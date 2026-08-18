// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.limrun.api.core.Params
import com.limrun.api.core.checkRequired
import com.limrun.api.core.http.Headers
import com.limrun.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns per-instance analytics grouped by minute bucket for detailed chart views. */
class AnalyticsGetInstancesParams
private constructor(
    private val from: OffsetDateTime,
    private val to: OffsetDateTime,
    private val labels: String?,
    private val region: String?,
    private val timezone: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Start of the time range (inclusive, RFC3339) */
    fun from(): OffsetDateTime = from

    /** End of the time range (exclusive, RFC3339) */
    fun to(): OffsetDateTime = to

    /** Label selector to filter instances (e.g., "env=prod,team=backend") */
    fun labels(): Optional<String> = Optional.ofNullable(labels)

    /** Optional region filter */
    fun region(): Optional<String> = Optional.ofNullable(region)

    /**
     * Optional IANA timezone used for minute bucket grouping. Defaults to America/Los_Angeles when
     * omitted.
     */
    fun timezone(): Optional<String> = Optional.ofNullable(timezone)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AnalyticsGetInstancesParams].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsGetInstancesParams]. */
    class Builder internal constructor() {

        private var from: OffsetDateTime? = null
        private var to: OffsetDateTime? = null
        private var labels: String? = null
        private var region: String? = null
        private var timezone: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(analyticsGetInstancesParams: AnalyticsGetInstancesParams) = apply {
            from = analyticsGetInstancesParams.from
            to = analyticsGetInstancesParams.to
            labels = analyticsGetInstancesParams.labels
            region = analyticsGetInstancesParams.region
            timezone = analyticsGetInstancesParams.timezone
            additionalHeaders = analyticsGetInstancesParams.additionalHeaders.toBuilder()
            additionalQueryParams = analyticsGetInstancesParams.additionalQueryParams.toBuilder()
        }

        /** Start of the time range (inclusive, RFC3339) */
        fun from(from: OffsetDateTime) = apply { this.from = from }

        /** End of the time range (exclusive, RFC3339) */
        fun to(to: OffsetDateTime) = apply { this.to = to }

        /** Label selector to filter instances (e.g., "env=prod,team=backend") */
        fun labels(labels: String?) = apply { this.labels = labels }

        /** Alias for calling [Builder.labels] with `labels.orElse(null)`. */
        fun labels(labels: Optional<String>) = labels(labels.getOrNull())

        /** Optional region filter */
        fun region(region: String?) = apply { this.region = region }

        /** Alias for calling [Builder.region] with `region.orElse(null)`. */
        fun region(region: Optional<String>) = region(region.getOrNull())

        /**
         * Optional IANA timezone used for minute bucket grouping. Defaults to America/Los_Angeles
         * when omitted.
         */
        fun timezone(timezone: String?) = apply { this.timezone = timezone }

        /** Alias for calling [Builder.timezone] with `timezone.orElse(null)`. */
        fun timezone(timezone: Optional<String>) = timezone(timezone.getOrNull())

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
         * Returns an immutable instance of [AnalyticsGetInstancesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticsGetInstancesParams =
            AnalyticsGetInstancesParams(
                checkRequired("from", from),
                checkRequired("to", to),
                labels,
                region,
                timezone,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(from))
                put("to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(to))
                labels?.let { put("labels", it) }
                region?.let { put("region", it) }
                timezone?.let { put("timezone", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsGetInstancesParams &&
            from == other.from &&
            to == other.to &&
            labels == other.labels &&
            region == other.region &&
            timezone == other.timezone &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(from, to, labels, region, timezone, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AnalyticsGetInstancesParams{from=$from, to=$to, labels=$labels, region=$region, timezone=$timezone, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
