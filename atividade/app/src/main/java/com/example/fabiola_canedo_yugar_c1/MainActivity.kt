package com.example.fabiola_canedo_yugar_c1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(componente: View){
        val nomeExposto = et_nome.text
        val metaEscolhida = et_meta.text

        var valorMeta = et_valormeta.text.toString().toDouble()
        var valorGuardado = et_valorguardado.text.toString().toDouble()

        var guarda10 = 10
        var guarda20 = 20
        var guarda30 = 30


        if(valorGuardado <= (valorMeta/100)*guarda10){
            tv_resultado.setTextColor(Color.parseColor("#FF0000"))
            tv_resultado.text = "${nomeExposto}, vc guardou até 10% do valor necessário, demorará para atingir a meta ${metaEscolhida} :("

        } else if (valorGuardado <= (valorMeta/100)*guarda20){
            tv_resultado.setTextColor(Color.parseColor("#FFA500"))
            tv_resultado.text = "${nomeExposto}, você guardou até 20% do valor necessário, bom para atingir a sua meta ${metaEscolhida} :)"

        } else if( valorGuardado <= (valorMeta/100)*guarda30){
            tv_resultado.setTextColor(Color.parseColor("#0000FF"))
            tv_resultado.text = "${nomeExposto}, você guardou até 30% do valor necessário, ótimo para atingir a sua meta ${metaEscolhida} :D"
        } else {
            tv_resultado.setTextColor(Color.parseColor("#008000"))
            tv_resultado.text = "${nomeExposto}, parabéns ! vc conseguirá a sua meta ${metaEscolhida} em breve"
        }
    }
}