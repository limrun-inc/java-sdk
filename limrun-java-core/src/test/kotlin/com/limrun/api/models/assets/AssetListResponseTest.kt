// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetListResponseTest {

    @Test
    fun create() {
        val assetListResponse =
            AssetListResponse.builder()
                .addItem(
                    Asset.builder()
                        .id("id")
                        .name("name")
                        .md5("md5")
                        .signedDownloadUrl("signedDownloadUrl")
                        .signedUploadUrl("signedUploadUrl")
                        .build()
                )
                .build()

        assertThat(assetListResponse.items().getOrNull())
            .containsExactly(
                Asset.builder()
                    .id("id")
                    .name("name")
                    .md5("md5")
                    .signedDownloadUrl("signedDownloadUrl")
                    .signedUploadUrl("signedUploadUrl")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assetListResponse =
            AssetListResponse.builder()
                .addItem(
                    Asset.builder()
                        .id("id")
                        .name("name")
                        .md5("md5")
                        .signedDownloadUrl("signedDownloadUrl")
                        .signedUploadUrl("signedUploadUrl")
                        .build()
                )
                .build()

        val roundtrippedAssetListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assetListResponse),
                jacksonTypeRef<AssetListResponse>(),
            )

        assertThat(roundtrippedAssetListResponse).isEqualTo(assetListResponse)
    }
}
