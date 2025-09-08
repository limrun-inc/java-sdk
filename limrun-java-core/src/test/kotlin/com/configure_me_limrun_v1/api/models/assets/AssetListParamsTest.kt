// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.models.assets

import com.configure_me_limrun_v1.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetListParamsTest {

    @Test
    fun create() {
        AssetListParams.builder()
            .includeDownloadUrl(true)
            .includeUploadUrl(true)
            .md5Filter("md5Filter")
            .nameFilter("nameFilter")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AssetListParams.builder()
                .includeDownloadUrl(true)
                .includeUploadUrl(true)
                .md5Filter("md5Filter")
                .nameFilter("nameFilter")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeDownloadUrl", "true")
                    .put("includeUploadUrl", "true")
                    .put("md5Filter", "md5Filter")
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
