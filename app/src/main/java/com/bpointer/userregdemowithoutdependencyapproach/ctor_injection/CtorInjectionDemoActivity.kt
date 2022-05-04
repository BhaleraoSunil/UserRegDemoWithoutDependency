package com.bpointer.userregdemowithoutdependencyapproach.ctor_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bpointer.userregdemowithoutdependencyapproach.R

class CtorInjectionDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ctor_injection_demo)
        val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()

        userRegistrationService.registerUser("sunil@yopmail.com","1234")
    }
}