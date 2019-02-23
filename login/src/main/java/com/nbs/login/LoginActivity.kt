package com.nbs.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nbs.myappbundle.BUNDLE_KEY

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val data = intent.getStringExtra(BUNDLE_KEY)
        Toast.makeText(this, data, Toast.LENGTH_LONG).show()
    }
}
