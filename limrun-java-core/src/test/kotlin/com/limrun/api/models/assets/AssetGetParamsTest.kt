// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetGetParamsTest {

    @Test
    fun create() {
        AssetGetParams.builder()
            .assetId("assetId")
            .includeDownloadUrl(true)
            .includeUploadUrl(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AssetGetParams.builder().assetId("assetId").build()

        assertThat(params._pathParam(0)).isEqualTo("assetId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AssetGetParams.builder()
                .assetId("assetId")
                .includeDownloadUrl(true)
                .includeUploadUrl(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeDownloadUrl", "true")
                    .put("includeUploadUrl", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AssetGetParams.builder().assetId("assetId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
