// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.core.JsonValue
import com.limrun.api.models.gradleinstances.GradleInstanceCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GradleInstanceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val gradleInstanceService = client.gradleInstances()

        val gradleInstance =
            gradleInstanceService.create(
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

        gradleInstance.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val gradleInstanceService = client.gradleInstances()

        val page = gradleInstanceService.list()

        page.items().forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val gradleInstanceService = client.gradleInstances()

        gradleInstanceService.delete("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val gradleInstanceService = client.gradleInstances()

        val gradleInstance = gradleInstanceService.get("id")

        gradleInstance.validate()
    }
}
