// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.xcodeinstances

import com.limrun.api.core.AutoPagerAsync
import com.limrun.api.core.PageAsync
import com.limrun.api.core.checkRequired
import com.limrun.api.services.async.XcodeInstanceServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see XcodeInstanceServiceAsync.list */
class XcodeInstanceListPageAsync
private constructor(
    private val service: XcodeInstanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: XcodeInstanceListParams,
    private val items: List<XcodeInstances>,
) : PageAsync<XcodeInstances> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): XcodeInstanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<XcodeInstanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<XcodeInstances> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): XcodeInstanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<XcodeInstances> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [XcodeInstanceListPageAsync].
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

    /** A builder for [XcodeInstanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: XcodeInstanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: XcodeInstanceListParams? = null
        private var items: List<XcodeInstances>? = null

        @JvmSynthetic
        internal fun from(xcodeInstanceListPageAsync: XcodeInstanceListPageAsync) = apply {
            service = xcodeInstanceListPageAsync.service
            streamHandlerExecutor = xcodeInstanceListPageAsync.streamHandlerExecutor
            params = xcodeInstanceListPageAsync.params
            items = xcodeInstanceListPageAsync.items
        }

        fun service(service: XcodeInstanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: XcodeInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<XcodeInstances>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [XcodeInstanceListPageAsync].
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
        fun build(): XcodeInstanceListPageAsync =
            XcodeInstanceListPageAsync(
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

        return other is XcodeInstanceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "XcodeInstanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
