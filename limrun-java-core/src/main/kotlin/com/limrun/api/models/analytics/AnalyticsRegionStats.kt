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

/** Complete analytics for a specific region including billing breakdown */
class AnalyticsRegionStats
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val avgDurationMinutes: JsonField<Double>,
    private val billedMinutes: JsonField<Long>,
    private val cost: JsonField<Double>,
    private val count: JsonField<Long>,
    private val creditsBilledMinutes: JsonField<Long>,
    private val creditsCost: JsonField<Double>,
    private val onDemandBilledMinutes: JsonField<Long>,
    private val onDemandCost: JsonField<Double>,
    private val runtimeMinutes: JsonField<Long>,
    private val subscriptionBilledMinutes: JsonField<SubscriptionBilledMinutes>,
    private val subscriptionCost: JsonField<SubscriptionCost>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("avgDurationMinutes")
        @ExcludeMissing
        avgDurationMinutes: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("billedMinutes")
        @ExcludeMissing
        billedMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("creditsBilledMinutes")
        @ExcludeMissing
        creditsBilledMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("creditsCost")
        @ExcludeMissing
        creditsCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("onDemandBilledMinutes")
        @ExcludeMissing
        onDemandBilledMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("onDemandCost")
        @ExcludeMissing
        onDemandCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("runtimeMinutes")
        @ExcludeMissing
        runtimeMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("subscriptionBilledMinutes")
        @ExcludeMissing
        subscriptionBilledMinutes: JsonField<SubscriptionBilledMinutes> = JsonMissing.of(),
        @JsonProperty("subscriptionCost")
        @ExcludeMissing
        subscriptionCost: JsonField<SubscriptionCost> = JsonMissing.of(),
    ) : this(
        avgDurationMinutes,
        billedMinutes,
        cost,
        count,
        creditsBilledMinutes,
        creditsCost,
        onDemandBilledMinutes,
        onDemandCost,
        runtimeMinutes,
        subscriptionBilledMinutes,
        subscriptionCost,
        mutableMapOf(),
    )

    /**
     * Average instance duration in minutes
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun avgDurationMinutes(): Double = avgDurationMinutes.getRequired("avgDurationMinutes")

    /**
     * Billed minutes with platform multiplier applied
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billedMinutes(): Long = billedMinutes.getRequired("billedMinutes")

    /**
     * Total cost in dollars
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cost(): Double = cost.getRequired("cost")

    /**
     * Number of unique instances
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun count(): Long = count.getRequired("count")

    /**
     * Minutes billed to credits
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditsBilledMinutes(): Long = creditsBilledMinutes.getRequired("creditsBilledMinutes")

    /**
     * Cost from credits (always 0)
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditsCost(): Double = creditsCost.getRequired("creditsCost")

    /**
     * Minutes billed on-demand
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun onDemandBilledMinutes(): Long = onDemandBilledMinutes.getRequired("onDemandBilledMinutes")

    /**
     * Cost from on-demand billing in dollars
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun onDemandCost(): Double = onDemandCost.getRequired("onDemandCost")

    /**
     * Actual runtime minutes before platform multiplier
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runtimeMinutes(): Long = runtimeMinutes.getRequired("runtimeMinutes")

    /**
     * Map of subscription ID to billed minutes
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionBilledMinutes(): Optional<SubscriptionBilledMinutes> =
        subscriptionBilledMinutes.getOptional("subscriptionBilledMinutes")

    /**
     * Map of subscription ID to cost in dollars
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionCost(): Optional<SubscriptionCost> =
        subscriptionCost.getOptional("subscriptionCost")

    /**
     * Returns the raw JSON value of [avgDurationMinutes].
     *
     * Unlike [avgDurationMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("avgDurationMinutes")
    @ExcludeMissing
    fun _avgDurationMinutes(): JsonField<Double> = avgDurationMinutes

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
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [creditsBilledMinutes].
     *
     * Unlike [creditsBilledMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("creditsBilledMinutes")
    @ExcludeMissing
    fun _creditsBilledMinutes(): JsonField<Long> = creditsBilledMinutes

    /**
     * Returns the raw JSON value of [creditsCost].
     *
     * Unlike [creditsCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditsCost") @ExcludeMissing fun _creditsCost(): JsonField<Double> = creditsCost

    /**
     * Returns the raw JSON value of [onDemandBilledMinutes].
     *
     * Unlike [onDemandBilledMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("onDemandBilledMinutes")
    @ExcludeMissing
    fun _onDemandBilledMinutes(): JsonField<Long> = onDemandBilledMinutes

    /**
     * Returns the raw JSON value of [onDemandCost].
     *
     * Unlike [onDemandCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onDemandCost")
    @ExcludeMissing
    fun _onDemandCost(): JsonField<Double> = onDemandCost

    /**
     * Returns the raw JSON value of [runtimeMinutes].
     *
     * Unlike [runtimeMinutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtimeMinutes")
    @ExcludeMissing
    fun _runtimeMinutes(): JsonField<Long> = runtimeMinutes

    /**
     * Returns the raw JSON value of [subscriptionBilledMinutes].
     *
     * Unlike [subscriptionBilledMinutes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("subscriptionBilledMinutes")
    @ExcludeMissing
    fun _subscriptionBilledMinutes(): JsonField<SubscriptionBilledMinutes> =
        subscriptionBilledMinutes

    /**
     * Returns the raw JSON value of [subscriptionCost].
     *
     * Unlike [subscriptionCost], this method doesn't throw if the JSON field has an unexpected
     * type.
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
         * Returns a mutable builder for constructing an instance of [AnalyticsRegionStats].
         *
         * The following fields are required:
         * ```java
         * .avgDurationMinutes()
         * .billedMinutes()
         * .cost()
         * .count()
         * .creditsBilledMinutes()
         * .creditsCost()
         * .onDemandBilledMinutes()
         * .onDemandCost()
         * .runtimeMinutes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsRegionStats]. */
    class Builder internal constructor() {

        private var avgDurationMinutes: JsonField<Double>? = null
        private var billedMinutes: JsonField<Long>? = null
        private var cost: JsonField<Double>? = null
        private var count: JsonField<Long>? = null
        private var creditsBilledMinutes: JsonField<Long>? = null
        private var creditsCost: JsonField<Double>? = null
        private var onDemandBilledMinutes: JsonField<Long>? = null
        private var onDemandCost: JsonField<Double>? = null
        private var runtimeMinutes: JsonField<Long>? = null
        private var subscriptionBilledMinutes: JsonField<SubscriptionBilledMinutes> =
            JsonMissing.of()
        private var subscriptionCost: JsonField<SubscriptionCost> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsRegionStats: AnalyticsRegionStats) = apply {
            avgDurationMinutes = analyticsRegionStats.avgDurationMinutes
            billedMinutes = analyticsRegionStats.billedMinutes
            cost = analyticsRegionStats.cost
            count = analyticsRegionStats.count
            creditsBilledMinutes = analyticsRegionStats.creditsBilledMinutes
            creditsCost = analyticsRegionStats.creditsCost
            onDemandBilledMinutes = analyticsRegionStats.onDemandBilledMinutes
            onDemandCost = analyticsRegionStats.onDemandCost
            runtimeMinutes = analyticsRegionStats.runtimeMinutes
            subscriptionBilledMinutes = analyticsRegionStats.subscriptionBilledMinutes
            subscriptionCost = analyticsRegionStats.subscriptionCost
            additionalProperties = analyticsRegionStats.additionalProperties.toMutableMap()
        }

        /** Average instance duration in minutes */
        fun avgDurationMinutes(avgDurationMinutes: Double) =
            avgDurationMinutes(JsonField.of(avgDurationMinutes))

        /**
         * Sets [Builder.avgDurationMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgDurationMinutes] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avgDurationMinutes(avgDurationMinutes: JsonField<Double>) = apply {
            this.avgDurationMinutes = avgDurationMinutes
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

        /** Total cost in dollars */
        fun cost(cost: Double) = cost(JsonField.of(cost))

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

        /** Number of unique instances */
        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        /** Minutes billed to credits */
        fun creditsBilledMinutes(creditsBilledMinutes: Long) =
            creditsBilledMinutes(JsonField.of(creditsBilledMinutes))

        /**
         * Sets [Builder.creditsBilledMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditsBilledMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditsBilledMinutes(creditsBilledMinutes: JsonField<Long>) = apply {
            this.creditsBilledMinutes = creditsBilledMinutes
        }

        /** Cost from credits (always 0) */
        fun creditsCost(creditsCost: Double) = creditsCost(JsonField.of(creditsCost))

        /**
         * Sets [Builder.creditsCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditsCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditsCost(creditsCost: JsonField<Double>) = apply { this.creditsCost = creditsCost }

        /** Minutes billed on-demand */
        fun onDemandBilledMinutes(onDemandBilledMinutes: Long) =
            onDemandBilledMinutes(JsonField.of(onDemandBilledMinutes))

        /**
         * Sets [Builder.onDemandBilledMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onDemandBilledMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun onDemandBilledMinutes(onDemandBilledMinutes: JsonField<Long>) = apply {
            this.onDemandBilledMinutes = onDemandBilledMinutes
        }

        /** Cost from on-demand billing in dollars */
        fun onDemandCost(onDemandCost: Double) = onDemandCost(JsonField.of(onDemandCost))

        /**
         * Sets [Builder.onDemandCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onDemandCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun onDemandCost(onDemandCost: JsonField<Double>) = apply {
            this.onDemandCost = onDemandCost
        }

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

        /** Map of subscription ID to billed minutes */
        fun subscriptionBilledMinutes(subscriptionBilledMinutes: SubscriptionBilledMinutes) =
            subscriptionBilledMinutes(JsonField.of(subscriptionBilledMinutes))

        /**
         * Sets [Builder.subscriptionBilledMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionBilledMinutes] with a well-typed
         * [SubscriptionBilledMinutes] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun subscriptionBilledMinutes(
            subscriptionBilledMinutes: JsonField<SubscriptionBilledMinutes>
        ) = apply { this.subscriptionBilledMinutes = subscriptionBilledMinutes }

        /** Map of subscription ID to cost in dollars */
        fun subscriptionCost(subscriptionCost: SubscriptionCost) =
            subscriptionCost(JsonField.of(subscriptionCost))

        /**
         * Sets [Builder.subscriptionCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionCost] with a well-typed [SubscriptionCost]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AnalyticsRegionStats].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .avgDurationMinutes()
         * .billedMinutes()
         * .cost()
         * .count()
         * .creditsBilledMinutes()
         * .creditsCost()
         * .onDemandBilledMinutes()
         * .onDemandCost()
         * .runtimeMinutes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticsRegionStats =
            AnalyticsRegionStats(
                checkRequired("avgDurationMinutes", avgDurationMinutes),
                checkRequired("billedMinutes", billedMinutes),
                checkRequired("cost", cost),
                checkRequired("count", count),
                checkRequired("creditsBilledMinutes", creditsBilledMinutes),
                checkRequired("creditsCost", creditsCost),
                checkRequired("onDemandBilledMinutes", onDemandBilledMinutes),
                checkRequired("onDemandCost", onDemandCost),
                checkRequired("runtimeMinutes", runtimeMinutes),
                subscriptionBilledMinutes,
                subscriptionCost,
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
    fun validate(): AnalyticsRegionStats = apply {
        if (validated) {
            return@apply
        }

        avgDurationMinutes()
        billedMinutes()
        cost()
        count()
        creditsBilledMinutes()
        creditsCost()
        onDemandBilledMinutes()
        onDemandCost()
        runtimeMinutes()
        subscriptionBilledMinutes().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (avgDurationMinutes.asKnown().isPresent) 1 else 0) +
            (if (billedMinutes.asKnown().isPresent) 1 else 0) +
            (if (cost.asKnown().isPresent) 1 else 0) +
            (if (count.asKnown().isPresent) 1 else 0) +
            (if (creditsBilledMinutes.asKnown().isPresent) 1 else 0) +
            (if (creditsCost.asKnown().isPresent) 1 else 0) +
            (if (onDemandBilledMinutes.asKnown().isPresent) 1 else 0) +
            (if (onDemandCost.asKnown().isPresent) 1 else 0) +
            (if (runtimeMinutes.asKnown().isPresent) 1 else 0) +
            (subscriptionBilledMinutes.asKnown().getOrNull()?.validity() ?: 0) +
            (subscriptionCost.asKnown().getOrNull()?.validity() ?: 0)

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

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionBilledMinutes: SubscriptionBilledMinutes) = apply {
                additionalProperties = subscriptionBilledMinutes.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SubscriptionBilledMinutes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SubscriptionBilledMinutes =
                SubscriptionBilledMinutes(additionalProperties.toImmutable())
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

            /** Returns a mutable builder for constructing an instance of [SubscriptionCost]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubscriptionCost]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionCost: SubscriptionCost) = apply {
                additionalProperties = subscriptionCost.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SubscriptionCost].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SubscriptionCost = SubscriptionCost(additionalProperties.toImmutable())
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubscriptionCost && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SubscriptionCost{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsRegionStats &&
            avgDurationMinutes == other.avgDurationMinutes &&
            billedMinutes == other.billedMinutes &&
            cost == other.cost &&
            count == other.count &&
            creditsBilledMinutes == other.creditsBilledMinutes &&
            creditsCost == other.creditsCost &&
            onDemandBilledMinutes == other.onDemandBilledMinutes &&
            onDemandCost == other.onDemandCost &&
            runtimeMinutes == other.runtimeMinutes &&
            subscriptionBilledMinutes == other.subscriptionBilledMinutes &&
            subscriptionCost == other.subscriptionCost &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            avgDurationMinutes,
            billedMinutes,
            cost,
            count,
            creditsBilledMinutes,
            creditsCost,
            onDemandBilledMinutes,
            onDemandCost,
            runtimeMinutes,
            subscriptionBilledMinutes,
            subscriptionCost,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsRegionStats{avgDurationMinutes=$avgDurationMinutes, billedMinutes=$billedMinutes, cost=$cost, count=$count, creditsBilledMinutes=$creditsBilledMinutes, creditsCost=$creditsCost, onDemandBilledMinutes=$onDemandBilledMinutes, onDemandCost=$onDemandCost, runtimeMinutes=$runtimeMinutes, subscriptionBilledMinutes=$subscriptionBilledMinutes, subscriptionCost=$subscriptionCost, additionalProperties=$additionalProperties}"
}
