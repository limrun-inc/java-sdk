// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.limrun.api.core.ClientOptions
import com.limrun.api.core.RequestOptions
import com.limrun.api.core.http.HttpResponseFor
import com.limrun.api.models.analytics.AnalyticsGetInstancesParams
import com.limrun.api.models.analytics.AnalyticsGetParams
import com.limrun.api.models.analytics.AnalyticsInstancesResponse
import com.limrun.api.models.analytics.AnalyticsResponse
import java.util.function.Consumer

interface AnalyticsService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticsService

    /** Get analytics for the authenticated organization */
    fun get(params: AnalyticsGetParams): AnalyticsResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AnalyticsGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticsResponse

    /** Returns per-instance analytics grouped by minute bucket for detailed chart views. */
    fun getInstances(params: AnalyticsGetInstancesParams): AnalyticsInstancesResponse =
        getInstances(params, RequestOptions.none())

    /** @see getInstances */
    fun getInstances(
        params: AnalyticsGetInstancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticsInstancesResponse

    /** A view of [AnalyticsService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticsService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/analytics`, but is otherwise the same as
         * [AnalyticsService.get].
         */
        @MustBeClosed
        fun get(params: AnalyticsGetParams): HttpResponseFor<AnalyticsResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AnalyticsGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticsResponse>

        /**
         * Returns a raw HTTP response for `get /v1/analytics/instances`, but is otherwise the same
         * as [AnalyticsService.getInstances].
         */
        @MustBeClosed
        fun getInstances(
            params: AnalyticsGetInstancesParams
        ): HttpResponseFor<AnalyticsInstancesResponse> = getInstances(params, RequestOptions.none())

        /** @see getInstances */
        @MustBeClosed
        fun getInstances(
            params: AnalyticsGetInstancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticsInstancesResponse>
    }
}
