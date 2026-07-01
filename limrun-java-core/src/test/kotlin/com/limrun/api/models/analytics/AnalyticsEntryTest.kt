// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsEntryTest {

    @Test
    fun create() {
        val analyticsEntry =
            AnalyticsEntry.builder()
                .android(
                    AnalyticsEntry.Android.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "avgDurationMinutes" to 0,
                                    "billedMinutes" to 0,
                                    "cost" to 0,
                                    "count" to 0,
                                    "creditsBilledMinutes" to 0,
                                    "creditsCost" to 0,
                                    "onDemandBilledMinutes" to 0,
                                    "onDemandCost" to 0,
                                    "runtimeMinutes" to 0,
                                    "subscriptionBilledMinutes" to mapOf("foo" to 0),
                                    "subscriptionCost" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .ios(
                    AnalyticsEntry.Ios.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "avgDurationMinutes" to 0,
                                    "billedMinutes" to 0,
                                    "cost" to 0,
                                    "count" to 0,
                                    "creditsBilledMinutes" to 0,
                                    "creditsCost" to 0,
                                    "onDemandBilledMinutes" to 0,
                                    "onDemandCost" to 0,
                                    "runtimeMinutes" to 0,
                                    "subscriptionBilledMinutes" to mapOf("foo" to 0),
                                    "subscriptionCost" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .sandbox(
                    AnalyticsEntry.Sandbox.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "avgDurationMinutes" to 0,
                                    "billedMinutes" to 0,
                                    "cost" to 0,
                                    "count" to 0,
                                    "creditsBilledMinutes" to 0,
                                    "creditsCost" to 0,
                                    "onDemandBilledMinutes" to 0,
                                    "onDemandCost" to 0,
                                    "runtimeMinutes" to 0,
                                    "subscriptionBilledMinutes" to mapOf("foo" to 0),
                                    "subscriptionCost" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .timestamp("timestamp")
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
                .build()

        assertThat(analyticsEntry.android())
            .isEqualTo(
                AnalyticsEntry.Android.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "avgDurationMinutes" to 0,
                                "billedMinutes" to 0,
                                "cost" to 0,
                                "count" to 0,
                                "creditsBilledMinutes" to 0,
                                "creditsCost" to 0,
                                "onDemandBilledMinutes" to 0,
                                "onDemandCost" to 0,
                                "runtimeMinutes" to 0,
                                "subscriptionBilledMinutes" to mapOf("foo" to 0),
                                "subscriptionCost" to mapOf("foo" to 0),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(analyticsEntry.ios())
            .isEqualTo(
                AnalyticsEntry.Ios.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "avgDurationMinutes" to 0,
                                "billedMinutes" to 0,
                                "cost" to 0,
                                "count" to 0,
                                "creditsBilledMinutes" to 0,
                                "creditsCost" to 0,
                                "onDemandBilledMinutes" to 0,
                                "onDemandCost" to 0,
                                "runtimeMinutes" to 0,
                                "subscriptionBilledMinutes" to mapOf("foo" to 0),
                                "subscriptionCost" to mapOf("foo" to 0),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(analyticsEntry.sandbox())
            .isEqualTo(
                AnalyticsEntry.Sandbox.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "avgDurationMinutes" to 0,
                                "billedMinutes" to 0,
                                "cost" to 0,
                                "count" to 0,
                                "creditsBilledMinutes" to 0,
                                "creditsCost" to 0,
                                "onDemandBilledMinutes" to 0,
                                "onDemandCost" to 0,
                                "runtimeMinutes" to 0,
                                "subscriptionBilledMinutes" to mapOf("foo" to 0),
                                "subscriptionCost" to mapOf("foo" to 0),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(analyticsEntry.timestamp()).isEqualTo("timestamp")
        assertThat(analyticsEntry.instances().getOrNull())
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsEntry =
            AnalyticsEntry.builder()
                .android(
                    AnalyticsEntry.Android.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "avgDurationMinutes" to 0,
                                    "billedMinutes" to 0,
                                    "cost" to 0,
                                    "count" to 0,
                                    "creditsBilledMinutes" to 0,
                                    "creditsCost" to 0,
                                    "onDemandBilledMinutes" to 0,
                                    "onDemandCost" to 0,
                                    "runtimeMinutes" to 0,
                                    "subscriptionBilledMinutes" to mapOf("foo" to 0),
                                    "subscriptionCost" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .ios(
                    AnalyticsEntry.Ios.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "avgDurationMinutes" to 0,
                                    "billedMinutes" to 0,
                                    "cost" to 0,
                                    "count" to 0,
                                    "creditsBilledMinutes" to 0,
                                    "creditsCost" to 0,
                                    "onDemandBilledMinutes" to 0,
                                    "onDemandCost" to 0,
                                    "runtimeMinutes" to 0,
                                    "subscriptionBilledMinutes" to mapOf("foo" to 0),
                                    "subscriptionCost" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .sandbox(
                    AnalyticsEntry.Sandbox.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "avgDurationMinutes" to 0,
                                    "billedMinutes" to 0,
                                    "cost" to 0,
                                    "count" to 0,
                                    "creditsBilledMinutes" to 0,
                                    "creditsCost" to 0,
                                    "onDemandBilledMinutes" to 0,
                                    "onDemandCost" to 0,
                                    "runtimeMinutes" to 0,
                                    "subscriptionBilledMinutes" to mapOf("foo" to 0),
                                    "subscriptionCost" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .timestamp("timestamp")
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
                .build()

        val roundtrippedAnalyticsEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsEntry),
                jacksonTypeRef<AnalyticsEntry>(),
            )

        assertThat(roundtrippedAnalyticsEntry).isEqualTo(analyticsEntry)
    }
}
