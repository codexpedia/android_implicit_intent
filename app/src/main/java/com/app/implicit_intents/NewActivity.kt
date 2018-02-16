package com.app.implicit_intents

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_new)

        val value = intent.extras.getString("Name")
        textView1.text = "Welcome " + value
    }

}
