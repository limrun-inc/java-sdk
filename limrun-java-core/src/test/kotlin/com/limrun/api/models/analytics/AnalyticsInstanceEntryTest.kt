// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsInstanceEntryTest {

    @Test
    fun create() {
        val analyticsInstanceEntry =
            AnalyticsInstanceEntry.builder()
                .addInstance(
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
                )
                .timestamp("timestamp")
                .build()

        assertThat(analyticsInstanceEntry.instances())
            .containsExactly(
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
            )
        assertThat(analyticsInstanceEntry.timestamp()).isEqualTo("timestamp")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsInstanceEntry =
            AnalyticsInstanceEntry.builder()
                .addInstance(
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
                )
                .timestamp("timestamp")
                .build()

        val roundtrippedAnalyticsInstanceEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsInstanceEntry),
                jacksonTypeRef<AnalyticsInstanceEntry>(),
            )

        assertThat(roundtrippedAnalyticsInstanceEntry).isEqualTo(analyticsInstanceEntry)
    }
}
