package com.example.projeto_aniplay.View

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.projeto_aniplay.R
import com.example.projeto_aniplay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)


        bind.img1c1.setOnClickListener {
            var a = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=mA6F13WsZhc&list=PLA3YCbTyL4Ws6D7s9BpU8XMXBqofufDQc")
            )
        }

        bind.img2c1.setOnClickListener {
            var b =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YKSNBIlM_bY"))
        }

        bind.img3c1.setOnClickListener {
            var c =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=idlLFNNpZiI"))
        }

        bind.img4c1.setOnClickListener {
            var d =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=QVL1n8MAJWo"))
        }

        bind.img1c2.setOnClickListener {
            var e =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=a2GujJZfXpg"))
        }

        bind.img2c2.setOnClickListener {
            var f =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=y8ax2FIa_cM"))
        }

        bind.img3c2.setOnClickListener {
            var g =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ZzCh5cI9ylY"))
        }

        bind.img4c2.setOnClickListener {
            var h =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JOGp2c7-cKc"))
        }

        bind.img1c3.setOnClickListener {
            var i =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=t6MXHczeEqc"))
        }

        bind.img2c3.setOnClickListener {
            var j =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1aZG66zITIA"))
        }

        bind.img3c3.setOnClickListener {
            var k =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RNwNA1M8A94"))
        }

        bind.img4c3.setOnClickListener {
            var l =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RNwNA1M8A94"))
        }

        bind.img1c4.setOnClickListener {
            var m =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RNwNA1M8A94"))
        }

        bind.img2c4.setOnClickListener {
            var n =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RNwNA1M8A94"))
        }

        bind.img3c4.setOnClickListener {
            var o =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RNwNA1M8A94"))
        }

        bind.img4c4.setOnClickListener {
            var p =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RNwNA1M8A94"))
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.itemsair -> {
                finish()
            }//fimsair
        }//fimwhen
        return super.onOptionsItemSelected(item)
    }//fimoverride
}
