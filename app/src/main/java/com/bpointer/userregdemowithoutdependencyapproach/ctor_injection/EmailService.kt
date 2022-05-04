package com.bpointer.userregdemowithoutdependencyapproach.ctor_injection

import android.util.Log
import com.bpointer.userregdemowithoutdependencyapproach.ctor_injection.Utils.Companion.TAG
import javax.inject.Inject

class EmailService @Inject constructor(){

    fun send(from:String,to:String,emailBody:String){
        Log.e(TAG,"Email sent")
    }
}