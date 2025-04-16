package ntub.imd.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v: View, insets: WindowInsetsCompat ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // 為每個飲料按鈕新增點擊事件，回傳選擇的副餐
        findViewById<Button>(R.id.btn_drink1).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("side_dish", "飲料1") })
            finish()
        }
        findViewById<Button>(R.id.btn_drink2).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("side_dish", "飲料2") })
            finish()
        }
        findViewById<Button>(R.id.btn_drink3).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("side_dish", "飲料3") })
            finish()
        }
        findViewById<Button>(R.id.btn_drink4).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("side_dish", "飲料4") })
            finish()
        }
        findViewById<Button>(R.id.btn_drink5).setOnClickListener {
            setResult(RESULT_OK, Intent().apply { putExtra("side_dish", "飲料5") })
            finish()
        }
    }
}
