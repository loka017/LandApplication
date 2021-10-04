package com.ateam.landapplication.datas

import android.icu.text.NumberFormat
import java.util.*



class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) {

    fun getFormattedPrice(): String {
        if (this.price >= 10000){
            val uk = this.price / 10000
            val rest = this.price % 10000
            return "${uk}억 ${java.text.NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
        }
        else {
            val rest = this.price
            return "${java.text.NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
        }
    }

    fun getFormattedFloor(): String {
        if (this.floor >= 1){
            return "${this.floor}층"
        }
        else if (this.floor == 0){
            return "반지하"
        }
        else{
            return "지하${-this.floor}층"
        }
    }
}