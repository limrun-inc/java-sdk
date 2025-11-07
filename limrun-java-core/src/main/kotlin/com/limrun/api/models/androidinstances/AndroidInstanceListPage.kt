// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.androidinstances

import com.limrun.api.core.AutoPager
import com.limrun.api.core.Page
import com.limrun.api.core.checkRequired
import com.limrun.api.services.blocking.AndroidInstanceService
import java.util.Objects

/** @see AndroidInstanceService.list */
class AndroidInstanceListPage
private constructor(
    private val service: AndroidInstanceService,
    private val params: AndroidInstanceListParams,
    private val items: List<AndroidInstance>,
) : Page<AndroidInstance> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AndroidInstanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): AndroidInstanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AndroidInstance> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AndroidInstanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AndroidInstance> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AndroidInstanceListPage].
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

    /** A builder for [AndroidInstanceListPage]. */
    class Builder internal constructor() {

        private var service: AndroidInstanceService? = null
        private var params: AndroidInstanceListParams? = null
        private var items: List<AndroidInstance>? = null

        @JvmSynthetic
        internal fun from(androidInstanceListPage: AndroidInstanceListPage) = apply {
            service = androidInstanceListPage.service
            params = androidInstanceListPage.params
            items = androidInstanceListPage.items
        }

        fun service(service: AndroidInstanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AndroidInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<AndroidInstance>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AndroidInstanceListPage].
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
        fun build(): AndroidInstanceListPage =
            AndroidInstanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AndroidInstanceListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "AndroidInstanceListPage{service=$service, params=$params, items=$items}"
}
