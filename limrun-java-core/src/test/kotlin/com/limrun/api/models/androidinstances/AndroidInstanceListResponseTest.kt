// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.androidinstances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.limrun.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AndroidInstanceListResponseTest {

    @Test
    fun create() {
        val androidInstanceListResponse = AndroidInstanceListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val androidInstanceListResponse = AndroidInstanceListResponse.builder().build()

        val roundtrippedAndroidInstanceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(androidInstanceListResponse),
                jacksonTypeRef<AndroidInstanceListResponse>(),
            )

        assertThat(roundtrippedAndroidInstanceListResponse).isEqualTo(androidInstanceListResponse)
    }
}
