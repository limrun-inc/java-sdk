// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.androidinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AndroidInstanceListPageResponseTest {

    @Test
    fun create() {
        val androidInstanceListPageResponse =
            AndroidInstanceListPageResponse.builder()
                .addItem(
                    AndroidInstance.builder()
                        .metadata(
                            AndroidInstance.Metadata.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .organizationId("organizationId")
                                .displayName("displayName")
                                .labels(
                                    AndroidInstance.Metadata.Labels.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .spec(
                            AndroidInstance.Spec.builder()
                                .inactivityTimeout("inactivityTimeout")
                                .region("region")
                                .hardTimeout("hardTimeout")
                                .build()
                        )
                        .status(
                            AndroidInstance.Status.builder()
                                .token("token")
                                .state(AndroidInstance.Status.State.UNKNOWN)
                                .adbWebSocketUrl("adbWebSocketUrl")
                                .endpointWebSocketUrl("endpointWebSocketUrl")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(androidInstanceListPageResponse.items().getOrNull())
            .containsExactly(
                AndroidInstance.builder()
                    .metadata(
                        AndroidInstance.Metadata.builder()
                            .id("id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .organizationId("organizationId")
                            .displayName("displayName")
                            .labels(
                                AndroidInstance.Metadata.Labels.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .spec(
                        AndroidInstance.Spec.builder()
                            .inactivityTimeout("inactivityTimeout")
                            .region("region")
                            .hardTimeout("hardTimeout")
                            .build()
                    )
                    .status(
                        AndroidInstance.Status.builder()
                            .token("token")
                            .state(AndroidInstance.Status.State.UNKNOWN)
                            .adbWebSocketUrl("adbWebSocketUrl")
                            .endpointWebSocketUrl("endpointWebSocketUrl")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val androidInstanceListPageResponse =
            AndroidInstanceListPageResponse.builder()
                .addItem(
                    AndroidInstance.builder()
                        .metadata(
                            AndroidInstance.Metadata.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .organizationId("organizationId")
                                .displayName("displayName")
                                .labels(
                                    AndroidInstance.Metadata.Labels.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .spec(
                            AndroidInstance.Spec.builder()
                                .inactivityTimeout("inactivityTimeout")
                                .region("region")
                                .hardTimeout("hardTimeout")
                                .build()
                        )
                        .status(
                            AndroidInstance.Status.builder()
                                .token("token")
                                .state(AndroidInstance.Status.State.UNKNOWN)
                                .adbWebSocketUrl("adbWebSocketUrl")
                                .endpointWebSocketUrl("endpointWebSocketUrl")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedAndroidInstanceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(androidInstanceListPageResponse),
                jacksonTypeRef<AndroidInstanceListPageResponse>(),
            )

        assertThat(roundtrippedAndroidInstanceListPageResponse)
            .isEqualTo(androidInstanceListPageResponse)
    }
}
