// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.gradleinstances

import com.limrun.api.core.AutoPager
import com.limrun.api.core.Page
import com.limrun.api.core.checkRequired
import com.limrun.api.services.blocking.GradleInstanceService
import java.util.Objects

/** @see GradleInstanceService.list */
class GradleInstanceListPage
private constructor(
    private val service: GradleInstanceService,
    private val params: GradleInstanceListParams,
    private val items: List<GradleInstance>,
) : Page<GradleInstance> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GradleInstanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): GradleInstanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GradleInstance> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GradleInstanceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<GradleInstance> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GradleInstanceListPage].
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

    /** A builder for [GradleInstanceListPage]. */
    class Builder internal constructor() {

        private var service: GradleInstanceService? = null
        private var params: GradleInstanceListParams? = null
        private var items: List<GradleInstance>? = null

        @JvmSynthetic
        internal fun from(gradleInstanceListPage: GradleInstanceListPage) = apply {
            service = gradleInstanceListPage.service
            params = gradleInstanceListPage.params
            items = gradleInstanceListPage.items
        }

        fun service(service: GradleInstanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GradleInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<GradleInstance>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [GradleInstanceListPage].
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
        fun build(): GradleInstanceListPage =
            GradleInstanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GradleInstanceListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "GradleInstanceListPage{service=$service, params=$params, items=$items}"
}
