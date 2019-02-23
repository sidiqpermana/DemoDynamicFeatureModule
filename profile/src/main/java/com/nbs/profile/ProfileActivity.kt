package com.nbs.profile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = intent.data.lastPathSegment
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }
}
