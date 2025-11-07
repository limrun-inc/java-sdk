// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.androidinstances

import com.limrun.api.core.AutoPagerAsync
import com.limrun.api.core.PageAsync
import com.limrun.api.core.checkRequired
import com.limrun.api.services.async.AndroidInstanceServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see AndroidInstanceServiceAsync.list */
class AndroidInstanceListPageAsync
private constructor(
    private val service: AndroidInstanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AndroidInstanceListParams,
    private val items: List<AndroidInstance>,
) : PageAsync<AndroidInstance> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AndroidInstanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<AndroidInstanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AndroidInstance> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AndroidInstanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AndroidInstance> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AndroidInstanceListPageAsync].
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

    /** A builder for [AndroidInstanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: AndroidInstanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AndroidInstanceListParams? = null
        private var items: List<AndroidInstance>? = null

        @JvmSynthetic
        internal fun from(androidInstanceListPageAsync: AndroidInstanceListPageAsync) = apply {
            service = androidInstanceListPageAsync.service
            streamHandlerExecutor = androidInstanceListPageAsync.streamHandlerExecutor
            params = androidInstanceListPageAsync.params
            items = androidInstanceListPageAsync.items
        }

        fun service(service: AndroidInstanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AndroidInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AndroidInstance>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AndroidInstanceListPageAsync].
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
        fun build(): AndroidInstanceListPageAsync =
            AndroidInstanceListPageAsync(
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

        return other is AndroidInstanceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AndroidInstanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
