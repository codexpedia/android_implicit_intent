package com.app.implicit_intents

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val shareIntent = Intent(android.content.Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            val shareBody = "This is the body to be shared"
            shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject of the text")
            shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody)
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }

        button2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                    Uri.parse("content://contacts/people/"))
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                    Uri.parse("content://media/internal/images/media"))
            startActivity(intent)
        }

        button4.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
            startActivity(browserIntent)
        }

        button5.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_CALL)
            callIntent.data = Uri.parse("tel:0377778888")
            startActivity(callIntent)
        }
        button6.setOnClickListener {
            val i = Intent(applicationContext, NewActivity::class.java)
            i.putExtra("Name", "Kalpesh")
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)
        }
        button7.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:(+49)12345789"))
            startActivity(intent)
        }
    }

}

