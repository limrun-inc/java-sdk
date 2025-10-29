// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.androidinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AndroidInstanceListResponseTest {

    @Test
    fun create() {
        val androidInstanceListResponse =
            AndroidInstanceListResponse.builder()
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

        assertThat(androidInstanceListResponse.items().getOrNull())
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
        val androidInstanceListResponse =
            AndroidInstanceListResponse.builder()
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

        val roundtrippedAndroidInstanceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(androidInstanceListResponse),
                jacksonTypeRef<AndroidInstanceListResponse>(),
            )

        assertThat(roundtrippedAndroidInstanceListResponse).isEqualTo(androidInstanceListResponse)
    }
}
