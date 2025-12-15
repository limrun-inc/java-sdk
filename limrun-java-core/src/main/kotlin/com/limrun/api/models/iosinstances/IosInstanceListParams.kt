// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.limrun.api.core.Params
import com.limrun.api.core.http.Headers
import com.limrun.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List iOS instances */
class IosInstanceListParams
private constructor(
    private val endingBefore: String?,
    private val labelSelector: String?,
    private val limit: Long?,
    private val region: String?,
    private val startingAfter: String?,
    private val state: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    /**
     * Labels filter to apply to instances to return. Expects a comma-separated list of key=value
     * pairs (e.g., env=prod,region=us-west).
     */
    fun labelSelector(): Optional<String> = Optional.ofNullable(labelSelector)

    /** Maximum number of items to be returned. The default is 50. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Region where the instance is scheduled on. */
    fun region(): Optional<String> = Optional.ofNullable(region)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    /**
     * State filter to apply to Android instances to return. Each comma-separated state will be used
     * as part of an OR clause, e.g. "assigned,ready" will return all instances that are either
     * assigned or ready.
     *
     * Valid states: creating, assigned, ready, terminated, unknown
     */
    fun state(): Optional<String> = Optional.ofNullable(state)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): IosInstanceListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [IosInstanceListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IosInstanceListParams]. */
    class Builder internal constructor() {

        private var endingBefore: String? = null
        private var labelSelector: String? = null
        private var limit: Long? = null
        private var region: String? = null
        private var startingAfter: String? = null
        private var state: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(iosInstanceListParams: IosInstanceListParams) = apply {
            endingBefore = iosInstanceListParams.endingBefore
            labelSelector = iosInstanceListParams.labelSelector
            limit = iosInstanceListParams.limit
            region = iosInstanceListParams.region
            startingAfter = iosInstanceListParams.startingAfter
            state = iosInstanceListParams.state
            additionalHeaders = iosInstanceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = iosInstanceListParams.additionalQueryParams.toBuilder()
        }

        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.getOrNull())

        /**
         * Labels filter to apply to instances to return. Expects a comma-separated list of
         * key=value pairs (e.g., env=prod,region=us-west).
         */
        fun labelSelector(labelSelector: String?) = apply { this.labelSelector = labelSelector }

        /** Alias for calling [Builder.labelSelector] with `labelSelector.orElse(null)`. */
        fun labelSelector(labelSelector: Optional<String>) =
            labelSelector(labelSelector.getOrNull())

        /** Maximum number of items to be returned. The default is 50. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Region where the instance is scheduled on. */
        fun region(region: String?) = apply { this.region = region }

        /** Alias for calling [Builder.region] with `region.orElse(null)`. */
        fun region(region: Optional<String>) = region(region.getOrNull())

        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.getOrNull())

        /**
         * State filter to apply to Android instances to return. Each comma-separated state will be
         * used as part of an OR clause, e.g. "assigned,ready" will return all instances that are
         * either assigned or ready.
         *
         * Valid states: creating, assigned, ready, terminated, unknown
         */
        fun state(state: String?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [IosInstanceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IosInstanceListParams =
            IosInstanceListParams(
                endingBefore,
                labelSelector,
                limit,
                region,
                startingAfter,
                state,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endingBefore?.let { put("endingBefore", it) }
                labelSelector?.let { put("labelSelector", it) }
                limit?.let { put("limit", it.toString()) }
                region?.let { put("region", it) }
                startingAfter?.let { put("startingAfter", it) }
                state?.let { put("state", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IosInstanceListParams &&
            endingBefore == other.endingBefore &&
            labelSelector == other.labelSelector &&
            limit == other.limit &&
            region == other.region &&
            startingAfter == other.startingAfter &&
            state == other.state &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endingBefore,
            labelSelector,
            limit,
            region,
            startingAfter,
            state,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "IosInstanceListParams{endingBefore=$endingBefore, labelSelector=$labelSelector, limit=$limit, region=$region, startingAfter=$startingAfter, state=$state, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
