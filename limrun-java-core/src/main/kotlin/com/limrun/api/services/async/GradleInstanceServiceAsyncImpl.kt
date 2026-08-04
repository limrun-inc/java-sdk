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
import com.limrun.api.models.gradleinstances.GradleInstance
import com.limrun.api.models.gradleinstances.GradleInstanceCreateParams
import com.limrun.api.models.gradleinstances.GradleInstanceDeleteParams
import com.limrun.api.models.gradleinstances.GradleInstanceGetParams
import com.limrun.api.models.gradleinstances.GradleInstanceListPageAsync
import com.limrun.api.models.gradleinstances.GradleInstanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GradleInstanceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : GradleInstanceServiceAsync {

    private val withRawResponse: GradleInstanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GradleInstanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GradleInstanceServiceAsync =
        GradleInstanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GradleInstanceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GradleInstance> =
        // post /v1/gradle_instances
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: GradleInstanceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GradleInstanceListPageAsync> =
        // get /v1/gradle_instances
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: GradleInstanceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/gradle_instances/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: GradleInstanceGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GradleInstance> =
        // get /v1/gradle_instances/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GradleInstanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GradleInstanceServiceAsync.WithRawResponse =
            GradleInstanceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<GradleInstance> =
            jsonHandler<GradleInstance>(clientOptions.jsonMapper)

        override fun create(
            params: GradleInstanceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GradleInstance>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "gradle_instances")
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

        private val listHandler: Handler<List<GradleInstance>> =
            jsonHandler<List<GradleInstance>>(clientOptions.jsonMapper)

        override fun list(
            params: GradleInstanceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GradleInstanceListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "gradle_instances")
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
                            .let {
                                GradleInstanceListPageAsync.builder()
                                    .service(GradleInstanceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: GradleInstanceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "gradle_instances", params._pathParam(0))
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

        private val getHandler: Handler<GradleInstance> =
            jsonHandler<GradleInstance>(clientOptions.jsonMapper)

        override fun get(
            params: GradleInstanceGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GradleInstance>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "gradle_instances", params._pathParam(0))
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
