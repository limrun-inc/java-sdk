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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AnalyticsInstancesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val asOf: JsonField<OffsetDateTime>,
    private val from: JsonField<OffsetDateTime>,
    private val series: JsonField<List<Series>>,
    private val timezone: JsonField<String>,
    private val to: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("asOf") @ExcludeMissing asOf: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("series") @ExcludeMissing series: JsonField<List<Series>> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(asOf, from, series, timezone, to, mutableMapOf())

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun asOf(): OffsetDateTime = asOf.getRequired("asOf")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): OffsetDateTime = from.getRequired("from")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun series(): List<Series> = series.getRequired("series")

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
    @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<Series>> = series

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
         * Returns a mutable builder for constructing an instance of [AnalyticsInstancesResponse].
         *
         * The following fields are required:
         * ```java
         * .asOf()
         * .from()
         * .series()
         * .timezone()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsInstancesResponse]. */
    class Builder internal constructor() {

        private var asOf: JsonField<OffsetDateTime>? = null
        private var from: JsonField<OffsetDateTime>? = null
        private var series: JsonField<MutableList<Series>>? = null
        private var timezone: JsonField<String>? = null
        private var to: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsInstancesResponse: AnalyticsInstancesResponse) = apply {
            asOf = analyticsInstancesResponse.asOf
            from = analyticsInstancesResponse.from
            series = analyticsInstancesResponse.series.map { it.toMutableList() }
            timezone = analyticsInstancesResponse.timezone
            to = analyticsInstancesResponse.to
            additionalProperties = analyticsInstancesResponse.additionalProperties.toMutableMap()
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

        fun from(from: OffsetDateTime) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun from(from: JsonField<OffsetDateTime>) = apply { this.from = from }

        fun series(series: List<Series>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed `List<Series>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun series(series: JsonField<List<Series>>) = apply {
            this.series = series.map { it.toMutableList() }
        }

        /**
         * Adds a single [Series] to [Builder.series].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeries(series: Series) = apply {
            this.series =
                (this.series ?: JsonField.of(mutableListOf())).also {
                    checkKnown("series", it).add(series)
                }
        }

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
         * Returns an immutable instance of [AnalyticsInstancesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .asOf()
         * .from()
         * .series()
         * .timezone()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticsInstancesResponse =
            AnalyticsInstancesResponse(
                checkRequired("asOf", asOf),
                checkRequired("from", from),
                checkRequired("series", series).map { it.toImmutable() },
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
    fun validate(): AnalyticsInstancesResponse = apply {
        if (validated) {
            return@apply
        }

        asOf()
        from()
        series().forEach { it.validate() }
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
            (if (from.asKnown().isPresent) 1 else 0) +
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (timezone.asKnown().isPresent) 1 else 0) +
            (if (to.asKnown().isPresent) 1 else 0)

    class Series
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val instances: JsonField<List<Instance>>,
        private val timestamp: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("instances")
            @ExcludeMissing
            instances: JsonField<List<Instance>> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<String> = JsonMissing.of(),
        ) : this(instances, timestamp, mutableMapOf())

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instances(): List<Instance> = instances.getRequired("instances")

        /**
         * RFC3339 timestamp for the start of the minute bucket in the requested timezone, including
         * the local offset
         *
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): String = timestamp.getRequired("timestamp")

        /**
         * Returns the raw JSON value of [instances].
         *
         * Unlike [instances], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("instances")
        @ExcludeMissing
        fun _instances(): JsonField<List<Instance>> = instances

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

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
             * Returns a mutable builder for constructing an instance of [Series].
             *
             * The following fields are required:
             * ```java
             * .instances()
             * .timestamp()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Series]. */
        class Builder internal constructor() {

            private var instances: JsonField<MutableList<Instance>>? = null
            private var timestamp: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(series: Series) = apply {
                instances = series.instances.map { it.toMutableList() }
                timestamp = series.timestamp
                additionalProperties = series.additionalProperties.toMutableMap()
            }

            fun instances(instances: List<Instance>) = instances(JsonField.of(instances))

            /**
             * Sets [Builder.instances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instances] with a well-typed `List<Instance>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instances(instances: JsonField<List<Instance>>) = apply {
                this.instances = instances.map { it.toMutableList() }
            }

            /**
             * Adds a single [Instance] to [instances].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInstance(instance: Instance) = apply {
                instances =
                    (instances ?: JsonField.of(mutableListOf())).also {
                        checkKnown("instances", it).add(instance)
                    }
            }

            /**
             * RFC3339 timestamp for the start of the minute bucket in the requested timezone,
             * including the local offset
             */
            fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

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
             * Returns an immutable instance of [Series].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .instances()
             * .timestamp()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Series =
                Series(
                    checkRequired("instances", instances).map { it.toImmutable() },
                    checkRequired("timestamp", timestamp),
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Series = apply {
            if (validated) {
                return@apply
            }

            instances().forEach { it.validate() }
            timestamp()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (instances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0)

        /** Analytics details for a single instance within a time bucket */
        class Instance
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billedMinutes: JsonField<Long>,
            private val cost: JsonField<Double>,
            private val instanceTid: JsonField<String>,
            private val platform: JsonField<Platform>,
            private val runtimeMinutes: JsonField<Long>,
            private val billedBreakdown: JsonField<BilledBreakdown>,
            private val costBreakdown: JsonField<CostBreakdown>,
            private val labels: JsonField<Labels>,
            private val region: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billedMinutes")
                @ExcludeMissing
                billedMinutes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("cost") @ExcludeMissing cost: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("instanceTid")
                @ExcludeMissing
                instanceTid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("platform")
                @ExcludeMissing
                platform: JsonField<Platform> = JsonMissing.of(),
                @JsonProperty("runtimeMinutes")
                @ExcludeMissing
                runtimeMinutes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("billedBreakdown")
                @ExcludeMissing
                billedBreakdown: JsonField<BilledBreakdown> = JsonMissing.of(),
                @JsonProperty("costBreakdown")
                @ExcludeMissing
                costBreakdown: JsonField<CostBreakdown> = JsonMissing.of(),
                @JsonProperty("labels")
                @ExcludeMissing
                labels: JsonField<Labels> = JsonMissing.of(),
                @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            ) : this(
                billedMinutes,
                cost,
                instanceTid,
                platform,
                runtimeMinutes,
                billedBreakdown,
                costBreakdown,
                labels,
                region,
                mutableMapOf(),
            )

            /**
             * Billed minutes with platform multiplier applied
             *
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billedMinutes(): Long = billedMinutes.getRequired("billedMinutes")

            /**
             * Total cost in dollars for this instance
             *
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cost(): Double = cost.getRequired("cost")

            /**
             * Instance type ID (e.g., ios_xxx, android_xxx)
             *
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun instanceTid(): String = instanceTid.getRequired("instanceTid")

            /**
             * Platform name.
             *
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun platform(): Platform = platform.getRequired("platform")

            /**
             * Actual runtime minutes before platform multiplier
             *
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun runtimeMinutes(): Long = runtimeMinutes.getRequired("runtimeMinutes")

            /**
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billedBreakdown(): Optional<BilledBreakdown> =
                billedBreakdown.getOptional("billedBreakdown")

            /**
             * Cost breakdown by billing source in dollars
             *
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun costBreakdown(): Optional<CostBreakdown> =
                costBreakdown.getOptional("costBreakdown")

            /**
             * Instance labels at billing time
             *
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun labels(): Optional<Labels> = labels.getOptional("labels")

            /**
             * Region where the instance ran
             *
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun region(): Optional<String> = region.getOptional("region")

            /**
             * Returns the raw JSON value of [billedMinutes].
             *
             * Unlike [billedMinutes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("billedMinutes")
            @ExcludeMissing
            fun _billedMinutes(): JsonField<Long> = billedMinutes

            /**
             * Returns the raw JSON value of [cost].
             *
             * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

            /**
             * Returns the raw JSON value of [instanceTid].
             *
             * Unlike [instanceTid], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("instanceTid")
            @ExcludeMissing
            fun _instanceTid(): JsonField<String> = instanceTid

            /**
             * Returns the raw JSON value of [platform].
             *
             * Unlike [platform], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("platform")
            @ExcludeMissing
            fun _platform(): JsonField<Platform> = platform

            /**
             * Returns the raw JSON value of [runtimeMinutes].
             *
             * Unlike [runtimeMinutes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("runtimeMinutes")
            @ExcludeMissing
            fun _runtimeMinutes(): JsonField<Long> = runtimeMinutes

            /**
             * Returns the raw JSON value of [billedBreakdown].
             *
             * Unlike [billedBreakdown], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billedBreakdown")
            @ExcludeMissing
            fun _billedBreakdown(): JsonField<BilledBreakdown> = billedBreakdown

            /**
             * Returns the raw JSON value of [costBreakdown].
             *
             * Unlike [costBreakdown], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("costBreakdown")
            @ExcludeMissing
            fun _costBreakdown(): JsonField<CostBreakdown> = costBreakdown

            /**
             * Returns the raw JSON value of [labels].
             *
             * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonField<Labels> = labels

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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
                 * Returns a mutable builder for constructing an instance of [Instance].
                 *
                 * The following fields are required:
                 * ```java
                 * .billedMinutes()
                 * .cost()
                 * .instanceTid()
                 * .platform()
                 * .runtimeMinutes()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Instance]. */
            class Builder internal constructor() {

                private var billedMinutes: JsonField<Long>? = null
                private var cost: JsonField<Double>? = null
                private var instanceTid: JsonField<String>? = null
                private var platform: JsonField<Platform>? = null
                private var runtimeMinutes: JsonField<Long>? = null
                private var billedBreakdown: JsonField<BilledBreakdown> = JsonMissing.of()
                private var costBreakdown: JsonField<CostBreakdown> = JsonMissing.of()
                private var labels: JsonField<Labels> = JsonMissing.of()
                private var region: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(instance: Instance) = apply {
                    billedMinutes = instance.billedMinutes
                    cost = instance.cost
                    instanceTid = instance.instanceTid
                    platform = instance.platform
                    runtimeMinutes = instance.runtimeMinutes
                    billedBreakdown = instance.billedBreakdown
                    costBreakdown = instance.costBreakdown
                    labels = instance.labels
                    region = instance.region
                    additionalProperties = instance.additionalProperties.toMutableMap()
                }

                /** Billed minutes with platform multiplier applied */
                fun billedMinutes(billedMinutes: Long) = billedMinutes(JsonField.of(billedMinutes))

                /**
                 * Sets [Builder.billedMinutes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedMinutes] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billedMinutes(billedMinutes: JsonField<Long>) = apply {
                    this.billedMinutes = billedMinutes
                }

                /** Total cost in dollars for this instance */
                fun cost(cost: Double) = cost(JsonField.of(cost))

                /**
                 * Sets [Builder.cost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cost] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

                /** Instance type ID (e.g., ios_xxx, android_xxx) */
                fun instanceTid(instanceTid: String) = instanceTid(JsonField.of(instanceTid))

                /**
                 * Sets [Builder.instanceTid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.instanceTid] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun instanceTid(instanceTid: JsonField<String>) = apply {
                    this.instanceTid = instanceTid
                }

                /** Platform name. */
                fun platform(platform: Platform) = platform(JsonField.of(platform))

                /**
                 * Sets [Builder.platform] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platform] with a well-typed [Platform] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

                /** Actual runtime minutes before platform multiplier */
                fun runtimeMinutes(runtimeMinutes: Long) =
                    runtimeMinutes(JsonField.of(runtimeMinutes))

                /**
                 * Sets [Builder.runtimeMinutes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.runtimeMinutes] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun runtimeMinutes(runtimeMinutes: JsonField<Long>) = apply {
                    this.runtimeMinutes = runtimeMinutes
                }

                fun billedBreakdown(billedBreakdown: BilledBreakdown) =
                    billedBreakdown(JsonField.of(billedBreakdown))

                /**
                 * Sets [Builder.billedBreakdown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedBreakdown] with a well-typed
                 * [BilledBreakdown] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun billedBreakdown(billedBreakdown: JsonField<BilledBreakdown>) = apply {
                    this.billedBreakdown = billedBreakdown
                }

                /** Cost breakdown by billing source in dollars */
                fun costBreakdown(costBreakdown: CostBreakdown) =
                    costBreakdown(JsonField.of(costBreakdown))

                /**
                 * Sets [Builder.costBreakdown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.costBreakdown] with a well-typed [CostBreakdown]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun costBreakdown(costBreakdown: JsonField<CostBreakdown>) = apply {
                    this.costBreakdown = costBreakdown
                }

                /** Instance labels at billing time */
                fun labels(labels: Labels) = labels(JsonField.of(labels))

                /**
                 * Sets [Builder.labels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.labels] with a well-typed [Labels] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun labels(labels: JsonField<Labels>) = apply { this.labels = labels }

                /** Region where the instance ran */
                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Instance].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .billedMinutes()
                 * .cost()
                 * .instanceTid()
                 * .platform()
                 * .runtimeMinutes()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Instance =
                    Instance(
                        checkRequired("billedMinutes", billedMinutes),
                        checkRequired("cost", cost),
                        checkRequired("instanceTid", instanceTid),
                        checkRequired("platform", platform),
                        checkRequired("runtimeMinutes", runtimeMinutes),
                        billedBreakdown,
                        costBreakdown,
                        labels,
                        region,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LimrunInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Instance = apply {
                if (validated) {
                    return@apply
                }

                billedMinutes()
                cost()
                instanceTid()
                platform().validate()
                runtimeMinutes()
                billedBreakdown().ifPresent { it.validate() }
                costBreakdown().ifPresent { it.validate() }
                labels().ifPresent { it.validate() }
                region()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (billedMinutes.asKnown().isPresent) 1 else 0) +
                    (if (cost.asKnown().isPresent) 1 else 0) +
                    (if (instanceTid.asKnown().isPresent) 1 else 0) +
                    (platform.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (runtimeMinutes.asKnown().isPresent) 1 else 0) +
                    (billedBreakdown.asKnown().getOrNull()?.validity() ?: 0) +
                    (costBreakdown.asKnown().getOrNull()?.validity() ?: 0) +
                    (labels.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (region.asKnown().isPresent) 1 else 0)

            /** Platform name. */
            class Platform @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ANDROID = of("android")

                    @JvmField val IOS = of("ios")

                    @JvmField val XCODE = of("xcode")

                    @JvmStatic fun of(value: String) = Platform(JsonField.of(value))
                }

                /** An enum containing [Platform]'s known values. */
                enum class Known {
                    ANDROID,
                    IOS,
                    XCODE,
                }

                /**
                 * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Platform] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANDROID,
                    IOS,
                    XCODE,
                    /**
                     * An enum member indicating that [Platform] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANDROID -> Value.ANDROID
                        IOS -> Value.IOS
                        XCODE -> Value.XCODE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ANDROID -> Known.ANDROID
                        IOS -> Known.IOS
                        XCODE -> Known.XCODE
                        else -> throw LimrunInvalidDataException("Unknown Platform: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LimrunInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LimrunInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Platform = apply {
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

                    return other is Platform && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class BilledBreakdown
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val creditsBilledMinutes: JsonField<Long>,
                private val onDemandBilledMinutes: JsonField<Long>,
                private val planBilledMinutes: JsonField<PlanBilledMinutes>,
                private val subscriptionBilledMinutes: JsonField<SubscriptionBilledMinutes>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("creditsBilledMinutes")
                    @ExcludeMissing
                    creditsBilledMinutes: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("onDemandBilledMinutes")
                    @ExcludeMissing
                    onDemandBilledMinutes: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("planBilledMinutes")
                    @ExcludeMissing
                    planBilledMinutes: JsonField<PlanBilledMinutes> = JsonMissing.of(),
                    @JsonProperty("subscriptionBilledMinutes")
                    @ExcludeMissing
                    subscriptionBilledMinutes: JsonField<SubscriptionBilledMinutes> =
                        JsonMissing.of(),
                ) : this(
                    creditsBilledMinutes,
                    onDemandBilledMinutes,
                    planBilledMinutes,
                    subscriptionBilledMinutes,
                    mutableMapOf(),
                )

                /**
                 * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun creditsBilledMinutes(): Long =
                    creditsBilledMinutes.getRequired("creditsBilledMinutes")

                /**
                 * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun onDemandBilledMinutes(): Long =
                    onDemandBilledMinutes.getRequired("onDemandBilledMinutes")

                /**
                 * Map of plan ID to billed minutes
                 *
                 * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun planBilledMinutes(): Optional<PlanBilledMinutes> =
                    planBilledMinutes.getOptional("planBilledMinutes")

                /**
                 * Map of subscription ID to billed minutes
                 *
                 * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun subscriptionBilledMinutes(): Optional<SubscriptionBilledMinutes> =
                    subscriptionBilledMinutes.getOptional("subscriptionBilledMinutes")

                /**
                 * Returns the raw JSON value of [creditsBilledMinutes].
                 *
                 * Unlike [creditsBilledMinutes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("creditsBilledMinutes")
                @ExcludeMissing
                fun _creditsBilledMinutes(): JsonField<Long> = creditsBilledMinutes

                /**
                 * Returns the raw JSON value of [onDemandBilledMinutes].
                 *
                 * Unlike [onDemandBilledMinutes], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("onDemandBilledMinutes")
                @ExcludeMissing
                fun _onDemandBilledMinutes(): JsonField<Long> = onDemandBilledMinutes

                /**
                 * Returns the raw JSON value of [planBilledMinutes].
                 *
                 * Unlike [planBilledMinutes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("planBilledMinutes")
                @ExcludeMissing
                fun _planBilledMinutes(): JsonField<PlanBilledMinutes> = planBilledMinutes

                /**
                 * Returns the raw JSON value of [subscriptionBilledMinutes].
                 *
                 * Unlike [subscriptionBilledMinutes], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("subscriptionBilledMinutes")
                @ExcludeMissing
                fun _subscriptionBilledMinutes(): JsonField<SubscriptionBilledMinutes> =
                    subscriptionBilledMinutes

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
                     * Returns a mutable builder for constructing an instance of [BilledBreakdown].
                     *
                     * The following fields are required:
                     * ```java
                     * .creditsBilledMinutes()
                     * .onDemandBilledMinutes()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [BilledBreakdown]. */
                class Builder internal constructor() {

                    private var creditsBilledMinutes: JsonField<Long>? = null
                    private var onDemandBilledMinutes: JsonField<Long>? = null
                    private var planBilledMinutes: JsonField<PlanBilledMinutes> = JsonMissing.of()
                    private var subscriptionBilledMinutes: JsonField<SubscriptionBilledMinutes> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(billedBreakdown: BilledBreakdown) = apply {
                        creditsBilledMinutes = billedBreakdown.creditsBilledMinutes
                        onDemandBilledMinutes = billedBreakdown.onDemandBilledMinutes
                        planBilledMinutes = billedBreakdown.planBilledMinutes
                        subscriptionBilledMinutes = billedBreakdown.subscriptionBilledMinutes
                        additionalProperties = billedBreakdown.additionalProperties.toMutableMap()
                    }

                    fun creditsBilledMinutes(creditsBilledMinutes: Long) =
                        creditsBilledMinutes(JsonField.of(creditsBilledMinutes))

                    /**
                     * Sets [Builder.creditsBilledMinutes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.creditsBilledMinutes] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun creditsBilledMinutes(creditsBilledMinutes: JsonField<Long>) = apply {
                        this.creditsBilledMinutes = creditsBilledMinutes
                    }

                    fun onDemandBilledMinutes(onDemandBilledMinutes: Long) =
                        onDemandBilledMinutes(JsonField.of(onDemandBilledMinutes))

                    /**
                     * Sets [Builder.onDemandBilledMinutes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onDemandBilledMinutes] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun onDemandBilledMinutes(onDemandBilledMinutes: JsonField<Long>) = apply {
                        this.onDemandBilledMinutes = onDemandBilledMinutes
                    }

                    /** Map of plan ID to billed minutes */
                    fun planBilledMinutes(planBilledMinutes: PlanBilledMinutes) =
                        planBilledMinutes(JsonField.of(planBilledMinutes))

                    /**
                     * Sets [Builder.planBilledMinutes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.planBilledMinutes] with a well-typed
                     * [PlanBilledMinutes] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun planBilledMinutes(planBilledMinutes: JsonField<PlanBilledMinutes>) = apply {
                        this.planBilledMinutes = planBilledMinutes
                    }

                    /** Map of subscription ID to billed minutes */
                    fun subscriptionBilledMinutes(
                        subscriptionBilledMinutes: SubscriptionBilledMinutes
                    ) = subscriptionBilledMinutes(JsonField.of(subscriptionBilledMinutes))

                    /**
                     * Sets [Builder.subscriptionBilledMinutes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subscriptionBilledMinutes] with a well-typed
                     * [SubscriptionBilledMinutes] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun subscriptionBilledMinutes(
                        subscriptionBilledMinutes: JsonField<SubscriptionBilledMinutes>
                    ) = apply { this.subscriptionBilledMinutes = subscriptionBilledMinutes }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [BilledBreakdown].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .creditsBilledMinutes()
                     * .onDemandBilledMinutes()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BilledBreakdown =
                        BilledBreakdown(
                            checkRequired("creditsBilledMinutes", creditsBilledMinutes),
                            checkRequired("onDemandBilledMinutes", onDemandBilledMinutes),
                            planBilledMinutes,
                            subscriptionBilledMinutes,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LimrunInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): BilledBreakdown = apply {
                    if (validated) {
                        return@apply
                    }

                    creditsBilledMinutes()
                    onDemandBilledMinutes()
                    planBilledMinutes().ifPresent { it.validate() }
                    subscriptionBilledMinutes().ifPresent { it.validate() }
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
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (creditsBilledMinutes.asKnown().isPresent) 1 else 0) +
                        (if (onDemandBilledMinutes.asKnown().isPresent) 1 else 0) +
                        (planBilledMinutes.asKnown().getOrNull()?.validity() ?: 0) +
                        (subscriptionBilledMinutes.asKnown().getOrNull()?.validity() ?: 0)

                /** Map of plan ID to billed minutes */
                class PlanBilledMinutes
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [PlanBilledMinutes].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [PlanBilledMinutes]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(planBilledMinutes: PlanBilledMinutes) = apply {
                            additionalProperties =
                                planBilledMinutes.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [PlanBilledMinutes].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): PlanBilledMinutes =
                            PlanBilledMinutes(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LimrunInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): PlanBilledMinutes = apply {
                        if (validated) {
                            return@apply
                        }

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
                    @JvmSynthetic
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PlanBilledMinutes &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PlanBilledMinutes{additionalProperties=$additionalProperties}"
                }

                /** Map of subscription ID to billed minutes */
                class SubscriptionBilledMinutes
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [SubscriptionBilledMinutes].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SubscriptionBilledMinutes]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(subscriptionBilledMinutes: SubscriptionBilledMinutes) =
                            apply {
                                additionalProperties =
                                    subscriptionBilledMinutes.additionalProperties.toMutableMap()
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SubscriptionBilledMinutes].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SubscriptionBilledMinutes =
                            SubscriptionBilledMinutes(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LimrunInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): SubscriptionBilledMinutes = apply {
                        if (validated) {
                            return@apply
                        }

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
                    @JvmSynthetic
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SubscriptionBilledMinutes &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SubscriptionBilledMinutes{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BilledBreakdown &&
                        creditsBilledMinutes == other.creditsBilledMinutes &&
                        onDemandBilledMinutes == other.onDemandBilledMinutes &&
                        planBilledMinutes == other.planBilledMinutes &&
                        subscriptionBilledMinutes == other.subscriptionBilledMinutes &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        creditsBilledMinutes,
                        onDemandBilledMinutes,
                        planBilledMinutes,
                        subscriptionBilledMinutes,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BilledBreakdown{creditsBilledMinutes=$creditsBilledMinutes, onDemandBilledMinutes=$onDemandBilledMinutes, planBilledMinutes=$planBilledMinutes, subscriptionBilledMinutes=$subscriptionBilledMinutes, additionalProperties=$additionalProperties}"
            }

            /** Cost breakdown by billing source in dollars */
            class CostBreakdown
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val creditsCost: JsonField<Double>,
                private val onDemandCost: JsonField<Double>,
                private val planCost: JsonField<PlanCost>,
                private val subscriptionCost: JsonField<SubscriptionCost>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("creditsCost")
                    @ExcludeMissing
                    creditsCost: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("onDemandCost")
                    @ExcludeMissing
                    onDemandCost: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("planCost")
                    @ExcludeMissing
                    planCost: JsonField<PlanCost> = JsonMissing.of(),
                    @JsonProperty("subscriptionCost")
                    @ExcludeMissing
                    subscriptionCost: JsonField<SubscriptionCost> = JsonMissing.of(),
                ) : this(creditsCost, onDemandCost, planCost, subscriptionCost, mutableMapOf())

                /**
                 * Cost from credits (always 0)
                 *
                 * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun creditsCost(): Double = creditsCost.getRequired("creditsCost")

                /**
                 * Cost from on-demand billing in dollars
                 *
                 * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun onDemandCost(): Double = onDemandCost.getRequired("onDemandCost")

                /**
                 * Map of plan ID to cost in dollars
                 *
                 * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun planCost(): Optional<PlanCost> = planCost.getOptional("planCost")

                /**
                 * Map of subscription ID to cost in dollars
                 *
                 * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun subscriptionCost(): Optional<SubscriptionCost> =
                    subscriptionCost.getOptional("subscriptionCost")

                /**
                 * Returns the raw JSON value of [creditsCost].
                 *
                 * Unlike [creditsCost], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("creditsCost")
                @ExcludeMissing
                fun _creditsCost(): JsonField<Double> = creditsCost

                /**
                 * Returns the raw JSON value of [onDemandCost].
                 *
                 * Unlike [onDemandCost], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("onDemandCost")
                @ExcludeMissing
                fun _onDemandCost(): JsonField<Double> = onDemandCost

                /**
                 * Returns the raw JSON value of [planCost].
                 *
                 * Unlike [planCost], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("planCost")
                @ExcludeMissing
                fun _planCost(): JsonField<PlanCost> = planCost

                /**
                 * Returns the raw JSON value of [subscriptionCost].
                 *
                 * Unlike [subscriptionCost], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subscriptionCost")
                @ExcludeMissing
                fun _subscriptionCost(): JsonField<SubscriptionCost> = subscriptionCost

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
                     * Returns a mutable builder for constructing an instance of [CostBreakdown].
                     *
                     * The following fields are required:
                     * ```java
                     * .creditsCost()
                     * .onDemandCost()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CostBreakdown]. */
                class Builder internal constructor() {

                    private var creditsCost: JsonField<Double>? = null
                    private var onDemandCost: JsonField<Double>? = null
                    private var planCost: JsonField<PlanCost> = JsonMissing.of()
                    private var subscriptionCost: JsonField<SubscriptionCost> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(costBreakdown: CostBreakdown) = apply {
                        creditsCost = costBreakdown.creditsCost
                        onDemandCost = costBreakdown.onDemandCost
                        planCost = costBreakdown.planCost
                        subscriptionCost = costBreakdown.subscriptionCost
                        additionalProperties = costBreakdown.additionalProperties.toMutableMap()
                    }

                    /** Cost from credits (always 0) */
                    fun creditsCost(creditsCost: Double) = creditsCost(JsonField.of(creditsCost))

                    /**
                     * Sets [Builder.creditsCost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.creditsCost] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun creditsCost(creditsCost: JsonField<Double>) = apply {
                        this.creditsCost = creditsCost
                    }

                    /** Cost from on-demand billing in dollars */
                    fun onDemandCost(onDemandCost: Double) =
                        onDemandCost(JsonField.of(onDemandCost))

                    /**
                     * Sets [Builder.onDemandCost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onDemandCost] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun onDemandCost(onDemandCost: JsonField<Double>) = apply {
                        this.onDemandCost = onDemandCost
                    }

                    /** Map of plan ID to cost in dollars */
                    fun planCost(planCost: PlanCost) = planCost(JsonField.of(planCost))

                    /**
                     * Sets [Builder.planCost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.planCost] with a well-typed [PlanCost] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun planCost(planCost: JsonField<PlanCost>) = apply { this.planCost = planCost }

                    /** Map of subscription ID to cost in dollars */
                    fun subscriptionCost(subscriptionCost: SubscriptionCost) =
                        subscriptionCost(JsonField.of(subscriptionCost))

                    /**
                     * Sets [Builder.subscriptionCost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subscriptionCost] with a well-typed
                     * [SubscriptionCost] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun subscriptionCost(subscriptionCost: JsonField<SubscriptionCost>) = apply {
                        this.subscriptionCost = subscriptionCost
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CostBreakdown].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .creditsCost()
                     * .onDemandCost()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CostBreakdown =
                        CostBreakdown(
                            checkRequired("creditsCost", creditsCost),
                            checkRequired("onDemandCost", onDemandCost),
                            planCost,
                            subscriptionCost,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LimrunInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): CostBreakdown = apply {
                    if (validated) {
                        return@apply
                    }

                    creditsCost()
                    onDemandCost()
                    planCost().ifPresent { it.validate() }
                    subscriptionCost().ifPresent { it.validate() }
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
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (creditsCost.asKnown().isPresent) 1 else 0) +
                        (if (onDemandCost.asKnown().isPresent) 1 else 0) +
                        (planCost.asKnown().getOrNull()?.validity() ?: 0) +
                        (subscriptionCost.asKnown().getOrNull()?.validity() ?: 0)

                /** Map of plan ID to cost in dollars */
                class PlanCost
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [PlanCost]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [PlanCost]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(planCost: PlanCost) = apply {
                            additionalProperties = planCost.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [PlanCost].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): PlanCost = PlanCost(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LimrunInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): PlanCost = apply {
                        if (validated) {
                            return@apply
                        }

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
                    @JvmSynthetic
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PlanCost &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "PlanCost{additionalProperties=$additionalProperties}"
                }

                /** Map of subscription ID to cost in dollars */
                class SubscriptionCost
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [SubscriptionCost].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SubscriptionCost]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(subscriptionCost: SubscriptionCost) = apply {
                            additionalProperties =
                                subscriptionCost.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SubscriptionCost].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SubscriptionCost =
                            SubscriptionCost(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LimrunInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): SubscriptionCost = apply {
                        if (validated) {
                            return@apply
                        }

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
                    @JvmSynthetic
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SubscriptionCost &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SubscriptionCost{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CostBreakdown &&
                        creditsCost == other.creditsCost &&
                        onDemandCost == other.onDemandCost &&
                        planCost == other.planCost &&
                        subscriptionCost == other.subscriptionCost &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        creditsCost,
                        onDemandCost,
                        planCost,
                        subscriptionCost,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CostBreakdown{creditsCost=$creditsCost, onDemandCost=$onDemandCost, planCost=$planCost, subscriptionCost=$subscriptionCost, additionalProperties=$additionalProperties}"
            }

            /** Instance labels at billing time */
            class Labels
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Labels]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Labels]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(labels: Labels) = apply {
                        additionalProperties = labels.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Labels].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Labels = Labels(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LimrunInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Labels = apply {
                    if (validated) {
                        return@apply
                    }

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
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Labels && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Labels{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Instance &&
                    billedMinutes == other.billedMinutes &&
                    cost == other.cost &&
                    instanceTid == other.instanceTid &&
                    platform == other.platform &&
                    runtimeMinutes == other.runtimeMinutes &&
                    billedBreakdown == other.billedBreakdown &&
                    costBreakdown == other.costBreakdown &&
                    labels == other.labels &&
                    region == other.region &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billedMinutes,
                    cost,
                    instanceTid,
                    platform,
                    runtimeMinutes,
                    billedBreakdown,
                    costBreakdown,
                    labels,
                    region,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Instance{billedMinutes=$billedMinutes, cost=$cost, instanceTid=$instanceTid, platform=$platform, runtimeMinutes=$runtimeMinutes, billedBreakdown=$billedBreakdown, costBreakdown=$costBreakdown, labels=$labels, region=$region, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Series &&
                instances == other.instances &&
                timestamp == other.timestamp &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(instances, timestamp, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Series{instances=$instances, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsInstancesResponse &&
            asOf == other.asOf &&
            from == other.from &&
            series == other.series &&
            timezone == other.timezone &&
            to == other.to &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(asOf, from, series, timezone, to, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsInstancesResponse{asOf=$asOf, from=$from, series=$series, timezone=$timezone, to=$to, additionalProperties=$additionalProperties}"
}
