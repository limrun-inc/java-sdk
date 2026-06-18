// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetGetOrCreateResponseTest {

    @Test
    fun create() {
        val assetGetOrCreateResponse =
            AssetGetOrCreateResponse.builder()
                .id("id")
                .name("name")
                .signedDownloadUrl("signedDownloadUrl")
                .signedUploadUrl("signedUploadUrl")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .md5("md5")
                .build()

        assertThat(assetGetOrCreateResponse.id()).isEqualTo("id")
        assertThat(assetGetOrCreateResponse.name()).isEqualTo("name")
        assertThat(assetGetOrCreateResponse.signedDownloadUrl()).isEqualTo("signedDownloadUrl")
        assertThat(assetGetOrCreateResponse.signedUploadUrl()).isEqualTo("signedUploadUrl")
        assertThat(assetGetOrCreateResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(assetGetOrCreateResponse.md5()).contains("md5")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assetGetOrCreateResponse =
            AssetGetOrCreateResponse.builder()
                .id("id")
                .name("name")
                .signedDownloadUrl("signedDownloadUrl")
                .signedUploadUrl("signedUploadUrl")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .md5("md5")
                .build()

        val roundtrippedAssetGetOrCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assetGetOrCreateResponse),
                jacksonTypeRef<AssetGetOrCreateResponse>(),
            )

        assertThat(roundtrippedAssetGetOrCreateResponse).isEqualTo(assetGetOrCreateResponse)
    }
}
