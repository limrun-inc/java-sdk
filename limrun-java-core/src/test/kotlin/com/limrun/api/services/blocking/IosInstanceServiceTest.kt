// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.limrun.api.TestServerExtension
import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.core.JsonValue
import com.limrun.api.models.iosinstances.IosInstanceCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IosInstanceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val iosInstanceService = client.iosInstances()

        val iosInstance =
            iosInstanceService.create(
                IosInstanceCreateParams.builder()
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
                                    .sVersion("sVersion")
                                    .build()
                            )
                            .hardTimeout("hardTimeout")
                            .inactivityTimeout("inactivityTimeout")
                            .addInitialAsset(
                                IosInstanceCreateParams.Spec.InitialAsset.builder()
                                    .kind(IosInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                                    .source(IosInstanceCreateParams.Spec.InitialAsset.Source.URL)
                                    .assetName("assetName")
                                    .url("url")
                                    .build()
                            )
                            .region("region")
                            .build()
                    )
                    .build()
            )

        iosInstance.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val iosInstanceService = client.iosInstances()

        val page = iosInstanceService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val iosInstanceService = client.iosInstances()

        iosInstanceService.delete("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            LimrunOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val iosInstanceService = client.iosInstances()

        val iosInstance = iosInstanceService.get("id")

        iosInstance.validate()
    }
}
