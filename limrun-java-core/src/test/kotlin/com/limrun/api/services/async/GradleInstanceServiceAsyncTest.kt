// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.client.okhttp.LimrunOkHttpClientAsync
import com.limrun.api.core.JsonValue
import com.limrun.api.models.gradleinstances.GradleInstanceCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GradleInstanceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gradleInstanceServiceAsync = client.gradleInstances()

        val gradleInstanceFuture =
            gradleInstanceServiceAsync.create(
                GradleInstanceCreateParams.builder()
                    .reuseIfExists(true)
                    .wait(true)
                    .metadata(
                        GradleInstanceCreateParams.Metadata.builder()
                            .displayName("displayName")
                            .labels(
                                GradleInstanceCreateParams.Metadata.Labels.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .spec(
                        GradleInstanceCreateParams.Spec.builder()
                            .addClue(
                                GradleInstanceCreateParams.Spec.Clue.builder()
                                    .kind(GradleInstanceCreateParams.Spec.Clue.Kind.CLIENT_IP)
                                    .clientIp("clientIp")
                                    .build()
                            )
                            .hardTimeout("hardTimeout")
                            .inactivityTimeout("inactivityTimeout")
                            .jurisdiction(GradleInstanceCreateParams.Spec.Jurisdiction.US)
                            .region("region")
                            .build()
                    )
                    .build()
            )

        val gradleInstance = gradleInstanceFuture.get()
        gradleInstance.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gradleInstanceServiceAsync = client.gradleInstances()

        val pageFuture = gradleInstanceServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gradleInstanceServiceAsync = client.gradleInstances()

        val future = gradleInstanceServiceAsync.delete("id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gradleInstanceServiceAsync = client.gradleInstances()

        val gradleInstanceFuture = gradleInstanceServiceAsync.get("id")

        val gradleInstance = gradleInstanceFuture.get()
        gradleInstance.validate()
    }
}
