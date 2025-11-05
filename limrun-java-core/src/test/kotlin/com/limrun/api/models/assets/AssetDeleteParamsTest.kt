// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetDeleteParamsTest {

    @Test
    fun create() {
        AssetDeleteParams.builder().assetId("assetId").build()
    }

    @Test
    fun pathParams() {
        val params = AssetDeleteParams.builder().assetId("assetId").build()

        assertThat(params._pathParam(0)).isEqualTo("assetId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
