// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.scopedtokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopedTokenTest {

    @Test
    fun create() {
        val scopedToken =
            ScopedToken.builder()
                .token("token")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addScope("string")
                .build()

        assertThat(scopedToken.token()).isEqualTo("token")
        assertThat(scopedToken.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scopedToken.scopes()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopedToken =
            ScopedToken.builder()
                .token("token")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addScope("string")
                .build()

        val roundtrippedScopedToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopedToken),
                jacksonTypeRef<ScopedToken>(),
            )

        assertThat(roundtrippedScopedToken).isEqualTo(scopedToken)
    }
}
