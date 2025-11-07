// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.assets.Asset
import com.limrun.api.models.assets.AssetDeleteParams
import com.limrun.api.models.assets.AssetGetOrCreateParams
import com.limrun.api.models.assets.AssetGetOrCreateResponse
import com.limrun.api.models.assets.AssetGetParams
import com.limrun.api.models.assets.AssetListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetServiceAsync

    /** List organization's all assets with given filters. If none given, return all assets. */
    fun list(): CompletableFuture<List<Asset>> = list(AssetListParams.none())

    /** @see list */
    fun list(
        params: AssetListParams = AssetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Asset>>

    /** @see list */
    fun list(params: AssetListParams = AssetListParams.none()): CompletableFuture<List<Asset>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<Asset>> =
        list(AssetListParams.none(), requestOptions)

    /** Delete the asset with given ID. */
    fun delete(assetId: String): CompletableFuture<Void?> =
        delete(assetId, AssetDeleteParams.none())

    /** @see delete */
    fun delete(
        assetId: String,
        params: AssetDeleteParams = AssetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().assetId(assetId).build(), requestOptions)

    /** @see delete */
    fun delete(
        assetId: String,
        params: AssetDeleteParams = AssetDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(assetId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AssetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(assetId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(assetId, AssetDeleteParams.none(), requestOptions)

    /** Get the asset with given ID. */
    fun get(assetId: String): CompletableFuture<Asset> = get(assetId, AssetGetParams.none())

    /** @see get */
    fun get(
        assetId: String,
        params: AssetGetParams = AssetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Asset> = get(params.toBuilder().assetId(assetId).build(), requestOptions)

    /** @see get */
    fun get(
        assetId: String,
        params: AssetGetParams = AssetGetParams.none(),
    ): CompletableFuture<Asset> = get(assetId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AssetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Asset>

    /** @see get */
    fun get(params: AssetGetParams): CompletableFuture<Asset> = get(params, RequestOptions.none())

    /** @see get */
    fun get(assetId: String, requestOptions: RequestOptions): CompletableFuture<Asset> =
        get(assetId, AssetGetParams.none(), requestOptions)

    /**
     * Creates an asset and returns upload and download URLs. If there is a corresponding file
     * uploaded in the storage with given name, its MD5 is returned so you can check if a re-upload
     * is necessary. If no MD5 is returned, then there is no corresponding file in the storage so
     * downloading it directly or using it in instances will fail until you use the returned upload
     * URL to submit the file.
     */
    fun getOrCreate(params: AssetGetOrCreateParams): CompletableFuture<AssetGetOrCreateResponse> =
        getOrCreate(params, RequestOptions.none())

    /** @see getOrCreate */
    fun getOrCreate(
        params: AssetGetOrCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetGetOrCreateResponse>

    /** A view of [AssetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/assets`, but is otherwise the same as
         * [AssetServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<Asset>>> = list(AssetListParams.none())

        /** @see list */
        fun list(
            params: AssetListParams = AssetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Asset>>>

        /** @see list */
        fun list(
            params: AssetListParams = AssetListParams.none()
        ): CompletableFuture<HttpResponseFor<List<Asset>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<Asset>>> =
            list(AssetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/assets/{assetId}`, but is otherwise the same
         * as [AssetServiceAsync.delete].
         */
        fun delete(assetId: String): CompletableFuture<HttpResponse> =
            delete(assetId, AssetDeleteParams.none())

        /** @see delete */
        fun delete(
            assetId: String,
            params: AssetDeleteParams = AssetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().assetId(assetId).build(), requestOptions)

        /** @see delete */
        fun delete(
            assetId: String,
            params: AssetDeleteParams = AssetDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(assetId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AssetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            assetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(assetId, AssetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/assets/{assetId}`, but is otherwise the same as
         * [AssetServiceAsync.get].
         */
        fun get(assetId: String): CompletableFuture<HttpResponseFor<Asset>> =
            get(assetId, AssetGetParams.none())

        /** @see get */
        fun get(
            assetId: String,
            params: AssetGetParams = AssetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Asset>> =
            get(params.toBuilder().assetId(assetId).build(), requestOptions)

        /** @see get */
        fun get(
            assetId: String,
            params: AssetGetParams = AssetGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Asset>> = get(assetId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: AssetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Asset>>

        /** @see get */
        fun get(params: AssetGetParams): CompletableFuture<HttpResponseFor<Asset>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            assetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Asset>> =
            get(assetId, AssetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/assets`, but is otherwise the same as
         * [AssetServiceAsync.getOrCreate].
         */
        fun getOrCreate(
            params: AssetGetOrCreateParams
        ): CompletableFuture<HttpResponseFor<AssetGetOrCreateResponse>> =
            getOrCreate(params, RequestOptions.none())

        /** @see getOrCreate */
        fun getOrCreate(
            params: AssetGetOrCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetGetOrCreateResponse>>
    }
}
