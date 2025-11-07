// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.iosinstances

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.limrun.api.core.Enum
import com.limrun.api.core.ExcludeMissing
import com.limrun.api.core.JsonField
import com.limrun.api.core.JsonMissing
import com.limrun.api.core.JsonValue
import com.limrun.api.core.Params
import com.limrun.api.core.checkKnown
import com.limrun.api.core.checkRequired
import com.limrun.api.core.http.Headers
import com.limrun.api.core.http.QueryParams
import com.limrun.api.core.toImmutable
import com.limrun.api.errors.LimrunInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create an iOS instance */
class IosInstanceCreateParams
private constructor(
    private val wait: Boolean?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Return after the instance is ready to connect. */
    fun wait(): Optional<Boolean> = Optional.ofNullable(wait)

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spec(): Optional<Spec> = body.spec()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [spec].
     *
     * Unlike [spec], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _spec(): JsonField<Spec> = body._spec()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): IosInstanceCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [IosInstanceCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IosInstanceCreateParams]. */
    class Builder internal constructor() {

        private var wait: Boolean? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(iosInstanceCreateParams: IosInstanceCreateParams) = apply {
            wait = iosInstanceCreateParams.wait
            body = iosInstanceCreateParams.body.toBuilder()
            additionalHeaders = iosInstanceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = iosInstanceCreateParams.additionalQueryParams.toBuilder()
        }

        /** Return after the instance is ready to connect. */
        fun wait(wait: Boolean?) = apply { this.wait = wait }

        /**
         * Alias for [Builder.wait].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun wait(wait: Boolean) = wait(wait as Boolean?)

        /** Alias for calling [Builder.wait] with `wait.orElse(null)`. */
        fun wait(wait: Optional<Boolean>) = wait(wait.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [metadata]
         * - [spec]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun spec(spec: Spec) = apply { body.spec(spec) }

        /**
         * Sets [Builder.spec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spec] with a well-typed [Spec] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spec(spec: JsonField<Spec>) = apply { body.spec(spec) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [IosInstanceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IosInstanceCreateParams =
            IosInstanceCreateParams(
                wait,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                wait?.let { put("wait", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val spec: JsonField<Spec>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("spec") @ExcludeMissing spec: JsonField<Spec> = JsonMissing.of(),
        ) : this(metadata, spec, mutableMapOf())

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spec(): Optional<Spec> = spec.getOptional("spec")

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [spec].
         *
         * Unlike [spec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spec") @ExcludeMissing fun _spec(): JsonField<Spec> = spec

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var spec: JsonField<Spec> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                metadata = body.metadata
                spec = body.spec
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun spec(spec: Spec) = spec(JsonField.of(spec))

            /**
             * Sets [Builder.spec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spec] with a well-typed [Spec] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun spec(spec: JsonField<Spec>) = apply { this.spec = spec }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(metadata, spec, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            metadata().ifPresent { it.validate() }
            spec().ifPresent { it.validate() }
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
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (spec.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                metadata == other.metadata &&
                spec == other.spec &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(metadata, spec, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{metadata=$metadata, spec=$spec, additionalProperties=$additionalProperties}"
    }

    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val labels: JsonField<Labels>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("labels") @ExcludeMissing labels: JsonField<Labels> = JsonMissing.of(),
        ) : this(displayName, labels, mutableMapOf())

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("displayName")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun labels(): Optional<Labels> = labels.getOptional("labels")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [labels].
         *
         * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonField<Labels> = labels

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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String> = JsonMissing.of()
            private var labels: JsonField<Labels> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                displayName = metadata.displayName
                labels = metadata.labels
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            fun labels(labels: Labels) = labels(JsonField.of(labels))

            /**
             * Sets [Builder.labels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.labels] with a well-typed [Labels] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun labels(labels: JsonField<Labels>) = apply { this.labels = labels }

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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata =
                Metadata(displayName, labels, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            displayName()
            labels().ifPresent { it.validate() }
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
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (labels.asKnown().getOrNull()?.validity() ?: 0)

        class Labels
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

                /** Returns a mutable builder for constructing an instance of [Labels]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Labels]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(labels: Labels) = apply {
                    additionalProperties = labels.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Labels].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Labels = Labels(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Labels = apply {
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

                return other is Labels && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Labels{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                displayName == other.displayName &&
                labels == other.labels &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(displayName, labels, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{displayName=$displayName, labels=$labels, additionalProperties=$additionalProperties}"
    }

    class Spec
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clues: JsonField<List<Clue>>,
        private val hardTimeout: JsonField<String>,
        private val inactivityTimeout: JsonField<String>,
        private val initialAssets: JsonField<List<InitialAsset>>,
        private val region: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("clues") @ExcludeMissing clues: JsonField<List<Clue>> = JsonMissing.of(),
            @JsonProperty("hardTimeout")
            @ExcludeMissing
            hardTimeout: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inactivityTimeout")
            @ExcludeMissing
            inactivityTimeout: JsonField<String> = JsonMissing.of(),
            @JsonProperty("initialAssets")
            @ExcludeMissing
            initialAssets: JsonField<List<InitialAsset>> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        ) : this(clues, hardTimeout, inactivityTimeout, initialAssets, region, mutableMapOf())

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clues(): Optional<List<Clue>> = clues.getOptional("clues")

        /**
         * After how many minutes should the instance be terminated. Example values 1m, 10m, 3h.
         * Default is "0" which means no hard timeout.
         *
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hardTimeout(): Optional<String> = hardTimeout.getOptional("hardTimeout")

        /**
         * After how many minutes of inactivity should the instance be terminated. Example values
         * 1m, 10m, 3h. Default is 3m. Providing "0" disables inactivity checks altogether.
         *
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inactivityTimeout(): Optional<String> =
            inactivityTimeout.getOptional("inactivityTimeout")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun initialAssets(): Optional<List<InitialAsset>> =
            initialAssets.getOptional("initialAssets")

        /**
         * The region where the instance will be created. If not given, will be decided based on
         * scheduling clues and availability.
         *
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

        /**
         * Returns the raw JSON value of [clues].
         *
         * Unlike [clues], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clues") @ExcludeMissing fun _clues(): JsonField<List<Clue>> = clues

        /**
         * Returns the raw JSON value of [hardTimeout].
         *
         * Unlike [hardTimeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hardTimeout")
        @ExcludeMissing
        fun _hardTimeout(): JsonField<String> = hardTimeout

        /**
         * Returns the raw JSON value of [inactivityTimeout].
         *
         * Unlike [inactivityTimeout], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inactivityTimeout")
        @ExcludeMissing
        fun _inactivityTimeout(): JsonField<String> = inactivityTimeout

        /**
         * Returns the raw JSON value of [initialAssets].
         *
         * Unlike [initialAssets], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("initialAssets")
        @ExcludeMissing
        fun _initialAssets(): JsonField<List<InitialAsset>> = initialAssets

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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

            /** Returns a mutable builder for constructing an instance of [Spec]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Spec]. */
        class Builder internal constructor() {

            private var clues: JsonField<MutableList<Clue>>? = null
            private var hardTimeout: JsonField<String> = JsonMissing.of()
            private var inactivityTimeout: JsonField<String> = JsonMissing.of()
            private var initialAssets: JsonField<MutableList<InitialAsset>>? = null
            private var region: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spec: Spec) = apply {
                clues = spec.clues.map { it.toMutableList() }
                hardTimeout = spec.hardTimeout
                inactivityTimeout = spec.inactivityTimeout
                initialAssets = spec.initialAssets.map { it.toMutableList() }
                region = spec.region
                additionalProperties = spec.additionalProperties.toMutableMap()
            }

            fun clues(clues: List<Clue>) = clues(JsonField.of(clues))

            /**
             * Sets [Builder.clues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clues] with a well-typed `List<Clue>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clues(clues: JsonField<List<Clue>>) = apply {
                this.clues = clues.map { it.toMutableList() }
            }

            /**
             * Adds a single [Clue] to [clues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addClue(clue: Clue) = apply {
                clues =
                    (clues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("clues", it).add(clue)
                    }
            }

            /**
             * After how many minutes should the instance be terminated. Example values 1m, 10m, 3h.
             * Default is "0" which means no hard timeout.
             */
            fun hardTimeout(hardTimeout: String) = hardTimeout(JsonField.of(hardTimeout))

            /**
             * Sets [Builder.hardTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hardTimeout] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hardTimeout(hardTimeout: JsonField<String>) = apply {
                this.hardTimeout = hardTimeout
            }

            /**
             * After how many minutes of inactivity should the instance be terminated. Example
             * values 1m, 10m, 3h. Default is 3m. Providing "0" disables inactivity checks
             * altogether.
             */
            fun inactivityTimeout(inactivityTimeout: String) =
                inactivityTimeout(JsonField.of(inactivityTimeout))

            /**
             * Sets [Builder.inactivityTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inactivityTimeout] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inactivityTimeout(inactivityTimeout: JsonField<String>) = apply {
                this.inactivityTimeout = inactivityTimeout
            }

            fun initialAssets(initialAssets: List<InitialAsset>) =
                initialAssets(JsonField.of(initialAssets))

            /**
             * Sets [Builder.initialAssets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialAssets] with a well-typed
             * `List<InitialAsset>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun initialAssets(initialAssets: JsonField<List<InitialAsset>>) = apply {
                this.initialAssets = initialAssets.map { it.toMutableList() }
            }

            /**
             * Adds a single [InitialAsset] to [initialAssets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInitialAsset(initialAsset: InitialAsset) = apply {
                initialAssets =
                    (initialAssets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("initialAssets", it).add(initialAsset)
                    }
            }

            /**
             * The region where the instance will be created. If not given, will be decided based on
             * scheduling clues and availability.
             */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

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
             * Returns an immutable instance of [Spec].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Spec =
                Spec(
                    (clues ?: JsonMissing.of()).map { it.toImmutable() },
                    hardTimeout,
                    inactivityTimeout,
                    (initialAssets ?: JsonMissing.of()).map { it.toImmutable() },
                    region,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Spec = apply {
            if (validated) {
                return@apply
            }

            clues().ifPresent { it.forEach { it.validate() } }
            hardTimeout()
            inactivityTimeout()
            initialAssets().ifPresent { it.forEach { it.validate() } }
            region()
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
            (clues.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (hardTimeout.asKnown().isPresent) 1 else 0) +
                (if (inactivityTimeout.asKnown().isPresent) 1 else 0) +
                (initialAssets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (region.asKnown().isPresent) 1 else 0)

        class Clue
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val kind: JsonField<Kind>,
            private val clientIp: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
                @JsonProperty("clientIp")
                @ExcludeMissing
                clientIp: JsonField<String> = JsonMissing.of(),
            ) : this(kind, clientIp, mutableMapOf())

            /**
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun kind(): Kind = kind.getRequired("kind")

            /**
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun clientIp(): Optional<String> = clientIp.getOptional("clientIp")

            /**
             * Returns the raw JSON value of [kind].
             *
             * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

            /**
             * Returns the raw JSON value of [clientIp].
             *
             * Unlike [clientIp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("clientIp") @ExcludeMissing fun _clientIp(): JsonField<String> = clientIp

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
                 * Returns a mutable builder for constructing an instance of [Clue].
                 *
                 * The following fields are required:
                 * ```java
                 * .kind()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Clue]. */
            class Builder internal constructor() {

                private var kind: JsonField<Kind>? = null
                private var clientIp: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(clue: Clue) = apply {
                    kind = clue.kind
                    clientIp = clue.clientIp
                    additionalProperties = clue.additionalProperties.toMutableMap()
                }

                fun kind(kind: Kind) = kind(JsonField.of(kind))

                /**
                 * Sets [Builder.kind] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kind] with a well-typed [Kind] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

                fun clientIp(clientIp: String) = clientIp(JsonField.of(clientIp))

                /**
                 * Sets [Builder.clientIp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientIp] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clientIp(clientIp: JsonField<String>) = apply { this.clientIp = clientIp }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Clue].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .kind()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Clue =
                    Clue(checkRequired("kind", kind), clientIp, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Clue = apply {
                if (validated) {
                    return@apply
                }

                kind().validate()
                clientIp()
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
                (kind.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (clientIp.asKnown().isPresent) 1 else 0)

            class Kind @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CLIENT_IP = of("ClientIP")

                    @JvmStatic fun of(value: String) = Kind(JsonField.of(value))
                }

                /** An enum containing [Kind]'s known values. */
                enum class Known {
                    CLIENT_IP
                }

                /**
                 * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Kind] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CLIENT_IP,
                    /**
                     * An enum member indicating that [Kind] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CLIENT_IP -> Value.CLIENT_IP
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CLIENT_IP -> Known.CLIENT_IP
                        else -> throw LimrunInvalidDataException("Unknown Kind: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LimrunInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Clue &&
                    kind == other.kind &&
                    clientIp == other.clientIp &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(kind, clientIp, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Clue{kind=$kind, clientIp=$clientIp, additionalProperties=$additionalProperties}"
        }

        class InitialAsset
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val kind: JsonField<Kind>,
            private val source: JsonField<Source>,
            private val assetId: JsonField<String>,
            private val assetName: JsonField<String>,
            private val launchMode: JsonField<LaunchMode>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<Source> = JsonMissing.of(),
                @JsonProperty("assetId")
                @ExcludeMissing
                assetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("assetName")
                @ExcludeMissing
                assetName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("launchMode")
                @ExcludeMissing
                launchMode: JsonField<LaunchMode> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(kind, source, assetId, assetName, launchMode, url, mutableMapOf())

            /**
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun kind(): Kind = kind.getRequired("kind")

            /**
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun source(): Source = source.getRequired("source")

            /**
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun assetId(): Optional<String> = assetId.getOptional("assetId")

            /**
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun assetName(): Optional<String> = assetName.getOptional("assetName")

            /**
             * Launch mode specifies how to launch the app after installation. If not given, the app
             * won't be launched.
             *
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun launchMode(): Optional<LaunchMode> = launchMode.getOptional("launchMode")

            /**
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [kind].
             *
             * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

            /**
             * Returns the raw JSON value of [assetId].
             *
             * Unlike [assetId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("assetId") @ExcludeMissing fun _assetId(): JsonField<String> = assetId

            /**
             * Returns the raw JSON value of [assetName].
             *
             * Unlike [assetName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assetName")
            @ExcludeMissing
            fun _assetName(): JsonField<String> = assetName

            /**
             * Returns the raw JSON value of [launchMode].
             *
             * Unlike [launchMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("launchMode")
            @ExcludeMissing
            fun _launchMode(): JsonField<LaunchMode> = launchMode

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
                 * Returns a mutable builder for constructing an instance of [InitialAsset].
                 *
                 * The following fields are required:
                 * ```java
                 * .kind()
                 * .source()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InitialAsset]. */
            class Builder internal constructor() {

                private var kind: JsonField<Kind>? = null
                private var source: JsonField<Source>? = null
                private var assetId: JsonField<String> = JsonMissing.of()
                private var assetName: JsonField<String> = JsonMissing.of()
                private var launchMode: JsonField<LaunchMode> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(initialAsset: InitialAsset) = apply {
                    kind = initialAsset.kind
                    source = initialAsset.source
                    assetId = initialAsset.assetId
                    assetName = initialAsset.assetName
                    launchMode = initialAsset.launchMode
                    url = initialAsset.url
                    additionalProperties = initialAsset.additionalProperties.toMutableMap()
                }

                fun kind(kind: Kind) = kind(JsonField.of(kind))

                /**
                 * Sets [Builder.kind] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kind] with a well-typed [Kind] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

                fun source(source: Source) = source(JsonField.of(source))

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [Source] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<Source>) = apply { this.source = source }

                fun assetId(assetId: String) = assetId(JsonField.of(assetId))

                /**
                 * Sets [Builder.assetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetId(assetId: JsonField<String>) = apply { this.assetId = assetId }

                fun assetName(assetName: String) = assetName(JsonField.of(assetName))

                /**
                 * Sets [Builder.assetName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetName(assetName: JsonField<String>) = apply { this.assetName = assetName }

                /**
                 * Launch mode specifies how to launch the app after installation. If not given, the
                 * app won't be launched.
                 */
                fun launchMode(launchMode: LaunchMode) = launchMode(JsonField.of(launchMode))

                /**
                 * Sets [Builder.launchMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.launchMode] with a well-typed [LaunchMode] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun launchMode(launchMode: JsonField<LaunchMode>) = apply {
                    this.launchMode = launchMode
                }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [InitialAsset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .kind()
                 * .source()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InitialAsset =
                    InitialAsset(
                        checkRequired("kind", kind),
                        checkRequired("source", source),
                        assetId,
                        assetName,
                        launchMode,
                        url,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InitialAsset = apply {
                if (validated) {
                    return@apply
                }

                kind().validate()
                source().validate()
                assetId()
                assetName()
                launchMode().ifPresent { it.validate() }
                url()
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
                (kind.asKnown().getOrNull()?.validity() ?: 0) +
                    (source.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (assetId.asKnown().isPresent) 1 else 0) +
                    (if (assetName.asKnown().isPresent) 1 else 0) +
                    (launchMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            class Kind @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val APP = of("App")

                    @JvmStatic fun of(value: String) = Kind(JsonField.of(value))
                }

                /** An enum containing [Kind]'s known values. */
                enum class Known {
                    APP
                }

                /**
                 * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Kind] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APP,
                    /**
                     * An enum member indicating that [Kind] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        APP -> Value.APP
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        APP -> Known.APP
                        else -> throw LimrunInvalidDataException("Unknown Kind: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LimrunInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

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

            class Source @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val URL = of("URL")

                    @JvmField val ASSET_NAME = of("AssetName")

                    @JvmField val ASSET_ID = of("AssetID")

                    @JvmStatic fun of(value: String) = Source(JsonField.of(value))
                }

                /** An enum containing [Source]'s known values. */
                enum class Known {
                    URL,
                    ASSET_NAME,
                    ASSET_ID,
                }

                /**
                 * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Source] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    URL,
                    ASSET_NAME,
                    ASSET_ID,
                    /**
                     * An enum member indicating that [Source] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        URL -> Value.URL
                        ASSET_NAME -> Value.ASSET_NAME
                        ASSET_ID -> Value.ASSET_ID
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        URL -> Known.URL
                        ASSET_NAME -> Known.ASSET_NAME
                        ASSET_ID -> Known.ASSET_ID
                        else -> throw LimrunInvalidDataException("Unknown Source: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LimrunInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Source = apply {
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

                    return other is Source && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Launch mode specifies how to launch the app after installation. If not given, the app
             * won't be launched.
             */
            class LaunchMode
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FOREGROUND_IF_RUNNING = of("ForegroundIfRunning")

                    @JvmField val RELAUNCH_IF_RUNNING = of("RelaunchIfRunning")

                    @JvmField val FAIL_IF_RUNNING = of("FailIfRunning")

                    @JvmStatic fun of(value: String) = LaunchMode(JsonField.of(value))
                }

                /** An enum containing [LaunchMode]'s known values. */
                enum class Known {
                    FOREGROUND_IF_RUNNING,
                    RELAUNCH_IF_RUNNING,
                    FAIL_IF_RUNNING,
                }

                /**
                 * An enum containing [LaunchMode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [LaunchMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FOREGROUND_IF_RUNNING,
                    RELAUNCH_IF_RUNNING,
                    FAIL_IF_RUNNING,
                    /**
                     * An enum member indicating that [LaunchMode] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FOREGROUND_IF_RUNNING -> Value.FOREGROUND_IF_RUNNING
                        RELAUNCH_IF_RUNNING -> Value.RELAUNCH_IF_RUNNING
                        FAIL_IF_RUNNING -> Value.FAIL_IF_RUNNING
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FOREGROUND_IF_RUNNING -> Known.FOREGROUND_IF_RUNNING
                        RELAUNCH_IF_RUNNING -> Known.RELAUNCH_IF_RUNNING
                        FAIL_IF_RUNNING -> Known.FAIL_IF_RUNNING
                        else -> throw LimrunInvalidDataException("Unknown LaunchMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LimrunInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LimrunInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): LaunchMode = apply {
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

                    return other is LaunchMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InitialAsset &&
                    kind == other.kind &&
                    source == other.source &&
                    assetId == other.assetId &&
                    assetName == other.assetName &&
                    launchMode == other.launchMode &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    kind,
                    source,
                    assetId,
                    assetName,
                    launchMode,
                    url,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InitialAsset{kind=$kind, source=$source, assetId=$assetId, assetName=$assetName, launchMode=$launchMode, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Spec &&
                clues == other.clues &&
                hardTimeout == other.hardTimeout &&
                inactivityTimeout == other.inactivityTimeout &&
                initialAssets == other.initialAssets &&
                region == other.region &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                clues,
                hardTimeout,
                inactivityTimeout,
                initialAssets,
                region,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Spec{clues=$clues, hardTimeout=$hardTimeout, inactivityTimeout=$inactivityTimeout, initialAssets=$initialAssets, region=$region, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IosInstanceCreateParams &&
            wait == other.wait &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(wait, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IosInstanceCreateParams{wait=$wait, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
