// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetTest {

    @Test
    fun create() {
        val asset =
            Asset.builder()
                .id("id")
                .kind(Asset.Kind.APP)
                .name("name")
                .displayName("displayName")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .md5("md5")
                .os(Asset.Os.IOS)
                .platform(Asset.Platform.IOS)
                .signedDownloadUrl("signedDownloadUrl")
                .signedUploadUrl("signedUploadUrl")
                .build()

        assertThat(asset.id()).isEqualTo("id")
        assertThat(asset.kind()).isEqualTo(Asset.Kind.APP)
        assertThat(asset.name()).isEqualTo("name")
        assertThat(asset.displayName()).contains("displayName")
        assertThat(asset.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(asset.md5()).contains("md5")
        assertThat(asset.os()).contains(Asset.Os.IOS)
        assertThat(asset.platform()).contains(Asset.Platform.IOS)
        assertThat(asset.signedDownloadUrl()).contains("signedDownloadUrl")
        assertThat(asset.signedUploadUrl()).contains("signedUploadUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val asset =
            Asset.builder()
                .id("id")
                .kind(Asset.Kind.APP)
                .name("name")
                .displayName("displayName")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .md5("md5")
                .os(Asset.Os.IOS)
                .platform(Asset.Platform.IOS)
                .signedDownloadUrl("signedDownloadUrl")
                .signedUploadUrl("signedUploadUrl")
                .build()

        val roundtrippedAsset =
            jsonMapper.readValue(jsonMapper.writeValueAsString(asset), jacksonTypeRef<Asset>())

        assertThat(roundtrippedAsset).isEqualTo(asset)
    }
}
