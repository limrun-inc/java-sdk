// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.limrun.api.core.AutoPager
import com.limrun.api.core.Page
import com.limrun.api.core.checkRequired
import com.limrun.api.services.blocking.IosInstanceService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see IosInstanceService.list */
class IosInstanceListPage
private constructor(
    private val service: IosInstanceService,
    private val params: IosInstanceListParams,
    private val response: IosInstanceListPageResponse,
) : Page<IosInstance> {

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

    override fun nextPage(): IosInstanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IosInstance> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IosInstanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): IosInstanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IosInstanceListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IosInstanceListPage]. */
    class Builder internal constructor() {

        private var service: IosInstanceService? = null
        private var params: IosInstanceListParams? = null
        private var response: IosInstanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(iosInstanceListPage: IosInstanceListPage) = apply {
            service = iosInstanceListPage.service
            params = iosInstanceListPage.params
            response = iosInstanceListPage.response
        }

        fun service(service: IosInstanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IosInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IosInstanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [IosInstanceListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IosInstanceListPage =
            IosInstanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IosInstanceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "IosInstanceListPage{service=$service, params=$params, response=$response}"
}
