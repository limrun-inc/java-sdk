// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.TestServerExtension
import com.limrun.api.client.okhttp.LimrunOkHttpClientAsync
import com.limrun.api.models.assets.AssetGetOrCreateParams
import com.limrun.api.models.assets.AssetGetParams
import com.limrun.api.models.assets.AssetListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssetServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.assets()

        val assetsFuture =
            assetServiceAsync.list(
                AssetListParams.builder()
                    .includeDownloadUrl(true)
                    .includeUploadUrl(true)
                    .nameFilter("nameFilter")
                    .build()
            )

        val assets = assetsFuture.get()
        assets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.assets()

        val assetFuture =
            assetServiceAsync.get(
                AssetGetParams.builder()
                    .assetId("assetId")
                    .includeDownloadUrl(true)
                    .includeUploadUrl(true)
                    .build()
            )

        val asset = assetFuture.get()
        asset.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOrCreate() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.assets()

        val responseFuture =
            assetServiceAsync.getOrCreate(AssetGetOrCreateParams.builder().name("name").build())

        val response = responseFuture.get()
        response.validate()
    }
}
