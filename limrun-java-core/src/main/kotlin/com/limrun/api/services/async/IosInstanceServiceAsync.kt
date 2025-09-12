// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.iosinstances.IosInstanceCreateParams
import com.limrun.api.models.iosinstances.IosInstanceCreateResponse
import com.limrun.api.models.iosinstances.IosInstanceDeleteParams
import com.limrun.api.models.iosinstances.IosInstanceGetParams
import com.limrun.api.models.iosinstances.IosInstanceGetResponse
import com.limrun.api.models.iosinstances.IosInstanceListParams
import com.limrun.api.models.iosinstances.IosInstanceListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IosInstanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IosInstanceServiceAsync

    /** Create an iOS instance */
    fun create(): CompletableFuture<IosInstanceCreateResponse> =
        create(IosInstanceCreateParams.none())

    /** @see create */
    fun create(
        params: IosInstanceCreateParams = IosInstanceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IosInstanceCreateResponse>

    /** @see create */
    fun create(
        params: IosInstanceCreateParams = IosInstanceCreateParams.none()
    ): CompletableFuture<IosInstanceCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<IosInstanceCreateResponse> =
        create(IosInstanceCreateParams.none(), requestOptions)

    /** List iOS instances */
    fun list(): CompletableFuture<List<IosInstanceListResponse>> =
        list(IosInstanceListParams.none())

    /** @see list */
    fun list(
        params: IosInstanceListParams = IosInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<IosInstanceListResponse>>

    /** @see list */
    fun list(
        params: IosInstanceListParams = IosInstanceListParams.none()
    ): CompletableFuture<List<IosInstanceListResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<IosInstanceListResponse>> =
        list(IosInstanceListParams.none(), requestOptions)

    /** Delete iOS instance with given name */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, IosInstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IosInstanceDeleteParams = IosInstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: IosInstanceDeleteParams = IosInstanceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IosInstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: IosInstanceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, IosInstanceDeleteParams.none(), requestOptions)

    /** Get iOS instance with given ID */
    fun get(id: String): CompletableFuture<IosInstanceGetResponse> =
        get(id, IosInstanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: IosInstanceGetParams = IosInstanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IosInstanceGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: IosInstanceGetParams = IosInstanceGetParams.none(),
    ): CompletableFuture<IosInstanceGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: IosInstanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IosInstanceGetResponse>

    /** @see get */
    fun get(params: IosInstanceGetParams): CompletableFuture<IosInstanceGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<IosInstanceGetResponse> =
        get(id, IosInstanceGetParams.none(), requestOptions)

    /**
     * A view of [IosInstanceServiceAsync] that provides access to raw HTTP responses for each
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
        ): IosInstanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/ios_instances`, but is otherwise the same as
         * [IosInstanceServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<IosInstanceCreateResponse>> =
            create(IosInstanceCreateParams.none())

        /** @see create */
        fun create(
            params: IosInstanceCreateParams = IosInstanceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IosInstanceCreateResponse>>

        /** @see create */
        fun create(
            params: IosInstanceCreateParams = IosInstanceCreateParams.none()
        ): CompletableFuture<HttpResponseFor<IosInstanceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IosInstanceCreateResponse>> =
            create(IosInstanceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ios_instances`, but is otherwise the same as
         * [IosInstanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<IosInstanceListResponse>>> =
            list(IosInstanceListParams.none())

        /** @see list */
        fun list(
            params: IosInstanceListParams = IosInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<IosInstanceListResponse>>>

        /** @see list */
        fun list(
            params: IosInstanceListParams = IosInstanceListParams.none()
        ): CompletableFuture<HttpResponseFor<List<IosInstanceListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<IosInstanceListResponse>>> =
            list(IosInstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ios_instances/{id}`, but is otherwise the
         * same as [IosInstanceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, IosInstanceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: IosInstanceDeleteParams = IosInstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: IosInstanceDeleteParams = IosInstanceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: IosInstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: IosInstanceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, IosInstanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ios_instances/{id}`, but is otherwise the same
         * as [IosInstanceServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<IosInstanceGetResponse>> =
            get(id, IosInstanceGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: IosInstanceGetParams = IosInstanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IosInstanceGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: IosInstanceGetParams = IosInstanceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<IosInstanceGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: IosInstanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IosInstanceGetResponse>>

        /** @see get */
        fun get(
            params: IosInstanceGetParams
        ): CompletableFuture<HttpResponseFor<IosInstanceGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IosInstanceGetResponse>> =
            get(id, IosInstanceGetParams.none(), requestOptions)
    }
}
