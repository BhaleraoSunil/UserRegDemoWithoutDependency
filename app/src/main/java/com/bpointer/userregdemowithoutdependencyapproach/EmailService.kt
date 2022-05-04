package com.bpointer.userregdemowithoutdependencyapproach

import android.util.Log

class EmailService {
    val TAG = "UserRepository"
    fun send(from:String,to:String,emailBody:String){
        Log.e(TAG,"Email sent")
    }
}