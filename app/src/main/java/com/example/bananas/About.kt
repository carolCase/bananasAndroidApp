package com.example.bananas

import android.media.MediaController2
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class About : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val videoView : VideoView = findViewById(R.id.video_about)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val onlineUri: Uri = Uri.parse("https://www.istockphoto.com/br/v%C3%ADdeo/banana-que-flutua-no-fundo-amarelo-conceito-m%C3%ADnimo-da-id%C3%A9ia-da-fruta-gm1159109296-316838010")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(onlineUri)
        videoView.requestFocus()
        videoView.start()






    }
}