// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.gradleinstances

import com.limrun.api.core.JsonValue
import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GradleInstanceCreateParamsTest {

    @Test
    fun create() {
        GradleInstanceCreateParams.builder()
            .reuseIfExists(true)
            .wait(true)
            .metadata(
                GradleInstanceCreateParams.Metadata.builder()
                    .displayName("displayName")
                    .labels(
                        GradleInstanceCreateParams.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .spec(
                GradleInstanceCreateParams.Spec.builder()
                    .addClue(
                        GradleInstanceCreateParams.Spec.Clue.builder()
                            .kind(GradleInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                            .clientIp("clientIp")
                            .build()
                    )
                    .hardTimeout("hardTimeout")
                    .inactivityTimeout("inactivityTimeout")
                    .jurisdiction(GradleInstanceCreateParams.Spec.Jurisdiction.US)
                    .region("region")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GradleInstanceCreateParams.builder()
                .reuseIfExists(true)
                .wait(true)
                .metadata(
                    GradleInstanceCreateParams.Metadata.builder()
                        .displayName("displayName")
                        .labels(
                            GradleInstanceCreateParams.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .spec(
                    GradleInstanceCreateParams.Spec.builder()
                        .addClue(
                            GradleInstanceCreateParams.Spec.Clue.builder()
                                .kind(GradleInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                .clientIp("clientIp")
                                .build()
                        )
                        .hardTimeout("hardTimeout")
                        .inactivityTimeout("inactivityTimeout")
                        .jurisdiction(GradleInstanceCreateParams.Spec.Jurisdiction.US)
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
        val params = GradleInstanceCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            GradleInstanceCreateParams.builder()
                .reuseIfExists(true)
                .wait(true)
                .metadata(
                    GradleInstanceCreateParams.Metadata.builder()
                        .displayName("displayName")
                        .labels(
                            GradleInstanceCreateParams.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .spec(
                    GradleInstanceCreateParams.Spec.builder()
                        .addClue(
                            GradleInstanceCreateParams.Spec.Clue.builder()
                                .kind(GradleInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                .clientIp("clientIp")
                                .build()
                        )
                        .hardTimeout("hardTimeout")
                        .inactivityTimeout("inactivityTimeout")
                        .jurisdiction(GradleInstanceCreateParams.Spec.Jurisdiction.US)
                        .region("region")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .contains(
                GradleInstanceCreateParams.Metadata.builder()
                    .displayName("displayName")
                    .labels(
                        GradleInstanceCreateParams.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.spec())
            .contains(
                GradleInstanceCreateParams.Spec.builder()
                    .addClue(
                        GradleInstanceCreateParams.Spec.Clue.builder()
                            .kind(GradleInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                            .clientIp("clientIp")
                            .build()
                    )
                    .hardTimeout("hardTimeout")
                    .inactivityTimeout("inactivityTimeout")
                    .jurisdiction(GradleInstanceCreateParams.Spec.Jurisdiction.US)
                    .region("region")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GradleInstanceCreateParams.builder().build()

        val body = params._body()
    }
}
