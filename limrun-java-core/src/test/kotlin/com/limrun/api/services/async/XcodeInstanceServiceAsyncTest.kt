// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.client.okhttp.LimrunOkHttpClientAsync
import com.limrun.api.core.JsonValue
import com.limrun.api.models.xcodeinstances.XcodeInstanceCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class XcodeInstanceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val xcodeInstanceServiceAsync = client.xcodeInstances()

        val xcodeInstanceFuture =
            xcodeInstanceServiceAsync.create(
                XcodeInstanceCreateParams.builder()
                    .reuseIfExists(true)
                    .wait(true)
                    .metadata(
                        XcodeInstanceCreateParams.Metadata.builder()
                            .displayName("displayName")
                            .labels(
                                XcodeInstanceCreateParams.Metadata.Labels.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .spec(
                        XcodeInstanceCreateParams.Spec.builder()
                            .addClue(
                                XcodeInstanceCreateParams.Spec.Clue.builder()
                                    .kind(XcodeInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                    .clientIp("clientIp")
                                    .build()
                            )
                            .hardTimeout("hardTimeout")
                            .inactivityTimeout("inactivityTimeout")
                            .jurisdiction(XcodeInstanceCreateParams.Spec.Jurisdiction.US)
                            .region("region")
                            .build()
                    )
                    .build()
            )

        val xcodeInstance = xcodeInstanceFuture.get()
        xcodeInstance.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val xcodeInstanceServiceAsync = client.xcodeInstances()

        val pageFuture = xcodeInstanceServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val xcodeInstanceServiceAsync = client.xcodeInstances()

        val future = xcodeInstanceServiceAsync.delete("id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val xcodeInstanceServiceAsync = client.xcodeInstances()

        val xcodeInstanceFuture = xcodeInstanceServiceAsync.get("id")

        val xcodeInstance = xcodeInstanceFuture.get()
        xcodeInstance.validate()
    }
}
