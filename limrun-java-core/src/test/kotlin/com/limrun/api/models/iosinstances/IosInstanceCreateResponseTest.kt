// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IosInstanceCreateResponseTest {

    @Test
    fun create() {
        val iosInstanceCreateResponse =
            IosInstanceCreateResponse.builder()
                .metadata(
                    IosInstanceCreateResponse.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            IosInstanceCreateResponse.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    IosInstanceCreateResponse.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    IosInstanceCreateResponse.Status.builder()
                        .token("token")
                        .state(IosInstanceCreateResponse.Status.State.UNKNOWN)
                        .endpointWebSocketUrl("endpointWebSocketUrl")
                        .build()
                )
                .build()

        assertThat(iosInstanceCreateResponse.metadata())
            .isEqualTo(
                IosInstanceCreateResponse.Metadata.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("organizationId")
                    .displayName("displayName")
                    .labels(
                        IosInstanceCreateResponse.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(iosInstanceCreateResponse.spec())
            .isEqualTo(
                IosInstanceCreateResponse.Spec.builder()
                    .inactivityTimeout("inactivityTimeout")
                    .region("region")
                    .hardTimeout("hardTimeout")
                    .build()
            )
        assertThat(iosInstanceCreateResponse.status())
            .isEqualTo(
                IosInstanceCreateResponse.Status.builder()
                    .token("token")
                    .state(IosInstanceCreateResponse.Status.State.UNKNOWN)
                    .endpointWebSocketUrl("endpointWebSocketUrl")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val iosInstanceCreateResponse =
            IosInstanceCreateResponse.builder()
                .metadata(
                    IosInstanceCreateResponse.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            IosInstanceCreateResponse.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    IosInstanceCreateResponse.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    IosInstanceCreateResponse.Status.builder()
                        .token("token")
                        .state(IosInstanceCreateResponse.Status.State.UNKNOWN)
                        .endpointWebSocketUrl("endpointWebSocketUrl")
                        .build()
                )
                .build()

        val roundtrippedIosInstanceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(iosInstanceCreateResponse),
                jacksonTypeRef<IosInstanceCreateResponse>(),
            )

        assertThat(roundtrippedIosInstanceCreateResponse).isEqualTo(iosInstanceCreateResponse)
    }
}
