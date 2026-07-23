// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.scopedtokens.ScopedToken
import com.limrun.api.models.scopedtokens.ScopedTokenCreate
import com.limrun.api.models.scopedtokens.ScopedTokenCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ScopedTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScopedTokenServiceAsync

    /**
     * Mint a short-lived scoped token whose scopes limit what the holder can do, e.g. install a
     * specific asset on a device through the registry. The token is verified offline by services
     * holding the token signing public key and cannot be revoked, so keep TTLs short. It is bound
     * to the authenticated caller's organization.
     */
    fun create(params: ScopedTokenCreateParams): CompletableFuture<ScopedToken> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ScopedTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScopedToken>

    /** @see create */
    fun create(
        scopedTokenCreate: ScopedTokenCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScopedToken> =
        create(
            ScopedTokenCreateParams.builder().scopedTokenCreate(scopedTokenCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(scopedTokenCreate: ScopedTokenCreate): CompletableFuture<ScopedToken> =
        create(scopedTokenCreate, RequestOptions.none())

    /**
     * A view of [ScopedTokenServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScopedTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/scoped_tokens`, but is otherwise the same as
         * [ScopedTokenServiceAsync.create].
         */
        fun create(
            params: ScopedTokenCreateParams
        ): CompletableFuture<HttpResponseFor<ScopedToken>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ScopedTokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScopedToken>>

        /** @see create */
        fun create(
            scopedTokenCreate: ScopedTokenCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScopedToken>> =
            create(
                ScopedTokenCreateParams.builder().scopedTokenCreate(scopedTokenCreate).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            scopedTokenCreate: ScopedTokenCreate
        ): CompletableFuture<HttpResponseFor<ScopedToken>> =
            create(scopedTokenCreate, RequestOptions.none())
    }
}
