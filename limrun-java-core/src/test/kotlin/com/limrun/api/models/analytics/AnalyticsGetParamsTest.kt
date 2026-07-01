// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.limrun.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsGetParamsTest {

    @Test
    fun create() {
        AnalyticsGetParams.builder()
            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .bucket(AnalyticsGetParams.Bucket.HOUR)
            .labels("labels")
            .region("region")
            .timezone("timezone")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AnalyticsGetParams.builder()
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .bucket(AnalyticsGetParams.Bucket.HOUR)
                .labels("labels")
                .region("region")
                .timezone("timezone")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from", "2019-12-27T18:11:19.117Z")
                    .put("to", "2019-12-27T18:11:19.117Z")
                    .put("bucket", "hour")
                    .put("labels", "labels")
                    .put("region", "region")
                    .put("timezone", "timezone")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AnalyticsGetParams.builder()
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from", "2019-12-27T18:11:19.117Z")
                    .put("to", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }
}
