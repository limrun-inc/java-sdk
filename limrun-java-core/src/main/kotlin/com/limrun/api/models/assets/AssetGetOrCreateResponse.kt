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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AssetGetOrCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val kind: JsonField<Kind>,
    private val name: JsonField<String>,
    private val signedDownloadUrl: JsonField<String>,
    private val signedUploadUrl: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val md5: JsonField<String>,
    private val platform: JsonField<Platform>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signedDownloadUrl")
        @ExcludeMissing
        signedDownloadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signedUploadUrl")
        @ExcludeMissing
        signedUploadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("md5") @ExcludeMissing md5: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<Platform> = JsonMissing.of(),
    ) : this(
        id,
        kind,
        name,
        signedDownloadUrl,
        signedUploadUrl,
        expiresAt,
        md5,
        platform,
        mutableMapOf(),
    )

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kind(): Kind = kind.getRequired("kind")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signedDownloadUrl(): String = signedDownloadUrl.getRequired("signedDownloadUrl")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signedUploadUrl(): String = signedUploadUrl.getRequired("signedUploadUrl")

    /**
     * When set, the time after which the asset is automatically deleted.
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expiresAt")

    /**
     * Returned only if there is a corresponding file uploaded already.
     *
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun md5(): Optional<String> = md5.getOptional("md5")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun platform(): Optional<Platform> = platform.getOptional("platform")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [md5].
     *
     * Unlike [md5], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("md5") @ExcludeMissing fun _md5(): JsonField<String> = md5

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

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
         * Returns a mutable builder for constructing an instance of [AssetGetOrCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .kind()
         * .name()
         * .signedDownloadUrl()
         * .signedUploadUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetGetOrCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var kind: JsonField<Kind>? = null
        private var name: JsonField<String>? = null
        private var signedDownloadUrl: JsonField<String>? = null
        private var signedUploadUrl: JsonField<String>? = null
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var md5: JsonField<String> = JsonMissing.of()
        private var platform: JsonField<Platform> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(assetGetOrCreateResponse: AssetGetOrCreateResponse) = apply {
            id = assetGetOrCreateResponse.id
            kind = assetGetOrCreateResponse.kind
            name = assetGetOrCreateResponse.name
            signedDownloadUrl = assetGetOrCreateResponse.signedDownloadUrl
            signedUploadUrl = assetGetOrCreateResponse.signedUploadUrl
            expiresAt = assetGetOrCreateResponse.expiresAt
            md5 = assetGetOrCreateResponse.md5
            platform = assetGetOrCreateResponse.platform
            additionalProperties = assetGetOrCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun kind(kind: Kind) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed [Kind] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** When set, the time after which the asset is automatically deleted. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Returned only if there is a corresponding file uploaded already. */
        fun md5(md5: String) = md5(JsonField.of(md5))

        /**
         * Sets [Builder.md5] to an arbitrary JSON value.
         *
         * You should usually call [Builder.md5] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun md5(md5: JsonField<String>) = apply { this.md5 = md5 }

        fun platform(platform: Platform) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [Platform] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

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
         * Returns an immutable instance of [AssetGetOrCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .kind()
         * .name()
         * .signedDownloadUrl()
         * .signedUploadUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssetGetOrCreateResponse =
            AssetGetOrCreateResponse(
                checkRequired("id", id),
                checkRequired("kind", kind),
                checkRequired("name", name),
                checkRequired("signedDownloadUrl", signedDownloadUrl),
                checkRequired("signedUploadUrl", signedUploadUrl),
                expiresAt,
                md5,
                platform,
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
    fun validate(): AssetGetOrCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        kind().validate()
        name()
        signedDownloadUrl()
        signedUploadUrl()
        expiresAt()
        md5()
        platform().ifPresent { it.validate() }
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
            (kind.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (signedDownloadUrl.asKnown().isPresent) 1 else 0) +
            (if (signedUploadUrl.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (md5.asKnown().isPresent) 1 else 0) +
            (platform.asKnown().getOrNull()?.validity() ?: 0)

    class Kind @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val APP = of("App")

            @JvmField val KEYCHAIN = of("Keychain")

            @JvmStatic fun of(value: String) = Kind(JsonField.of(value))
        }

        /** An enum containing [Kind]'s known values. */
        enum class Known {
            APP,
            KEYCHAIN,
        }

        /**
         * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Kind] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APP,
            KEYCHAIN,
            /** An enum member indicating that [Kind] was instantiated with an unknown value. */
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
                APP -> Value.APP
                KEYCHAIN -> Value.KEYCHAIN
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
                APP -> Known.APP
                KEYCHAIN -> Known.KEYCHAIN
                else -> throw LimrunInvalidDataException("Unknown Kind: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LimrunInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Kind = apply {
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

            return other is Kind && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Platform @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val XCODE = of("xcode")

            @JvmStatic fun of(value: String) = Platform(JsonField.of(value))
        }

        /** An enum containing [Platform]'s known values. */
        enum class Known {
            IOS,
            ANDROID,
            XCODE,
        }

        /**
         * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Platform] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IOS,
            ANDROID,
            XCODE,
            /** An enum member indicating that [Platform] was instantiated with an unknown value. */
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
                XCODE -> Value.XCODE
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
                XCODE -> Known.XCODE
                else -> throw LimrunInvalidDataException("Unknown Platform: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LimrunInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssetGetOrCreateResponse &&
            id == other.id &&
            kind == other.kind &&
            name == other.name &&
            signedDownloadUrl == other.signedDownloadUrl &&
            signedUploadUrl == other.signedUploadUrl &&
            expiresAt == other.expiresAt &&
            md5 == other.md5 &&
            platform == other.platform &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            kind,
            name,
            signedDownloadUrl,
            signedUploadUrl,
            expiresAt,
            md5,
            platform,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssetGetOrCreateResponse{id=$id, kind=$kind, name=$name, signedDownloadUrl=$signedDownloadUrl, signedUploadUrl=$signedUploadUrl, expiresAt=$expiresAt, md5=$md5, platform=$platform, additionalProperties=$additionalProperties}"
}
