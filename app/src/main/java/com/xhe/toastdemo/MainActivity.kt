package com.xhe.toastdemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.xhe.ptoast.PToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1.setOnClickListener {
            PToast.makeText(this, tv1.text.toString())
                    .duration(PToast.Time.LENGTH_LONG) //持续时间
                    .gravity(PToast.Gravity.BOTTOM) //位置
                    .replace(false) //是否直接替换
                    .show()


        }

        tv2.setOnClickListener {

            PToast.makeText(this, tv2.text.toString())
                    .gravity(PToast.Gravity.TOP)
                    .replace(true)
                    .show()
        }

        tv3.setOnClickListener {
            //            PToast.makeText(this, tv3.text.toString()).replace(false).show()
            startActivity(Intent(this, SecondsActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("PToast", javaClass.simpleName + "-------onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("PToast", javaClass.simpleName + "-------onRestart")
    }

    override fun onPause() {
        Log.d("PToast", javaClass.simpleName + "-------onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("PToast", javaClass.simpleName + "-------onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("PToast", javaClass.simpleName + "-------onDestroy")
        super.onDestroy()
    }
}