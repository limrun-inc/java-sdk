// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.async

import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.gradleinstances.GradleInstance
import com.limrun.api.models.gradleinstances.GradleInstanceCreateParams
import com.limrun.api.models.gradleinstances.GradleInstanceDeleteParams
import com.limrun.api.models.gradleinstances.GradleInstanceGetParams
import com.limrun.api.models.gradleinstances.GradleInstanceListPageAsync
import com.limrun.api.models.gradleinstances.GradleInstanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GradleInstanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GradleInstanceServiceAsync

    /** Create a Gradle instance */
    fun create(): CompletableFuture<GradleInstance> = create(GradleInstanceCreateParams.none())

    /** @see create */
    fun create(
        params: GradleInstanceCreateParams = GradleInstanceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GradleInstance>

    /** @see create */
    fun create(
        params: GradleInstanceCreateParams = GradleInstanceCreateParams.none()
    ): CompletableFuture<GradleInstance> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<GradleInstance> =
        create(GradleInstanceCreateParams.none(), requestOptions)

    /** List Gradle instances */
    fun list(): CompletableFuture<GradleInstanceListPageAsync> =
        list(GradleInstanceListParams.none())

    /** @see list */
    fun list(
        params: GradleInstanceListParams = GradleInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GradleInstanceListPageAsync>

    /** @see list */
    fun list(
        params: GradleInstanceListParams = GradleInstanceListParams.none()
    ): CompletableFuture<GradleInstanceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<GradleInstanceListPageAsync> =
        list(GradleInstanceListParams.none(), requestOptions)

    /** Delete Gradle instance with given name */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, GradleInstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GradleInstanceDeleteParams = GradleInstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: GradleInstanceDeleteParams = GradleInstanceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GradleInstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: GradleInstanceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, GradleInstanceDeleteParams.none(), requestOptions)

    /** Get Gradle instance with given ID */
    fun get(id: String): CompletableFuture<GradleInstance> = get(id, GradleInstanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: GradleInstanceGetParams = GradleInstanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GradleInstance> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: GradleInstanceGetParams = GradleInstanceGetParams.none(),
    ): CompletableFuture<GradleInstance> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GradleInstanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GradleInstance>

    /** @see get */
    fun get(params: GradleInstanceGetParams): CompletableFuture<GradleInstance> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<GradleInstance> =
        get(id, GradleInstanceGetParams.none(), requestOptions)

    /**
     * A view of [GradleInstanceServiceAsync] that provides access to raw HTTP responses for each
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
        ): GradleInstanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/gradle_instances`, but is otherwise the same as
         * [GradleInstanceServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<GradleInstance>> =
            create(GradleInstanceCreateParams.none())

        /** @see create */
        fun create(
            params: GradleInstanceCreateParams = GradleInstanceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GradleInstance>>

        /** @see create */
        fun create(
            params: GradleInstanceCreateParams = GradleInstanceCreateParams.none()
        ): CompletableFuture<HttpResponseFor<GradleInstance>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GradleInstance>> =
            create(GradleInstanceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/gradle_instances`, but is otherwise the same as
         * [GradleInstanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GradleInstanceListPageAsync>> =
            list(GradleInstanceListParams.none())

        /** @see list */
        fun list(
            params: GradleInstanceListParams = GradleInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GradleInstanceListPageAsync>>

        /** @see list */
        fun list(
            params: GradleInstanceListParams = GradleInstanceListParams.none()
        ): CompletableFuture<HttpResponseFor<GradleInstanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GradleInstanceListPageAsync>> =
            list(GradleInstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/gradle_instances/{id}`, but is otherwise the
         * same as [GradleInstanceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, GradleInstanceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: GradleInstanceDeleteParams = GradleInstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: GradleInstanceDeleteParams = GradleInstanceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GradleInstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: GradleInstanceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, GradleInstanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/gradle_instances/{id}`, but is otherwise the
         * same as [GradleInstanceServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<GradleInstance>> =
            get(id, GradleInstanceGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: GradleInstanceGetParams = GradleInstanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GradleInstance>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: GradleInstanceGetParams = GradleInstanceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<GradleInstance>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: GradleInstanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GradleInstance>>

        /** @see get */
        fun get(
            params: GradleInstanceGetParams
        ): CompletableFuture<HttpResponseFor<GradleInstance>> = get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GradleInstance>> =
            get(id, GradleInstanceGetParams.none(), requestOptions)
    }
}
