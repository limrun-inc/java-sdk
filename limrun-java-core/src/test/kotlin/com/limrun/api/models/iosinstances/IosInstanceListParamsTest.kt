// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IosInstanceListParamsTest {

    @Test
    fun create() {
        IosInstanceListParams.builder()
            .endingBefore("ios_someid")
            .labelSelector("env=prod,version=1.2")
            .limit(50L)
            .region("region")
            .startingAfter("ios_someid")
            .state(IosInstanceListParams.State.UNKNOWN)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IosInstanceListParams.builder()
                .endingBefore("ios_someid")
                .labelSelector("env=prod,version=1.2")
                .limit(50L)
                .region("region")
                .startingAfter("ios_someid")
                .state(IosInstanceListParams.State.UNKNOWN)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endingBefore", "ios_someid")
                    .put("labelSelector", "env=prod,version=1.2")
                    .put("limit", "50")
                    .put("region", "region")
                    .put("startingAfter", "ios_someid")
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
