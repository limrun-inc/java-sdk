// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IosInstanceListParamsTest {

    @Test
    fun create() {
        IosInstanceListParams.builder()
            .labelSelector("env=prod,version=1.2")
            .region("region")
            .state(IosInstanceListParams.State.UNKNOWN)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IosInstanceListParams.builder()
                .labelSelector("env=prod,version=1.2")
                .region("region")
                .state(IosInstanceListParams.State.UNKNOWN)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("labelSelector", "env=prod,version=1.2")
                    .put("region", "region")
                    .put("state", "unknown")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IosInstanceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
