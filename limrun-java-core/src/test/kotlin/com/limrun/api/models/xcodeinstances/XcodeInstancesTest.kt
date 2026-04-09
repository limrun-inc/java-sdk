// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.xcodeinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XcodeInstancesTest {

    @Test
    fun create() {
        val xcodeInstances =
            XcodeInstances.builder()
                .metadata(
                    XcodeInstances.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            XcodeInstances.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    XcodeInstances.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    XcodeInstances.Status.builder()
                        .token("token")
                        .state(XcodeInstances.Status.State.UNKNOWN)
                        .apiUrl("apiUrl")
                        .errorMessage("errorMessage")
                        .build()
                )
                .build()

        assertThat(xcodeInstances.metadata())
            .isEqualTo(
                XcodeInstances.Metadata.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("organizationId")
                    .displayName("displayName")
                    .labels(
                        XcodeInstances.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(xcodeInstances.spec())
            .isEqualTo(
                XcodeInstances.Spec.builder()
                    .inactivityTimeout("inactivityTimeout")
                    .region("region")
                    .hardTimeout("hardTimeout")
                    .build()
            )
        assertThat(xcodeInstances.status())
            .isEqualTo(
                XcodeInstances.Status.builder()
                    .token("token")
                    .state(XcodeInstances.Status.State.UNKNOWN)
                    .apiUrl("apiUrl")
                    .errorMessage("errorMessage")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xcodeInstances =
            XcodeInstances.builder()
                .metadata(
                    XcodeInstances.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            XcodeInstances.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    XcodeInstances.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    XcodeInstances.Status.builder()
                        .token("token")
                        .state(XcodeInstances.Status.State.UNKNOWN)
                        .apiUrl("apiUrl")
                        .errorMessage("errorMessage")
                        .build()
                )
                .build()

        val roundtrippedXcodeInstances =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xcodeInstances),
                jacksonTypeRef<XcodeInstances>(),
            )

        assertThat(roundtrippedXcodeInstances).isEqualTo(xcodeInstances)
    }
}
