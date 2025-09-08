package com.limrun.api.errors

class LimrunInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LimrunException(message, cause)
