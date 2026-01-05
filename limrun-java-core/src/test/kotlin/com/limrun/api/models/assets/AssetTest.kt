// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetTest {

    @Test
    fun create() {
        val asset =
            Asset.builder()
                .id("id")
                .name("name")
                .displayName("displayName")
                .md5("md5")
                .signedDownloadUrl("signedDownloadUrl")
                .signedUploadUrl("signedUploadUrl")
                .build()

        assertThat(asset.id()).isEqualTo("id")
        assertThat(asset.name()).isEqualTo("name")
        assertThat(asset.displayName()).contains("displayName")
        assertThat(asset.md5()).contains("md5")
        assertThat(asset.signedDownloadUrl()).contains("signedDownloadUrl")
        assertThat(asset.signedUploadUrl()).contains("signedUploadUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val asset =
            Asset.builder()
                .id("id")
                .name("name")
                .displayName("displayName")
                .md5("md5")
                .signedDownloadUrl("signedDownloadUrl")
                .signedUploadUrl("signedUploadUrl")
                .build()

        val roundtrippedAsset =
            jsonMapper.readValue(jsonMapper.writeValueAsString(asset), jacksonTypeRef<Asset>())

        assertThat(roundtrippedAsset).isEqualTo(asset)
    }
}
