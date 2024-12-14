package com.example.dz15viewpager2tablayout

import android.media.Image
import java.io.Serializable

class Page(
    var name:String,
    var adress:String,
    var image: Int) : Serializable {


    companion object {
        val pages= mutableListOf(
            Page("Музыка", "https://musik.yandex.ru/", R.drawable.baseline_audiotrack_24),
            Page("Новости", "https://bcs.ru/", R.drawable.baseline_auto_stories_24),
            Page("Кино", "https://rutube.ru/", R.drawable.baseline_videocam_24),
            Page("Почта", "https://mail.ru/", R.drawable.baseline_email_24)
        )
    }
}
