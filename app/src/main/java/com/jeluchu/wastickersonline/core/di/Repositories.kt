package com.jeluchu.wastickersonline.core.di

import com.jeluchu.wastickersonline.features.stickerlist.repository.StickersRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<StickersRepository> { StickersRepository.Network(get(), get()) }

}