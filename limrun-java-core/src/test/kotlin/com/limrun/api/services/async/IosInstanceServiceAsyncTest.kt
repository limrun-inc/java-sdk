// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.TestServerExtension
import com.limrun.api.client.okhttp.LimrunOkHttpClientAsync
import com.limrun.api.core.JsonValue
import com.limrun.api.models.iosinstances.IosInstanceCreateParams
import com.limrun.api.models.iosinstances.IosInstanceListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IosInstanceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val iosInstanceServiceAsync = client.iosInstances()

        val iosInstanceFuture =
            iosInstanceServiceAsync.create(
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
                                    .build()
                            )
                            .hardTimeout("hardTimeout")
                            .inactivityTimeout("inactivityTimeout")
                            .addInitialAsset(
                                IosInstanceCreateParams.Spec.InitialAsset.builder()
                                    .kind(IosInstanceCreateParams.Spec.InitialAsset.Kind.APP)
                                    .source(IosInstanceCreateParams.Spec.InitialAsset.Source.URL)
                                    .assetName("assetName")
                                    .launchMode(
                                        IosInstanceCreateParams.Spec.InitialAsset.LaunchMode
                                            .FOREGROUND_IF_RUNNING
                                    )
                                    .url("url")
                                    .build()
                            )
                            .region("region")
                            .build()
                    )
                    .build()
            )

        val iosInstance = iosInstanceFuture.get()
        iosInstance.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val iosInstanceServiceAsync = client.iosInstances()

        val iosInstancesFuture =
            iosInstanceServiceAsync.list(
                IosInstanceListParams.builder()
                    .labelSelector("env=prod,version=1.2")
                    .limit(50L)
                    .region("region")
                    .state(IosInstanceListParams.State.UNKNOWN)
                    .build()
            )

        val iosInstances = iosInstancesFuture.get()
        iosInstances.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val iosInstanceServiceAsync = client.iosInstances()

        val future = iosInstanceServiceAsync.delete("id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val iosInstanceServiceAsync = client.iosInstances()

        val iosInstanceFuture = iosInstanceServiceAsync.get("id")

        val iosInstance = iosInstanceFuture.get()
        iosInstance.validate()
    }
}
