// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.limrun.api.core.Enum
import com.limrun.api.core.ExcludeMissing
import com.limrun.api.core.JsonField
import com.limrun.api.core.JsonMissing
import com.limrun.api.core.JsonValue
import com.limrun.api.core.checkRequired
import com.limrun.api.errors.LimrunInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Asset
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val displayName: JsonField<String>,
    private val md5: JsonField<String>,
    private val os: JsonField<Os>,
    private val signedDownloadUrl: JsonField<String>,
    private val signedUploadUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displayName")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("md5") @ExcludeMissing md5: JsonField<String> = JsonMissing.of(),
        @JsonProperty("os") @ExcludeMissing os: JsonField<Os> = JsonMissing.of(),
        @JsonProperty("signedDownloadUrl")
        @ExcludeMissing
        signedDownloadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signedUploadUrl")
        @ExcludeMissing
        signedUploadUrl: JsonField<String> = JsonMissing.of(),
    ) : this(id, name, displayName, md5, os, signedDownloadUrl, signedUploadUrl, mutableMapOf())

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Human-readable display name for the asset. If not set, the name should be used.
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = displayName.getOptional("displayName")

    /**
     * Returned only if there is a corresponding file uploaded already.
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun md5(): Optional<String> = md5.getOptional("md5")

    /**
     * The operating system this asset is for. If not set, the asset is available for all platforms.
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun os(): Optional<Os> = os.getOptional("os")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signedDownloadUrl(): Optional<String> = signedDownloadUrl.getOptional("signedDownloadUrl")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signedUploadUrl(): Optional<String> = signedUploadUrl.getOptional("signedUploadUrl")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayName") @ExcludeMissing fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [md5].
     *
     * Unlike [md5], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("md5") @ExcludeMissing fun _md5(): JsonField<String> = md5

    /**
     * Returns the raw JSON value of [os].
     *
     * Unlike [os], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("os") @ExcludeMissing fun _os(): JsonField<Os> = os

    /**
     * Returns the raw JSON value of [signedDownloadUrl].
     *
     * Unlike [signedDownloadUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("signedDownloadUrl")
    @ExcludeMissing
    fun _signedDownloadUrl(): JsonField<String> = signedDownloadUrl

    /**
     * Returns the raw JSON value of [signedUploadUrl].
     *
     * Unlike [signedUploadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signedUploadUrl")
    @ExcludeMissing
    fun _signedUploadUrl(): JsonField<String> = signedUploadUrl

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
         * Returns a mutable builder for constructing an instance of [Asset].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Asset]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var displayName: JsonField<String> = JsonMissing.of()
        private var md5: JsonField<String> = JsonMissing.of()
        private var os: JsonField<Os> = JsonMissing.of()
        private var signedDownloadUrl: JsonField<String> = JsonMissing.of()
        private var signedUploadUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(asset: Asset) = apply {
            id = asset.id
            name = asset.name
            displayName = asset.displayName
            md5 = asset.md5
            os = asset.os
            signedDownloadUrl = asset.signedDownloadUrl
            signedUploadUrl = asset.signedUploadUrl
            additionalProperties = asset.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Human-readable display name for the asset. If not set, the name should be used. */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /** Returned only if there is a corresponding file uploaded already. */
        fun md5(md5: String) = md5(JsonField.of(md5))

        /**
         * Sets [Builder.md5] to an arbitrary JSON value.
         *
         * You should usually call [Builder.md5] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun md5(md5: JsonField<String>) = apply { this.md5 = md5 }

        /**
         * The operating system this asset is for. If not set, the asset is available for all
         * platforms.
         */
        fun os(os: Os) = os(JsonField.of(os))

        /**
         * Sets [Builder.os] to an arbitrary JSON value.
         *
         * You should usually call [Builder.os] with a well-typed [Os] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun os(os: JsonField<Os>) = apply { this.os = os }

        fun signedDownloadUrl(signedDownloadUrl: String) =
            signedDownloadUrl(JsonField.of(signedDownloadUrl))

        /**
         * Sets [Builder.signedDownloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signedDownloadUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signedDownloadUrl(signedDownloadUrl: JsonField<String>) = apply {
            this.signedDownloadUrl = signedDownloadUrl
        }

        fun signedUploadUrl(signedUploadUrl: String) =
            signedUploadUrl(JsonField.of(signedUploadUrl))

        /**
         * Sets [Builder.signedUploadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signedUploadUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signedUploadUrl(signedUploadUrl: JsonField<String>) = apply {
            this.signedUploadUrl = signedUploadUrl
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
         * Returns an immutable instance of [Asset].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Asset =
            Asset(
                checkRequired("id", id),
                checkRequired("name", name),
                displayName,
                md5,
                os,
                signedDownloadUrl,
                signedUploadUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Asset = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        displayName()
        md5()
        os().ifPresent { it.validate() }
        signedDownloadUrl()
        signedUploadUrl()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (md5.asKnown().isPresent) 1 else 0) +
            (os.asKnown().getOrNull()?.validity() ?: 0) +
            (if (signedDownloadUrl.asKnown().isPresent) 1 else 0) +
            (if (signedUploadUrl.asKnown().isPresent) 1 else 0)

    /**
     * The operating system this asset is for. If not set, the asset is available for all platforms.
     */
    class Os @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val IOS = of("ios")

            @JvmField val ANDROID = of("android")

            @JvmStatic fun of(value: String) = Os(JsonField.of(value))
        }

        /** An enum containing [Os]'s known values. */
        enum class Known {
            IOS,
            ANDROID,
        }

        /**
         * An enum containing [Os]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Os] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IOS,
            ANDROID,
            /** An enum member indicating that [Os] was instantiated with an unknown value. */
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
                IOS -> Value.IOS
                ANDROID -> Value.ANDROID
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
                IOS -> Known.IOS
                ANDROID -> Known.ANDROID
                else -> throw LimrunInvalidDataException("Unknown Os: $value")
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

        fun validate(): Os = apply {
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

            return other is Os && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Asset &&
            id == other.id &&
            name == other.name &&
            displayName == other.displayName &&
            md5 == other.md5 &&
            os == other.os &&
            signedDownloadUrl == other.signedDownloadUrl &&
            signedUploadUrl == other.signedUploadUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            displayName,
            md5,
            os,
            signedDownloadUrl,
            signedUploadUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Asset{id=$id, name=$name, displayName=$displayName, md5=$md5, os=$os, signedDownloadUrl=$signedDownloadUrl, signedUploadUrl=$signedUploadUrl, additionalProperties=$additionalProperties}"
}
