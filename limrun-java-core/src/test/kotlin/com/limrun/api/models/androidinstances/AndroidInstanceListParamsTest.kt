// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.androidinstances

import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AndroidInstanceListParamsTest {

    @Test
    fun create() {
        AndroidInstanceListParams.builder()
            .labelSelector("env=prod,version=1.2")
            .limit(50L)
            .region("region")
            .state(AndroidInstanceListParams.State.UNKNOWN)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AndroidInstanceListParams.builder()
                .labelSelector("env=prod,version=1.2")
                .limit(50L)
                .region("region")
                .state(AndroidInstanceListParams.State.UNKNOWN)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("labelSelector", "env=prod,version=1.2")
                    .put("limit", "50")
                    .put("region", "region")
                    .put("state", "unknown")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AndroidInstanceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
