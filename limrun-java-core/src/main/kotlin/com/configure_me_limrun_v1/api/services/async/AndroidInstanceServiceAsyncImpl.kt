// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.services.async

import com.configure_me_limrun_v1.api.core.ClientOptions
import com.configure_me_limrun_v1.api.core.RequestOptions
import com.configure_me_limrun_v1.api.core.checkRequired
import com.configure_me_limrun_v1.api.core.handlers.emptyHandler
import com.configure_me_limrun_v1.api.core.handlers.errorBodyHandler
import com.configure_me_limrun_v1.api.core.handlers.errorHandler
import com.configure_me_limrun_v1.api.core.handlers.jsonHandler
import com.configure_me_limrun_v1.api.core.http.HttpMethod
import com.configure_me_limrun_v1.api.core.http.HttpRequest
import com.configure_me_limrun_v1.api.core.http.HttpResponse
import com.configure_me_limrun_v1.api.core.http.HttpResponse.Handler
import com.configure_me_limrun_v1.api.core.http.HttpResponseFor
import com.configure_me_limrun_v1.api.core.http.json
import com.configure_me_limrun_v1.api.core.http.parseable
import com.configure_me_limrun_v1.api.core.prepareAsync
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstance
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceCreateParams
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceDeleteParams
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceGetParams
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceListParams
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
    ): CompletableFuture<List<AndroidInstance>> =
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

        private val listHandler: Handler<List<AndroidInstance>> =
            jsonHandler<List<AndroidInstance>>(clientOptions.jsonMapper)

        override fun list(
            params: AndroidInstanceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AndroidInstance>>> {
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
                                    it.forEach { it.validate() }
                                }
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
