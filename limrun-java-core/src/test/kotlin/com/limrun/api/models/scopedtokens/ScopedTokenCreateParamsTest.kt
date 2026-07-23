// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.scopedtokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopedTokenCreateParamsTest {

    @Test
    fun create() {
        ScopedTokenCreateParams.builder()
            .scopedTokenCreate(
                ScopedTokenCreate.builder().addScope("string").ttlSeconds(1L).build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ScopedTokenCreateParams.builder()
                .scopedTokenCreate(
                    ScopedTokenCreate.builder().addScope("string").ttlSeconds(1L).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(ScopedTokenCreate.builder().addScope("string").ttlSeconds(1L).build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ScopedTokenCreateParams.builder()
                .scopedTokenCreate(ScopedTokenCreate.builder().addScope("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ScopedTokenCreate.builder().addScope("string").build())
    }
}
