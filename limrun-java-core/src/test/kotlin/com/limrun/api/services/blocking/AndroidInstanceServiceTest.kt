// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.limrun.api.TestServerExtension
import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.core.JsonValue
import com.limrun.api.models.androidinstances.AndroidInstanceCreateParams
import com.limrun.api.models.androidinstances.AndroidInstanceListParams
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
                                    .source(
                                        AndroidInstanceCreateParams.Spec.InitialAsset.Source.URL
                                    )
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

        val androidInstances =
            androidInstanceService.list(
                AndroidInstanceListParams.builder()
                    .labelSelector("env=prod,version=1.2")
                    .limit(50L)
                    .region("region")
                    .state(AndroidInstanceListParams.State.UNKNOWN)
                    .build()
            )

        androidInstances.forEach { it.validate() }
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
