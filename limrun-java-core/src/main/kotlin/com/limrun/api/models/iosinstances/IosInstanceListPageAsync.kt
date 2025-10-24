// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.limrun.api.core.AutoPagerAsync
import com.limrun.api.core.PageAsync
import com.limrun.api.core.checkRequired
import com.limrun.api.services.async.IosInstanceServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see IosInstanceServiceAsync.list */
class IosInstanceListPageAsync
private constructor(
    private val service: IosInstanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IosInstanceListParams,
    private val response: IosInstanceListPageResponse,
) : PageAsync<IosInstance> {

    /**
     * Delegates to [IosInstanceListPageResponse], but gracefully handles missing data.
     *
     * @see IosInstanceListPageResponse.items
     */
    override fun items(): List<IosInstance> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IosInstanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<IosInstanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IosInstance> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IosInstanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): IosInstanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IosInstanceListPageAsync].
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

    /** A builder for [IosInstanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: IosInstanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IosInstanceListParams? = null
        private var response: IosInstanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(iosInstanceListPageAsync: IosInstanceListPageAsync) = apply {
            service = iosInstanceListPageAsync.service
            streamHandlerExecutor = iosInstanceListPageAsync.streamHandlerExecutor
            params = iosInstanceListPageAsync.params
            response = iosInstanceListPageAsync.response
        }

        fun service(service: IosInstanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IosInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IosInstanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [IosInstanceListPageAsync].
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
        fun build(): IosInstanceListPageAsync =
            IosInstanceListPageAsync(
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

        return other is IosInstanceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "IosInstanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
