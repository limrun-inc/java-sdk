package com.configure_me_limrun_v1.api.errors

open class LimrunException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
