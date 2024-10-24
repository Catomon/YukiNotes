package com.github.catomon.yukinotes.di

import com.github.catomon.yukinotes.createDatabase
import com.github.catomon.yukinotes.data.repository.YukiRepository
import com.github.catomon.yukinotes.data.repository.YukiRepositoryImpl
import com.github.catomon.yukinotes.feature.YukiViewModel
import org.koin.dsl.module

val appModule = module {
    single<YukiRepository> { YukiRepositoryImpl(createDatabase().noteDao()) }
    factory { YukiViewModel(get()) }
}