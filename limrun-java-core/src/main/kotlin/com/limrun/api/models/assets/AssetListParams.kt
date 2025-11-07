// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.assets

import com.limrun.api.core.Params
import com.limrun.api.core.http.Headers
import com.limrun.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List organization's all assets with given filters. If none given, return all assets. */
class AssetListParams
private constructor(
    private val endingBefore: String?,
    private val includeDownloadUrl: Boolean?,
    private val includeUploadUrl: Boolean?,
    private val limit: Long?,
    private val nameFilter: String?,
    private val startingAfter: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    /** Toggles whether a download URL should be included in the response */
    fun includeDownloadUrl(): Optional<Boolean> = Optional.ofNullable(includeDownloadUrl)

    /** Toggles whether an upload URL should be included in the response */
    fun includeUploadUrl(): Optional<Boolean> = Optional.ofNullable(includeUploadUrl)

    /** Maximum number of items to be returned. The default is 50. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Query by file name */
    fun nameFilter(): Optional<String> = Optional.ofNullable(nameFilter)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

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

        private var endingBefore: String? = null
        private var includeDownloadUrl: Boolean? = null
        private var includeUploadUrl: Boolean? = null
        private var limit: Long? = null
        private var nameFilter: String? = null
        private var startingAfter: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assetListParams: AssetListParams) = apply {
            endingBefore = assetListParams.endingBefore
            includeDownloadUrl = assetListParams.includeDownloadUrl
            includeUploadUrl = assetListParams.includeUploadUrl
            limit = assetListParams.limit
            nameFilter = assetListParams.nameFilter
            startingAfter = assetListParams.startingAfter
            additionalHeaders = assetListParams.additionalHeaders.toBuilder()
            additionalQueryParams = assetListParams.additionalQueryParams.toBuilder()
        }

        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.getOrNull())

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

        /** Query by file name */
        fun nameFilter(nameFilter: String?) = apply { this.nameFilter = nameFilter }

        /** Alias for calling [Builder.nameFilter] with `nameFilter.orElse(null)`. */
        fun nameFilter(nameFilter: Optional<String>) = nameFilter(nameFilter.getOrNull())

        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.getOrNull())

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
                endingBefore,
                includeDownloadUrl,
                includeUploadUrl,
                limit,
                nameFilter,
                startingAfter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endingBefore?.let { put("endingBefore", it) }
                includeDownloadUrl?.let { put("includeDownloadUrl", it.toString()) }
                includeUploadUrl?.let { put("includeUploadUrl", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                nameFilter?.let { put("nameFilter", it) }
                startingAfter?.let { put("startingAfter", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssetListParams &&
            endingBefore == other.endingBefore &&
            includeDownloadUrl == other.includeDownloadUrl &&
            includeUploadUrl == other.includeUploadUrl &&
            limit == other.limit &&
            nameFilter == other.nameFilter &&
            startingAfter == other.startingAfter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endingBefore,
            includeDownloadUrl,
            includeUploadUrl,
            limit,
            nameFilter,
            startingAfter,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AssetListParams{endingBefore=$endingBefore, includeDownloadUrl=$includeDownloadUrl, includeUploadUrl=$includeUploadUrl, limit=$limit, nameFilter=$nameFilter, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
