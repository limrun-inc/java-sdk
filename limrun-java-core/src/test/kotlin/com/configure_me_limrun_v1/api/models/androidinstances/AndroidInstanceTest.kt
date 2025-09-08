// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.models.androidinstances

import com.configure_me_limrun_v1.api.core.JsonValue
import com.configure_me_limrun_v1.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AndroidInstanceTest {

    @Test
    fun create() {
        val androidInstance =
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

        assertThat(androidInstance.metadata())
            .isEqualTo(
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
        assertThat(androidInstance.spec())
            .isEqualTo(
                AndroidInstance.Spec.builder()
                    .inactivityTimeout("inactivityTimeout")
                    .region("region")
                    .hardTimeout("hardTimeout")
                    .build()
            )
        assertThat(androidInstance.status())
            .isEqualTo(
                AndroidInstance.Status.builder()
                    .token("token")
                    .state(AndroidInstance.Status.State.UNKNOWN)
                    .adbWebSocketUrl("adbWebSocketUrl")
                    .endpointWebSocketUrl("endpointWebSocketUrl")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val androidInstance =
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

        val roundtrippedAndroidInstance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(androidInstance),
                jacksonTypeRef<AndroidInstance>(),
            )

        assertThat(roundtrippedAndroidInstance).isEqualTo(androidInstance)
    }
}
