@file:JvmName("EmptyHandler")

package com.limrun.api.core.handlers

import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
