// File generated from our OpenAPI spec by Stainless.

package com.configure_me_limrun_v1.api.errors

import com.configure_me_limrun_v1.api.core.JsonValue
import com.configure_me_limrun_v1.api.core.http.Headers

abstract class LimrunServiceException
protected constructor(message: String, cause: Throwable? = null) : LimrunException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
