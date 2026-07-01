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
        subscriptionBilledMinutes: JsonField<SubscriptionBilledMinutes> = JsonMissing.of(),
    ) : this(
        creditsBilledMinutes,
        onDemandBilledMinutes,
        planBilledMinutes,
        subscriptionBilledMinutes,
        mutableMapOf(),
    )

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditsBilledMinutes(): Long = creditsBilledMinutes.getRequired("creditsBilledMinutes")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun onDemandBilledMinutes(): Long = onDemandBilledMinutes.getRequired("onDemandBilledMinutes")

    /**
     * Map of plan ID to billed minutes
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planBilledMinutes(): Optional<PlanBilledMinutes> =
        planBilledMinutes.getOptional("planBilledMinutes")

    /**
     * Map of subscription ID to billed minutes
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionBilledMinutes(): Optional<SubscriptionBilledMinutes> =
        subscriptionBilledMinutes.getOptional("subscriptionBilledMinutes")

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
     * Returns the raw JSON value of [onDemandBilledMinutes].
     *
     * Unlike [onDemandBilledMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("onDemandBilledMinutes")
    @ExcludeMissing
    fun _onDemandBilledMinutes(): JsonField<Long> = onDemandBilledMinutes

    /**
     * Returns the raw JSON value of [planBilledMinutes].
     *
     * Unlike [planBilledMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("planBilledMinutes")
    @ExcludeMissing
    fun _planBilledMinutes(): JsonField<PlanBilledMinutes> = planBilledMinutes

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
         * You should usually call [Builder.creditsBilledMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditsBilledMinutes(creditsBilledMinutes: JsonField<Long>) = apply {
            this.creditsBilledMinutes = creditsBilledMinutes
        }

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

        /** Map of plan ID to billed minutes */
        fun planBilledMinutes(planBilledMinutes: PlanBilledMinutes) =
            planBilledMinutes(JsonField.of(planBilledMinutes))

        /**
         * Sets [Builder.planBilledMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planBilledMinutes] with a well-typed [PlanBilledMinutes]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun planBilledMinutes(planBilledMinutes: JsonField<PlanBilledMinutes>) = apply {
            this.planBilledMinutes = planBilledMinutes
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LimrunInvalidDataException if any value type in this object doesn't match its
     *   expected type.
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

            /** Returns a mutable builder for constructing an instance of [PlanBilledMinutes]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PlanBilledMinutes]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(planBilledMinutes: PlanBilledMinutes) = apply {
                additionalProperties = planBilledMinutes.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PlanBilledMinutes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PlanBilledMinutes = PlanBilledMinutes(additionalProperties.toImmutable())
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlanBilledMinutes && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PlanBilledMinutes{additionalProperties=$additionalProperties}"
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
