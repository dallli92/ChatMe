package com.dalilandoulsi.chatme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CreateUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatarClicked(view: View) {}
    fun generateBackgroundColorClicked(view: View) {}
    fun createUserClicked(view: View) {}
}
