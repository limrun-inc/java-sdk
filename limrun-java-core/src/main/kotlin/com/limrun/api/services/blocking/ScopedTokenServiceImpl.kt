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
import com.limrun.api.core.http.json
import com.limrun.api.core.http.parseable
import com.limrun.api.core.prepare
import com.limrun.api.models.scopedtokens.ScopedToken
import com.limrun.api.models.scopedtokens.ScopedTokenCreateParams
import java.util.function.Consumer

class ScopedTokenServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScopedTokenService {

    private val withRawResponse: ScopedTokenService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScopedTokenService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScopedTokenService =
        ScopedTokenServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ScopedTokenCreateParams,
        requestOptions: RequestOptions,
    ): ScopedToken =
        // post /v1/scoped_tokens
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScopedTokenService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScopedTokenService.WithRawResponse =
            ScopedTokenServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ScopedToken> =
            jsonHandler<ScopedToken>(clientOptions.jsonMapper)

        override fun create(
            params: ScopedTokenCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopedToken> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "scoped_tokens")
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
    }
}
