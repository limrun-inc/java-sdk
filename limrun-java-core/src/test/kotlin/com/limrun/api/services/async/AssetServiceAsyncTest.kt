// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.client.okhttp.LimrunOkHttpClientAsync
import com.limrun.api.models.assets.AssetGetOrCreateParams
import com.limrun.api.models.assets.AssetGetParams
import com.limrun.api.models.assets.AssetListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val assetServiceAsync = client.assets()

        val assetsFuture =
            assetServiceAsync.list(
                AssetListParams.builder()
                    .includeAppStore(true)
                    .includeDownloadUrl(true)
                    .includeUploadUrl(true)
                    .limit(50L)
                    .nameFilter("nameFilter")
                    .namePrefixFilter("namePrefixFilter")
                    .build()
            )

        val assets = assetsFuture.get()
        assets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val assetServiceAsync = client.assets()

        val future = assetServiceAsync.delete("assetId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOrCreate() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val assetServiceAsync = client.assets()

        val responseFuture =
            assetServiceAsync.getOrCreate(
                AssetGetOrCreateParams.builder().name("name").ttl("ttl").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
