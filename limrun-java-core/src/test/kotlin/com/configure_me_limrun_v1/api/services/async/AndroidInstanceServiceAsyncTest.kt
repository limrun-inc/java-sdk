// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.services.async

import com.configure_me_limrun_v1.api.TestServerExtension
import com.configure_me_limrun_v1.api.client.okhttp.LimrunOkHttpClientAsync
import com.configure_me_limrun_v1.api.core.JsonValue
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceCreateParams
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AndroidInstanceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val androidInstanceServiceAsync = client.androidInstances()

        val androidInstanceFuture =
            androidInstanceServiceAsync.create(
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
                                    .url("url")
                                    .build()
                            )
                            .region("region")
                            .build()
                    )
                    .build()
            )

        val androidInstance = androidInstanceFuture.get()
        androidInstance.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val androidInstanceServiceAsync = client.androidInstances()

        val androidInstancesFuture =
            androidInstanceServiceAsync.list(
                AndroidInstanceListParams.builder()
                    .labelSelector("env=prod,version=1.2")
                    .region("region")
                    .state(AndroidInstanceListParams.State.UNKNOWN)
                    .build()
            )

        val androidInstances = androidInstancesFuture.get()
        androidInstances.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LimrunOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val androidInstanceServiceAsync = client.androidInstances()

        val future = androidInstanceServiceAsync.delete("id")

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
        val androidInstanceServiceAsync = client.androidInstances()

        val androidInstanceFuture = androidInstanceServiceAsync.get("id")

        val androidInstance = androidInstanceFuture.get()
        androidInstance.validate()
    }
}
