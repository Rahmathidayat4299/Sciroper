package com.binar.sciroper.util

import com.binar.sciroper.R

object AvatarHelper {

    fun provideList(): List<Int>{
        return listOf(
            avatarId1,
            avatarId2,
            avatarId3,
            avatarId4
        )
    }

    const val avatarId1 = R.drawable.avatar1
    const val avatarId2 = R.drawable.avatar2
    const val avatarId3 = R.drawable.avatar3
    const val avatarId4 = R.drawable.avatar4

}