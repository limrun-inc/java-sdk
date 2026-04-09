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
import com.limrun.api.models.xcodeinstances.XcodeInstance
import com.limrun.api.models.xcodeinstances.XcodeInstanceCreateParams
import com.limrun.api.models.xcodeinstances.XcodeInstanceDeleteParams
import com.limrun.api.models.xcodeinstances.XcodeInstanceGetParams
import com.limrun.api.models.xcodeinstances.XcodeInstanceListPage
import com.limrun.api.models.xcodeinstances.XcodeInstanceListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class XcodeInstanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    XcodeInstanceService {

    private val withRawResponse: XcodeInstanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): XcodeInstanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): XcodeInstanceService =
        XcodeInstanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: XcodeInstanceCreateParams,
        requestOptions: RequestOptions,
    ): XcodeInstance =
        // post /v1/xcode_instances
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: XcodeInstanceListParams,
        requestOptions: RequestOptions,
    ): XcodeInstanceListPage =
        // get /v1/xcode_instances
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: XcodeInstanceDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/xcode_instances/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: XcodeInstanceGetParams,
        requestOptions: RequestOptions,
    ): XcodeInstance =
        // get /v1/xcode_instances/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        XcodeInstanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): XcodeInstanceService.WithRawResponse =
            XcodeInstanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<XcodeInstance> =
            jsonHandler<XcodeInstance>(clientOptions.jsonMapper)

        override fun create(
            params: XcodeInstanceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<XcodeInstance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "xcode_instances")
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

        private val listHandler: Handler<List<XcodeInstance>> =
            jsonHandler<List<XcodeInstance>>(clientOptions.jsonMapper)

        override fun list(
            params: XcodeInstanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<XcodeInstanceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "xcode_instances")
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
                        XcodeInstanceListPage.builder()
                            .service(XcodeInstanceServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: XcodeInstanceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "xcode_instances", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<XcodeInstance> =
            jsonHandler<XcodeInstance>(clientOptions.jsonMapper)

        override fun get(
            params: XcodeInstanceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<XcodeInstance> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "xcode_instances", params._pathParam(0))
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
