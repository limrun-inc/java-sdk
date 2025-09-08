@file:JvmName("StringHandler")

package com.limrun.api.core.handlers

import com.limrun.api.core.http.HttpResponse
import com.limrun.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
