// File generated from our OpenAPI spec by Stainless.

package com.limrun.api.errors

import com.limrun.api.core.JsonValue
import com.limrun.api.core.http.Headers

abstract class LimrunServiceException
protected constructor(message: String, cause: Throwable? = null) : LimrunException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
