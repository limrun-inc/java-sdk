// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BilledBreakdownTest {

    @Test
    fun create() {
        val billedBreakdown =
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

        assertThat(billedBreakdown.creditsBilledMinutes()).isEqualTo(0L)
        assertThat(billedBreakdown.onDemandBilledMinutes()).isEqualTo(0L)
        assertThat(billedBreakdown.planBilledMinutes())
            .contains(
                BilledBreakdown.PlanBilledMinutes.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(billedBreakdown.subscriptionBilledMinutes())
            .contains(
                BilledBreakdown.SubscriptionBilledMinutes.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billedBreakdown =
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

        val roundtrippedBilledBreakdown =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billedBreakdown),
                jacksonTypeRef<BilledBreakdown>(),
            )

        assertThat(roundtrippedBilledBreakdown).isEqualTo(billedBreakdown)
    }
}
