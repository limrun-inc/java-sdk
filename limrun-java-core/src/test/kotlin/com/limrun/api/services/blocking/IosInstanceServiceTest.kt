// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.core.JsonValue
import com.limrun.api.models.iosinstances.IosInstanceCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IosInstanceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val iosInstanceService = client.iosInstances()

        val iosInstance =
            iosInstanceService.create(
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
                            .forceBundleId("x")
                            .hardTimeout("hardTimeout")
                            .inactivityTimeout("inactivityTimeout")
                            .addInitialAsset(
                                IosInstanceCreateParams.Spec.InitialAsset.builder()
                                    .kind(IosInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                                    .source(IosInstanceCreateParams.Spec.InitialAsset.Source.URL)
                                    .assetId("assetId")
                                    .assetName("assetName")
                                    .encryptionKey("encryptionKey")
                                    .launchMode(
                                        IosInstanceCreateParams.Spec.InitialAsset.LaunchMode
                                            .FOREGROUND_IF_RUNNING
                                    )
                                    .url("url")
                                    .build()
                            )
                            .model(IosInstanceCreateParams.Spec.Model.IPHONE)
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
            )

        iosInstance.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val iosInstanceService = client.iosInstances()

        val page = iosInstanceService.list()

        page.items().forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val iosInstanceService = client.iosInstances()

        iosInstanceService.delete("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val iosInstanceService = client.iosInstances()

        val iosInstance = iosInstanceService.get("id")

        iosInstance.validate()
    }
}
