// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.limrun.api.TestServerExtension
import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.core.JsonValue
import com.limrun.api.models.androidinstances.AndroidInstanceCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AndroidInstanceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val androidInstanceService = client.androidInstances()

        val androidInstance =
            androidInstanceService.create(
                AndroidInstanceCreateParams.builder()
                    .reuseIfExists(true)
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
                                    .osVersion("osVersion")
                                    .build()
                            )
                            .hardTimeout("hardTimeout")
                            .inactivityTimeout("inactivityTimeout")
                            .addInitialAsset(
                                AndroidInstanceCreateParams.Spec.InitialAsset.builder()
                                    .kind(AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                                    .addAssetId("string")
                                    .assetName("assetName")
                                    .addAssetName("string")
                                    .configuration(
                                        AndroidInstanceCreateParams.Spec.InitialAsset.Configuration
                                            .builder()
                                            .kind(
                                                AndroidInstanceCreateParams.Spec.InitialAsset
                                                    .Configuration
                                                    .Kind
                                                    .CHROME_FLAG
                                            )
                                            .chromeFlag(
                                                AndroidInstanceCreateParams.Spec.InitialAsset
                                                    .Configuration
                                                    .ChromeFlag
                                                    .ENABLE_COMMAND_LINE_ON_NON_ROOTED_DEVICES_1
                                            )
                                            .build()
                                    )
                                    .source(
                                        AndroidInstanceCreateParams.Spec.InitialAsset.Source.URL
                                    )
                                    .url("url")
                                    .addUrl("string")
                                    .build()
                            )
                            .region("region")
                            .sandbox(
                                AndroidInstanceCreateParams.Spec.Sandbox.builder()
                                    .playwrightAndroid(
                                        AndroidInstanceCreateParams.Spec.Sandbox.PlaywrightAndroid
                                            .builder()
                                            .enabled(true)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        androidInstance.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val androidInstanceService = client.androidInstances()

        val page = androidInstanceService.list()

        page.items().forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val androidInstanceService = client.androidInstances()

        androidInstanceService.delete("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val androidInstanceService = client.androidInstances()

        val androidInstance = androidInstanceService.get("id")

        androidInstance.validate()
    }
}
