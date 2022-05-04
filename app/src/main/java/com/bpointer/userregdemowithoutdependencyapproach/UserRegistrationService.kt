package com.bpointer.userregdemowithoutdependencyapproach

/*Problems:
* 1. unit testing difficult due to hard dependencies
* 2. Single responsibility
* 3. Lifetime of these objects
* 4. Extensible
* */

/*class UserRegistrationService {
    *//*
    * hard dependencies @UserRepository, @EmailService
    * *//*
    val userRepository = UserRepository();
    val emailService = EmailService();

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password);
        emailService.send("sunil@gmail.com",email,"Welcome, thanks for registration.")
    }

}*/


/*
* To resolve above 4 problem we will use manual dependencies approach.
* So need to modify above class as below
* */

class UserRegistrationService(
    private val userRepository: UserRepository ,
    private val emailService: EmailService
) {


    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password);
        emailService.send("sunil@gmail.com",email,"Welcome, thanks for registration.")
    }

}