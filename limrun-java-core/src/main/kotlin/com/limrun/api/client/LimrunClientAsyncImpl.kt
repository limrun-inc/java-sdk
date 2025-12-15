// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.client

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.getPackageVersion
import com.limrun.api.services.async.AndroidInstanceServiceAsync
import com.limrun.api.services.async.AndroidInstanceServiceAsyncImpl
import com.limrun.api.services.async.AssetServiceAsync
import com.limrun.api.services.async.AssetServiceAsyncImpl
import com.limrun.api.services.async.IosInstanceServiceAsync
import com.limrun.api.services.async.IosInstanceServiceAsyncImpl
import java.util.function.Consumer

class LimrunClientAsyncImpl(private val clientOptions: ClientOptions) : LimrunClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LimrunClient by lazy { LimrunClientImpl(clientOptions) }

    private val withRawResponse: LimrunClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val androidInstances: AndroidInstanceServiceAsync by lazy {
        AndroidInstanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val assets: AssetServiceAsync by lazy {
        AssetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val iosInstances: IosInstanceServiceAsync by lazy {
        IosInstanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): LimrunClient = sync

    override fun withRawResponse(): LimrunClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimrunClientAsync =
        LimrunClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun androidInstances(): AndroidInstanceServiceAsync = androidInstances

    override fun assets(): AssetServiceAsync = assets

    override fun iosInstances(): IosInstanceServiceAsync = iosInstances

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LimrunClientAsync.WithRawResponse {

        private val androidInstances: AndroidInstanceServiceAsync.WithRawResponse by lazy {
            AndroidInstanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val assets: AssetServiceAsync.WithRawResponse by lazy {
            AssetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val iosInstances: IosInstanceServiceAsync.WithRawResponse by lazy {
            IosInstanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LimrunClientAsync.WithRawResponse =
            LimrunClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun androidInstances(): AndroidInstanceServiceAsync.WithRawResponse =
            androidInstances

        override fun assets(): AssetServiceAsync.WithRawResponse = assets

        override fun iosInstances(): IosInstanceServiceAsync.WithRawResponse = iosInstances
    }
}
