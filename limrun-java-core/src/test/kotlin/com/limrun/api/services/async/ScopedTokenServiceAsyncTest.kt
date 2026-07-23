// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.client.okhttp.LimrunOkHttpClientAsync
import com.limrun.api.models.scopedtokens.ScopedTokenCreate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScopedTokenServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LimrunOkHttpClientAsync.builder().apiKey("My API Key").build()
        val scopedTokenServiceAsync = client.scopedTokens()

        val scopedTokenFuture =
            scopedTokenServiceAsync.create(
                ScopedTokenCreate.builder().addScope("string").ttlSeconds(1L).build()
            )

        val scopedToken = scopedTokenFuture.get()
        scopedToken.validate()
    }
}
