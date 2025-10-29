// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.androidinstances.AndroidInstance
import com.limrun.api.models.androidinstances.AndroidInstanceCreateParams
import com.limrun.api.models.androidinstances.AndroidInstanceDeleteParams
import com.limrun.api.models.androidinstances.AndroidInstanceGetParams
import com.limrun.api.models.androidinstances.AndroidInstanceListParams
import com.limrun.api.models.androidinstances.AndroidInstanceListResponse
import java.util.function.Consumer

interface AndroidInstanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AndroidInstanceService

    /** Create an Android instance */
    fun create(): AndroidInstance = create(AndroidInstanceCreateParams.none())

    /** @see create */
    fun create(
        params: AndroidInstanceCreateParams = AndroidInstanceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AndroidInstance

    /** @see create */
    fun create(
        params: AndroidInstanceCreateParams = AndroidInstanceCreateParams.none()
    ): AndroidInstance = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): AndroidInstance =
        create(AndroidInstanceCreateParams.none(), requestOptions)

    /** List Android instances */
    fun list(): List<AndroidInstanceListResponse> = list(AndroidInstanceListParams.none())

    /** @see list */
    fun list(
        params: AndroidInstanceListParams = AndroidInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AndroidInstanceListResponse>

    /** @see list */
    fun list(
        params: AndroidInstanceListParams = AndroidInstanceListParams.none()
    ): List<AndroidInstanceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<AndroidInstanceListResponse> =
        list(AndroidInstanceListParams.none(), requestOptions)

    /** Delete Android instance with given name */
    fun delete(id: String) = delete(id, AndroidInstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AndroidInstanceDeleteParams = AndroidInstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AndroidInstanceDeleteParams = AndroidInstanceDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AndroidInstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: AndroidInstanceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, AndroidInstanceDeleteParams.none(), requestOptions)

    /** Get Android instance with given ID */
    fun get(id: String): AndroidInstance = get(id, AndroidInstanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: AndroidInstanceGetParams = AndroidInstanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AndroidInstance = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: AndroidInstanceGetParams = AndroidInstanceGetParams.none(),
    ): AndroidInstance = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AndroidInstanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AndroidInstance

    /** @see get */
    fun get(params: AndroidInstanceGetParams): AndroidInstance = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): AndroidInstance =
        get(id, AndroidInstanceGetParams.none(), requestOptions)

    /**
     * A view of [AndroidInstanceService] that provides access to raw HTTP responses for each
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
        ): AndroidInstanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/android_instances`, but is otherwise the same
         * as [AndroidInstanceService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<AndroidInstance> = create(AndroidInstanceCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AndroidInstanceCreateParams = AndroidInstanceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AndroidInstance>

        /** @see create */
        @MustBeClosed
        fun create(
            params: AndroidInstanceCreateParams = AndroidInstanceCreateParams.none()
        ): HttpResponseFor<AndroidInstance> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<AndroidInstance> =
            create(AndroidInstanceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/android_instances`, but is otherwise the same as
         * [AndroidInstanceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<AndroidInstanceListResponse>> =
            list(AndroidInstanceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AndroidInstanceListParams = AndroidInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AndroidInstanceListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AndroidInstanceListParams = AndroidInstanceListParams.none()
        ): HttpResponseFor<List<AndroidInstanceListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AndroidInstanceListResponse>> =
            list(AndroidInstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/android_instances/{id}`, but is otherwise the
         * same as [AndroidInstanceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, AndroidInstanceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AndroidInstanceDeleteParams = AndroidInstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AndroidInstanceDeleteParams = AndroidInstanceDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AndroidInstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AndroidInstanceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, AndroidInstanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/android_instances/{id}`, but is otherwise the
         * same as [AndroidInstanceService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<AndroidInstance> =
            get(id, AndroidInstanceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: AndroidInstanceGetParams = AndroidInstanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AndroidInstance> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: AndroidInstanceGetParams = AndroidInstanceGetParams.none(),
        ): HttpResponseFor<AndroidInstance> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AndroidInstanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AndroidInstance>

        /** @see get */
        @MustBeClosed
        fun get(params: AndroidInstanceGetParams): HttpResponseFor<AndroidInstance> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<AndroidInstance> =
            get(id, AndroidInstanceGetParams.none(), requestOptions)
    }
}
