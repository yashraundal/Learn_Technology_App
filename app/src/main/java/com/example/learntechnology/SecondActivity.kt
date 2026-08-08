package com.example.learntechnology

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.card.MaterialCardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<MaterialCardView>(R.id.cardAndroid).setOnClickListener {
            startActivity(Intent(this, AndroidActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardKotlin).setOnClickListener {
            startActivity(Intent(this, KotlinActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardJava).setOnClickListener {
            startActivity(Intent(this, JavaActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardXml).setOnClickListener {
            startActivity(Intent(this, XmlActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardCompose).setOnClickListener {
            startActivity(Intent(this, ComposeActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardFirebase).setOnClickListener {
            startActivity(Intent(this, FirebaseActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardGitHub).setOnClickListener {
            startActivity(Intent(this, GithubActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardRestApi).setOnClickListener {
            startActivity(Intent(this, RestApiActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardRetrofit).setOnClickListener {
            startActivity(Intent(this, RetrofitActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardRoom).setOnClickListener {
            startActivity(Intent(this, RoomActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardSqlite).setOnClickListener {
            startActivity(Intent(this, SqliteActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardMaterial).setOnClickListener {
            startActivity(Intent(this, MaterialActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardUiUx).setOnClickListener {
            startActivity(Intent(this, UiUxActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardWebRtc).setOnClickListener {
            startActivity(Intent(this, WebRtcActivity::class.java))
        }
        findViewById<MaterialCardView>(R.id.cardJson).setOnClickListener {
            startActivity(Intent(this, JsonActivity::class.java))
        }
    }
}