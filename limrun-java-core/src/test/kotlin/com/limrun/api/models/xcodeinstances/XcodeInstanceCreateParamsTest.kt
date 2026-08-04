// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.xcodeinstances

import com.limrun.api.core.JsonValue
import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XcodeInstanceCreateParamsTest {

    @Test
    fun create() {
        XcodeInstanceCreateParams.builder()
            .reuseIfExists(true)
            .wait(true)
            .metadata(
                XcodeInstanceCreateParams.Metadata.builder()
                    .displayName("displayName")
                    .labels(
                        XcodeInstanceCreateParams.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .spec(
                XcodeInstanceCreateParams.Spec.builder()
                    .addClue(
                        XcodeInstanceCreateParams.Spec.Clue.builder()
                            .kind(XcodeInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                            .clientIp("clientIp")
                            .build()
                    )
                    .hardTimeout("hardTimeout")
                    .inactivityTimeout("inactivityTimeout")
                    .jurisdiction(XcodeInstanceCreateParams.Spec.Jurisdiction.US)
                    .region("region")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            XcodeInstanceCreateParams.builder()
                .reuseIfExists(true)
                .wait(true)
                .metadata(
                    XcodeInstanceCreateParams.Metadata.builder()
                        .displayName("displayName")
                        .labels(
                            XcodeInstanceCreateParams.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .spec(
                    XcodeInstanceCreateParams.Spec.builder()
                        .addClue(
                            XcodeInstanceCreateParams.Spec.Clue.builder()
                                .kind(XcodeInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                .clientIp("clientIp")
                                .build()
                        )
                        .hardTimeout("hardTimeout")
                        .inactivityTimeout("inactivityTimeout")
                        .jurisdiction(XcodeInstanceCreateParams.Spec.Jurisdiction.US)
                        .region("region")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("reuseIfExists", "true").put("wait", "true").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = XcodeInstanceCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            XcodeInstanceCreateParams.builder()
                .reuseIfExists(true)
                .wait(true)
                .metadata(
                    XcodeInstanceCreateParams.Metadata.builder()
                        .displayName("displayName")
                        .labels(
                            XcodeInstanceCreateParams.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .spec(
                    XcodeInstanceCreateParams.Spec.builder()
                        .addClue(
                            XcodeInstanceCreateParams.Spec.Clue.builder()
                                .kind(XcodeInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                .clientIp("clientIp")
                                .build()
                        )
                        .hardTimeout("hardTimeout")
                        .inactivityTimeout("inactivityTimeout")
                        .jurisdiction(XcodeInstanceCreateParams.Spec.Jurisdiction.US)
                        .region("region")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .contains(
                XcodeInstanceCreateParams.Metadata.builder()
                    .displayName("displayName")
                    .labels(
                        XcodeInstanceCreateParams.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.spec())
            .contains(
                XcodeInstanceCreateParams.Spec.builder()
                    .addClue(
                        XcodeInstanceCreateParams.Spec.Clue.builder()
                            .kind(XcodeInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                            .clientIp("clientIp")
                            .build()
                    )
                    .hardTimeout("hardTimeout")
                    .inactivityTimeout("inactivityTimeout")
                    .jurisdiction(XcodeInstanceCreateParams.Spec.Jurisdiction.US)
                    .region("region")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = XcodeInstanceCreateParams.builder().build()

        val body = params._body()
    }
}
