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
import com.limrun.api.core.checkKnown
import com.limrun.api.core.checkRequired
import com.limrun.api.core.toImmutable
import com.limrun.api.errors.LimrunInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Analytics data for a single time bucket, broken down by platform and region */
class AnalyticsEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val android: JsonField<Android>,
    private val ios: JsonField<Ios>,
    private val sandbox: JsonField<Sandbox>,
    private val timestamp: JsonField<String>,
    private val instances: JsonField<List<AnalyticsInstance>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("android") @ExcludeMissing android: JsonField<Android> = JsonMissing.of(),
        @JsonProperty("ios") @ExcludeMissing ios: JsonField<Ios> = JsonMissing.of(),
        @JsonProperty("sandbox") @ExcludeMissing sandbox: JsonField<Sandbox> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instances")
        @ExcludeMissing
        instances: JsonField<List<AnalyticsInstance>> = JsonMissing.of(),
    ) : this(android, ios, sandbox, timestamp, instances, mutableMapOf())

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
     * RFC3339 timestamp for the start of the bucket in the requested timezone, including the local
     * offset
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): String = timestamp.getRequired("timestamp")

    /**
     * Individual instance details for this time bucket
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instances(): Optional<List<AnalyticsInstance>> = instances.getOptional("instances")

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

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

    /**
     * Returns the raw JSON value of [instances].
     *
     * Unlike [instances], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instances")
    @ExcludeMissing
    fun _instances(): JsonField<List<AnalyticsInstance>> = instances

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
         * Returns a mutable builder for constructing an instance of [AnalyticsEntry].
         *
         * The following fields are required:
         * ```java
         * .android()
         * .ios()
         * .sandbox()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsEntry]. */
    class Builder internal constructor() {

        private var android: JsonField<Android>? = null
        private var ios: JsonField<Ios>? = null
        private var sandbox: JsonField<Sandbox>? = null
        private var timestamp: JsonField<String>? = null
        private var instances: JsonField<MutableList<AnalyticsInstance>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsEntry: AnalyticsEntry) = apply {
            android = analyticsEntry.android
            ios = analyticsEntry.ios
            sandbox = analyticsEntry.sandbox
            timestamp = analyticsEntry.timestamp
            instances = analyticsEntry.instances.map { it.toMutableList() }
            additionalProperties = analyticsEntry.additionalProperties.toMutableMap()
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

        /**
         * RFC3339 timestamp for the start of the bucket in the requested timezone, including the
         * local offset
         */
        fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

        /** Individual instance details for this time bucket */
        fun instances(instances: List<AnalyticsInstance>) = instances(JsonField.of(instances))

        /**
         * Sets [Builder.instances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instances] with a well-typed `List<AnalyticsInstance>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun instances(instances: JsonField<List<AnalyticsInstance>>) = apply {
            this.instances = instances.map { it.toMutableList() }
        }

        /**
         * Adds a single [AnalyticsInstance] to [instances].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstance(instance: AnalyticsInstance) = apply {
            instances =
                (instances ?: JsonField.of(mutableListOf())).also {
                    checkKnown("instances", it).add(instance)
                }
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
         * Returns an immutable instance of [AnalyticsEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .android()
         * .ios()
         * .sandbox()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticsEntry =
            AnalyticsEntry(
                checkRequired("android", android),
                checkRequired("ios", ios),
                checkRequired("sandbox", sandbox),
                checkRequired("timestamp", timestamp),
                (instances ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): AnalyticsEntry = apply {
        if (validated) {
            return@apply
        }

        android().validate()
        ios().validate()
        sandbox().validate()
        timestamp()
        instances().ifPresent { it.forEach { it.validate() } }
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
            (sandbox.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (instances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

        return other is AnalyticsEntry &&
            android == other.android &&
            ios == other.ios &&
            sandbox == other.sandbox &&
            timestamp == other.timestamp &&
            instances == other.instances &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(android, ios, sandbox, timestamp, instances, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsEntry{android=$android, ios=$ios, sandbox=$sandbox, timestamp=$timestamp, instances=$instances, additionalProperties=$additionalProperties}"
}
