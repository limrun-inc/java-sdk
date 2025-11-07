// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.limrun.api.core.AutoPagerAsync
import com.limrun.api.core.PageAsync
import com.limrun.api.core.checkRequired
import com.limrun.api.services.async.AssetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see AssetServiceAsync.list */
class AssetListPageAsync
private constructor(
    private val service: AssetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AssetListParams,
    private val items: List<Asset>,
) : PageAsync<Asset> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AssetListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<AssetListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Asset> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AssetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Asset> = items

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
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetListPageAsync]. */
    class Builder internal constructor() {

        private var service: AssetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AssetListParams? = null
        private var items: List<Asset>? = null

        @JvmSynthetic
        internal fun from(assetListPageAsync: AssetListPageAsync) = apply {
            service = assetListPageAsync.service
            streamHandlerExecutor = assetListPageAsync.streamHandlerExecutor
            params = assetListPageAsync.params
            items = assetListPageAsync.items
        }

        fun service(service: AssetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AssetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Asset>) = apply { this.items = items }

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
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssetListPageAsync =
            AssetListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
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
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AssetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
