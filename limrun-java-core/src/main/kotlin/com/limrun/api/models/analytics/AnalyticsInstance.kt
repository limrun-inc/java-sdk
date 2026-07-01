// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.analytics

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.limrun.api.core.ExcludeMissing
import com.limrun.api.core.JsonField
import com.limrun.api.core.JsonMissing
import com.limrun.api.core.JsonValue
import com.limrun.api.core.checkRequired
import com.limrun.api.core.toImmutable
import com.limrun.api.errors.LimrunInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Analytics details for a single instance within a time bucket */
class AnalyticsInstance
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val billedMinutes: JsonField<Long>,
    private val cost: JsonField<Double>,
    private val instanceTid: JsonField<String>,
    private val platform: JsonField<String>,
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
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<String> = JsonMissing.of(),
        @JsonProperty("runtimeMinutes")
        @ExcludeMissing
        runtimeMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billedBreakdown")
        @ExcludeMissing
        billedBreakdown: JsonField<BilledBreakdown> = JsonMissing.of(),
        @JsonProperty("costBreakdown")
        @ExcludeMissing
        costBreakdown: JsonField<CostBreakdown> = JsonMissing.of(),
        @JsonProperty("labels") @ExcludeMissing labels: JsonField<Labels> = JsonMissing.of(),
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
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billedMinutes(): Long = billedMinutes.getRequired("billedMinutes")

    /**
     * Total cost in dollars for this instance
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cost(): Double = cost.getRequired("cost")

    /**
     * Instance type ID (e.g., ios_xxx, android_xxx)
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instanceTid(): String = instanceTid.getRequired("instanceTid")

    /**
     * Platform name, such as android, ios, or sandbox
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): String = platform.getRequired("platform")

    /**
     * Actual runtime minutes before platform multiplier
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runtimeMinutes(): Long = runtimeMinutes.getRequired("runtimeMinutes")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billedBreakdown(): Optional<BilledBreakdown> =
        billedBreakdown.getOptional("billedBreakdown")

    /**
     * Cost breakdown by billing source in dollars
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun costBreakdown(): Optional<CostBreakdown> = costBreakdown.getOptional("costBreakdown")

    /**
     * Instance labels at billing time
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun labels(): Optional<Labels> = labels.getOptional("labels")

    /**
     * Region where the instance ran
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * Returns the raw JSON value of [billedMinutes].
     *
     * Unlike [billedMinutes], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [instanceTid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instanceTid") @ExcludeMissing fun _instanceTid(): JsonField<String> = instanceTid

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

    /**
     * Returns the raw JSON value of [runtimeMinutes].
     *
     * Unlike [runtimeMinutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtimeMinutes")
    @ExcludeMissing
    fun _runtimeMinutes(): JsonField<Long> = runtimeMinutes

    /**
     * Returns the raw JSON value of [billedBreakdown].
     *
     * Unlike [billedBreakdown], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billedBreakdown")
    @ExcludeMissing
    fun _billedBreakdown(): JsonField<BilledBreakdown> = billedBreakdown

    /**
     * Returns the raw JSON value of [costBreakdown].
     *
     * Unlike [costBreakdown], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [AnalyticsInstance].
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

    /** A builder for [AnalyticsInstance]. */
    class Builder internal constructor() {

        private var billedMinutes: JsonField<Long>? = null
        private var cost: JsonField<Double>? = null
        private var instanceTid: JsonField<String>? = null
        private var platform: JsonField<String>? = null
        private var runtimeMinutes: JsonField<Long>? = null
        private var billedBreakdown: JsonField<BilledBreakdown> = JsonMissing.of()
        private var costBreakdown: JsonField<CostBreakdown> = JsonMissing.of()
        private var labels: JsonField<Labels> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsInstance: AnalyticsInstance) = apply {
            billedMinutes = analyticsInstance.billedMinutes
            cost = analyticsInstance.cost
            instanceTid = analyticsInstance.instanceTid
            platform = analyticsInstance.platform
            runtimeMinutes = analyticsInstance.runtimeMinutes
            billedBreakdown = analyticsInstance.billedBreakdown
            costBreakdown = analyticsInstance.costBreakdown
            labels = analyticsInstance.labels
            region = analyticsInstance.region
            additionalProperties = analyticsInstance.additionalProperties.toMutableMap()
        }

        /** Billed minutes with platform multiplier applied */
        fun billedMinutes(billedMinutes: Long) = billedMinutes(JsonField.of(billedMinutes))

        /**
         * Sets [Builder.billedMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billedMinutes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billedMinutes(billedMinutes: JsonField<Long>) = apply {
            this.billedMinutes = billedMinutes
        }

        /** Total cost in dollars for this instance */
        fun cost(cost: Double) = cost(JsonField.of(cost))

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

        /** Instance type ID (e.g., ios_xxx, android_xxx) */
        fun instanceTid(instanceTid: String) = instanceTid(JsonField.of(instanceTid))

        /**
         * Sets [Builder.instanceTid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instanceTid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instanceTid(instanceTid: JsonField<String>) = apply { this.instanceTid = instanceTid }

        /** Platform name, such as android, ios, or sandbox */
        fun platform(platform: String) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun platform(platform: JsonField<String>) = apply { this.platform = platform }

        /** Actual runtime minutes before platform multiplier */
        fun runtimeMinutes(runtimeMinutes: Long) = runtimeMinutes(JsonField.of(runtimeMinutes))

        /**
         * Sets [Builder.runtimeMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtimeMinutes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runtimeMinutes(runtimeMinutes: JsonField<Long>) = apply {
            this.runtimeMinutes = runtimeMinutes
        }

        fun billedBreakdown(billedBreakdown: BilledBreakdown) =
            billedBreakdown(JsonField.of(billedBreakdown))

        /**
         * Sets [Builder.billedBreakdown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billedBreakdown] with a well-typed [BilledBreakdown]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billedBreakdown(billedBreakdown: JsonField<BilledBreakdown>) = apply {
            this.billedBreakdown = billedBreakdown
        }

        /** Cost breakdown by billing source in dollars */
        fun costBreakdown(costBreakdown: CostBreakdown) = costBreakdown(JsonField.of(costBreakdown))

        /**
         * Sets [Builder.costBreakdown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costBreakdown] with a well-typed [CostBreakdown] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun costBreakdown(costBreakdown: JsonField<CostBreakdown>) = apply {
            this.costBreakdown = costBreakdown
        }

        /** Instance labels at billing time */
        fun labels(labels: Labels) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed [Labels] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun labels(labels: JsonField<Labels>) = apply { this.labels = labels }

        /** Region where the instance ran */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

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
         * Returns an immutable instance of [AnalyticsInstance].
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
        fun build(): AnalyticsInstance =
            AnalyticsInstance(
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LimrunInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AnalyticsInstance = apply {
        if (validated) {
            return@apply
        }

        billedMinutes()
        cost()
        instanceTid()
        platform()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (billedMinutes.asKnown().isPresent) 1 else 0) +
            (if (cost.asKnown().isPresent) 1 else 0) +
            (if (instanceTid.asKnown().isPresent) 1 else 0) +
            (if (platform.asKnown().isPresent) 1 else 0) +
            (if (runtimeMinutes.asKnown().isPresent) 1 else 0) +
            (billedBreakdown.asKnown().getOrNull()?.validity() ?: 0) +
            (costBreakdown.asKnown().getOrNull()?.validity() ?: 0) +
            (labels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (region.asKnown().isPresent) 1 else 0)

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LimrunInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

        return other is AnalyticsInstance &&
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
        "AnalyticsInstance{billedMinutes=$billedMinutes, cost=$cost, instanceTid=$instanceTid, platform=$platform, runtimeMinutes=$runtimeMinutes, billedBreakdown=$billedBreakdown, costBreakdown=$costBreakdown, labels=$labels, region=$region, additionalProperties=$additionalProperties}"
}
