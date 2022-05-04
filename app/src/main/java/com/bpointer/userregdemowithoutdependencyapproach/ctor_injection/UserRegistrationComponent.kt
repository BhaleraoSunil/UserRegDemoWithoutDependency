package com.bpointer.userregdemowithoutdependencyapproach.ctor_injection

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService():UserRegistrationService
    fun getEmailService():EmailService
}