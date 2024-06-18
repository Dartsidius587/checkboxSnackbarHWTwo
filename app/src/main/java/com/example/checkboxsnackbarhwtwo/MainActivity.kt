package com.example.checkboxsnackbarhwtwo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var toolBarMain: androidx.appcompat.widget.Toolbar

    private lateinit var viewPDDTV: TextView
    private lateinit var pointPDDTV: TextView

    private lateinit var checkBoxCB: CheckBox




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        init()
        checkBoxCB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                viewPDDTV.text = "Правила дорожного движения"
                viewPDDTV.textSize = 12F
                pointPDDTV.text = "1.3. Участники дорожного движения обязаны знать и соблюдать относящиеся " +
                        "к ним требования Правил, сигналов светофоров, знаков и разметки, а также выполнять " +
                        "распоряжения регулировщиков, действующих в пределах предоставленных им прав и " +
                        "регулирующих дорожное движение установленными сигналами.\n" +
                        "1.4. На дорогах установлено правостороннее движение транспортных средств.\n" +
                        "1.5. Участники дорожного движения должны действовать таким образом, " +
                        "чтобы не создавать опасности для движения и не причинять вреда.\n" +
                        "Запрещается повреждать или загрязнять покрытие дорог, снимать, " +
                        "загораживать, повреждать, самовольно устанавливать дорожные знаки, " +
                        "светофоры и другие технические средства организации движения, " +
                        "оставлять на дороге предметы, создающие помехи для движения. " +
                        "Лицо, создавшее помеху, обязано принять все возможные меры для ее устранения, " +
                        "а если это невозможно, то доступными средствами обеспечить информирование " +
                        "участников движения об опасности и сообщить в полицию."
            } else {
                viewPDDTV.text = "Информация"
                viewPDDTV.textSize = 24F
                pointPDDTV.text = ""
            }
        }

    }

    private fun init(){
        setContentView(R.layout.activity_main)
        toolBarMain = findViewById(R.id.toolBarMain)
        setSupportActionBar(toolBarMain)
        title = "Правила дорожного движения"
        viewPDDTV = findViewById(R.id.viewPDDTV)
        pointPDDTV = findViewById(R.id.pointPDDTV)
        checkBoxCB = findViewById(R.id.checkBoxCB)
    }

}