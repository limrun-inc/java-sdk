// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.assets.Asset
import com.limrun.api.models.assets.AssetGetOrCreateParams
import com.limrun.api.models.assets.AssetGetOrCreateResponse
import com.limrun.api.models.assets.AssetGetParams
import com.limrun.api.models.assets.AssetListPage
import com.limrun.api.models.assets.AssetListParams
import java.util.function.Consumer

interface AssetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetService

    /** List organization's all assets with given filters. If none given, return all assets. */
    fun list(): AssetListPage = list(AssetListParams.none())

    /** @see list */
    fun list(
        params: AssetListParams = AssetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetListPage

    /** @see list */
    fun list(params: AssetListParams = AssetListParams.none()): AssetListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AssetListPage =
        list(AssetListParams.none(), requestOptions)

    /** Get the asset with given ID. */
    fun get(assetId: String): Asset = get(assetId, AssetGetParams.none())

    /** @see get */
    fun get(
        assetId: String,
        params: AssetGetParams = AssetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Asset = get(params.toBuilder().assetId(assetId).build(), requestOptions)

    /** @see get */
    fun get(assetId: String, params: AssetGetParams = AssetGetParams.none()): Asset =
        get(assetId, params, RequestOptions.none())

    /** @see get */
    fun get(params: AssetGetParams, requestOptions: RequestOptions = RequestOptions.none()): Asset

    /** @see get */
    fun get(params: AssetGetParams): Asset = get(params, RequestOptions.none())

    /** @see get */
    fun get(assetId: String, requestOptions: RequestOptions): Asset =
        get(assetId, AssetGetParams.none(), requestOptions)

    /**
     * Creates an asset and returns upload and download URLs. If there is a corresponding file
     * uploaded in the storage with given name, its MD5 is returned so you can check if a re-upload
     * is necessary. If no MD5 is returned, then there is no corresponding file in the storage so
     * downloading it directly or using it in instances will fail until you use the returned upload
     * URL to submit the file.
     */
    fun getOrCreate(params: AssetGetOrCreateParams): AssetGetOrCreateResponse =
        getOrCreate(params, RequestOptions.none())

    /** @see getOrCreate */
    fun getOrCreate(
        params: AssetGetOrCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetGetOrCreateResponse

    /** A view of [AssetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/assets`, but is otherwise the same as
         * [AssetService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AssetListPage> = list(AssetListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssetListParams = AssetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AssetListParams = AssetListParams.none()): HttpResponseFor<AssetListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AssetListPage> =
            list(AssetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/assets/{assetId}`, but is otherwise the same as
         * [AssetService.get].
         */
        @MustBeClosed
        fun get(assetId: String): HttpResponseFor<Asset> = get(assetId, AssetGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            assetId: String,
            params: AssetGetParams = AssetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Asset> = get(params.toBuilder().assetId(assetId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            assetId: String,
            params: AssetGetParams = AssetGetParams.none(),
        ): HttpResponseFor<Asset> = get(assetId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AssetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Asset>

        /** @see get */
        @MustBeClosed
        fun get(params: AssetGetParams): HttpResponseFor<Asset> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(assetId: String, requestOptions: RequestOptions): HttpResponseFor<Asset> =
            get(assetId, AssetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/assets`, but is otherwise the same as
         * [AssetService.getOrCreate].
         */
        @MustBeClosed
        fun getOrCreate(params: AssetGetOrCreateParams): HttpResponseFor<AssetGetOrCreateResponse> =
            getOrCreate(params, RequestOptions.none())

        /** @see getOrCreate */
        @MustBeClosed
        fun getOrCreate(
            params: AssetGetOrCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetGetOrCreateResponse>
    }
}
