// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.TestServerExtension
import com.limrun.api.client.okhttp.LimrunOkHttpClientAsync
import com.limrun.api.core.JsonValue
import com.limrun.api.models.androidinstances.AndroidInstanceCreateParams
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

        val pageFuture = androidInstanceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
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
