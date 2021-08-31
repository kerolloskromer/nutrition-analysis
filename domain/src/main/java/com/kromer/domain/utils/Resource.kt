package com.kromer.domain.utils

data class Resource<out T>(
    val status: Status,
    val data: T?,
    val message: String?,
    val validationError: ValidationError?
) {
    companion object {
        fun <T> success(data: T): Resource<T> =
            Resource(status = Status.SUCCESS, data = data, message = null, validationError = null)

        fun <T> error(message: String?, validationError: ValidationError?): Resource<T> =
            Resource(
                status = Status.ERROR,
                data = null,
                message = message,
                validationError = validationError
            )

        fun <T> loading(): Resource<T> =
            Resource(status = Status.LOADING, data = null, message = null, validationError = null)
    }
}