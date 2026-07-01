// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.handlers.errorBodyHandler
import com.limrun.api.core.handlers.errorHandler
import com.limrun.api.core.handlers.jsonHandler
import com.limrun.api.core.http.HttpMethod
import com.limrun.api.core.http.HttpRequest
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponse.Handler
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.core.http.parseable
import com.limrun.api.core.prepareAsync
import com.limrun.api.models.analytics.AnalyticsGetInstancesParams
import com.limrun.api.models.analytics.AnalyticsGetParams
import com.limrun.api.models.analytics.AnalyticsInstancesResponse
import com.limrun.api.models.analytics.AnalyticsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AnalyticsServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AnalyticsServiceAsync {

    private val withRawResponse: AnalyticsServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AnalyticsServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticsServiceAsync =
        AnalyticsServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: AnalyticsGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnalyticsResponse> =
        // get /v1/analytics
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getInstances(
        params: AnalyticsGetInstancesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnalyticsInstancesResponse> =
        // get /v1/analytics/instances
        withRawResponse().getInstances(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AnalyticsServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnalyticsServiceAsync.WithRawResponse =
            AnalyticsServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<AnalyticsResponse> =
            jsonHandler<AnalyticsResponse>(clientOptions.jsonMapper)

        override fun get(
            params: AnalyticsGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnalyticsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getInstancesHandler: Handler<AnalyticsInstancesResponse> =
            jsonHandler<AnalyticsInstancesResponse>(clientOptions.jsonMapper)

        override fun getInstances(
            params: AnalyticsGetInstancesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnalyticsInstancesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "instances")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstancesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
