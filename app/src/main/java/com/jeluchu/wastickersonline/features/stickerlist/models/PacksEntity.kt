package com.jeluchu.wastickersonline.features.stickerlist.models

import com.google.gson.annotations.SerializedName

data class PacksEntity(
    @SerializedName("sticker_packs")
    val stickerPacks: List<StickerPackEntity>
)