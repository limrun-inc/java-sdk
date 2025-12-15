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
import com.limrun.api.models.iosinstances.IosInstance
import com.limrun.api.models.iosinstances.IosInstanceCreateParams
import com.limrun.api.models.iosinstances.IosInstanceDeleteParams
import com.limrun.api.models.iosinstances.IosInstanceGetParams
import com.limrun.api.models.iosinstances.IosInstanceListPage
import com.limrun.api.models.iosinstances.IosInstanceListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IosInstanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IosInstanceService {

    private val withRawResponse: IosInstanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IosInstanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IosInstanceService =
        IosInstanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: IosInstanceCreateParams,
        requestOptions: RequestOptions,
    ): IosInstance =
        // post /v1/ios_instances
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: IosInstanceListParams,
        requestOptions: RequestOptions,
    ): IosInstanceListPage =
        // get /v1/ios_instances
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: IosInstanceDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/ios_instances/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: IosInstanceGetParams, requestOptions: RequestOptions): IosInstance =
        // get /v1/ios_instances/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IosInstanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IosInstanceService.WithRawResponse =
            IosInstanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<IosInstance> =
            jsonHandler<IosInstance>(clientOptions.jsonMapper)

        override fun create(
            params: IosInstanceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IosInstance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "ios_instances")
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

        private val listHandler: Handler<List<IosInstance>> =
            jsonHandler<List<IosInstance>>(clientOptions.jsonMapper)

        override fun list(
            params: IosInstanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IosInstanceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "ios_instances")
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
                        IosInstanceListPage.builder()
                            .service(IosInstanceServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: IosInstanceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "ios_instances", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<IosInstance> =
            jsonHandler<IosInstance>(clientOptions.jsonMapper)

        override fun get(
            params: IosInstanceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IosInstance> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "ios_instances", params._pathParam(0))
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
