// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

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
import com.limrun.api.core.prepare
import com.limrun.api.models.gradleinstances.GradleInstance
import com.limrun.api.models.gradleinstances.GradleInstanceCreateParams
import com.limrun.api.models.gradleinstances.GradleInstanceDeleteParams
import com.limrun.api.models.gradleinstances.GradleInstanceGetParams
import com.limrun.api.models.gradleinstances.GradleInstanceListPage
import com.limrun.api.models.gradleinstances.GradleInstanceListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GradleInstanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GradleInstanceService {

    private val withRawResponse: GradleInstanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GradleInstanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GradleInstanceService =
        GradleInstanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GradleInstanceCreateParams,
        requestOptions: RequestOptions,
    ): GradleInstance =
        // post /v1/gradle_instances
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: GradleInstanceListParams,
        requestOptions: RequestOptions,
    ): GradleInstanceListPage =
        // get /v1/gradle_instances
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: GradleInstanceDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/gradle_instances/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: GradleInstanceGetParams,
        requestOptions: RequestOptions,
    ): GradleInstance =
        // get /v1/gradle_instances/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GradleInstanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GradleInstanceService.WithRawResponse =
            GradleInstanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<GradleInstance> =
            jsonHandler<GradleInstance>(clientOptions.jsonMapper)

        override fun create(
            params: GradleInstanceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GradleInstance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "gradle_instances")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<GradleInstance>> =
            jsonHandler<List<GradleInstance>>(clientOptions.jsonMapper)

        override fun list(
            params: GradleInstanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GradleInstanceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "gradle_instances")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        GradleInstanceListPage.builder()
                            .service(GradleInstanceServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: GradleInstanceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<GradleInstance> =
            jsonHandler<GradleInstance>(clientOptions.jsonMapper)

        override fun get(
            params: GradleInstanceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GradleInstance> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "gradle_instances", params._pathParam(0))
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
    }
}
