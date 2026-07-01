// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.annotation.JsonCreator
import com.limrun.api.core.Enum
import com.limrun.api.core.JsonField
import com.limrun.api.core.Params
import com.limrun.api.core.checkRequired
import com.limrun.api.core.http.Headers
import com.limrun.api.core.http.QueryParams
import com.limrun.api.errors.LimrunInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get analytics for the authenticated organization */
class AnalyticsGetParams
private constructor(
    private val from: OffsetDateTime,
    private val to: OffsetDateTime,
    private val bucket: Bucket?,
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

    /** Time bucket granularity for the analytics series */
    fun bucket(): Optional<Bucket> = Optional.ofNullable(bucket)

    /** Label selector to filter instances (e.g., "env=prod,team=backend") */
    fun labels(): Optional<String> = Optional.ofNullable(labels)

    /** Optional region filter */
    fun region(): Optional<String> = Optional.ofNullable(region)

    /**
     * Optional IANA timezone used for time bucket grouping. Defaults to America/Los_Angeles when
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
         * Returns a mutable builder for constructing an instance of [AnalyticsGetParams].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsGetParams]. */
    class Builder internal constructor() {

        private var from: OffsetDateTime? = null
        private var to: OffsetDateTime? = null
        private var bucket: Bucket? = null
        private var labels: String? = null
        private var region: String? = null
        private var timezone: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(analyticsGetParams: AnalyticsGetParams) = apply {
            from = analyticsGetParams.from
            to = analyticsGetParams.to
            bucket = analyticsGetParams.bucket
            labels = analyticsGetParams.labels
            region = analyticsGetParams.region
            timezone = analyticsGetParams.timezone
            additionalHeaders = analyticsGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = analyticsGetParams.additionalQueryParams.toBuilder()
        }

        /** Start of the time range (inclusive, RFC3339) */
        fun from(from: OffsetDateTime) = apply { this.from = from }

        /** End of the time range (exclusive, RFC3339) */
        fun to(to: OffsetDateTime) = apply { this.to = to }

        /** Time bucket granularity for the analytics series */
        fun bucket(bucket: Bucket?) = apply { this.bucket = bucket }

        /** Alias for calling [Builder.bucket] with `bucket.orElse(null)`. */
        fun bucket(bucket: Optional<Bucket>) = bucket(bucket.getOrNull())

        /** Label selector to filter instances (e.g., "env=prod,team=backend") */
        fun labels(labels: String?) = apply { this.labels = labels }

        /** Alias for calling [Builder.labels] with `labels.orElse(null)`. */
        fun labels(labels: Optional<String>) = labels(labels.getOrNull())

        /** Optional region filter */
        fun region(region: String?) = apply { this.region = region }

        /** Alias for calling [Builder.region] with `region.orElse(null)`. */
        fun region(region: Optional<String>) = region(region.getOrNull())

        /**
         * Optional IANA timezone used for time bucket grouping. Defaults to America/Los_Angeles
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
         * Returns an immutable instance of [AnalyticsGetParams].
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
        fun build(): AnalyticsGetParams =
            AnalyticsGetParams(
                checkRequired("from", from),
                checkRequired("to", to),
                bucket,
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
                bucket?.let { put("bucket", it.toString()) }
                labels?.let { put("labels", it) }
                region?.let { put("region", it) }
                timezone?.let { put("timezone", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Time bucket granularity for the analytics series */
    class Bucket @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HOUR = of("hour")

            @JvmField val DAY = of("day")

            @JvmField val WEEK = of("week")

            @JvmField val MINUTE = of("minute")

            @JvmStatic fun of(value: String) = Bucket(JsonField.of(value))
        }

        /** An enum containing [Bucket]'s known values. */
        enum class Known {
            HOUR,
            DAY,
            WEEK,
            MINUTE,
        }

        /**
         * An enum containing [Bucket]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Bucket] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HOUR,
            DAY,
            WEEK,
            MINUTE,
            /** An enum member indicating that [Bucket] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                HOUR -> Value.HOUR
                DAY -> Value.DAY
                WEEK -> Value.WEEK
                MINUTE -> Value.MINUTE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LimrunInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HOUR -> Known.HOUR
                DAY -> Known.DAY
                WEEK -> Known.WEEK
                MINUTE -> Known.MINUTE
                else -> throw LimrunInvalidDataException("Unknown Bucket: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LimrunInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LimrunInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LimrunInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Bucket = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LimrunInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Bucket && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsGetParams &&
            from == other.from &&
            to == other.to &&
            bucket == other.bucket &&
            labels == other.labels &&
            region == other.region &&
            timezone == other.timezone &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            from,
            to,
            bucket,
            labels,
            region,
            timezone,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AnalyticsGetParams{from=$from, to=$to, bucket=$bucket, labels=$labels, region=$region, timezone=$timezone, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
