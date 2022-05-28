package com.example.payment

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Kisiler(var kisi_cinsiyet:String? = "",var kisi_wakeuptime:Int?=0,var kisi_sleeptime:Int?=0) {
}