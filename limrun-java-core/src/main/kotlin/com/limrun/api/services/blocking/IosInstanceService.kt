// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.iosinstances.IosInstance
import com.limrun.api.models.iosinstances.IosInstanceCreateParams
import com.limrun.api.models.iosinstances.IosInstanceDeleteParams
import com.limrun.api.models.iosinstances.IosInstanceGetParams
import com.limrun.api.models.iosinstances.IosInstanceListParams
import com.limrun.api.models.iosinstances.IosInstanceListResponse
import java.util.function.Consumer

interface IosInstanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IosInstanceService

    /** Create an iOS instance */
    fun create(): IosInstance = create(IosInstanceCreateParams.none())

    /** @see create */
    fun create(
        params: IosInstanceCreateParams = IosInstanceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IosInstance

    /** @see create */
    fun create(params: IosInstanceCreateParams = IosInstanceCreateParams.none()): IosInstance =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): IosInstance =
        create(IosInstanceCreateParams.none(), requestOptions)

    /** List iOS instances */
    fun list(): IosInstanceListResponse = list(IosInstanceListParams.none())

    /** @see list */
    fun list(
        params: IosInstanceListParams = IosInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IosInstanceListResponse

    /** @see list */
    fun list(
        params: IosInstanceListParams = IosInstanceListParams.none()
    ): IosInstanceListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IosInstanceListResponse =
        list(IosInstanceListParams.none(), requestOptions)

    /** Delete iOS instance with given name */
    fun delete(id: String) = delete(id, IosInstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IosInstanceDeleteParams = IosInstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: IosInstanceDeleteParams = IosInstanceDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IosInstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: IosInstanceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, IosInstanceDeleteParams.none(), requestOptions)

    /** Get iOS instance with given ID */
    fun get(id: String): IosInstance = get(id, IosInstanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: IosInstanceGetParams = IosInstanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IosInstance = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: IosInstanceGetParams = IosInstanceGetParams.none()): IosInstance =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: IosInstanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IosInstance

    /** @see get */
    fun get(params: IosInstanceGetParams): IosInstance = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): IosInstance =
        get(id, IosInstanceGetParams.none(), requestOptions)

    /**
     * A view of [IosInstanceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IosInstanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/ios_instances`, but is otherwise the same as
         * [IosInstanceService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<IosInstance> = create(IosInstanceCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IosInstanceCreateParams = IosInstanceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IosInstance>

        /** @see create */
        @MustBeClosed
        fun create(
            params: IosInstanceCreateParams = IosInstanceCreateParams.none()
        ): HttpResponseFor<IosInstance> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<IosInstance> =
            create(IosInstanceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ios_instances`, but is otherwise the same as
         * [IosInstanceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<IosInstanceListResponse> = list(IosInstanceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IosInstanceListParams = IosInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IosInstanceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: IosInstanceListParams = IosInstanceListParams.none()
        ): HttpResponseFor<IosInstanceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IosInstanceListResponse> =
            list(IosInstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ios_instances/{id}`, but is otherwise the
         * same as [IosInstanceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, IosInstanceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IosInstanceDeleteParams = IosInstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IosInstanceDeleteParams = IosInstanceDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: IosInstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: IosInstanceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, IosInstanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/ios_instances/{id}`, but is otherwise the same
         * as [IosInstanceService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<IosInstance> = get(id, IosInstanceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: IosInstanceGetParams = IosInstanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IosInstance> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: IosInstanceGetParams = IosInstanceGetParams.none(),
        ): HttpResponseFor<IosInstance> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: IosInstanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IosInstance>

        /** @see get */
        @MustBeClosed
        fun get(params: IosInstanceGetParams): HttpResponseFor<IosInstance> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<IosInstance> =
            get(id, IosInstanceGetParams.none(), requestOptions)
    }
}
