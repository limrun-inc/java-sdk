// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CostBreakdownTest {

    @Test
    fun create() {
        val costBreakdown =
            CostBreakdown.builder()
                .creditsCost(0.0)
                .onDemandCost(0.0)
                .planCost(
                    CostBreakdown.PlanCost.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .subscriptionCost(
                    CostBreakdown.SubscriptionCost.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        assertThat(costBreakdown.creditsCost()).isEqualTo(0.0)
        assertThat(costBreakdown.onDemandCost()).isEqualTo(0.0)
        assertThat(costBreakdown.planCost())
            .contains(
                CostBreakdown.PlanCost.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(costBreakdown.subscriptionCost())
            .contains(
                CostBreakdown.SubscriptionCost.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val costBreakdown =
            CostBreakdown.builder()
                .creditsCost(0.0)
                .onDemandCost(0.0)
                .planCost(
                    CostBreakdown.PlanCost.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .subscriptionCost(
                    CostBreakdown.SubscriptionCost.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        val roundtrippedCostBreakdown =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(costBreakdown),
                jacksonTypeRef<CostBreakdown>(),
            )

        assertThat(roundtrippedCostBreakdown).isEqualTo(costBreakdown)
    }
}
