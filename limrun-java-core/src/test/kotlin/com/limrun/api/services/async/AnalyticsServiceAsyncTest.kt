// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.client.okhttp.LimrunOkHttpClientAsync
import com.limrun.api.models.analytics.AnalyticsGetInstancesParams
import com.limrun.api.models.analytics.AnalyticsGetParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnalyticsServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analyticsServiceAsync = client.analytics()

        val analyticsResponseFuture =
            analyticsServiceAsync.get(
                AnalyticsGetParams.builder()
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .bucket(AnalyticsGetParams.Bucket.HOUR)
                    .labels("labels")
                    .region("region")
                    .timezone("timezone")
                    .build()
            )

        val analyticsResponse = analyticsResponseFuture.get()
        analyticsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstances() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analyticsServiceAsync = client.analytics()

        val analyticsInstancesResponseFuture =
            analyticsServiceAsync.getInstances(
                AnalyticsGetInstancesParams.builder()
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .labels("labels")
                    .region("region")
                    .timezone("timezone")
                    .build()
            )

        val analyticsInstancesResponse = analyticsInstancesResponseFuture.get()
        analyticsInstancesResponse.validate()
    }
}
