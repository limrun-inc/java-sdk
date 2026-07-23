// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.scopedtokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopedTokenCreateTest {

    @Test
    fun create() {
        val scopedTokenCreate =
            ScopedTokenCreate.builder().addScope("string").ttlSeconds(1L).build()

        assertThat(scopedTokenCreate.scopes()).containsExactly("string")
        assertThat(scopedTokenCreate.ttlSeconds()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopedTokenCreate =
            ScopedTokenCreate.builder().addScope("string").ttlSeconds(1L).build()

        val roundtrippedScopedTokenCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopedTokenCreate),
                jacksonTypeRef<ScopedTokenCreate>(),
            )

        assertThat(roundtrippedScopedTokenCreate).isEqualTo(scopedTokenCreate)
    }
}
