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
import kotlin.jvm.optionals.getOrNull

/** Summary of analytics across all time buckets, broken down by platform and region */
class AnalyticsSummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val android: JsonField<Android>,
    private val ios: JsonField<Ios>,
    private val sandbox: JsonField<Sandbox>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("android") @ExcludeMissing android: JsonField<Android> = JsonMissing.of(),
        @JsonProperty("ios") @ExcludeMissing ios: JsonField<Ios> = JsonMissing.of(),
        @JsonProperty("sandbox") @ExcludeMissing sandbox: JsonField<Sandbox> = JsonMissing.of(),
    ) : this(android, ios, sandbox, mutableMapOf())

    /**
     * Map of region to analytics stats for Android
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun android(): Android = android.getRequired("android")

    /**
     * Map of region to analytics stats for iOS
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ios(): Ios = ios.getRequired("ios")

    /**
     * Map of region to analytics stats for Sandbox
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sandbox(): Sandbox = sandbox.getRequired("sandbox")

    /**
     * Returns the raw JSON value of [android].
     *
     * Unlike [android], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("android") @ExcludeMissing fun _android(): JsonField<Android> = android

    /**
     * Returns the raw JSON value of [ios].
     *
     * Unlike [ios], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ios") @ExcludeMissing fun _ios(): JsonField<Ios> = ios

    /**
     * Returns the raw JSON value of [sandbox].
     *
     * Unlike [sandbox], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sandbox") @ExcludeMissing fun _sandbox(): JsonField<Sandbox> = sandbox

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
         * Returns a mutable builder for constructing an instance of [AnalyticsSummary].
         *
         * The following fields are required:
         * ```java
         * .android()
         * .ios()
         * .sandbox()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsSummary]. */
    class Builder internal constructor() {

        private var android: JsonField<Android>? = null
        private var ios: JsonField<Ios>? = null
        private var sandbox: JsonField<Sandbox>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsSummary: AnalyticsSummary) = apply {
            android = analyticsSummary.android
            ios = analyticsSummary.ios
            sandbox = analyticsSummary.sandbox
            additionalProperties = analyticsSummary.additionalProperties.toMutableMap()
        }

        /** Map of region to analytics stats for Android */
        fun android(android: Android) = android(JsonField.of(android))

        /**
         * Sets [Builder.android] to an arbitrary JSON value.
         *
         * You should usually call [Builder.android] with a well-typed [Android] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun android(android: JsonField<Android>) = apply { this.android = android }

        /** Map of region to analytics stats for iOS */
        fun ios(ios: Ios) = ios(JsonField.of(ios))

        /**
         * Sets [Builder.ios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ios] with a well-typed [Ios] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ios(ios: JsonField<Ios>) = apply { this.ios = ios }

        /** Map of region to analytics stats for Sandbox */
        fun sandbox(sandbox: Sandbox) = sandbox(JsonField.of(sandbox))

        /**
         * Sets [Builder.sandbox] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandbox] with a well-typed [Sandbox] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sandbox(sandbox: JsonField<Sandbox>) = apply { this.sandbox = sandbox }

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
         * Returns an immutable instance of [AnalyticsSummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .android()
         * .ios()
         * .sandbox()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticsSummary =
            AnalyticsSummary(
                checkRequired("android", android),
                checkRequired("ios", ios),
                checkRequired("sandbox", sandbox),
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
    fun validate(): AnalyticsSummary = apply {
        if (validated) {
            return@apply
        }

        android().validate()
        ios().validate()
        sandbox().validate()
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
        (android.asKnown().getOrNull()?.validity() ?: 0) +
            (ios.asKnown().getOrNull()?.validity() ?: 0) +
            (sandbox.asKnown().getOrNull()?.validity() ?: 0)

    /** Map of region to analytics stats for Android */
    class Android
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

            /** Returns a mutable builder for constructing an instance of [Android]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Android]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(android: Android) = apply {
                additionalProperties = android.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Android].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Android = Android(additionalProperties.toImmutable())
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
        fun validate(): Android = apply {
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

            return other is Android && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Android{additionalProperties=$additionalProperties}"
    }

    /** Map of region to analytics stats for iOS */
    class Ios
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

            /** Returns a mutable builder for constructing an instance of [Ios]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Ios]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ios: Ios) = apply {
                additionalProperties = ios.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Ios].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Ios = Ios(additionalProperties.toImmutable())
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
        fun validate(): Ios = apply {
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

            return other is Ios && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Ios{additionalProperties=$additionalProperties}"
    }

    /** Map of region to analytics stats for Sandbox */
    class Sandbox
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

            /** Returns a mutable builder for constructing an instance of [Sandbox]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sandbox]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandbox: Sandbox) = apply {
                additionalProperties = sandbox.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Sandbox].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Sandbox = Sandbox(additionalProperties.toImmutable())
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
        fun validate(): Sandbox = apply {
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

            return other is Sandbox && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Sandbox{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsSummary &&
            android == other.android &&
            ios == other.ios &&
            sandbox == other.sandbox &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(android, ios, sandbox, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsSummary{android=$android, ios=$ios, sandbox=$sandbox, additionalProperties=$additionalProperties}"
}
