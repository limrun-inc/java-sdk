// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.core.JsonValue
import com.limrun.api.models.xcodeinstances.XcodeInstanceCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class XcodeInstanceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val xcodeInstanceService = client.xcodeInstances()

        val xcodeInstances =
            xcodeInstanceService.create(
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
                            .region("region")
                            .build()
                    )
                    .build()
            )

        xcodeInstances.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val xcodeInstanceService = client.xcodeInstances()

        val page = xcodeInstanceService.list()

        page.items().forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val xcodeInstanceService = client.xcodeInstances()

        xcodeInstanceService.delete("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val xcodeInstanceService = client.xcodeInstances()

        val xcodeInstances = xcodeInstanceService.get("id")

        xcodeInstances.validate()
    }
}
