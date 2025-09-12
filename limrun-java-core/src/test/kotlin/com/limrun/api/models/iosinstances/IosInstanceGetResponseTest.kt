// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IosInstanceGetResponseTest {

    @Test
    fun create() {
        val iosInstanceGetResponse =
            IosInstanceGetResponse.builder()
                .metadata(
                    IosInstanceGetResponse.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            IosInstanceGetResponse.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    IosInstanceGetResponse.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    IosInstanceGetResponse.Status.builder()
                        .token("token")
                        .state(IosInstanceGetResponse.Status.State.UNKNOWN)
                        .endpointWebSocketUrl("endpointWebSocketUrl")
                        .build()
                )
                .build()

        assertThat(iosInstanceGetResponse.metadata())
            .isEqualTo(
                IosInstanceGetResponse.Metadata.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("organizationId")
                    .displayName("displayName")
                    .labels(
                        IosInstanceGetResponse.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(iosInstanceGetResponse.spec())
            .isEqualTo(
                IosInstanceGetResponse.Spec.builder()
                    .inactivityTimeout("inactivityTimeout")
                    .region("region")
                    .hardTimeout("hardTimeout")
                    .build()
            )
        assertThat(iosInstanceGetResponse.status())
            .isEqualTo(
                IosInstanceGetResponse.Status.builder()
                    .token("token")
                    .state(IosInstanceGetResponse.Status.State.UNKNOWN)
                    .endpointWebSocketUrl("endpointWebSocketUrl")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val iosInstanceGetResponse =
            IosInstanceGetResponse.builder()
                .metadata(
                    IosInstanceGetResponse.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            IosInstanceGetResponse.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    IosInstanceGetResponse.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    IosInstanceGetResponse.Status.builder()
                        .token("token")
                        .state(IosInstanceGetResponse.Status.State.UNKNOWN)
                        .endpointWebSocketUrl("endpointWebSocketUrl")
                        .build()
                )
                .build()

        val roundtrippedIosInstanceGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(iosInstanceGetResponse),
                jacksonTypeRef<IosInstanceGetResponse>(),
            )

        assertThat(roundtrippedIosInstanceGetResponse).isEqualTo(iosInstanceGetResponse)
    }
}
