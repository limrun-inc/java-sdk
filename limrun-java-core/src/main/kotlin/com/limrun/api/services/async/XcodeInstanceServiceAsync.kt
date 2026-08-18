// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.xcodeinstances.XcodeInstance
import com.limrun.api.models.xcodeinstances.XcodeInstanceCreateParams
import com.limrun.api.models.xcodeinstances.XcodeInstanceDeleteParams
import com.limrun.api.models.xcodeinstances.XcodeInstanceGetParams
import com.limrun.api.models.xcodeinstances.XcodeInstanceListPageAsync
import com.limrun.api.models.xcodeinstances.XcodeInstanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface XcodeInstanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): XcodeInstanceServiceAsync

    /** Create an Xcode instance */
    fun create(): CompletableFuture<XcodeInstance> = create(XcodeInstanceCreateParams.none())

    /** @see create */
    fun create(
        params: XcodeInstanceCreateParams = XcodeInstanceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<XcodeInstance>

    /** @see create */
    fun create(
        params: XcodeInstanceCreateParams = XcodeInstanceCreateParams.none()
    ): CompletableFuture<XcodeInstance> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<XcodeInstance> =
        create(XcodeInstanceCreateParams.none(), requestOptions)

    /** List Xcode instances */
    fun list(): CompletableFuture<XcodeInstanceListPageAsync> = list(XcodeInstanceListParams.none())

    /** @see list */
    fun list(
        params: XcodeInstanceListParams = XcodeInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<XcodeInstanceListPageAsync>

    /** @see list */
    fun list(
        params: XcodeInstanceListParams = XcodeInstanceListParams.none()
    ): CompletableFuture<XcodeInstanceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<XcodeInstanceListPageAsync> =
        list(XcodeInstanceListParams.none(), requestOptions)

    /** Delete Xcode instance with given name */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, XcodeInstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: XcodeInstanceDeleteParams = XcodeInstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: XcodeInstanceDeleteParams = XcodeInstanceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: XcodeInstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: XcodeInstanceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, XcodeInstanceDeleteParams.none(), requestOptions)

    /** Get Xcode instance with given ID */
    fun get(id: String): CompletableFuture<XcodeInstance> = get(id, XcodeInstanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: XcodeInstanceGetParams = XcodeInstanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<XcodeInstance> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: XcodeInstanceGetParams = XcodeInstanceGetParams.none(),
    ): CompletableFuture<XcodeInstance> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: XcodeInstanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<XcodeInstance>

    /** @see get */
    fun get(params: XcodeInstanceGetParams): CompletableFuture<XcodeInstance> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<XcodeInstance> =
        get(id, XcodeInstanceGetParams.none(), requestOptions)

    /**
     * A view of [XcodeInstanceServiceAsync] that provides access to raw HTTP responses for each
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
        ): XcodeInstanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/xcode_instances`, but is otherwise the same as
         * [XcodeInstanceServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<XcodeInstance>> =
            create(XcodeInstanceCreateParams.none())

        /** @see create */
        fun create(
            params: XcodeInstanceCreateParams = XcodeInstanceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<XcodeInstance>>

        /** @see create */
        fun create(
            params: XcodeInstanceCreateParams = XcodeInstanceCreateParams.none()
        ): CompletableFuture<HttpResponseFor<XcodeInstance>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<XcodeInstance>> =
            create(XcodeInstanceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/xcode_instances`, but is otherwise the same as
         * [XcodeInstanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<XcodeInstanceListPageAsync>> =
            list(XcodeInstanceListParams.none())

        /** @see list */
        fun list(
            params: XcodeInstanceListParams = XcodeInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<XcodeInstanceListPageAsync>>

        /** @see list */
        fun list(
            params: XcodeInstanceListParams = XcodeInstanceListParams.none()
        ): CompletableFuture<HttpResponseFor<XcodeInstanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<XcodeInstanceListPageAsync>> =
            list(XcodeInstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/xcode_instances/{id}`, but is otherwise the
         * same as [XcodeInstanceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, XcodeInstanceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: XcodeInstanceDeleteParams = XcodeInstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: XcodeInstanceDeleteParams = XcodeInstanceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: XcodeInstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: XcodeInstanceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, XcodeInstanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/xcode_instances/{id}`, but is otherwise the same
         * as [XcodeInstanceServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<XcodeInstance>> =
            get(id, XcodeInstanceGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: XcodeInstanceGetParams = XcodeInstanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<XcodeInstance>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: XcodeInstanceGetParams = XcodeInstanceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<XcodeInstance>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: XcodeInstanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<XcodeInstance>>

        /** @see get */
        fun get(params: XcodeInstanceGetParams): CompletableFuture<HttpResponseFor<XcodeInstance>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<XcodeInstance>> =
            get(id, XcodeInstanceGetParams.none(), requestOptions)
    }
}
