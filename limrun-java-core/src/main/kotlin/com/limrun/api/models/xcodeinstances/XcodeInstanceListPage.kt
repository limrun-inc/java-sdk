// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.xcodeinstances

import com.limrun.api.core.AutoPager
import com.limrun.api.core.Page
import com.limrun.api.core.checkRequired
import com.limrun.api.services.blocking.XcodeInstanceService
import java.util.Objects

/** @see XcodeInstanceService.list */
class XcodeInstanceListPage
private constructor(
    private val service: XcodeInstanceService,
    private val params: XcodeInstanceListParams,
    private val items: List<XcodeInstances>,
) : Page<XcodeInstances> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): XcodeInstanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): XcodeInstanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<XcodeInstances> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): XcodeInstanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<XcodeInstances> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [XcodeInstanceListPage].
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

    /** A builder for [XcodeInstanceListPage]. */
    class Builder internal constructor() {

        private var service: XcodeInstanceService? = null
        private var params: XcodeInstanceListParams? = null
        private var items: List<XcodeInstances>? = null

        @JvmSynthetic
        internal fun from(xcodeInstanceListPage: XcodeInstanceListPage) = apply {
            service = xcodeInstanceListPage.service
            params = xcodeInstanceListPage.params
            items = xcodeInstanceListPage.items
        }

        fun service(service: XcodeInstanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: XcodeInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<XcodeInstances>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [XcodeInstanceListPage].
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
        fun build(): XcodeInstanceListPage =
            XcodeInstanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is XcodeInstanceListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "XcodeInstanceListPage{service=$service, params=$params, items=$items}"
}
