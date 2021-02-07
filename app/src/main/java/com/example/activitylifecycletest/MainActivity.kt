package com.example.activitylifecycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null){
            var data = savedInstanceState.getString("data_key")
            Log.d("linxiaohong",data)
        }

        var button1 = findViewById<Button>(R.id.start_dialog_activity)
        button1.setOnClickListener(){
            intent = Intent(this,DialogActivity::class.java)
            startActivity(intent)
        }

        var button2 = findViewById<Button>(R.id.start_normal_activity)
        button2.setOnClickListener(){
            var intent1 = Intent(this,NormalActivity::class.java)
            startActivity(intent1)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        var data = "you just typed"
        outState.putString("data_key",data)
    }

    override fun onStart() {
        super.onStart()
        Log.d("linxiaohong","onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("linxiaohong","onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.d("linxiaohong","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("linxiaohong","onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("linxiaohong","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("linxiaohong","onDestroy")
    }
}
