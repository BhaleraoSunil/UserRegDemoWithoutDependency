package com.bpointer.userregdemowithoutdependencyapproach.fieldinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bpointer.userregdemowithoutdependencyapproach.R
import javax.inject.Inject

class FieldInjectionDemoActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_field_injection_demo)

        val component2 = DaggerUserRegistrationComponent2.builder().build()
        component2.inject(this)
        userRegistrationService.registerUser("sunil@yopmail.com","1234")

    }
}