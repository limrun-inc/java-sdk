// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.models.assets

import com.configure_me_limrun_v1.api.core.Params
import com.configure_me_limrun_v1.api.core.http.Headers
import com.configure_me_limrun_v1.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get the asset with given ID. */
class AssetGetParams
private constructor(
    private val assetId: String?,
    private val includeDownloadUrl: Boolean?,
    private val includeUploadUrl: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assetId(): Optional<String> = Optional.ofNullable(assetId)

    /** Toggles whether a download URL should be included in the response */
    fun includeDownloadUrl(): Optional<Boolean> = Optional.ofNullable(includeDownloadUrl)

    /** Toggles whether an upload URL should be included in the response */
    fun includeUploadUrl(): Optional<Boolean> = Optional.ofNullable(includeUploadUrl)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AssetGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AssetGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetGetParams]. */
    class Builder internal constructor() {

        private var assetId: String? = null
        private var includeDownloadUrl: Boolean? = null
        private var includeUploadUrl: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assetGetParams: AssetGetParams) = apply {
            assetId = assetGetParams.assetId
            includeDownloadUrl = assetGetParams.includeDownloadUrl
            includeUploadUrl = assetGetParams.includeUploadUrl
            additionalHeaders = assetGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = assetGetParams.additionalQueryParams.toBuilder()
        }

        fun assetId(assetId: String?) = apply { this.assetId = assetId }

        /** Alias for calling [Builder.assetId] with `assetId.orElse(null)`. */
        fun assetId(assetId: Optional<String>) = assetId(assetId.getOrNull())

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
         * Returns an immutable instance of [AssetGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AssetGetParams =
            AssetGetParams(
                assetId,
                includeDownloadUrl,
                includeUploadUrl,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeDownloadUrl?.let { put("includeDownloadUrl", it.toString()) }
                includeUploadUrl?.let { put("includeUploadUrl", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssetGetParams &&
            assetId == other.assetId &&
            includeDownloadUrl == other.includeDownloadUrl &&
            includeUploadUrl == other.includeUploadUrl &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            assetId,
            includeDownloadUrl,
            includeUploadUrl,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AssetGetParams{assetId=$assetId, includeDownloadUrl=$includeDownloadUrl, includeUploadUrl=$includeUploadUrl, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
