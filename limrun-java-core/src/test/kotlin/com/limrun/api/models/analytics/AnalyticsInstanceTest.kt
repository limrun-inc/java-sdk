// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsInstanceTest {

    @Test
    fun create() {
        val analyticsInstance =
            AnalyticsInstance.builder()
                .billedMinutes(0L)
                .cost(0.0)
                .instanceTid("instanceTid")
                .platform("platform")
                .runtimeMinutes(0L)
                .billedBreakdown(
                    BilledBreakdown.builder()
                        .creditsBilledMinutes(0L)
                        .onDemandBilledMinutes(0L)
                        .planBilledMinutes(
                            BilledBreakdown.PlanBilledMinutes.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .subscriptionBilledMinutes(
                            BilledBreakdown.SubscriptionBilledMinutes.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .costBreakdown(
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
                )
                .labels(
                    AnalyticsInstance.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .region("region")
                .build()

        assertThat(analyticsInstance.billedMinutes()).isEqualTo(0L)
        assertThat(analyticsInstance.cost()).isEqualTo(0.0)
        assertThat(analyticsInstance.instanceTid()).isEqualTo("instanceTid")
        assertThat(analyticsInstance.platform()).isEqualTo("platform")
        assertThat(analyticsInstance.runtimeMinutes()).isEqualTo(0L)
        assertThat(analyticsInstance.billedBreakdown())
            .contains(
                BilledBreakdown.builder()
                    .creditsBilledMinutes(0L)
                    .onDemandBilledMinutes(0L)
                    .planBilledMinutes(
                        BilledBreakdown.PlanBilledMinutes.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .subscriptionBilledMinutes(
                        BilledBreakdown.SubscriptionBilledMinutes.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(analyticsInstance.costBreakdown())
            .contains(
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
            )
        assertThat(analyticsInstance.labels())
            .contains(
                AnalyticsInstance.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(analyticsInstance.region()).contains("region")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsInstance =
            AnalyticsInstance.builder()
                .billedMinutes(0L)
                .cost(0.0)
                .instanceTid("instanceTid")
                .platform("platform")
                .runtimeMinutes(0L)
                .billedBreakdown(
                    BilledBreakdown.builder()
                        .creditsBilledMinutes(0L)
                        .onDemandBilledMinutes(0L)
                        .planBilledMinutes(
                            BilledBreakdown.PlanBilledMinutes.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .subscriptionBilledMinutes(
                            BilledBreakdown.SubscriptionBilledMinutes.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .costBreakdown(
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
                )
                .labels(
                    AnalyticsInstance.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .region("region")
                .build()

        val roundtrippedAnalyticsInstance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsInstance),
                jacksonTypeRef<AnalyticsInstance>(),
            )

        assertThat(roundtrippedAnalyticsInstance).isEqualTo(analyticsInstance)
    }
}
