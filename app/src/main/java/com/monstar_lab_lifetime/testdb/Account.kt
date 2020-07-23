package com.monstar_lab_lifetime.testdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "account_new")
data class Account (
    @PrimaryKey(autoGenerate = true) val id:Int=0,
    @ColumnInfo(name = "mail") val mail:String,
    @ColumnInfo(name = "pass") val pass:String
)