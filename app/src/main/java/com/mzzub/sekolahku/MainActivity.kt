package com.mzzub.sekolahku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun menuJadwal(view: View) {}
    fun menuDataGuru(view: View) {}
    fun menuGaleri(view: View) {}
    fun menuBKK(view: View) {}
    fun menuJurusan(view: View) {}
    fun menuBerita(view: View) {}
    fun menuPPDB(view: View) {}
    fun menuTentang(view: View) {}
}
