// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.limrun.api.core.AutoPager
import com.limrun.api.core.Page
import com.limrun.api.core.checkRequired
import com.limrun.api.services.blocking.IosInstanceService
import java.util.Objects

/** @see IosInstanceService.list */
class IosInstanceListPage
private constructor(
    private val service: IosInstanceService,
    private val params: IosInstanceListParams,
    private val items: List<IosInstance>,
) : Page<IosInstance> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IosInstanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): IosInstanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IosInstance> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IosInstanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IosInstance> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IosInstanceListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IosInstanceListPage]. */
    class Builder internal constructor() {

        private var service: IosInstanceService? = null
        private var params: IosInstanceListParams? = null
        private var items: List<IosInstance>? = null

        @JvmSynthetic
        internal fun from(iosInstanceListPage: IosInstanceListPage) = apply {
            service = iosInstanceListPage.service
            params = iosInstanceListPage.params
            items = iosInstanceListPage.items
        }

        fun service(service: IosInstanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IosInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<IosInstance>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IosInstanceListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IosInstanceListPage =
            IosInstanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IosInstanceListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "IosInstanceListPage{service=$service, params=$params, items=$items}"
}
