// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.scopedtokens.ScopedToken
import com.limrun.api.models.scopedtokens.ScopedTokenCreate
import com.limrun.api.models.scopedtokens.ScopedTokenCreateParams
import java.util.function.Consumer

interface ScopedTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScopedTokenService

    /**
     * Mint a short-lived scoped token whose scopes limit what the holder can do, e.g. install a
     * specific asset on a device through the registry. The token is verified offline by services
     * holding the token signing public key and cannot be revoked, so keep TTLs short. It is bound
     * to the authenticated caller's organization.
     */
    fun create(params: ScopedTokenCreateParams): ScopedToken = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ScopedTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopedToken

    /** @see create */
    fun create(
        scopedTokenCreate: ScopedTokenCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopedToken =
        create(
            ScopedTokenCreateParams.builder().scopedTokenCreate(scopedTokenCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(scopedTokenCreate: ScopedTokenCreate): ScopedToken =
        create(scopedTokenCreate, RequestOptions.none())

    /**
     * A view of [ScopedTokenService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScopedTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/scoped_tokens`, but is otherwise the same as
         * [ScopedTokenService.create].
         */
        @MustBeClosed
        fun create(params: ScopedTokenCreateParams): HttpResponseFor<ScopedToken> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ScopedTokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopedToken>

        /** @see create */
        @MustBeClosed
        fun create(
            scopedTokenCreate: ScopedTokenCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopedToken> =
            create(
                ScopedTokenCreateParams.builder().scopedTokenCreate(scopedTokenCreate).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(scopedTokenCreate: ScopedTokenCreate): HttpResponseFor<ScopedToken> =
            create(scopedTokenCreate, RequestOptions.none())
    }
}
