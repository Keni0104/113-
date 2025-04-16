package ntub.imd.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        // 為各披薩按鈕新增點擊事件處理並回傳主餐選擇
        findViewById<Button>(R.id.btn_pizza1).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("main_dish", "瑪格麗特披薩") })
            finish()
        }
        findViewById<Button>(R.id.btn_pizza2).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("main_dish", "夏威夷披薩") })
            finish()
        }
        findViewById<Button>(R.id.btn_pizza3).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("main_dish", "四季披薩") })
            finish()
        }
        findViewById<Button>(R.id.btn_pizza4).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("main_dish", "義式香腸披薩") })
            finish()
        }
        findViewById<Button>(R.id.btn_pizza5).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("main_dish", "海鮮披薩") })
            finish()
        }
    }
}

