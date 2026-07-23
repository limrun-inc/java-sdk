// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.scopedtokens

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

class ScopedTokenCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val scopes: JsonField<List<String>>,
    private val ttlSeconds: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ttlSeconds") @ExcludeMissing ttlSeconds: JsonField<Long> = JsonMissing.of(),
    ) : this(scopes, ttlSeconds, mutableMapOf())

    /**
     * Scopes in the form <resource>:<id|*>:<action>, e.g. "device:*:install",
     * "asset:asset_01h455vb4pex5vsknk084sn02q:read" or "applerelay:*:connect". Resource IDs are the
     * customer-visible IDs returned by the API.
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopes(): List<String> = scopes.getRequired("scopes")

    /**
     * How long the token stays valid. Defaults to 3600 (1 hour), maximum is 14400 (4 hours).
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttlSeconds(): Optional<Long> = ttlSeconds.getOptional("ttlSeconds")

    /**
     * Returns the raw JSON value of [scopes].
     *
     * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

    /**
     * Returns the raw JSON value of [ttlSeconds].
     *
     * Unlike [ttlSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttlSeconds") @ExcludeMissing fun _ttlSeconds(): JsonField<Long> = ttlSeconds

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
         * Returns a mutable builder for constructing an instance of [ScopedTokenCreate].
         *
         * The following fields are required:
         * ```java
         * .scopes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScopedTokenCreate]. */
    class Builder internal constructor() {

        private var scopes: JsonField<MutableList<String>>? = null
        private var ttlSeconds: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scopedTokenCreate: ScopedTokenCreate) = apply {
            scopes = scopedTokenCreate.scopes.map { it.toMutableList() }
            ttlSeconds = scopedTokenCreate.ttlSeconds
            additionalProperties = scopedTokenCreate.additionalProperties.toMutableMap()
        }

        /**
         * Scopes in the form <resource>:<id|*>:<action>, e.g. "device:*:install",
         * "asset:asset_01h455vb4pex5vsknk084sn02q:read" or "applerelay:*:connect". Resource IDs are
         * the customer-visible IDs returned by the API.
         */
        fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

        /**
         * Sets [Builder.scopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopes] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scopes(scopes: JsonField<List<String>>) = apply {
            this.scopes = scopes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [scopes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScope(scope: String) = apply {
            scopes =
                (scopes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scopes", it).add(scope)
                }
        }

        /**
         * How long the token stays valid. Defaults to 3600 (1 hour), maximum is 14400 (4 hours).
         */
        fun ttlSeconds(ttlSeconds: Long) = ttlSeconds(JsonField.of(ttlSeconds))

        /**
         * Sets [Builder.ttlSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttlSeconds] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { this.ttlSeconds = ttlSeconds }

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
         * Returns an immutable instance of [ScopedTokenCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .scopes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScopedTokenCreate =
            ScopedTokenCreate(
                checkRequired("scopes", scopes).map { it.toImmutable() },
                ttlSeconds,
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
    fun validate(): ScopedTokenCreate = apply {
        if (validated) {
            return@apply
        }

        scopes()
        ttlSeconds()
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
        (scopes.asKnown().getOrNull()?.size ?: 0) + (if (ttlSeconds.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScopedTokenCreate &&
            scopes == other.scopes &&
            ttlSeconds == other.ttlSeconds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(scopes, ttlSeconds, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScopedTokenCreate{scopes=$scopes, ttlSeconds=$ttlSeconds, additionalProperties=$additionalProperties}"
}
