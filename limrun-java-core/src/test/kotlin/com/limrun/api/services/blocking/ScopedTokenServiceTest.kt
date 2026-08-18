// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.limrun.api.client.okhttp.LimrunOkHttpClient
import com.limrun.api.models.scopedtokens.ScopedTokenCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScopedTokenServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LimrunOkHttpClient.builder().apiKey("My API Key").build()
        val scopedTokenService = client.scopedTokens()

        val scopedToken =
            scopedTokenService.create(
                ScopedTokenCreateParams.builder().addScope("string").ttlSeconds(1L).build()
            )

        scopedToken.validate()
    }
}
