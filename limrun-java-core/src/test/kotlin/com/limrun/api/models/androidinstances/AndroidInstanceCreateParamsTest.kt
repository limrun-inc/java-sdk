// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.androidinstances

import com.limrun.api.core.JsonValue
import com.limrun.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AndroidInstanceCreateParamsTest {

    @Test
    fun create() {
        AndroidInstanceCreateParams.builder()
            .wait(true)
            .metadata(
                AndroidInstanceCreateParams.Metadata.builder()
                    .displayName("displayName")
                    .labels(
                        AndroidInstanceCreateParams.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .spec(
                AndroidInstanceCreateParams.Spec.builder()
                    .addClue(
                        AndroidInstanceCreateParams.Spec.Clue.builder()
                            .kind(AndroidInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                            .clientIp("clientIp")
                            .build()
                    )
                    .hardTimeout("hardTimeout")
                    .inactivityTimeout("inactivityTimeout")
                    .addInitialAsset(
                        AndroidInstanceCreateParams.Spec.InitialAsset.builder()
                            .kind(AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                            .source(AndroidInstanceCreateParams.Spec.InitialAsset.Source.URL)
                            .assetName("assetName")
                            .addAssetName("string")
                            .url("url")
                            .addUrl("string")
                            .build()
                    )
                    .region("region")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AndroidInstanceCreateParams.builder()
                .wait(true)
                .metadata(
                    AndroidInstanceCreateParams.Metadata.builder()
                        .displayName("displayName")
                        .labels(
                            AndroidInstanceCreateParams.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .spec(
                    AndroidInstanceCreateParams.Spec.builder()
                        .addClue(
                            AndroidInstanceCreateParams.Spec.Clue.builder()
                                .kind(AndroidInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                .clientIp("clientIp")
                                .build()
                        )
                        .hardTimeout("hardTimeout")
                        .inactivityTimeout("inactivityTimeout")
                        .addInitialAsset(
                            AndroidInstanceCreateParams.Spec.InitialAsset.builder()
                                .kind(AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                                .source(AndroidInstanceCreateParams.Spec.InitialAsset.Source.URL)
                                .assetName("assetName")
                                .addAssetName("string")
                                .url("url")
                                .addUrl("string")
                                .build()
                        )
                        .region("region")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("wait", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AndroidInstanceCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            AndroidInstanceCreateParams.builder()
                .wait(true)
                .metadata(
                    AndroidInstanceCreateParams.Metadata.builder()
                        .displayName("displayName")
                        .labels(
                            AndroidInstanceCreateParams.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .spec(
                    AndroidInstanceCreateParams.Spec.builder()
                        .addClue(
                            AndroidInstanceCreateParams.Spec.Clue.builder()
                                .kind(AndroidInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                .clientIp("clientIp")
                                .build()
                        )
                        .hardTimeout("hardTimeout")
                        .inactivityTimeout("inactivityTimeout")
                        .addInitialAsset(
                            AndroidInstanceCreateParams.Spec.InitialAsset.builder()
                                .kind(AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                                .source(AndroidInstanceCreateParams.Spec.InitialAsset.Source.URL)
                                .assetName("assetName")
                                .addAssetName("string")
                                .url("url")
                                .addUrl("string")
                                .build()
                        )
                        .region("region")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .contains(
                AndroidInstanceCreateParams.Metadata.builder()
                    .displayName("displayName")
                    .labels(
                        AndroidInstanceCreateParams.Metadata.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.spec())
            .contains(
                AndroidInstanceCreateParams.Spec.builder()
                    .addClue(
                        AndroidInstanceCreateParams.Spec.Clue.builder()
                            .kind(AndroidInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                            .clientIp("clientIp")
                            .build()
                    )
                    .hardTimeout("hardTimeout")
                    .inactivityTimeout("inactivityTimeout")
                    .addInitialAsset(
                        AndroidInstanceCreateParams.Spec.InitialAsset.builder()
                            .kind(AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                            .source(AndroidInstanceCreateParams.Spec.InitialAsset.Source.URL)
                            .assetName("assetName")
                            .addAssetName("string")
                            .url("url")
                            .addUrl("string")
                            .build()
                    )
                    .region("region")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AndroidInstanceCreateParams.builder().build()

        val body = params._body()
    }
}
