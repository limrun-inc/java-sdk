// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.xcodeinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XcodeInstanceTest {

    @Test
    fun create() {
        val xcodeInstance =
            XcodeInstance.builder()
                .metadata(
                    XcodeInstance.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            XcodeInstance.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    XcodeInstance.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    XcodeInstance.Status.builder()
                        .token("token")
                        .state(XcodeInstance.Status.State.UNKNOWN)
                        .apiUrl("apiUrl")
                        .errorMessage("errorMessage")
                        .terminationReason("InactivityTimeout")
                        .build()
                )
                .build()

        assertThat(xcodeInstance.metadata())
            .isEqualTo(
                XcodeInstance.Metadata.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("organizationId")
                    .displayName("displayName")
                    .labels(
                        XcodeInstance.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(xcodeInstance.spec())
            .isEqualTo(
                XcodeInstance.Spec.builder()
                    .inactivityTimeout("inactivityTimeout")
                    .region("region")
                    .hardTimeout("hardTimeout")
                    .build()
            )
        assertThat(xcodeInstance.status())
            .isEqualTo(
                XcodeInstance.Status.builder()
                    .token("token")
                    .state(XcodeInstance.Status.State.UNKNOWN)
                    .apiUrl("apiUrl")
                    .errorMessage("errorMessage")
                    .terminationReason("InactivityTimeout")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xcodeInstance =
            XcodeInstance.builder()
                .metadata(
                    XcodeInstance.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            XcodeInstance.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    XcodeInstance.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    XcodeInstance.Status.builder()
                        .token("token")
                        .state(XcodeInstance.Status.State.UNKNOWN)
                        .apiUrl("apiUrl")
                        .errorMessage("errorMessage")
                        .terminationReason("InactivityTimeout")
                        .build()
                )
                .build()

        val roundtrippedXcodeInstance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xcodeInstance),
                jacksonTypeRef<XcodeInstance>(),
            )

        assertThat(roundtrippedXcodeInstance).isEqualTo(xcodeInstance)
    }
}
