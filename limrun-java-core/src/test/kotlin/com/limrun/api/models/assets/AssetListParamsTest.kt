// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetListParamsTest {

    @Test
    fun create() {
        AssetListParams.builder()
            .endingBefore("asset_someid")
            .includeDownloadUrl(true)
            .includeUploadUrl(true)
            .limit(50L)
            .nameFilter("nameFilter")
            .startingAfter("asset_someid")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AssetListParams.builder()
                .endingBefore("asset_someid")
                .includeDownloadUrl(true)
                .includeUploadUrl(true)
                .limit(50L)
                .nameFilter("nameFilter")
                .startingAfter("asset_someid")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endingBefore", "asset_someid")
                    .put("includeDownloadUrl", "true")
                    .put("includeUploadUrl", "true")
                    .put("limit", "50")
                    .put("nameFilter", "nameFilter")
                    .put("startingAfter", "asset_someid")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AssetListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
