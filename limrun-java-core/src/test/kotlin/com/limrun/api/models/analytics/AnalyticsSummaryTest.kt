// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsSummaryTest {

    @Test
    fun create() {
        val analyticsSummary =
            AnalyticsSummary.builder()
                .android(
                    AnalyticsSummary.Android.builder()
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
                    AnalyticsSummary.Ios.builder()
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
                    AnalyticsSummary.Sandbox.builder()
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
                .build()

        assertThat(analyticsSummary.android())
            .isEqualTo(
                AnalyticsSummary.Android.builder()
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
        assertThat(analyticsSummary.ios())
            .isEqualTo(
                AnalyticsSummary.Ios.builder()
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
        assertThat(analyticsSummary.sandbox())
            .isEqualTo(
                AnalyticsSummary.Sandbox.builder()
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsSummary =
            AnalyticsSummary.builder()
                .android(
                    AnalyticsSummary.Android.builder()
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
                    AnalyticsSummary.Ios.builder()
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
                    AnalyticsSummary.Sandbox.builder()
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
                .build()

        val roundtrippedAnalyticsSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsSummary),
                jacksonTypeRef<AnalyticsSummary>(),
            )

        assertThat(roundtrippedAnalyticsSummary).isEqualTo(analyticsSummary)
    }
}
