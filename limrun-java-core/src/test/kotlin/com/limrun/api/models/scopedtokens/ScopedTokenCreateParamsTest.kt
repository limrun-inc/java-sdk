// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.scopedtokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopedTokenCreateParamsTest {

    @Test
    fun create() {
        ScopedTokenCreateParams.builder().addScope("string").ttlSeconds(1L).build()
    }

    @Test
    fun body() {
        val params = ScopedTokenCreateParams.builder().addScope("string").ttlSeconds(1L).build()

        val body = params._body()

        assertThat(body.scopes()).containsExactly("string")
        assertThat(body.ttlSeconds()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ScopedTokenCreateParams.builder().addScope("string").build()

        val body = params._body()

        assertThat(body.scopes()).containsExactly("string")
    }
}
