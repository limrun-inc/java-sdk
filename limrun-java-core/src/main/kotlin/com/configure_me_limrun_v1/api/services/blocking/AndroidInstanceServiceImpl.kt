// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.services.blocking

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
import com.configure_me_limrun_v1.api.core.prepare
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstance
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceCreateParams
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceDeleteParams
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceGetParams
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AndroidInstanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AndroidInstanceService {

    private val withRawResponse: AndroidInstanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AndroidInstanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AndroidInstanceService =
        AndroidInstanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AndroidInstanceCreateParams,
        requestOptions: RequestOptions,
    ): AndroidInstance =
        // post /v1/android_instances
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: AndroidInstanceListParams,
        requestOptions: RequestOptions,
    ): List<AndroidInstance> =
        // get /v1/android_instances
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AndroidInstanceDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/android_instances/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: AndroidInstanceGetParams,
        requestOptions: RequestOptions,
    ): AndroidInstance =
        // get /v1/android_instances/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AndroidInstanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AndroidInstanceService.WithRawResponse =
            AndroidInstanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AndroidInstance> =
            jsonHandler<AndroidInstance>(clientOptions.jsonMapper)

        override fun create(
            params: AndroidInstanceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AndroidInstance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "android_instances")
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

        private val listHandler: Handler<List<AndroidInstance>> =
            jsonHandler<List<AndroidInstance>>(clientOptions.jsonMapper)

        override fun list(
            params: AndroidInstanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AndroidInstance>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "android_instances")
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
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AndroidInstanceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<AndroidInstance> =
            jsonHandler<AndroidInstance>(clientOptions.jsonMapper)

        override fun get(
            params: AndroidInstanceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AndroidInstance> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "android_instances", params._pathParam(0))
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
