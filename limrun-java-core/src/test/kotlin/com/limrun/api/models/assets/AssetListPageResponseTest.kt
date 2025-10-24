// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetListPageResponseTest {

    @Test
    fun create() {
        val assetListPageResponse =
            AssetListPageResponse.builder()
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

        assertThat(assetListPageResponse.items().getOrNull())
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
        val assetListPageResponse =
            AssetListPageResponse.builder()
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

        val roundtrippedAssetListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assetListPageResponse),
                jacksonTypeRef<AssetListPageResponse>(),
            )

        assertThat(roundtrippedAssetListPageResponse).isEqualTo(assetListPageResponse)
    }
}
