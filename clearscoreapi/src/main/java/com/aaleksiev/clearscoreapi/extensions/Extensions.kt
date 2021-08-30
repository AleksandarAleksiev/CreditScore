package com.aaleksiev.clearscoreapi.extensions

inline fun <T, R> T.runCatchingWithLoading(block: () -> R, loading: (Boolean) -> Unit): Result<R> {
    return try {
        loading(true)
        Result.success(block())
    } catch (e: Throwable) {
        Result.failure(e)
    } finally {
        loading(false)
    }
}