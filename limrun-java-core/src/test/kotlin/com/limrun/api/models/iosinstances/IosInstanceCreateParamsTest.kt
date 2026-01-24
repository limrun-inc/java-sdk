// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.limrun.api.core.JsonValue
import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IosInstanceCreateParamsTest {

    @Test
    fun create() {
        IosInstanceCreateParams.builder()
            .reuseIfExists(true)
            .wait(true)
            .metadata(
                IosInstanceCreateParams.Metadata.builder()
                    .displayName("displayName")
                    .labels(
                        IosInstanceCreateParams.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .spec(
                IosInstanceCreateParams.Spec.builder()
                    .addClue(
                        IosInstanceCreateParams.Spec.Clue.builder()
                            .kind(IosInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                            .clientIp("clientIp")
                            .build()
                    )
                    .hardTimeout("hardTimeout")
                    .inactivityTimeout("inactivityTimeout")
                    .addInitialAsset(
                        IosInstanceCreateParams.Spec.InitialAsset.builder()
                            .kind(IosInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                            .source(IosInstanceCreateParams.Spec.InitialAsset.Source.URL)
                            .assetId("assetId")
                            .assetName("assetName")
                            .launchMode(
                                IosInstanceCreateParams.Spec.InitialAsset.LaunchMode
                                    .FOREGROUND_IF_RUNNING
                            )
                            .url("url")
                            .build()
                    )
                    .region("region")
                    .sandbox(
                        IosInstanceCreateParams.Spec.Sandbox.builder()
                            .xcode(
                                IosInstanceCreateParams.Spec.Sandbox.Xcode.builder()
                                    .enabled(true)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IosInstanceCreateParams.builder()
                .reuseIfExists(true)
                .wait(true)
                .metadata(
                    IosInstanceCreateParams.Metadata.builder()
                        .displayName("displayName")
                        .labels(
                            IosInstanceCreateParams.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .spec(
                    IosInstanceCreateParams.Spec.builder()
                        .addClue(
                            IosInstanceCreateParams.Spec.Clue.builder()
                                .kind(IosInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                .clientIp("clientIp")
                                .build()
                        )
                        .hardTimeout("hardTimeout")
                        .inactivityTimeout("inactivityTimeout")
                        .addInitialAsset(
                            IosInstanceCreateParams.Spec.InitialAsset.builder()
                                .kind(IosInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                                .source(IosInstanceCreateParams.Spec.InitialAsset.Source.URL)
                                .assetId("assetId")
                                .assetName("assetName")
                                .launchMode(
                                    IosInstanceCreateParams.Spec.InitialAsset.LaunchMode
                                        .FOREGROUND_IF_RUNNING
                                )
                                .url("url")
                                .build()
                        )
                        .region("region")
                        .sandbox(
                            IosInstanceCreateParams.Spec.Sandbox.builder()
                                .xcode(
                                    IosInstanceCreateParams.Spec.Sandbox.Xcode.builder()
                                        .enabled(true)
                                        .build()
                                )
                                .build()
                        )
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
        val params = IosInstanceCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            IosInstanceCreateParams.builder()
                .reuseIfExists(true)
                .wait(true)
                .metadata(
                    IosInstanceCreateParams.Metadata.builder()
                        .displayName("displayName")
                        .labels(
                            IosInstanceCreateParams.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .spec(
                    IosInstanceCreateParams.Spec.builder()
                        .addClue(
                            IosInstanceCreateParams.Spec.Clue.builder()
                                .kind(IosInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                .clientIp("clientIp")
                                .build()
                        )
                        .hardTimeout("hardTimeout")
                        .inactivityTimeout("inactivityTimeout")
                        .addInitialAsset(
                            IosInstanceCreateParams.Spec.InitialAsset.builder()
                                .kind(IosInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                                .source(IosInstanceCreateParams.Spec.InitialAsset.Source.URL)
                                .assetId("assetId")
                                .assetName("assetName")
                                .launchMode(
                                    IosInstanceCreateParams.Spec.InitialAsset.LaunchMode
                                        .FOREGROUND_IF_RUNNING
                                )
                                .url("url")
                                .build()
                        )
                        .region("region")
                        .sandbox(
                            IosInstanceCreateParams.Spec.Sandbox.builder()
                                .xcode(
                                    IosInstanceCreateParams.Spec.Sandbox.Xcode.builder()
                                        .enabled(true)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .contains(
                IosInstanceCreateParams.Metadata.builder()
                    .displayName("displayName")
                    .labels(
                        IosInstanceCreateParams.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.spec())
            .contains(
                IosInstanceCreateParams.Spec.builder()
                    .addClue(
                        IosInstanceCreateParams.Spec.Clue.builder()
                            .kind(IosInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                            .clientIp("clientIp")
                            .build()
                    )
                    .hardTimeout("hardTimeout")
                    .inactivityTimeout("inactivityTimeout")
                    .addInitialAsset(
                        IosInstanceCreateParams.Spec.InitialAsset.builder()
                            .kind(IosInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                            .source(IosInstanceCreateParams.Spec.InitialAsset.Source.URL)
                            .assetId("assetId")
                            .assetName("assetName")
                            .launchMode(
                                IosInstanceCreateParams.Spec.InitialAsset.LaunchMode
                                    .FOREGROUND_IF_RUNNING
                            )
                            .url("url")
                            .build()
                    )
                    .region("region")
                    .sandbox(
                        IosInstanceCreateParams.Spec.Sandbox.builder()
                            .xcode(
                                IosInstanceCreateParams.Spec.Sandbox.Xcode.builder()
                                    .enabled(true)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IosInstanceCreateParams.builder().build()

        val body = params._body()
    }
}
