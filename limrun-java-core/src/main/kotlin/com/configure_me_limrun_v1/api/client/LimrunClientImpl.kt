// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.client

import com.configure_me_limrun_v1.api.core.ClientOptions
import com.configure_me_limrun_v1.api.core.getPackageVersion
import com.configure_me_limrun_v1.api.services.blocking.AndroidInstanceService
import com.configure_me_limrun_v1.api.services.blocking.AndroidInstanceServiceImpl
import com.configure_me_limrun_v1.api.services.blocking.AssetService
import com.configure_me_limrun_v1.api.services.blocking.AssetServiceImpl
import java.util.function.Consumer

class LimrunClientImpl(private val clientOptions: ClientOptions) : LimrunClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LimrunClientAsync by lazy { LimrunClientAsyncImpl(clientOptions) }

    private val withRawResponse: LimrunClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val androidInstances: AndroidInstanceService by lazy {
        AndroidInstanceServiceImpl(clientOptionsWithUserAgent)
    }

    private val assets: AssetService by lazy { AssetServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): LimrunClientAsync = async

    override fun withRawResponse(): LimrunClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimrunClient =
        LimrunClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun androidInstances(): AndroidInstanceService = androidInstances

    override fun assets(): AssetService = assets

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LimrunClient.WithRawResponse {

        private val androidInstances: AndroidInstanceService.WithRawResponse by lazy {
            AndroidInstanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val assets: AssetService.WithRawResponse by lazy {
            AssetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LimrunClient.WithRawResponse =
            LimrunClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun androidInstances(): AndroidInstanceService.WithRawResponse = androidInstances

        override fun assets(): AssetService.WithRawResponse = assets
    }
}
