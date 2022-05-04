package com.bpointer.userregdemowithoutdependencyapproach.fieldinjection

import dagger.Component

@Component
interface UserRegistrationComponent2 {

    //removeing multiple dependencies objects
    //fun getUserRegistrationService():UserRegistrationService
   // fun getEmailService():EmailService


    fun inject(activity: FieldInjectionDemoActivity)
}