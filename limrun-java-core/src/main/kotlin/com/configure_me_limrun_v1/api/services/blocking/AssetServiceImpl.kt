// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.services.blocking

import com.configure_me_limrun_v1.api.core.ClientOptions
import com.configure_me_limrun_v1.api.core.RequestOptions
import com.configure_me_limrun_v1.api.core.checkRequired
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
import com.configure_me_limrun_v1.api.models.assets.Asset
import com.configure_me_limrun_v1.api.models.assets.AssetGetOrCreateParams
import com.configure_me_limrun_v1.api.models.assets.AssetGetOrCreateResponse
import com.configure_me_limrun_v1.api.models.assets.AssetGetParams
import com.configure_me_limrun_v1.api.models.assets.AssetListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AssetService {

    private val withRawResponse: AssetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetService =
        AssetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: AssetListParams, requestOptions: RequestOptions): List<Asset> =
        // get /v1/assets
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: AssetGetParams, requestOptions: RequestOptions): Asset =
        // get /v1/assets/{assetId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getOrCreate(
        params: AssetGetOrCreateParams,
        requestOptions: RequestOptions,
    ): AssetGetOrCreateResponse =
        // put /v1/assets
        withRawResponse().getOrCreate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssetService.WithRawResponse =
            AssetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<Asset>> =
            jsonHandler<List<Asset>>(clientOptions.jsonMapper)

        override fun list(
            params: AssetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Asset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "assets")
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

        private val getHandler: Handler<Asset> = jsonHandler<Asset>(clientOptions.jsonMapper)

        override fun get(
            params: AssetGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Asset> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assetId", params.assetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "assets", params._pathParam(0))
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

        private val getOrCreateHandler: Handler<AssetGetOrCreateResponse> =
            jsonHandler<AssetGetOrCreateResponse>(clientOptions.jsonMapper)

        override fun getOrCreate(
            params: AssetGetOrCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssetGetOrCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "assets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getOrCreateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
