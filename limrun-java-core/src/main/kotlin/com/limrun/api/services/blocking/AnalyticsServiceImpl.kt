// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

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
import com.limrun.api.core.prepare
import com.limrun.api.models.analytics.AnalyticsGetInstancesParams
import com.limrun.api.models.analytics.AnalyticsGetParams
import com.limrun.api.models.analytics.AnalyticsInstancesResponse
import com.limrun.api.models.analytics.AnalyticsResponse
import java.util.function.Consumer

class AnalyticsServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AnalyticsService {

    private val withRawResponse: AnalyticsService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AnalyticsService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticsService =
        AnalyticsServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: AnalyticsGetParams,
        requestOptions: RequestOptions,
    ): AnalyticsResponse =
        // get /v1/analytics
        withRawResponse().get(params, requestOptions).parse()

    override fun getInstances(
        params: AnalyticsGetInstancesParams,
        requestOptions: RequestOptions,
    ): AnalyticsInstancesResponse =
        // get /v1/analytics/instances
        withRawResponse().getInstances(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AnalyticsService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnalyticsService.WithRawResponse =
            AnalyticsServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<AnalyticsResponse> =
            jsonHandler<AnalyticsResponse>(clientOptions.jsonMapper)

        override fun get(
            params: AnalyticsGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalyticsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getInstancesHandler: Handler<AnalyticsInstancesResponse> =
            jsonHandler<AnalyticsInstancesResponse>(clientOptions.jsonMapper)

        override fun getInstances(
            params: AnalyticsGetInstancesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalyticsInstancesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "instances")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
