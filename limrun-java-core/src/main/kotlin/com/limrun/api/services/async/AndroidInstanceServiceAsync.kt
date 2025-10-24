// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.androidinstances.AndroidInstance
import com.limrun.api.models.androidinstances.AndroidInstanceCreateParams
import com.limrun.api.models.androidinstances.AndroidInstanceDeleteParams
import com.limrun.api.models.androidinstances.AndroidInstanceGetParams
import com.limrun.api.models.androidinstances.AndroidInstanceListPageAsync
import com.limrun.api.models.androidinstances.AndroidInstanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AndroidInstanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AndroidInstanceServiceAsync

    /** Create an Android instance */
    fun create(): CompletableFuture<AndroidInstance> = create(AndroidInstanceCreateParams.none())

    /** @see create */
    fun create(
        params: AndroidInstanceCreateParams = AndroidInstanceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AndroidInstance>

    /** @see create */
    fun create(
        params: AndroidInstanceCreateParams = AndroidInstanceCreateParams.none()
    ): CompletableFuture<AndroidInstance> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<AndroidInstance> =
        create(AndroidInstanceCreateParams.none(), requestOptions)

    /** List Android instances belonging to given organization */
    fun list(): CompletableFuture<AndroidInstanceListPageAsync> =
        list(AndroidInstanceListParams.none())

    /** @see list */
    fun list(
        params: AndroidInstanceListParams = AndroidInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AndroidInstanceListPageAsync>

    /** @see list */
    fun list(
        params: AndroidInstanceListParams = AndroidInstanceListParams.none()
    ): CompletableFuture<AndroidInstanceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AndroidInstanceListPageAsync> =
        list(AndroidInstanceListParams.none(), requestOptions)

    /** Delete Android instance with given name */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, AndroidInstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AndroidInstanceDeleteParams = AndroidInstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AndroidInstanceDeleteParams = AndroidInstanceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AndroidInstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AndroidInstanceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, AndroidInstanceDeleteParams.none(), requestOptions)

    /** Get Android instance with given ID */
    fun get(id: String): CompletableFuture<AndroidInstance> =
        get(id, AndroidInstanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: AndroidInstanceGetParams = AndroidInstanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AndroidInstance> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: AndroidInstanceGetParams = AndroidInstanceGetParams.none(),
    ): CompletableFuture<AndroidInstance> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AndroidInstanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AndroidInstance>

    /** @see get */
    fun get(params: AndroidInstanceGetParams): CompletableFuture<AndroidInstance> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<AndroidInstance> =
        get(id, AndroidInstanceGetParams.none(), requestOptions)

    /**
     * A view of [AndroidInstanceServiceAsync] that provides access to raw HTTP responses for each
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
        ): AndroidInstanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/android_instances`, but is otherwise the same
         * as [AndroidInstanceServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<AndroidInstance>> =
            create(AndroidInstanceCreateParams.none())

        /** @see create */
        fun create(
            params: AndroidInstanceCreateParams = AndroidInstanceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AndroidInstance>>

        /** @see create */
        fun create(
            params: AndroidInstanceCreateParams = AndroidInstanceCreateParams.none()
        ): CompletableFuture<HttpResponseFor<AndroidInstance>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AndroidInstance>> =
            create(AndroidInstanceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/android_instances`, but is otherwise the same as
         * [AndroidInstanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AndroidInstanceListPageAsync>> =
            list(AndroidInstanceListParams.none())

        /** @see list */
        fun list(
            params: AndroidInstanceListParams = AndroidInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AndroidInstanceListPageAsync>>

        /** @see list */
        fun list(
            params: AndroidInstanceListParams = AndroidInstanceListParams.none()
        ): CompletableFuture<HttpResponseFor<AndroidInstanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AndroidInstanceListPageAsync>> =
            list(AndroidInstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/android_instances/{id}`, but is otherwise the
         * same as [AndroidInstanceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, AndroidInstanceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AndroidInstanceDeleteParams = AndroidInstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AndroidInstanceDeleteParams = AndroidInstanceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AndroidInstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AndroidInstanceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, AndroidInstanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/android_instances/{id}`, but is otherwise the
         * same as [AndroidInstanceServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<AndroidInstance>> =
            get(id, AndroidInstanceGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: AndroidInstanceGetParams = AndroidInstanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AndroidInstance>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: AndroidInstanceGetParams = AndroidInstanceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<AndroidInstance>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: AndroidInstanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AndroidInstance>>

        /** @see get */
        fun get(
            params: AndroidInstanceGetParams
        ): CompletableFuture<HttpResponseFor<AndroidInstance>> = get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AndroidInstance>> =
            get(id, AndroidInstanceGetParams.none(), requestOptions)
    }
}
