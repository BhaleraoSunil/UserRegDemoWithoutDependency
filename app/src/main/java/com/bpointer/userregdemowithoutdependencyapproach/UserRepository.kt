package com.bpointer.userregdemowithoutdependencyapproach

import android.util.Log
import com.bpointer.userregdemowithoutdependencyapproach.ctor_injection.Utils.Companion.TAG

class UserRepository {

    fun saveUser(email:String,password:String){
        Log.e(TAG,"USer saved in db")
    }
}