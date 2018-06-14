package com.naysayer.testmvvm.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.naysayer.testmvvm.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textinputlayout_login_email.error = "Example error"
        textinputlayout_login_password.error = "Example error"
    }
}
