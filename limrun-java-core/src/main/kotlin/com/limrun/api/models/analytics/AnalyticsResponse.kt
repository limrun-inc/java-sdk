// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.limrun.api.core.Enum
import com.limrun.api.core.ExcludeMissing
import com.limrun.api.core.JsonField
import com.limrun.api.core.JsonMissing
import com.limrun.api.core.JsonValue
import com.limrun.api.core.checkKnown
import com.limrun.api.core.checkRequired
import com.limrun.api.core.toImmutable
import com.limrun.api.errors.LimrunInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AnalyticsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val asOf: JsonField<OffsetDateTime>,
    private val bucket: JsonField<Bucket>,
    private val from: JsonField<OffsetDateTime>,
    private val series: JsonField<List<AnalyticsEntry>>,
    private val summary: JsonField<AnalyticsSummary>,
    private val timezone: JsonField<String>,
    private val to: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("asOf") @ExcludeMissing asOf: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<Bucket> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("series")
        @ExcludeMissing
        series: JsonField<List<AnalyticsEntry>> = JsonMissing.of(),
        @JsonProperty("summary")
        @ExcludeMissing
        summary: JsonField<AnalyticsSummary> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(asOf, bucket, from, series, summary, timezone, to, mutableMapOf())

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun asOf(): OffsetDateTime = asOf.getRequired("asOf")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucket(): Bucket = bucket.getRequired("bucket")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): OffsetDateTime = from.getRequired("from")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun series(): List<AnalyticsEntry> = series.getRequired("series")

    /**
     * Summary of analytics across all time buckets, broken down by platform and region
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun summary(): AnalyticsSummary = summary.getRequired("summary")

    /**
     * IANA timezone used for time bucket grouping
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timezone(): String = timezone.getRequired("timezone")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): OffsetDateTime = to.getRequired("to")

    /**
     * Returns the raw JSON value of [asOf].
     *
     * Unlike [asOf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asOf") @ExcludeMissing fun _asOf(): JsonField<OffsetDateTime> = asOf

    /**
     * Returns the raw JSON value of [bucket].
     *
     * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<Bucket> = bucket

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<OffsetDateTime> = from

    /**
     * Returns the raw JSON value of [series].
     *
     * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<AnalyticsEntry>> = series

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<AnalyticsSummary> = summary

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<OffsetDateTime> = to

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AnalyticsResponse].
         *
         * The following fields are required:
         * ```java
         * .asOf()
         * .bucket()
         * .from()
         * .series()
         * .summary()
         * .timezone()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsResponse]. */
    class Builder internal constructor() {

        private var asOf: JsonField<OffsetDateTime>? = null
        private var bucket: JsonField<Bucket>? = null
        private var from: JsonField<OffsetDateTime>? = null
        private var series: JsonField<MutableList<AnalyticsEntry>>? = null
        private var summary: JsonField<AnalyticsSummary>? = null
        private var timezone: JsonField<String>? = null
        private var to: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsResponse: AnalyticsResponse) = apply {
            asOf = analyticsResponse.asOf
            bucket = analyticsResponse.bucket
            from = analyticsResponse.from
            series = analyticsResponse.series.map { it.toMutableList() }
            summary = analyticsResponse.summary
            timezone = analyticsResponse.timezone
            to = analyticsResponse.to
            additionalProperties = analyticsResponse.additionalProperties.toMutableMap()
        }

        fun asOf(asOf: OffsetDateTime) = asOf(JsonField.of(asOf))

        /**
         * Sets [Builder.asOf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOf] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asOf(asOf: JsonField<OffsetDateTime>) = apply { this.asOf = asOf }

        fun bucket(bucket: Bucket) = bucket(JsonField.of(bucket))

        /**
         * Sets [Builder.bucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucket] with a well-typed [Bucket] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bucket(bucket: JsonField<Bucket>) = apply { this.bucket = bucket }

        fun from(from: OffsetDateTime) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun from(from: JsonField<OffsetDateTime>) = apply { this.from = from }

        fun series(series: List<AnalyticsEntry>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed `List<AnalyticsEntry>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun series(series: JsonField<List<AnalyticsEntry>>) = apply {
            this.series = series.map { it.toMutableList() }
        }

        /**
         * Adds a single [AnalyticsEntry] to [Builder.series].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeries(series: AnalyticsEntry) = apply {
            this.series =
                (this.series ?: JsonField.of(mutableListOf())).also {
                    checkKnown("series", it).add(series)
                }
        }

        /** Summary of analytics across all time buckets, broken down by platform and region */
        fun summary(summary: AnalyticsSummary) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [AnalyticsSummary] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun summary(summary: JsonField<AnalyticsSummary>) = apply { this.summary = summary }

        /** IANA timezone used for time bucket grouping */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        fun to(to: OffsetDateTime) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun to(to: JsonField<OffsetDateTime>) = apply { this.to = to }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AnalyticsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .asOf()
         * .bucket()
         * .from()
         * .series()
         * .summary()
         * .timezone()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticsResponse =
            AnalyticsResponse(
                checkRequired("asOf", asOf),
                checkRequired("bucket", bucket),
                checkRequired("from", from),
                checkRequired("series", series).map { it.toImmutable() },
                checkRequired("summary", summary),
                checkRequired("timezone", timezone),
                checkRequired("to", to),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LimrunInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AnalyticsResponse = apply {
        if (validated) {
            return@apply
        }

        asOf()
        bucket().validate()
        from()
        series().forEach { it.validate() }
        summary().validate()
        timezone()
        to()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (asOf.asKnown().isPresent) 1 else 0) +
            (bucket.asKnown().getOrNull()?.validity() ?: 0) +
            (if (from.asKnown().isPresent) 1 else 0) +
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (summary.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timezone.asKnown().isPresent) 1 else 0) +
            (if (to.asKnown().isPresent) 1 else 0)

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

        return other is AnalyticsResponse &&
            asOf == other.asOf &&
            bucket == other.bucket &&
            from == other.from &&
            series == other.series &&
            summary == other.summary &&
            timezone == other.timezone &&
            to == other.to &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(asOf, bucket, from, series, summary, timezone, to, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsResponse{asOf=$asOf, bucket=$bucket, from=$from, series=$series, summary=$summary, timezone=$timezone, to=$to, additionalProperties=$additionalProperties}"
}
