package com.mzzub.sekolahku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var jadwal:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun menuJadwal(view: View) {
        jadwal = findViewById(R.id.idMenuJadwal)
        val intent = Intent(this, JadwalActivity::class.java)
        startActivity(intent)
    }
    fun menuDataGuru(view: View) {}
    fun menuGaleri(view: View) {}
    fun menuBKK(view: View) {}
    fun menuJurusan(view: View) {}
    fun menuBerita(view: View) {}
    fun menuPPDB(view: View) {}
    fun menuTentang(view: View) {}
}
