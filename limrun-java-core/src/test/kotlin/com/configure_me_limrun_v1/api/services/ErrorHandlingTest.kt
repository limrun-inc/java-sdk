// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.services

import com.configure_me_limrun_v1.api.client.LimrunClient
import com.configure_me_limrun_v1.api.client.okhttp.LimrunOkHttpClient
import com.configure_me_limrun_v1.api.core.JsonValue
import com.configure_me_limrun_v1.api.core.http.Headers
import com.configure_me_limrun_v1.api.core.jsonMapper
import com.configure_me_limrun_v1.api.errors.BadRequestException
import com.configure_me_limrun_v1.api.errors.InternalServerException
import com.configure_me_limrun_v1.api.errors.LimrunException
import com.configure_me_limrun_v1.api.errors.NotFoundException
import com.configure_me_limrun_v1.api.errors.PermissionDeniedException
import com.configure_me_limrun_v1.api.errors.RateLimitException
import com.configure_me_limrun_v1.api.errors.UnauthorizedException
import com.configure_me_limrun_v1.api.errors.UnexpectedStatusCodeException
import com.configure_me_limrun_v1.api.errors.UnprocessableEntityException
import com.configure_me_limrun_v1.api.models.androidinstances.AndroidInstanceCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: LimrunClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LimrunOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun androidInstancesCreate400() {
        val androidInstanceService = client.androidInstances()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate400WithRawResponse() {
        val androidInstanceService = client.androidInstances().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate401() {
        val androidInstanceService = client.androidInstances()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate401WithRawResponse() {
        val androidInstanceService = client.androidInstances().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate403() {
        val androidInstanceService = client.androidInstances()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate403WithRawResponse() {
        val androidInstanceService = client.androidInstances().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate404() {
        val androidInstanceService = client.androidInstances()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate404WithRawResponse() {
        val androidInstanceService = client.androidInstances().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate422() {
        val androidInstanceService = client.androidInstances()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate422WithRawResponse() {
        val androidInstanceService = client.androidInstances().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate429() {
        val androidInstanceService = client.androidInstances()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate429WithRawResponse() {
        val androidInstanceService = client.androidInstances().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate500() {
        val androidInstanceService = client.androidInstances()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate500WithRawResponse() {
        val androidInstanceService = client.androidInstances().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate999() {
        val androidInstanceService = client.androidInstances()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreate999WithRawResponse() {
        val androidInstanceService = client.androidInstances().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun androidInstancesCreateInvalidJsonBody() {
        val androidInstanceService = client.androidInstances()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<LimrunException> {
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
                                        .kind(
                                            AndroidInstanceCreateParams.Spec.InitialAsset.Kind.APP
                                        )
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
