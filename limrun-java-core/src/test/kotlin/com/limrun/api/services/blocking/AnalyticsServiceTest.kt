// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.models.analytics.AnalyticsGetInstancesParams
import com.limrun.api.models.analytics.AnalyticsGetParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnalyticsServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val analyticsService = client.analytics()

        val analyticsResponse =
            analyticsService.get(
                AnalyticsGetParams.builder()
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .bucket(AnalyticsGetParams.Bucket.HOUR)
                    .labels("labels")
                    .region("region")
                    .timezone("timezone")
                    .build()
            )

        analyticsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstances() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val analyticsService = client.analytics()

        val analyticsInstancesResponse =
            analyticsService.getInstances(
                AnalyticsGetInstancesParams.builder()
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .labels("labels")
                    .region("region")
                    .timezone("timezone")
                    .build()
            )

        analyticsInstancesResponse.validate()
    }
}
