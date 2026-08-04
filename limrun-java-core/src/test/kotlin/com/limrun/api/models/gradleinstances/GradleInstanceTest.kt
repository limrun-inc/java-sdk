// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.gradleinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GradleInstanceTest {

    @Test
    fun create() {
        val gradleInstance =
            GradleInstance.builder()
                .metadata(
                    GradleInstance.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            GradleInstance.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    GradleInstance.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    GradleInstance.Status.builder()
                        .token("token")
                        .state(GradleInstance.Status.State.UNKNOWN)
                        .apiUrl("apiUrl")
                        .errorMessage("errorMessage")
                        .terminationReason("InactivityTimeout")
                        .build()
                )
                .build()

        assertThat(gradleInstance.metadata())
            .isEqualTo(
                GradleInstance.Metadata.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("organizationId")
                    .displayName("displayName")
                    .labels(
                        GradleInstance.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(gradleInstance.spec())
            .isEqualTo(
                GradleInstance.Spec.builder()
                    .inactivityTimeout("inactivityTimeout")
                    .region("region")
                    .hardTimeout("hardTimeout")
                    .build()
            )
        assertThat(gradleInstance.status())
            .isEqualTo(
                GradleInstance.Status.builder()
                    .token("token")
                    .state(GradleInstance.Status.State.UNKNOWN)
                    .apiUrl("apiUrl")
                    .errorMessage("errorMessage")
                    .terminationReason("InactivityTimeout")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gradleInstance =
            GradleInstance.builder()
                .metadata(
                    GradleInstance.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            GradleInstance.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    GradleInstance.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    GradleInstance.Status.builder()
                        .token("token")
                        .state(GradleInstance.Status.State.UNKNOWN)
                        .apiUrl("apiUrl")
                        .errorMessage("errorMessage")
                        .terminationReason("InactivityTimeout")
                        .build()
                )
                .build()

        val roundtrippedGradleInstance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gradleInstance),
                jacksonTypeRef<GradleInstance>(),
            )

        assertThat(roundtrippedGradleInstance).isEqualTo(gradleInstance)
    }
}
