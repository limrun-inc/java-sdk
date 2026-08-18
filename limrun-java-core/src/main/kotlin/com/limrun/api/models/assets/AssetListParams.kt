// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.fasterxml.jackson.annotation.JsonCreator
import com.limrun.api.core.Enum
import com.limrun.api.core.JsonField
import com.limrun.api.core.Params
import com.limrun.api.core.http.Headers
import com.limrun.api.core.http.QueryParams
import com.limrun.api.errors.LimrunInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List organization's all assets with given filters. If none given, return all assets. */
class AssetListParams
private constructor(
    private val includeAppStore: Boolean?,
    private val includeDownloadUrl: Boolean?,
    private val includeUploadUrl: Boolean?,
    private val kindFilter: KindFilter?,
    private val limit: Long?,
    private val nameFilter: String?,
    private val namePrefixFilter: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * If true, also includes assets from Limrun App Store where you have access to. App Store
     * assets will be returned with a "appstore/" prefix in their names.
     */
    fun includeAppStore(): Optional<Boolean> = Optional.ofNullable(includeAppStore)

    /** Toggles whether a download URL should be included in the response */
    fun includeDownloadUrl(): Optional<Boolean> = Optional.ofNullable(includeDownloadUrl)

    /** Toggles whether an upload URL should be included in the response */
    fun includeUploadUrl(): Optional<Boolean> = Optional.ofNullable(includeUploadUrl)

    /** Filters assets by kind. */
    fun kindFilter(): Optional<KindFilter> = Optional.ofNullable(kindFilter)

    /** Maximum number of items to be returned. The default is 50. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * Case-sensitive exact match on the asset name. Cannot be combined with namePrefixFilter. When
     * combined with includeAppStore=true, a leading "appstore/" is stripped before querying App
     * Store assets (whose stored names never carry the prefix).
     */
    fun nameFilter(): Optional<String> = Optional.ofNullable(nameFilter)

    /**
     * Case-sensitive prefix match on the asset name. LIKE wildcards ("%", "_") in the value are
     * treated as literal characters, not wildcards. Empty string is rejected with 400; omit the
     * parameter if no filtering is desired. Cannot be combined with nameFilter. When combined with
     * includeAppStore=true, a leading "appstore/" is stripped before querying App Store assets
     * (whose stored names never carry the prefix); a partial prefix like "appstor" will not match
     * any App Store assets.
     */
    fun namePrefixFilter(): Optional<String> = Optional.ofNullable(namePrefixFilter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AssetListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AssetListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetListParams]. */
    class Builder internal constructor() {

        private var includeAppStore: Boolean? = null
        private var includeDownloadUrl: Boolean? = null
        private var includeUploadUrl: Boolean? = null
        private var kindFilter: KindFilter? = null
        private var limit: Long? = null
        private var nameFilter: String? = null
        private var namePrefixFilter: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assetListParams: AssetListParams) = apply {
            includeAppStore = assetListParams.includeAppStore
            includeDownloadUrl = assetListParams.includeDownloadUrl
            includeUploadUrl = assetListParams.includeUploadUrl
            kindFilter = assetListParams.kindFilter
            limit = assetListParams.limit
            nameFilter = assetListParams.nameFilter
            namePrefixFilter = assetListParams.namePrefixFilter
            additionalHeaders = assetListParams.additionalHeaders.toBuilder()
            additionalQueryParams = assetListParams.additionalQueryParams.toBuilder()
        }

        /**
         * If true, also includes assets from Limrun App Store where you have access to. App Store
         * assets will be returned with a "appstore/" prefix in their names.
         */
        fun includeAppStore(includeAppStore: Boolean?) = apply {
            this.includeAppStore = includeAppStore
        }

        /**
         * Alias for [Builder.includeAppStore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeAppStore(includeAppStore: Boolean) = includeAppStore(includeAppStore as Boolean?)

        /** Alias for calling [Builder.includeAppStore] with `includeAppStore.orElse(null)`. */
        fun includeAppStore(includeAppStore: Optional<Boolean>) =
            includeAppStore(includeAppStore.getOrNull())

        /** Toggles whether a download URL should be included in the response */
        fun includeDownloadUrl(includeDownloadUrl: Boolean?) = apply {
            this.includeDownloadUrl = includeDownloadUrl
        }

        /**
         * Alias for [Builder.includeDownloadUrl].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeDownloadUrl(includeDownloadUrl: Boolean) =
            includeDownloadUrl(includeDownloadUrl as Boolean?)

        /**
         * Alias for calling [Builder.includeDownloadUrl] with `includeDownloadUrl.orElse(null)`.
         */
        fun includeDownloadUrl(includeDownloadUrl: Optional<Boolean>) =
            includeDownloadUrl(includeDownloadUrl.getOrNull())

        /** Toggles whether an upload URL should be included in the response */
        fun includeUploadUrl(includeUploadUrl: Boolean?) = apply {
            this.includeUploadUrl = includeUploadUrl
        }

        /**
         * Alias for [Builder.includeUploadUrl].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeUploadUrl(includeUploadUrl: Boolean) =
            includeUploadUrl(includeUploadUrl as Boolean?)

        /** Alias for calling [Builder.includeUploadUrl] with `includeUploadUrl.orElse(null)`. */
        fun includeUploadUrl(includeUploadUrl: Optional<Boolean>) =
            includeUploadUrl(includeUploadUrl.getOrNull())

        /** Filters assets by kind. */
        fun kindFilter(kindFilter: KindFilter?) = apply { this.kindFilter = kindFilter }

        /** Alias for calling [Builder.kindFilter] with `kindFilter.orElse(null)`. */
        fun kindFilter(kindFilter: Optional<KindFilter>) = kindFilter(kindFilter.getOrNull())

        /** Maximum number of items to be returned. The default is 50. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /**
         * Case-sensitive exact match on the asset name. Cannot be combined with namePrefixFilter.
         * When combined with includeAppStore=true, a leading "appstore/" is stripped before
         * querying App Store assets (whose stored names never carry the prefix).
         */
        fun nameFilter(nameFilter: String?) = apply { this.nameFilter = nameFilter }

        /** Alias for calling [Builder.nameFilter] with `nameFilter.orElse(null)`. */
        fun nameFilter(nameFilter: Optional<String>) = nameFilter(nameFilter.getOrNull())

        /**
         * Case-sensitive prefix match on the asset name. LIKE wildcards ("%", "_") in the value are
         * treated as literal characters, not wildcards. Empty string is rejected with 400; omit the
         * parameter if no filtering is desired. Cannot be combined with nameFilter. When combined
         * with includeAppStore=true, a leading "appstore/" is stripped before querying App Store
         * assets (whose stored names never carry the prefix); a partial prefix like "appstor" will
         * not match any App Store assets.
         */
        fun namePrefixFilter(namePrefixFilter: String?) = apply {
            this.namePrefixFilter = namePrefixFilter
        }

        /** Alias for calling [Builder.namePrefixFilter] with `namePrefixFilter.orElse(null)`. */
        fun namePrefixFilter(namePrefixFilter: Optional<String>) =
            namePrefixFilter(namePrefixFilter.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AssetListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AssetListParams =
            AssetListParams(
                includeAppStore,
                includeDownloadUrl,
                includeUploadUrl,
                kindFilter,
                limit,
                nameFilter,
                namePrefixFilter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeAppStore?.let { put("includeAppStore", it.toString()) }
                includeDownloadUrl?.let { put("includeDownloadUrl", it.toString()) }
                includeUploadUrl?.let { put("includeUploadUrl", it.toString()) }
                kindFilter?.let { put("kindFilter", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                nameFilter?.let { put("nameFilter", it) }
                namePrefixFilter?.let { put("namePrefixFilter", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filters assets by kind. */
    class KindFilter @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = KindFilter(JsonField.of(value))
        }

        /** An enum containing [KindFilter]'s known values. */
        enum class Known {
            APP,
            KEYCHAIN,
        }

        /**
         * An enum containing [KindFilter]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [KindFilter] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APP,
            KEYCHAIN,
            /**
             * An enum member indicating that [KindFilter] was instantiated with an unknown value.
             */
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
                else -> throw LimrunInvalidDataException("Unknown KindFilter: $value")
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
        fun validate(): KindFilter = apply {
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

            return other is KindFilter && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssetListParams &&
            includeAppStore == other.includeAppStore &&
            includeDownloadUrl == other.includeDownloadUrl &&
            includeUploadUrl == other.includeUploadUrl &&
            kindFilter == other.kindFilter &&
            limit == other.limit &&
            nameFilter == other.nameFilter &&
            namePrefixFilter == other.namePrefixFilter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            includeAppStore,
            includeDownloadUrl,
            includeUploadUrl,
            kindFilter,
            limit,
            nameFilter,
            namePrefixFilter,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AssetListParams{includeAppStore=$includeAppStore, includeDownloadUrl=$includeDownloadUrl, includeUploadUrl=$includeUploadUrl, kindFilter=$kindFilter, limit=$limit, nameFilter=$nameFilter, namePrefixFilter=$namePrefixFilter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
