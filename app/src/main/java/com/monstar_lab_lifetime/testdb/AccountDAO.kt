package com.monstar_lab_lifetime.testdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AccountDAO {
//    @Query("SELECT *FROM account WHERE mail=:mail  ")
//    fun getAllAccount(mail:String):Account?

    @Insert
    suspend fun insertAccount(accountDAO: Account)

//    @Query("SELECT * FROM account_new WHERE mail=:email")
//    fun getAccByEmail(email:String) : Account
}