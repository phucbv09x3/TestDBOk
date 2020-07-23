package com.monstar_lab_lifetime.testdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(),CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main
    private var mAccountDatabase: AccountDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAccountDatabase = AccountDatabase.getDatabase(this)
        bt_save.setOnClickListener {
            launch {
                mAccountDatabase?.accountDAO()?.insertAccount(Account(mail = ed_mail.text.toString(),pass = ed_pass.text.toString()))

            }

        }


    }



}