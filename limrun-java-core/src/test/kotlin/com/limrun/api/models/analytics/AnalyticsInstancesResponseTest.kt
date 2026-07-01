// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsInstancesResponseTest {

    @Test
    fun create() {
        val analyticsInstancesResponse =
            AnalyticsInstancesResponse.builder()
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSeries(
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
                )
                .timezone("timezone")
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(analyticsInstancesResponse.asOf())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(analyticsInstancesResponse.from())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(analyticsInstancesResponse.series())
            .containsExactly(
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
            )
        assertThat(analyticsInstancesResponse.timezone()).isEqualTo("timezone")
        assertThat(analyticsInstancesResponse.to())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsInstancesResponse =
            AnalyticsInstancesResponse.builder()
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSeries(
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
                )
                .timezone("timezone")
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAnalyticsInstancesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsInstancesResponse),
                jacksonTypeRef<AnalyticsInstancesResponse>(),
            )

        assertThat(roundtrippedAnalyticsInstancesResponse).isEqualTo(analyticsInstancesResponse)
    }
}
