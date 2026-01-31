// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IosInstanceTest {

    @Test
    fun create() {
        val iosInstance =
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
                        .apiUrl("apiUrl")
                        .endpointWebSocketUrl("endpointWebSocketUrl")
                        .errorMessage("errorMessage")
                        .mcpUrl("mcpUrl")
                        .sandbox(
                            IosInstance.Status.Sandbox.builder()
                                .xcode(
                                    IosInstance.Status.Sandbox.Xcode.builder().url("url").build()
                                )
                                .build()
                        )
                        .targetHttpPortUrlPrefix("targetHttpPortUrlPrefix")
                        .build()
                )
                .build()

        assertThat(iosInstance.metadata())
            .isEqualTo(
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
        assertThat(iosInstance.spec())
            .isEqualTo(
                IosInstance.Spec.builder()
                    .inactivityTimeout("inactivityTimeout")
                    .region("region")
                    .hardTimeout("hardTimeout")
                    .build()
            )
        assertThat(iosInstance.status())
            .isEqualTo(
                IosInstance.Status.builder()
                    .token("token")
                    .state(IosInstance.Status.State.UNKNOWN)
                    .apiUrl("apiUrl")
                    .endpointWebSocketUrl("endpointWebSocketUrl")
                    .errorMessage("errorMessage")
                    .mcpUrl("mcpUrl")
                    .sandbox(
                        IosInstance.Status.Sandbox.builder()
                            .xcode(IosInstance.Status.Sandbox.Xcode.builder().url("url").build())
                            .build()
                    )
                    .targetHttpPortUrlPrefix("targetHttpPortUrlPrefix")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val iosInstance =
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
                        .apiUrl("apiUrl")
                        .endpointWebSocketUrl("endpointWebSocketUrl")
                        .errorMessage("errorMessage")
                        .mcpUrl("mcpUrl")
                        .sandbox(
                            IosInstance.Status.Sandbox.builder()
                                .xcode(
                                    IosInstance.Status.Sandbox.Xcode.builder().url("url").build()
                                )
                                .build()
                        )
                        .targetHttpPortUrlPrefix("targetHttpPortUrlPrefix")
                        .build()
                )
                .build()

        val roundtrippedIosInstance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(iosInstance),
                jacksonTypeRef<IosInstance>(),
            )

        assertThat(roundtrippedIosInstance).isEqualTo(iosInstance)
    }
}
