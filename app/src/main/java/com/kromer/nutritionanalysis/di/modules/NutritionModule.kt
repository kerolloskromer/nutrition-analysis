package com.kromer.nutritionanalysis.di.modules

import com.kromer.data.repositories.NutritionRepositoryImpl
import com.kromer.data.sources.remote.NutritionApiInterface
import com.kromer.data.sources.remote.NutritionRemoteDataSource
import com.kromer.data.sources.remote.NutritionRemoteDataSourceImpl
import com.kromer.domain.repositories.NutritionRepository
import com.kromer.domain.usecases.GetNutritionDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NutritionModule {

    @Provides
    @Singleton
    fun provideNutritionApiInterface(retrofit: Retrofit): NutritionApiInterface =
        retrofit.create(NutritionApiInterface::class.java)

    @Provides
    @Singleton
    fun provideNutritionRemoteDataSource(
        apiInterface: NutritionApiInterface
    ): NutritionRemoteDataSource {
        return NutritionRemoteDataSourceImpl(
            apiInterface
        )
    }

    @Provides
    @Singleton
    fun provideNutritionRepository(
        remoteDataSource: NutritionRemoteDataSource,
    ): NutritionRepository {
        return NutritionRepositoryImpl(
            remoteDataSource
        )
    }

    @Provides
    @Singleton
    fun provideGetNutritionDataUseCase(
        repository: NutritionRepository
    ): GetNutritionDataUseCase {
        return GetNutritionDataUseCase(
            repository
        )
    }
}
