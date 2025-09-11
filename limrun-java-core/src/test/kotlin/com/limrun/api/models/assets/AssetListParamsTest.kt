// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetListParamsTest {

    @Test
    fun create() {
        AssetListParams.builder()
            .includeDownloadUrl(true)
            .includeUploadUrl(true)
            .nameFilter("nameFilter")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AssetListParams.builder()
                .includeDownloadUrl(true)
                .includeUploadUrl(true)
                .nameFilter("nameFilter")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeDownloadUrl", "true")
                    .put("includeUploadUrl", "true")
                    .put("nameFilter", "nameFilter")
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
