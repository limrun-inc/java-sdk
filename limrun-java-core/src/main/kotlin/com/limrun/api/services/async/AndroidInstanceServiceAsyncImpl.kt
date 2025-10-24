// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.checkRequired
import com.limrun.api.core.handlers.emptyHandler
import com.limrun.api.core.handlers.errorBodyHandler
import com.limrun.api.core.handlers.errorHandler
import com.limrun.api.core.handlers.jsonHandler
import com.limrun.api.core.http.HttpMethod
import com.limrun.api.core.http.HttpRequest
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponse.Handler
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.core.http.json
import com.limrun.api.core.http.parseable
import com.limrun.api.core.prepareAsync
import com.limrun.api.models.androidinstances.AndroidInstance
import com.limrun.api.models.androidinstances.AndroidInstanceCreateParams
import com.limrun.api.models.androidinstances.AndroidInstanceDeleteParams
import com.limrun.api.models.androidinstances.AndroidInstanceGetParams
import com.limrun.api.models.androidinstances.AndroidInstanceListPageAsync
import com.limrun.api.models.androidinstances.AndroidInstanceListPageResponse
import com.limrun.api.models.androidinstances.AndroidInstanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AndroidInstanceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AndroidInstanceServiceAsync {

    private val withRawResponse: AndroidInstanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AndroidInstanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AndroidInstanceServiceAsync =
        AndroidInstanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AndroidInstanceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AndroidInstance> =
        // post /v1/android_instances
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AndroidInstanceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AndroidInstanceListPageAsync> =
        // get /v1/android_instances
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AndroidInstanceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/android_instances/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: AndroidInstanceGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AndroidInstance> =
        // get /v1/android_instances/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AndroidInstanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AndroidInstanceServiceAsync.WithRawResponse =
            AndroidInstanceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AndroidInstance> =
            jsonHandler<AndroidInstance>(clientOptions.jsonMapper)

        override fun create(
            params: AndroidInstanceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AndroidInstance>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "android_instances")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AndroidInstanceListPageResponse> =
            jsonHandler<AndroidInstanceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AndroidInstanceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AndroidInstanceListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "android_instances")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                AndroidInstanceListPageAsync.builder()
                                    .service(AndroidInstanceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AndroidInstanceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "android_instances", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<AndroidInstance> =
            jsonHandler<AndroidInstance>(clientOptions.jsonMapper)

        override fun get(
            params: AndroidInstanceGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AndroidInstance>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "android_instances", params._pathParam(0))
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
    }
}
