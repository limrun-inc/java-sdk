// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.limrun.api.client.LimrunClient
import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.core.JsonValue
import com.limrun.api.models.androidinstances.AndroidInstanceCreateParams
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: LimrunClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LimrunOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val androidInstanceService = client.androidInstances()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

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
                                .source(AndroidInstanceCreateParams.Spec.InitialAsset.Source.URL)
                                .addAssetId("string")
                                .assetName("assetName")
                                .addAssetName("string")
                                .url("url")
                                .addUrl("string")
                                .build()
                        )
                        .region("region")
                        .build()
                )
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
