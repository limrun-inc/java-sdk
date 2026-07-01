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
        @JsonProperty("planCost") @ExcludeMissing planCost: JsonField<PlanCost> = JsonMissing.of(),
        @JsonProperty("subscriptionCost")
        @ExcludeMissing
        subscriptionCost: JsonField<SubscriptionCost> = JsonMissing.of(),
    ) : this(creditsCost, onDemandCost, planCost, subscriptionCost, mutableMapOf())

    /**
     * Cost from credits (always 0)
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditsCost(): Double = creditsCost.getRequired("creditsCost")

    /**
     * Cost from on-demand billing in dollars
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun onDemandCost(): Double = onDemandCost.getRequired("onDemandCost")

    /**
     * Map of plan ID to cost in dollars
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planCost(): Optional<PlanCost> = planCost.getOptional("planCost")

    /**
     * Map of subscription ID to cost in dollars
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionCost(): Optional<SubscriptionCost> =
        subscriptionCost.getOptional("subscriptionCost")

    /**
     * Returns the raw JSON value of [creditsCost].
     *
     * Unlike [creditsCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditsCost") @ExcludeMissing fun _creditsCost(): JsonField<Double> = creditsCost

    /**
     * Returns the raw JSON value of [onDemandCost].
     *
     * Unlike [onDemandCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onDemandCost")
    @ExcludeMissing
    fun _onDemandCost(): JsonField<Double> = onDemandCost

    /**
     * Returns the raw JSON value of [planCost].
     *
     * Unlike [planCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planCost") @ExcludeMissing fun _planCost(): JsonField<PlanCost> = planCost

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
         * You should usually call [Builder.creditsCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditsCost(creditsCost: JsonField<Double>) = apply { this.creditsCost = creditsCost }

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

        /** Map of plan ID to cost in dollars */
        fun planCost(planCost: PlanCost) = planCost(JsonField.of(planCost))

        /**
         * Sets [Builder.planCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planCost] with a well-typed [PlanCost] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun planCost(planCost: JsonField<PlanCost>) = apply { this.planCost = planCost }

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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LimrunInvalidDataException if any value type in this object doesn't match its
     *   expected type.
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(planCost: PlanCost) = apply {
                additionalProperties = planCost.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PlanCost].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PlanCost = PlanCost(additionalProperties.toImmutable())
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlanCost && additionalProperties == other.additionalProperties
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

        return other is CostBreakdown &&
            creditsCost == other.creditsCost &&
            onDemandCost == other.onDemandCost &&
            planCost == other.planCost &&
            subscriptionCost == other.subscriptionCost &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(creditsCost, onDemandCost, planCost, subscriptionCost, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CostBreakdown{creditsCost=$creditsCost, onDemandCost=$onDemandCost, planCost=$planCost, subscriptionCost=$subscriptionCost, additionalProperties=$additionalProperties}"
}
