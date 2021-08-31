package com.kromer.domain.usecases.base

interface UseCase<T, Params> {
    suspend fun call(params: Params): T
}