package com.bpointer.userregdemowithoutdependencyapproach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Log.e(TAG,"Registering user with normal approach--->")
        val userRegistrationService = UserRegistrationService();
        */


        /**
         * To achive to manual dependency approach, we need to create
         * dependeny objects and pass to dependent object like below
         * using constructor inject approach
         */

        Log.e(TAG,"Registering user with manual dependency approach--->")
        val userRepository = UserRepository();
        val emailService = EmailService();

        val userRegistrationService = UserRegistrationService(userRepository, emailService)
        userRegistrationService.registerUser("abc@xyz.com","abc123")
    }


}