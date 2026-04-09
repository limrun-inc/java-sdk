// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.xcodeinstances.XcodeInstanceCreateParams
import com.limrun.api.models.xcodeinstances.XcodeInstanceDeleteParams
import com.limrun.api.models.xcodeinstances.XcodeInstanceGetParams
import com.limrun.api.models.xcodeinstances.XcodeInstanceListPage
import com.limrun.api.models.xcodeinstances.XcodeInstanceListParams
import com.limrun.api.models.xcodeinstances.XcodeInstances
import java.util.function.Consumer

interface XcodeInstanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): XcodeInstanceService

    /** Create an Xcode instance */
    fun create(): XcodeInstances = create(XcodeInstanceCreateParams.none())

    /** @see create */
    fun create(
        params: XcodeInstanceCreateParams = XcodeInstanceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): XcodeInstances

    /** @see create */
    fun create(
        params: XcodeInstanceCreateParams = XcodeInstanceCreateParams.none()
    ): XcodeInstances = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): XcodeInstances =
        create(XcodeInstanceCreateParams.none(), requestOptions)

    /** List Xcode instances */
    fun list(): XcodeInstanceListPage = list(XcodeInstanceListParams.none())

    /** @see list */
    fun list(
        params: XcodeInstanceListParams = XcodeInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): XcodeInstanceListPage

    /** @see list */
    fun list(
        params: XcodeInstanceListParams = XcodeInstanceListParams.none()
    ): XcodeInstanceListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): XcodeInstanceListPage =
        list(XcodeInstanceListParams.none(), requestOptions)

    /** Delete Xcode instance with given name */
    fun delete(id: String) = delete(id, XcodeInstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: XcodeInstanceDeleteParams = XcodeInstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: XcodeInstanceDeleteParams = XcodeInstanceDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: XcodeInstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: XcodeInstanceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, XcodeInstanceDeleteParams.none(), requestOptions)

    /** Get Xcode instance with given ID */
    fun get(id: String): XcodeInstances = get(id, XcodeInstanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: XcodeInstanceGetParams = XcodeInstanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): XcodeInstances = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: XcodeInstanceGetParams = XcodeInstanceGetParams.none(),
    ): XcodeInstances = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: XcodeInstanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): XcodeInstances

    /** @see get */
    fun get(params: XcodeInstanceGetParams): XcodeInstances = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): XcodeInstances =
        get(id, XcodeInstanceGetParams.none(), requestOptions)

    /**
     * A view of [XcodeInstanceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): XcodeInstanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/xcode_instances`, but is otherwise the same as
         * [XcodeInstanceService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<XcodeInstances> = create(XcodeInstanceCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: XcodeInstanceCreateParams = XcodeInstanceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<XcodeInstances>

        /** @see create */
        @MustBeClosed
        fun create(
            params: XcodeInstanceCreateParams = XcodeInstanceCreateParams.none()
        ): HttpResponseFor<XcodeInstances> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<XcodeInstances> =
            create(XcodeInstanceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/xcode_instances`, but is otherwise the same as
         * [XcodeInstanceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<XcodeInstanceListPage> = list(XcodeInstanceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: XcodeInstanceListParams = XcodeInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<XcodeInstanceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: XcodeInstanceListParams = XcodeInstanceListParams.none()
        ): HttpResponseFor<XcodeInstanceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<XcodeInstanceListPage> =
            list(XcodeInstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/xcode_instances/{id}`, but is otherwise the
         * same as [XcodeInstanceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, XcodeInstanceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: XcodeInstanceDeleteParams = XcodeInstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: XcodeInstanceDeleteParams = XcodeInstanceDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: XcodeInstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: XcodeInstanceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, XcodeInstanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/xcode_instances/{id}`, but is otherwise the same
         * as [XcodeInstanceService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<XcodeInstances> =
            get(id, XcodeInstanceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: XcodeInstanceGetParams = XcodeInstanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<XcodeInstances> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: XcodeInstanceGetParams = XcodeInstanceGetParams.none(),
        ): HttpResponseFor<XcodeInstances> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: XcodeInstanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<XcodeInstances>

        /** @see get */
        @MustBeClosed
        fun get(params: XcodeInstanceGetParams): HttpResponseFor<XcodeInstances> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<XcodeInstances> =
            get(id, XcodeInstanceGetParams.none(), requestOptions)
    }
}
