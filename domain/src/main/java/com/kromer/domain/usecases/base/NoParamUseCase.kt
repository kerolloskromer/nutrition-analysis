package com.kromer.domain.usecases.base

interface NoParamUseCase<T> {
    fun call(): T
}