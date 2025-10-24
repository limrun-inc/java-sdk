// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IosInstanceListPageResponseTest {

    @Test
    fun create() {
        val iosInstanceListPageResponse =
            IosInstanceListPageResponse.builder()
                .addItem(
                    IosInstance.builder()
                        .metadata(
                            IosInstance.Metadata.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .organizationId("organizationId")
                                .displayName("displayName")
                                .labels(
                                    IosInstance.Metadata.Labels.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .spec(
                            IosInstance.Spec.builder()
                                .inactivityTimeout("inactivityTimeout")
                                .region("region")
                                .hardTimeout("hardTimeout")
                                .build()
                        )
                        .status(
                            IosInstance.Status.builder()
                                .token("token")
                                .state(IosInstance.Status.State.UNKNOWN)
                                .endpointWebSocketUrl("endpointWebSocketUrl")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(iosInstanceListPageResponse.items().getOrNull())
            .containsExactly(
                IosInstance.builder()
                    .metadata(
                        IosInstance.Metadata.builder()
                            .id("id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .organizationId("organizationId")
                            .displayName("displayName")
                            .labels(
                                IosInstance.Metadata.Labels.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .spec(
                        IosInstance.Spec.builder()
                            .inactivityTimeout("inactivityTimeout")
                            .region("region")
                            .hardTimeout("hardTimeout")
                            .build()
                    )
                    .status(
                        IosInstance.Status.builder()
                            .token("token")
                            .state(IosInstance.Status.State.UNKNOWN)
                            .endpointWebSocketUrl("endpointWebSocketUrl")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val iosInstanceListPageResponse =
            IosInstanceListPageResponse.builder()
                .addItem(
                    IosInstance.builder()
                        .metadata(
                            IosInstance.Metadata.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .organizationId("organizationId")
                                .displayName("displayName")
                                .labels(
                                    IosInstance.Metadata.Labels.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .spec(
                            IosInstance.Spec.builder()
                                .inactivityTimeout("inactivityTimeout")
                                .region("region")
                                .hardTimeout("hardTimeout")
                                .build()
                        )
                        .status(
                            IosInstance.Status.builder()
                                .token("token")
                                .state(IosInstance.Status.State.UNKNOWN)
                                .endpointWebSocketUrl("endpointWebSocketUrl")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedIosInstanceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(iosInstanceListPageResponse),
                jacksonTypeRef<IosInstanceListPageResponse>(),
            )

        assertThat(roundtrippedIosInstanceListPageResponse).isEqualTo(iosInstanceListPageResponse)
    }
}
