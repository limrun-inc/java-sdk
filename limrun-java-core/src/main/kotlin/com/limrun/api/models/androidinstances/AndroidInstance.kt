// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.models.androidinstances

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
import com.limrun.api.core.toImmutable
import com.limrun.api.errors.LimrunInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AndroidInstance
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val metadata: JsonField<Metadata>,
    private val spec: JsonField<Spec>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("spec") @ExcludeMissing spec: JsonField<Spec> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(metadata, spec, status, mutableMapOf())

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spec(): Spec = spec.getRequired("spec")

    /**
     * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

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

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [AndroidInstance].
         *
         * The following fields are required:
         * ```java
         * .metadata()
         * .spec()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AndroidInstance]. */
    class Builder internal constructor() {

        private var metadata: JsonField<Metadata>? = null
        private var spec: JsonField<Spec>? = null
        private var status: JsonField<Status>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(androidInstance: AndroidInstance) = apply {
            metadata = androidInstance.metadata
            spec = androidInstance.spec
            status = androidInstance.status
            additionalProperties = androidInstance.additionalProperties.toMutableMap()
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun spec(spec: Spec) = spec(JsonField.of(spec))

        /**
         * Sets [Builder.spec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spec] with a well-typed [Spec] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spec(spec: JsonField<Spec>) = apply { this.spec = spec }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [AndroidInstance].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .metadata()
         * .spec()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AndroidInstance =
            AndroidInstance(
                checkRequired("metadata", metadata),
                checkRequired("spec", spec),
                checkRequired("status", status),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AndroidInstance = apply {
        if (validated) {
            return@apply
        }

        metadata().validate()
        spec().validate()
        status().validate()
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
        (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (spec.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val organizationId: JsonField<String>,
        private val displayName: JsonField<String>,
        private val labels: JsonField<Labels>,
        private val terminatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("organizationId")
            @ExcludeMissing
            organizationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("labels") @ExcludeMissing labels: JsonField<Labels> = JsonMissing.of(),
            @JsonProperty("terminatedAt")
            @ExcludeMissing
            terminatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, createdAt, organizationId, displayName, labels, terminatedAt, mutableMapOf())

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationId(): String = organizationId.getRequired("organizationId")

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
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun terminatedAt(): Optional<OffsetDateTime> = terminatedAt.getOptional("terminatedAt")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [organizationId].
         *
         * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organizationId")
        @ExcludeMissing
        fun _organizationId(): JsonField<String> = organizationId

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

        /**
         * Returns the raw JSON value of [terminatedAt].
         *
         * Unlike [terminatedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("terminatedAt")
        @ExcludeMissing
        fun _terminatedAt(): JsonField<OffsetDateTime> = terminatedAt

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
             * Returns a mutable builder for constructing an instance of [Metadata].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .organizationId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var organizationId: JsonField<String>? = null
            private var displayName: JsonField<String> = JsonMissing.of()
            private var labels: JsonField<Labels> = JsonMissing.of()
            private var terminatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                id = metadata.id
                createdAt = metadata.createdAt
                organizationId = metadata.organizationId
                displayName = metadata.displayName
                labels = metadata.labels
                terminatedAt = metadata.terminatedAt
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun organizationId(organizationId: String) =
                organizationId(JsonField.of(organizationId))

            /**
             * Sets [Builder.organizationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organizationId(organizationId: JsonField<String>) = apply {
                this.organizationId = organizationId
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

            fun terminatedAt(terminatedAt: OffsetDateTime) =
                terminatedAt(JsonField.of(terminatedAt))

            /**
             * Sets [Builder.terminatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.terminatedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun terminatedAt(terminatedAt: JsonField<OffsetDateTime>) = apply {
                this.terminatedAt = terminatedAt
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .organizationId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Metadata =
                Metadata(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("organizationId", organizationId),
                    displayName,
                    labels,
                    terminatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            organizationId()
            displayName()
            labels().ifPresent { it.validate() }
            terminatedAt()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (organizationId.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (labels.asKnown().getOrNull()?.validity() ?: 0) +
                (if (terminatedAt.asKnown().isPresent) 1 else 0)

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
                id == other.id &&
                createdAt == other.createdAt &&
                organizationId == other.organizationId &&
                displayName == other.displayName &&
                labels == other.labels &&
                terminatedAt == other.terminatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                organizationId,
                displayName,
                labels,
                terminatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{id=$id, createdAt=$createdAt, organizationId=$organizationId, displayName=$displayName, labels=$labels, terminatedAt=$terminatedAt, additionalProperties=$additionalProperties}"
    }

    class Spec
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val inactivityTimeout: JsonField<String>,
        private val region: JsonField<String>,
        private val hardTimeout: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("inactivityTimeout")
            @ExcludeMissing
            inactivityTimeout: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hardTimeout")
            @ExcludeMissing
            hardTimeout: JsonField<String> = JsonMissing.of(),
        ) : this(inactivityTimeout, region, hardTimeout, mutableMapOf())

        /**
         * After how many minutes of inactivity should the instance be terminated. Example values
         * 1m, 10m, 3h. Default is 3m. Providing "0" disables inactivity checks altogether.
         *
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inactivityTimeout(): String = inactivityTimeout.getRequired("inactivityTimeout")

        /**
         * The region where the instance will be created. If not given, will be decided based on
         * scheduling clues and availability.
         *
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * After how many minutes should the instance be terminated. Example values 1m, 10m, 3h.
         * Default is "0" which means no hard timeout.
         *
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hardTimeout(): Optional<String> = hardTimeout.getOptional("hardTimeout")

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
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [hardTimeout].
         *
         * Unlike [hardTimeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hardTimeout")
        @ExcludeMissing
        fun _hardTimeout(): JsonField<String> = hardTimeout

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
             * Returns a mutable builder for constructing an instance of [Spec].
             *
             * The following fields are required:
             * ```java
             * .inactivityTimeout()
             * .region()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Spec]. */
        class Builder internal constructor() {

            private var inactivityTimeout: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var hardTimeout: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spec: Spec) = apply {
                inactivityTimeout = spec.inactivityTimeout
                region = spec.region
                hardTimeout = spec.hardTimeout
                additionalProperties = spec.additionalProperties.toMutableMap()
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
             *
             * The following fields are required:
             * ```java
             * .inactivityTimeout()
             * .region()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Spec =
                Spec(
                    checkRequired("inactivityTimeout", inactivityTimeout),
                    checkRequired("region", region),
                    hardTimeout,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Spec = apply {
            if (validated) {
                return@apply
            }

            inactivityTimeout()
            region()
            hardTimeout()
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
            (if (inactivityTimeout.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (hardTimeout.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Spec &&
                inactivityTimeout == other.inactivityTimeout &&
                region == other.region &&
                hardTimeout == other.hardTimeout &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(inactivityTimeout, region, hardTimeout, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Spec{inactivityTimeout=$inactivityTimeout, region=$region, hardTimeout=$hardTimeout, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val state: JsonField<State>,
        private val adbWebSocketUrl: JsonField<String>,
        private val endpointWebSocketUrl: JsonField<String>,
        private val errorMessage: JsonField<String>,
        private val sandbox: JsonField<Sandbox>,
        private val targetHttpPortUrlPrefix: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            @JsonProperty("adbWebSocketUrl")
            @ExcludeMissing
            adbWebSocketUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endpointWebSocketUrl")
            @ExcludeMissing
            endpointWebSocketUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("errorMessage")
            @ExcludeMissing
            errorMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sandbox") @ExcludeMissing sandbox: JsonField<Sandbox> = JsonMissing.of(),
            @JsonProperty("targetHttpPortUrlPrefix")
            @ExcludeMissing
            targetHttpPortUrlPrefix: JsonField<String> = JsonMissing.of(),
        ) : this(
            token,
            state,
            adbWebSocketUrl,
            endpointWebSocketUrl,
            errorMessage,
            sandbox,
            targetHttpPortUrlPrefix,
            mutableMapOf(),
        )

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): State = state.getRequired("state")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun adbWebSocketUrl(): Optional<String> = adbWebSocketUrl.getOptional("adbWebSocketUrl")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endpointWebSocketUrl(): Optional<String> =
            endpointWebSocketUrl.getOptional("endpointWebSocketUrl")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sandbox(): Optional<Sandbox> = sandbox.getOptional("sandbox")

        /**
         * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetHttpPortUrlPrefix(): Optional<String> =
            targetHttpPortUrlPrefix.getOptional("targetHttpPortUrlPrefix")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        /**
         * Returns the raw JSON value of [adbWebSocketUrl].
         *
         * Unlike [adbWebSocketUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("adbWebSocketUrl")
        @ExcludeMissing
        fun _adbWebSocketUrl(): JsonField<String> = adbWebSocketUrl

        /**
         * Returns the raw JSON value of [endpointWebSocketUrl].
         *
         * Unlike [endpointWebSocketUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("endpointWebSocketUrl")
        @ExcludeMissing
        fun _endpointWebSocketUrl(): JsonField<String> = endpointWebSocketUrl

        /**
         * Returns the raw JSON value of [errorMessage].
         *
         * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("errorMessage")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        /**
         * Returns the raw JSON value of [sandbox].
         *
         * Unlike [sandbox], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sandbox") @ExcludeMissing fun _sandbox(): JsonField<Sandbox> = sandbox

        /**
         * Returns the raw JSON value of [targetHttpPortUrlPrefix].
         *
         * Unlike [targetHttpPortUrlPrefix], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("targetHttpPortUrlPrefix")
        @ExcludeMissing
        fun _targetHttpPortUrlPrefix(): JsonField<String> = targetHttpPortUrlPrefix

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
             * Returns a mutable builder for constructing an instance of [Status].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Status]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var state: JsonField<State>? = null
            private var adbWebSocketUrl: JsonField<String> = JsonMissing.of()
            private var endpointWebSocketUrl: JsonField<String> = JsonMissing.of()
            private var errorMessage: JsonField<String> = JsonMissing.of()
            private var sandbox: JsonField<Sandbox> = JsonMissing.of()
            private var targetHttpPortUrlPrefix: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(status: Status) = apply {
                token = status.token
                state = status.state
                adbWebSocketUrl = status.adbWebSocketUrl
                endpointWebSocketUrl = status.endpointWebSocketUrl
                errorMessage = status.errorMessage
                sandbox = status.sandbox
                targetHttpPortUrlPrefix = status.targetHttpPortUrlPrefix
                additionalProperties = status.additionalProperties.toMutableMap()
            }

            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            fun state(state: State) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [State] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

            fun adbWebSocketUrl(adbWebSocketUrl: String) =
                adbWebSocketUrl(JsonField.of(adbWebSocketUrl))

            /**
             * Sets [Builder.adbWebSocketUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adbWebSocketUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adbWebSocketUrl(adbWebSocketUrl: JsonField<String>) = apply {
                this.adbWebSocketUrl = adbWebSocketUrl
            }

            fun endpointWebSocketUrl(endpointWebSocketUrl: String) =
                endpointWebSocketUrl(JsonField.of(endpointWebSocketUrl))

            /**
             * Sets [Builder.endpointWebSocketUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endpointWebSocketUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endpointWebSocketUrl(endpointWebSocketUrl: JsonField<String>) = apply {
                this.endpointWebSocketUrl = endpointWebSocketUrl
            }

            fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

            /**
             * Sets [Builder.errorMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            fun sandbox(sandbox: Sandbox) = sandbox(JsonField.of(sandbox))

            /**
             * Sets [Builder.sandbox] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sandbox] with a well-typed [Sandbox] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sandbox(sandbox: JsonField<Sandbox>) = apply { this.sandbox = sandbox }

            fun targetHttpPortUrlPrefix(targetHttpPortUrlPrefix: String) =
                targetHttpPortUrlPrefix(JsonField.of(targetHttpPortUrlPrefix))

            /**
             * Sets [Builder.targetHttpPortUrlPrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetHttpPortUrlPrefix] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun targetHttpPortUrlPrefix(targetHttpPortUrlPrefix: JsonField<String>) = apply {
                this.targetHttpPortUrlPrefix = targetHttpPortUrlPrefix
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
             * Returns an immutable instance of [Status].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Status =
                Status(
                    checkRequired("token", token),
                    checkRequired("state", state),
                    adbWebSocketUrl,
                    endpointWebSocketUrl,
                    errorMessage,
                    sandbox,
                    targetHttpPortUrlPrefix,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            token()
            state().validate()
            adbWebSocketUrl()
            endpointWebSocketUrl()
            errorMessage()
            sandbox().ifPresent { it.validate() }
            targetHttpPortUrlPrefix()
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
            (if (token.asKnown().isPresent) 1 else 0) +
                (state.asKnown().getOrNull()?.validity() ?: 0) +
                (if (adbWebSocketUrl.asKnown().isPresent) 1 else 0) +
                (if (endpointWebSocketUrl.asKnown().isPresent) 1 else 0) +
                (if (errorMessage.asKnown().isPresent) 1 else 0) +
                (sandbox.asKnown().getOrNull()?.validity() ?: 0) +
                (if (targetHttpPortUrlPrefix.asKnown().isPresent) 1 else 0)

        class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val UNKNOWN = of("unknown")

                @JvmField val CREATING = of("creating")

                @JvmField val ASSIGNED = of("assigned")

                @JvmField val READY = of("ready")

                @JvmField val TERMINATED = of("terminated")

                @JvmStatic fun of(value: String) = State(JsonField.of(value))
            }

            /** An enum containing [State]'s known values. */
            enum class Known {
                UNKNOWN,
                CREATING,
                ASSIGNED,
                READY,
                TERMINATED,
            }

            /**
             * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [State] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UNKNOWN,
                CREATING,
                ASSIGNED,
                READY,
                TERMINATED,
                /**
                 * An enum member indicating that [State] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    UNKNOWN -> Value.UNKNOWN
                    CREATING -> Value.CREATING
                    ASSIGNED -> Value.ASSIGNED
                    READY -> Value.READY
                    TERMINATED -> Value.TERMINATED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LimrunInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    UNKNOWN -> Known.UNKNOWN
                    CREATING -> Known.CREATING
                    ASSIGNED -> Known.ASSIGNED
                    READY -> Known.READY
                    TERMINATED -> Known.TERMINATED
                    else -> throw LimrunInvalidDataException("Unknown State: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LimrunInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LimrunInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): State = apply {
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

                return other is State && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Sandbox
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val playwrightAndroid: JsonField<PlaywrightAndroid>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("playwrightAndroid")
                @ExcludeMissing
                playwrightAndroid: JsonField<PlaywrightAndroid> = JsonMissing.of()
            ) : this(playwrightAndroid, mutableMapOf())

            /**
             * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun playwrightAndroid(): Optional<PlaywrightAndroid> =
                playwrightAndroid.getOptional("playwrightAndroid")

            /**
             * Returns the raw JSON value of [playwrightAndroid].
             *
             * Unlike [playwrightAndroid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("playwrightAndroid")
            @ExcludeMissing
            fun _playwrightAndroid(): JsonField<PlaywrightAndroid> = playwrightAndroid

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

                /** Returns a mutable builder for constructing an instance of [Sandbox]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Sandbox]. */
            class Builder internal constructor() {

                private var playwrightAndroid: JsonField<PlaywrightAndroid> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sandbox: Sandbox) = apply {
                    playwrightAndroid = sandbox.playwrightAndroid
                    additionalProperties = sandbox.additionalProperties.toMutableMap()
                }

                fun playwrightAndroid(playwrightAndroid: PlaywrightAndroid) =
                    playwrightAndroid(JsonField.of(playwrightAndroid))

                /**
                 * Sets [Builder.playwrightAndroid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.playwrightAndroid] with a well-typed
                 * [PlaywrightAndroid] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun playwrightAndroid(playwrightAndroid: JsonField<PlaywrightAndroid>) = apply {
                    this.playwrightAndroid = playwrightAndroid
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
                 * Returns an immutable instance of [Sandbox].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Sandbox =
                    Sandbox(playwrightAndroid, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Sandbox = apply {
                if (validated) {
                    return@apply
                }

                playwrightAndroid().ifPresent { it.validate() }
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
                (playwrightAndroid.asKnown().getOrNull()?.validity() ?: 0)

            class PlaywrightAndroid
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val url: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of()
                ) : this(url, mutableMapOf())

                /**
                 * @throws LimrunInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun url(): Optional<String> = url.getOptional("url")

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
                     * Returns a mutable builder for constructing an instance of
                     * [PlaywrightAndroid].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PlaywrightAndroid]. */
                class Builder internal constructor() {

                    private var url: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(playwrightAndroid: PlaywrightAndroid) = apply {
                        url = playwrightAndroid.url
                        additionalProperties = playwrightAndroid.additionalProperties.toMutableMap()
                    }

                    fun url(url: String) = url(JsonField.of(url))

                    /**
                     * Sets [Builder.url] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.url] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [PlaywrightAndroid].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PlaywrightAndroid =
                        PlaywrightAndroid(url, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): PlaywrightAndroid = apply {
                    if (validated) {
                        return@apply
                    }

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
                @JvmSynthetic internal fun validity(): Int = (if (url.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PlaywrightAndroid &&
                        url == other.url &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(url, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PlaywrightAndroid{url=$url, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Sandbox &&
                    playwrightAndroid == other.playwrightAndroid &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(playwrightAndroid, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Sandbox{playwrightAndroid=$playwrightAndroid, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status &&
                token == other.token &&
                state == other.state &&
                adbWebSocketUrl == other.adbWebSocketUrl &&
                endpointWebSocketUrl == other.endpointWebSocketUrl &&
                errorMessage == other.errorMessage &&
                sandbox == other.sandbox &&
                targetHttpPortUrlPrefix == other.targetHttpPortUrlPrefix &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                state,
                adbWebSocketUrl,
                endpointWebSocketUrl,
                errorMessage,
                sandbox,
                targetHttpPortUrlPrefix,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Status{token=$token, state=$state, adbWebSocketUrl=$adbWebSocketUrl, endpointWebSocketUrl=$endpointWebSocketUrl, errorMessage=$errorMessage, sandbox=$sandbox, targetHttpPortUrlPrefix=$targetHttpPortUrlPrefix, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AndroidInstance &&
            metadata == other.metadata &&
            spec == other.spec &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(metadata, spec, status, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AndroidInstance{metadata=$metadata, spec=$spec, status=$status, additionalProperties=$additionalProperties}"
}
