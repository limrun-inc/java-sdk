// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IosInstanceListResponseTest {

    @Test
    fun create() {
        val iosInstanceListResponse =
            IosInstanceListResponse.builder()
                .metadata(
                    IosInstanceListResponse.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            IosInstanceListResponse.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    IosInstanceListResponse.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    IosInstanceListResponse.Status.builder()
                        .token("token")
                        .state(IosInstanceListResponse.Status.State.UNKNOWN)
                        .endpointWebSocketUrl("endpointWebSocketUrl")
                        .build()
                )
                .build()

        assertThat(iosInstanceListResponse.metadata())
            .isEqualTo(
                IosInstanceListResponse.Metadata.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("organizationId")
                    .displayName("displayName")
                    .labels(
                        IosInstanceListResponse.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(iosInstanceListResponse.spec())
            .isEqualTo(
                IosInstanceListResponse.Spec.builder()
                    .inactivityTimeout("inactivityTimeout")
                    .region("region")
                    .hardTimeout("hardTimeout")
                    .build()
            )
        assertThat(iosInstanceListResponse.status())
            .isEqualTo(
                IosInstanceListResponse.Status.builder()
                    .token("token")
                    .state(IosInstanceListResponse.Status.State.UNKNOWN)
                    .endpointWebSocketUrl("endpointWebSocketUrl")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val iosInstanceListResponse =
            IosInstanceListResponse.builder()
                .metadata(
                    IosInstanceListResponse.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            IosInstanceListResponse.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    IosInstanceListResponse.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    IosInstanceListResponse.Status.builder()
                        .token("token")
                        .state(IosInstanceListResponse.Status.State.UNKNOWN)
                        .endpointWebSocketUrl("endpointWebSocketUrl")
                        .build()
                )
                .build()

        val roundtrippedIosInstanceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(iosInstanceListResponse),
                jacksonTypeRef<IosInstanceListResponse>(),
            )

        assertThat(roundtrippedIosInstanceListResponse).isEqualTo(iosInstanceListResponse)
    }
}
