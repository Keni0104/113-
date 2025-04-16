package ntub.imd.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // 新增類級屬性
    private lateinit var tvMainDish: TextView
    private lateinit var tvSideDish: TextView

    // 請求代碼
    private val MAIN_DISH_REQUEST = 100
    private val SIDE_DISH_REQUEST = 200

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 設定 activity_main 版面
        setContentView(R.layout.activity_main)

        // 初始化 TextView
        tvMainDish = findViewById(R.id.tv_main_dish)
        tvSideDish = findViewById(R.id.tv_side_dish)
        
        // 按鈕
        val btnMainDish = findViewById<Button>(R.id.btn_main_dish)
        val btnSideDish = findViewById<Button>(R.id.btn_side_dish)
        val btnStoreInfo = findViewById<Button>(R.id.btn_store_info)

        btnMainDish.setOnClickListener {
            // 導向主餐選單畫面，要求回傳結果
            val intent = Intent(this, MainActivity3::class.java)
            startActivityForResult(intent, MAIN_DISH_REQUEST)
        }

        btnSideDish.setOnClickListener {
            // 導向副餐（飲料）選單畫面，要求回傳結果
            val intent = Intent(this, MainActivity4::class.java)
            startActivityForResult(intent, SIDE_DISH_REQUEST)
        }

        btnStoreInfo.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("店家訊息")
                .setMessage("地址：台北市中正區信義路100號\n電話：02-98765432")
                .setPositiveButton("OK", null)
                .show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && data != null) {
            when (requestCode) {
                MAIN_DISH_REQUEST -> {
                    val mainDish = data.getStringExtra("main_dish")
                    tvMainDish.text = "主餐：$mainDish"
                }
                SIDE_DISH_REQUEST -> {
                    val sideDish = data.getStringExtra("side_dish")
                    tvSideDish.text = "副餐：$sideDish"
                }
            }
        }
    }
}
