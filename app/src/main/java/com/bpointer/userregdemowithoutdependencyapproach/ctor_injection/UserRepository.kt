package com.bpointer.userregdemowithoutdependencyapproach.ctor_injection

import android.util.Log
import com.bpointer.userregdemowithoutdependencyapproach.ctor_injection.Utils.Companion.TAG
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email:String,password:String){
        Log.e(TAG,"USer saved in db")
    }
}