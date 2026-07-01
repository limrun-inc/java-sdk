// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsRegionStatsTest {

    @Test
    fun create() {
        val analyticsRegionStats =
            AnalyticsRegionStats.builder()
                .avgDurationMinutes(0.0)
                .billedMinutes(0L)
                .cost(0.0)
                .count(0L)
                .creditsBilledMinutes(0L)
                .creditsCost(0.0)
                .onDemandBilledMinutes(0L)
                .onDemandCost(0.0)
                .runtimeMinutes(0L)
                .subscriptionBilledMinutes(
                    AnalyticsRegionStats.SubscriptionBilledMinutes.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .subscriptionCost(
                    AnalyticsRegionStats.SubscriptionCost.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        assertThat(analyticsRegionStats.avgDurationMinutes()).isEqualTo(0.0)
        assertThat(analyticsRegionStats.billedMinutes()).isEqualTo(0L)
        assertThat(analyticsRegionStats.cost()).isEqualTo(0.0)
        assertThat(analyticsRegionStats.count()).isEqualTo(0L)
        assertThat(analyticsRegionStats.creditsBilledMinutes()).isEqualTo(0L)
        assertThat(analyticsRegionStats.creditsCost()).isEqualTo(0.0)
        assertThat(analyticsRegionStats.onDemandBilledMinutes()).isEqualTo(0L)
        assertThat(analyticsRegionStats.onDemandCost()).isEqualTo(0.0)
        assertThat(analyticsRegionStats.runtimeMinutes()).isEqualTo(0L)
        assertThat(analyticsRegionStats.subscriptionBilledMinutes())
            .contains(
                AnalyticsRegionStats.SubscriptionBilledMinutes.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(analyticsRegionStats.subscriptionCost())
            .contains(
                AnalyticsRegionStats.SubscriptionCost.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsRegionStats =
            AnalyticsRegionStats.builder()
                .avgDurationMinutes(0.0)
                .billedMinutes(0L)
                .cost(0.0)
                .count(0L)
                .creditsBilledMinutes(0L)
                .creditsCost(0.0)
                .onDemandBilledMinutes(0L)
                .onDemandCost(0.0)
                .runtimeMinutes(0L)
                .subscriptionBilledMinutes(
                    AnalyticsRegionStats.SubscriptionBilledMinutes.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .subscriptionCost(
                    AnalyticsRegionStats.SubscriptionCost.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        val roundtrippedAnalyticsRegionStats =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsRegionStats),
                jacksonTypeRef<AnalyticsRegionStats>(),
            )

        assertThat(roundtrippedAnalyticsRegionStats).isEqualTo(analyticsRegionStats)
    }
}
