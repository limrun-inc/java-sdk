// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.core.JsonValue
import com.limrun.api.core.jsonMapper
import com.limrun.api.models.androidinstances.AndroidInstance
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/limrun-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.androidInstances()).isNotNull()
        assertThat(client.assets()).isNotNull()
        assertThat(client.iosInstances()).isNotNull()
    }

    @Test
    fun androidInstanceRoundtrip() {
        val jsonMapper = jsonMapper()
        val androidInstance =
            AndroidInstance.builder()
                .metadata(
                    AndroidInstance.Metadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organizationId")
                        .displayName("displayName")
                        .labels(
                            AndroidInstance.Metadata.Labels.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .terminatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .spec(
                    AndroidInstance.Spec.builder()
                        .inactivityTimeout("inactivityTimeout")
                        .region("region")
                        .hardTimeout("hardTimeout")
                        .build()
                )
                .status(
                    AndroidInstance.Status.builder()
                        .token("token")
                        .adbWebSocketUrl("adbWebSocketUrl")
                        .endpointWebSocketUrl("endpointWebSocketUrl")
                        .state(AndroidInstance.Status.State.UNKNOWN)
                        .build()
                )
                .build()

        val roundtrippedAndroidInstance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(androidInstance),
                jacksonTypeRef<AndroidInstance>(),
            )

        assertThat(roundtrippedAndroidInstance).isEqualTo(androidInstance)
    }
}
