// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.gradleinstances

import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GradleInstanceListParamsTest {

    @Test
    fun create() {
        GradleInstanceListParams.builder()
            .endingBefore("endingBefore")
            .labelSelector("env=prod,version=1.2")
            .limit(50L)
            .startingAfter("startingAfter")
            .state("assigned,ready")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GradleInstanceListParams.builder()
                .endingBefore("endingBefore")
                .labelSelector("env=prod,version=1.2")
                .limit(50L)
                .startingAfter("startingAfter")
                .state("assigned,ready")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endingBefore", "endingBefore")
                    .put("labelSelector", "env=prod,version=1.2")
                    .put("limit", "50")
                    .put("startingAfter", "startingAfter")
                    .put("state", "assigned,ready")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GradleInstanceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
