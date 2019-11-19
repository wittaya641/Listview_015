package com.example.listview_015

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("กรรไกร","ครีม","ประแจ","ค้อน","แม่แรง","ลูกบล็อก",
                            "บล็อกลม","ลวดเชื่อม","ไขควง","ครีมล็อก")

    val priceArr = arrayOf("50 บาท","150 บาท","175 บาท",
        "250 บาท","2000 บาท","75 บาท","2500 บาท","200 บาท","50 บาท","250 บาท")

    val context = this

    public final val KEY_TITLE = "TITLE"
    public final val KEY_RESULT = "RESULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("เครื่องมือช่าง")

        val mAdp = ArrayAdapter(context,
            android.R.layout.simple_list_item_1,
            titleArr)

        lv_result.adapter = mAdp

        lv_result.setOnItemClickListener { parent, view, position, id ->

            //            Toast.makeText(context,
//                " ชื่ออาหาร  ${titleArr[position]} ราคา ${priceArr[position]} บาท"
//                ,Toast.LENGTH_LONG).show()
            val goPageResult = Intent(context,Ppgg::class.java)

            goPageResult.putExtra(KEY_TITLE,titleArr[position])
            goPageResult.putExtra(KEY_RESULT,priceArr[position])

            startActivity(goPageResult)


        }
    }
}