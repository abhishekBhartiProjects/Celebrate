package io.github.abhishekbhartiprojects.celebrate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var allItem: MutableList<Any> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        initViews()
    }

    private fun initData(){
        for (i in 1..20){
            allItem.add(i)
        }
    }

    private fun initViews(){

    }
}
