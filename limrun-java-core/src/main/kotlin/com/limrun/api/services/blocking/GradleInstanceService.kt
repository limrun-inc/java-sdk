// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.gradleinstances.GradleInstance
import com.limrun.api.models.gradleinstances.GradleInstanceCreateParams
import com.limrun.api.models.gradleinstances.GradleInstanceDeleteParams
import com.limrun.api.models.gradleinstances.GradleInstanceGetParams
import com.limrun.api.models.gradleinstances.GradleInstanceListPage
import com.limrun.api.models.gradleinstances.GradleInstanceListParams
import java.util.function.Consumer

interface GradleInstanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GradleInstanceService

    /** Create a Gradle instance */
    fun create(): GradleInstance = create(GradleInstanceCreateParams.none())

    /** @see create */
    fun create(
        params: GradleInstanceCreateParams = GradleInstanceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GradleInstance

    /** @see create */
    fun create(
        params: GradleInstanceCreateParams = GradleInstanceCreateParams.none()
    ): GradleInstance = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): GradleInstance =
        create(GradleInstanceCreateParams.none(), requestOptions)

    /** List Gradle instances */
    fun list(): GradleInstanceListPage = list(GradleInstanceListParams.none())

    /** @see list */
    fun list(
        params: GradleInstanceListParams = GradleInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GradleInstanceListPage

    /** @see list */
    fun list(
        params: GradleInstanceListParams = GradleInstanceListParams.none()
    ): GradleInstanceListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GradleInstanceListPage =
        list(GradleInstanceListParams.none(), requestOptions)

    /** Delete Gradle instance with given name */
    fun delete(id: String) = delete(id, GradleInstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GradleInstanceDeleteParams = GradleInstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: GradleInstanceDeleteParams = GradleInstanceDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GradleInstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: GradleInstanceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, GradleInstanceDeleteParams.none(), requestOptions)

    /** Get Gradle instance with given ID */
    fun get(id: String): GradleInstance = get(id, GradleInstanceGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: GradleInstanceGetParams = GradleInstanceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GradleInstance = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: GradleInstanceGetParams = GradleInstanceGetParams.none(),
    ): GradleInstance = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GradleInstanceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GradleInstance

    /** @see get */
    fun get(params: GradleInstanceGetParams): GradleInstance = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): GradleInstance =
        get(id, GradleInstanceGetParams.none(), requestOptions)

    /**
     * A view of [GradleInstanceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GradleInstanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/gradle_instances`, but is otherwise the same as
         * [GradleInstanceService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<GradleInstance> = create(GradleInstanceCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GradleInstanceCreateParams = GradleInstanceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GradleInstance>

        /** @see create */
        @MustBeClosed
        fun create(
            params: GradleInstanceCreateParams = GradleInstanceCreateParams.none()
        ): HttpResponseFor<GradleInstance> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<GradleInstance> =
            create(GradleInstanceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/gradle_instances`, but is otherwise the same as
         * [GradleInstanceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<GradleInstanceListPage> = list(GradleInstanceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GradleInstanceListParams = GradleInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GradleInstanceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GradleInstanceListParams = GradleInstanceListParams.none()
        ): HttpResponseFor<GradleInstanceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GradleInstanceListPage> =
            list(GradleInstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/gradle_instances/{id}`, but is otherwise the
         * same as [GradleInstanceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, GradleInstanceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: GradleInstanceDeleteParams = GradleInstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: GradleInstanceDeleteParams = GradleInstanceDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GradleInstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: GradleInstanceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, GradleInstanceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/gradle_instances/{id}`, but is otherwise the
         * same as [GradleInstanceService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<GradleInstance> =
            get(id, GradleInstanceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: GradleInstanceGetParams = GradleInstanceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GradleInstance> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: GradleInstanceGetParams = GradleInstanceGetParams.none(),
        ): HttpResponseFor<GradleInstance> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: GradleInstanceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GradleInstance>

        /** @see get */
        @MustBeClosed
        fun get(params: GradleInstanceGetParams): HttpResponseFor<GradleInstance> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<GradleInstance> =
            get(id, GradleInstanceGetParams.none(), requestOptions)
    }
}
