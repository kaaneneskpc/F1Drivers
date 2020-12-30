package com.example.f1drivers

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data

        var drivers = ArrayList<String>()


        drivers.add("L.Hamilton - Mercedes")
        drivers.add("V.Bottas - Mercedes")
        drivers.add("M.Verstappen - RedBull")
        drivers.add("A.Albon - RedBull")
        drivers.add("S.Vettel - Ferrari")
        drivers.add("C.Leclerc - Ferrari")
        drivers.add("S.Perez - Racing Point")
        drivers.add("L.Stroll - Racing Point")
        drivers.add("D.Ricciardo - Renault")
        drivers.add("E.Ocon - Renault")
        drivers.add("C.Sainz - Mclaren")
        drivers.add("L.Norris - Mclaren")
        drivers.add("P.Gasly - Alpha Tauri")
        drivers.add("D.Kvyat - Alpha Tauri")
        drivers.add("K.Raikkonen - Alfa Romeo")
        drivers.add("A.Giovinazzi - Alfa Romeo")
        drivers.add("K.Magnussen - Haas")
        drivers.add("R.Grosjean - Haas")
        drivers.add("G.Russell - Williams")
        drivers.add("N.Latifi - Williams")
/*
        //Images

        val hamilton = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.hamilton)
        val bottas = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bottas)
        val seb = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.vettel)
        val leclerc = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.leclerc)
        val max = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.max)
        val albon = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.albon)
        val ric = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ric)
        val ocon = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ocon)
        val perez = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.perez)
        val stroll = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.stroll)
        val carlos = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.sainz)
        val norris = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.norris)
        val kimi = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.raikkonen)
        val gio = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.gio)
        val gasly = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.gasly)
        val kvyat = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kvyat)
        val kmag = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kmag)
        val grosjean = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.romain)
        val russell = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.russell)
        val latifi = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.latifi)

        var images=ArrayList<Bitmap>()
        images.add(hamilton)
        images.add(bottas)
        images.add(max)
        images.add(albon)
        images.add(seb)
        images.add(leclerc)
        images.add(perez)
        images.add(stroll)
        images.add(ric)
        images.add(ocon)
        images.add(carlos)
        images.add(norris)
        images.add(gasly)
        images.add(kvyat)
        images.add(kimi)
        images.add(gio)
        images.add(kmag)
        images.add(grosjean)
        images.add(russell)
        images.add(latifi)
*/
        //Image Efficient

        val ham = R.drawable.hamilton
        val bottas = R.drawable.bottas
        val seb = R.drawable.vettel
        val leclerc = R.drawable.leclerc
        val max = R.drawable.max
        val albon = R.drawable.albon
        val ric = R.drawable.ric
        val ocon = R.drawable.ocon
        val perez = R.drawable.perez
        val stroll = R.drawable.stroll
        val carlos = R.drawable.sainz
        val norris = R.drawable.norris
        val kimi = R.drawable.raikkonen
        val gio = R.drawable.gio
        val gasly = R.drawable.gasly
        val kvyat = R.drawable.kvyat
        val kmag = R.drawable.kmag
        val grosjean = R.drawable.romain
        val russell = R.drawable.russell
        val latifi = R.drawable.latifi


        var images = ArrayList<Int>()
        images.add(ham)
        images.add(bottas)
        images.add(max)
        images.add(albon)
        images.add(seb)
        images.add(leclerc)
        images.add(perez)
        images.add(stroll)
        images.add(ric)
        images.add(ocon)
        images.add(carlos)
        images.add(norris)
        images.add(gasly)
        images.add(kvyat)
        images.add(kimi)
        images.add(gio)
        images.add(kmag)
        images.add(grosjean)
        images.add(russell)
        images.add(latifi)




        //Adapter  Layout & data

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,drivers)
        listView.adapter = adapter


        //ListView Click

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(this@MainActivity,DetailsActivity::class.java)
            intent.putExtra("name",drivers[position])
            intent.putExtra("image",images[position])
            /*val singleton = Singleton.SelectedImage
            singleton.selectedImage = images[position]*/
            startActivity(intent)
        }



    }
}