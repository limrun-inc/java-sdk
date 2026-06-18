// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetGetOrCreateParamsTest {

    @Test
    fun create() {
        AssetGetOrCreateParams.builder().name("name").ttl("ttl").build()
    }

    @Test
    fun body() {
        val params = AssetGetOrCreateParams.builder().name("name").ttl("ttl").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.ttl()).contains("ttl")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AssetGetOrCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
