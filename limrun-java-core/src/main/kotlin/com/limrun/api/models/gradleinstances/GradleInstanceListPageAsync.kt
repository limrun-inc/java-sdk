// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.gradleinstances

import com.limrun.api.core.AutoPagerAsync
import com.limrun.api.core.PageAsync
import com.limrun.api.core.checkRequired
import com.limrun.api.services.async.GradleInstanceServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see GradleInstanceServiceAsync.list */
class GradleInstanceListPageAsync
private constructor(
    private val service: GradleInstanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GradleInstanceListParams,
    private val items: List<GradleInstance>,
) : PageAsync<GradleInstance> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GradleInstanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<GradleInstanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GradleInstance> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GradleInstanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GradleInstance> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GradleInstanceListPageAsync].
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

    /** A builder for [GradleInstanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: GradleInstanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GradleInstanceListParams? = null
        private var items: List<GradleInstance>? = null

        @JvmSynthetic
        internal fun from(gradleInstanceListPageAsync: GradleInstanceListPageAsync) = apply {
            service = gradleInstanceListPageAsync.service
            streamHandlerExecutor = gradleInstanceListPageAsync.streamHandlerExecutor
            params = gradleInstanceListPageAsync.params
            items = gradleInstanceListPageAsync.items
        }

        fun service(service: GradleInstanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GradleInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GradleInstance>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GradleInstanceListPageAsync].
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
        fun build(): GradleInstanceListPageAsync =
            GradleInstanceListPageAsync(
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

        return other is GradleInstanceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "GradleInstanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
