// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.limrun.api.core.AutoPager
import com.limrun.api.core.Page
import com.limrun.api.core.checkRequired
import com.limrun.api.services.blocking.AssetService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see AssetService.list */
class AssetListPage
private constructor(
    private val service: AssetService,
    private val params: AssetListParams,
    private val response: AssetListPageResponse,
) : Page<Asset> {

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

    override fun nextPage(): AssetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Asset> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AssetListParams = params

    /** The response that this page was parsed from. */
    fun response(): AssetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssetListPage].
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

    /** A builder for [AssetListPage]. */
    class Builder internal constructor() {

        private var service: AssetService? = null
        private var params: AssetListParams? = null
        private var response: AssetListPageResponse? = null

        @JvmSynthetic
        internal fun from(assetListPage: AssetListPage) = apply {
            service = assetListPage.service
            params = assetListPage.params
            response = assetListPage.response
        }

        fun service(service: AssetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AssetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AssetListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AssetListPage].
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
        fun build(): AssetListPage =
            AssetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssetListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "AssetListPage{service=$service, params=$params, response=$response}"
}
