// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.limrun.api.TestServerExtension
import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.models.assets.AssetGetOrCreateParams
import com.limrun.api.models.assets.AssetGetParams
import com.limrun.api.models.assets.AssetListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssetServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.assets()

        val assets =
            assetService.list(
                AssetListParams.builder()
                    .includeAppStore(true)
                    .includeDownloadUrl(true)
                    .includeUploadUrl(true)
                    .limit(50L)
                    .nameFilter("nameFilter")
                    .build()
            )

        assets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.assets()

        assetService.delete("assetId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.assets()

        val asset =
            assetService.get(
                AssetGetParams.builder()
                    .assetId("assetId")
                    .includeDownloadUrl(true)
                    .includeUploadUrl(true)
                    .build()
            )

        asset.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOrCreate() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.assets()

        val response =
            assetService.getOrCreate(AssetGetOrCreateParams.builder().name("name").build())

        response.validate()
    }
}
