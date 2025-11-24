// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.limrun.api.core.AutoPager
import com.limrun.api.core.Page
import com.limrun.api.core.checkRequired
import com.limrun.api.services.blocking.AssetService
import java.util.Objects

/** @see AssetService.list */
class AssetListPage
private constructor(
    private val service: AssetService,
    private val params: AssetListParams,
    private val items: List<Asset>,
) : Page<Asset> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AssetListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): AssetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Asset> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AssetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Asset> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssetListPage].
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

    /** A builder for [AssetListPage]. */
    class Builder internal constructor() {

        private var service: AssetService? = null
        private var params: AssetListParams? = null
        private var items: List<Asset>? = null

        @JvmSynthetic
        internal fun from(assetListPage: AssetListPage) = apply {
            service = assetListPage.service
            params = assetListPage.params
            items = assetListPage.items
        }

        fun service(service: AssetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AssetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Asset>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AssetListPage].
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
        fun build(): AssetListPage =
            AssetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssetListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "AssetListPage{service=$service, params=$params, items=$items}"
}
