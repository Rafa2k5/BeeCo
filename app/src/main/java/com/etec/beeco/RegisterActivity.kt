package com.etec.beeco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    lateinit var campoNome: EditText
    lateinit var campoEmail: EditText
    lateinit var campoSenha: EditText
    lateinit var campoCPF: EditText
    lateinit var campoCelular: EditText

    lateinit var fields: Array<EditText>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        campoNome = findViewById(R.id.txtNome)
        campoEmail = findViewById(R.id.txtEmail)
        campoSenha = findViewById(R.id.txtSenha)
        campoCPF = findViewById(R.id.txtCPF)
        campoCelular = findViewById(R.id.txtCelular)

        fields = arrayOf(campoNome, campoEmail, campoSenha, campoCPF, campoCelular)
    }

    fun validar(): Boolean {
        var error = false

        for (field in fields) {
            field.error = null

            if (TextUtils.isEmpty(field.text.toString())) {
                field.error = resources.getString(R.string.msg_required_field)
                error = true
            }
        }

        return !error
    }
}
