// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.limrun.api.core.AutoPagerAsync
import com.limrun.api.core.PageAsync
import com.limrun.api.core.checkRequired
import com.limrun.api.services.async.AssetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AssetServiceAsync.list */
class AssetListPageAsync
private constructor(
    private val service: AssetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AssetListParams,
    private val response: AssetListPageResponse,
) : PageAsync<Asset> {

    /**
     * Delegates to [AssetListPageResponse], but gracefully handles missing data.
     *
     * @see AssetListPageResponse.items
     */
    override fun items(): List<Asset> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AssetListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<AssetListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Asset> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AssetListParams = params

    /** The response that this page was parsed from. */
    fun response(): AssetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssetListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetListPageAsync]. */
    class Builder internal constructor() {

        private var service: AssetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AssetListParams? = null
        private var response: AssetListPageResponse? = null

        @JvmSynthetic
        internal fun from(assetListPageAsync: AssetListPageAsync) = apply {
            service = assetListPageAsync.service
            streamHandlerExecutor = assetListPageAsync.streamHandlerExecutor
            params = assetListPageAsync.params
            response = assetListPageAsync.response
        }

        fun service(service: AssetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AssetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AssetListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AssetListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssetListPageAsync =
            AssetListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssetListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AssetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
