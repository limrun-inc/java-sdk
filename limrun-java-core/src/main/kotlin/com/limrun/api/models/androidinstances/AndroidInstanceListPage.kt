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
    private val data: List<AndroidInstance>,
) : Page<AndroidInstance> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AndroidInstanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): AndroidInstanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AndroidInstance> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AndroidInstanceListParams = params

    /** The response that this page was parsed from. */
    override fun data(): List<AndroidInstance> = data

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AndroidInstanceListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AndroidInstanceListPage]. */
    class Builder internal constructor() {

        private var service: AndroidInstanceService? = null
        private var params: AndroidInstanceListParams? = null
        private var data: List<AndroidInstance>? = null

        @JvmSynthetic
        internal fun from(androidInstanceListPage: AndroidInstanceListPage) = apply {
            service = androidInstanceListPage.service
            params = androidInstanceListPage.params
            data = androidInstanceListPage.data
        }

        fun service(service: AndroidInstanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AndroidInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun data(data: List<AndroidInstance>) = apply { this.data = data }

        /**
         * Returns an immutable instance of [AndroidInstanceListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AndroidInstanceListPage =
            AndroidInstanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("data", data),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AndroidInstanceListPage &&
            service == other.service &&
            params == other.params &&
            data == other.data
    }

    override fun hashCode(): Int = Objects.hash(service, params, data)

    override fun toString() =
        "AndroidInstanceListPage{service=$service, params=$params, data=$data}"
}
