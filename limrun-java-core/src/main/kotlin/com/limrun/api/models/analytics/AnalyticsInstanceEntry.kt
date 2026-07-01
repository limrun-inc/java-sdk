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
import kotlin.jvm.optionals.getOrNull

class AnalyticsInstanceEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val instances: JsonField<List<AnalyticsInstance>>,
    private val timestamp: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("instances")
        @ExcludeMissing
        instances: JsonField<List<AnalyticsInstance>> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
    ) : this(instances, timestamp, mutableMapOf())

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instances(): List<AnalyticsInstance> = instances.getRequired("instances")

    /**
     * RFC3339 timestamp for the start of the minute bucket in the requested timezone, including the
     * local offset
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
    fun _instances(): JsonField<List<AnalyticsInstance>> = instances

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
         * Returns a mutable builder for constructing an instance of [AnalyticsInstanceEntry].
         *
         * The following fields are required:
         * ```java
         * .instances()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsInstanceEntry]. */
    class Builder internal constructor() {

        private var instances: JsonField<MutableList<AnalyticsInstance>>? = null
        private var timestamp: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsInstanceEntry: AnalyticsInstanceEntry) = apply {
            instances = analyticsInstanceEntry.instances.map { it.toMutableList() }
            timestamp = analyticsInstanceEntry.timestamp
            additionalProperties = analyticsInstanceEntry.additionalProperties.toMutableMap()
        }

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

        /**
         * RFC3339 timestamp for the start of the minute bucket in the requested timezone, including
         * the local offset
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
         * Returns an immutable instance of [AnalyticsInstanceEntry].
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
        fun build(): AnalyticsInstanceEntry =
            AnalyticsInstanceEntry(
                checkRequired("instances", instances).map { it.toImmutable() },
                checkRequired("timestamp", timestamp),
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
    fun validate(): AnalyticsInstanceEntry = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (instances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsInstanceEntry &&
            instances == other.instances &&
            timestamp == other.timestamp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(instances, timestamp, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsInstanceEntry{instances=$instances, timestamp=$timestamp, additionalProperties=$additionalProperties}"
}
