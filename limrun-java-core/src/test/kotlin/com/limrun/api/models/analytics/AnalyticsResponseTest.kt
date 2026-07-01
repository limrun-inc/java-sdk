// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsResponseTest {

    @Test
    fun create() {
        val analyticsResponse =
            AnalyticsResponse.builder()
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .bucket(AnalyticsResponse.Bucket.HOUR)
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSeries(
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
                )
                .summary(
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
                )
                .timezone("timezone")
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(analyticsResponse.asOf())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(analyticsResponse.bucket()).isEqualTo(AnalyticsResponse.Bucket.HOUR)
        assertThat(analyticsResponse.from())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(analyticsResponse.series())
            .containsExactly(
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
            )
        assertThat(analyticsResponse.summary())
            .isEqualTo(
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
            )
        assertThat(analyticsResponse.timezone()).isEqualTo("timezone")
        assertThat(analyticsResponse.to())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsResponse =
            AnalyticsResponse.builder()
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .bucket(AnalyticsResponse.Bucket.HOUR)
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSeries(
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
                )
                .summary(
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
                )
                .timezone("timezone")
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAnalyticsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsResponse),
                jacksonTypeRef<AnalyticsResponse>(),
            )

        assertThat(roundtrippedAnalyticsResponse).isEqualTo(analyticsResponse)
    }
}
