// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.services.async

import com.configure_me_limrun_v1.api.TestServerExtension
import com.configure_me_limrun_v1.api.client.okhttp.LimrunOkHttpClientAsync
import com.configure_me_limrun_v1.api.models.assets.AssetGetOrCreateParams
import com.configure_me_limrun_v1.api.models.assets.AssetGetParams
import com.configure_me_limrun_v1.api.models.assets.AssetListParams
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
                    .md5Filter("md5Filter")
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
