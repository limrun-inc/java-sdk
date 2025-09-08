@file:JvmName("EmptyHandler")

package com.configure_me_limrun_v1.api.core.handlers

import com.configure_me_limrun_v1.api.core.http.HttpResponse
import com.configure_me_limrun_v1.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
