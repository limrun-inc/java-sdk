// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.client

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.getPackageVersion
import com.limrun.api.services.blocking.AnalyticsService
import com.limrun.api.services.blocking.AnalyticsServiceImpl
import com.limrun.api.services.blocking.AndroidInstanceService
import com.limrun.api.services.blocking.AndroidInstanceServiceImpl
import com.limrun.api.services.blocking.AssetService
import com.limrun.api.services.blocking.AssetServiceImpl
import com.limrun.api.services.blocking.IosInstanceService
import com.limrun.api.services.blocking.IosInstanceServiceImpl
import com.limrun.api.services.blocking.ScopedTokenService
import com.limrun.api.services.blocking.ScopedTokenServiceImpl
import com.limrun.api.services.blocking.XcodeInstanceService
import com.limrun.api.services.blocking.XcodeInstanceServiceImpl
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

    private val iosInstances: IosInstanceService by lazy {
        IosInstanceServiceImpl(clientOptionsWithUserAgent)
    }

    private val xcodeInstances: XcodeInstanceService by lazy {
        XcodeInstanceServiceImpl(clientOptionsWithUserAgent)
    }

    private val analytics: AnalyticsService by lazy {
        AnalyticsServiceImpl(clientOptionsWithUserAgent)
    }

    private val scopedTokens: ScopedTokenService by lazy {
        ScopedTokenServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): LimrunClientAsync = async

    override fun withRawResponse(): LimrunClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimrunClient =
        LimrunClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun androidInstances(): AndroidInstanceService = androidInstances

    override fun assets(): AssetService = assets

    override fun iosInstances(): IosInstanceService = iosInstances

    override fun xcodeInstances(): XcodeInstanceService = xcodeInstances

    override fun analytics(): AnalyticsService = analytics

    override fun scopedTokens(): ScopedTokenService = scopedTokens

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LimrunClient.WithRawResponse {

        private val androidInstances: AndroidInstanceService.WithRawResponse by lazy {
            AndroidInstanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val assets: AssetService.WithRawResponse by lazy {
            AssetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val iosInstances: IosInstanceService.WithRawResponse by lazy {
            IosInstanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val xcodeInstances: XcodeInstanceService.WithRawResponse by lazy {
            XcodeInstanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val analytics: AnalyticsService.WithRawResponse by lazy {
            AnalyticsServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scopedTokens: ScopedTokenService.WithRawResponse by lazy {
            ScopedTokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LimrunClient.WithRawResponse =
            LimrunClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun androidInstances(): AndroidInstanceService.WithRawResponse = androidInstances

        override fun assets(): AssetService.WithRawResponse = assets

        override fun iosInstances(): IosInstanceService.WithRawResponse = iosInstances

        override fun xcodeInstances(): XcodeInstanceService.WithRawResponse = xcodeInstances

        override fun analytics(): AnalyticsService.WithRawResponse = analytics

        override fun scopedTokens(): ScopedTokenService.WithRawResponse = scopedTokens
    }
}
