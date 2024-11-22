package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity(),OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private var op1= 0
    private var op2=0
    private var resultado = 0
    private lateinit var operador:String

    override fun onCreate(savedInstanceState: Bundle?) {
        //savedInstanceState es una instancia del parámetro guardado
        super.onCreate(savedInstanceState)
        //Asocia lógico y gráfico
        binding=ActivityMainBinding.inflate(this.layoutInflater)//Activa al layout para poder usarlo
        setContentView(binding.root)
        //Lo gráfico tiene que ir siempre debajo de setContentView
        op1 =savedInstanceState?.getInt("op1") ?: 0
        op2= savedInstanceState?.getInt("op2")?:0
        operador = savedInstanceState?.getString("operador") ?: ""
        binding.textoInicio.text = savedInstanceState?.getString("textoInicio") ?: "0"
        //Esta últmima línea restaura el valor al girar la pantalla. Si tenía valor lo restaura y si no es 0

        binding.btn0.setOnClickListener(this)//this es un objeto de la clase MainActivity
        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)
        binding.btnBorrar.setOnClickListener(this)
        binding.btnSumar.setOnClickListener(this)
        binding.btnRestar.setOnClickListener(this)
        binding.btnMultiplicar.setOnClickListener(this)
        binding.btnDividir.setOnClickListener(this)
        binding.btnIgual.setOnClickListener(this)

        }



    override fun onSaveInstanceState(outState: Bundle) {//outState es el parámetro de info saliente, mediante unobjeto de tipo Bundle
        //Este método sirve para preservar las variables cuando se ejecuta el método destroy()
        //Gracias al él podemos mantener la información de las variables al girar pantalla
        super.onSaveInstanceState(outState)
        //Esto es una cajita donde guardamos las variables

        outState.putInt ("op1", op1)
        outState.putInt("op2",op2)
        outState.putString("operador", operador)
        outState.putString("textoInicio", binding.textoInicio.text.toString())
    }
    private fun añadirNumero(numero:String){
        if (binding.textoInicio.text.toString()=="0"){
            binding.textoInicio.text=numero
        }else {
            binding.textoInicio.text= "${binding.textoInicio.text}$numero"
            //Comprueba si el primer número es 0 y si lo es lo sustituye por el número
            //que he marcado. Hago esto porque el primer número que muestra la pantalla es 0
            //pero no quiero que cuando le añado números lo mantenga.
            //Es decir, quiero que ponga 35, no 035
        }
    }
    override fun onClick(v: View) {//v es quien provoca el evento
        when (v.id) {//Como hemos implementado la interfaz podemos usar el método onClick y ahorrar
            //líneas de código
            //Con R.id puedo acceder al botón del xml, y llamamos al método añadirNumero
            R.id.btn0 -> añadirNumero("0")
            R.id.btn1 -> añadirNumero("1")
            R.id.btn2 -> añadirNumero("2")
            R.id.btn3 -> añadirNumero("3")
            R.id.btn4 -> añadirNumero("4")
            R.id.btn5 -> añadirNumero("5")
            R.id.btn6 -> añadirNumero("6")
            R.id.btn7 -> añadirNumero("7")
            R.id.btn8 -> añadirNumero("8")
            R.id.btn9 -> añadirNumero("9")
            R.id.btnSeno -> {
                op1 = binding.textoInicio.text.toString().toIntOrNull() ?: 0
                resultado = kotlin.math.sin(Math.toRadians(op1.toDouble())).toInt()
                binding.textoInicio.text = resultado.toString()
            }
            R.id.btnCoseno -> {
                op1 = binding.textoInicio.text.toString().toIntOrNull() ?: 0
                resultado = kotlin.math.cos(Math.toRadians(op1.toDouble())).toInt()
                binding.textoInicio.text = resultado.toString()
            }
            R.id.btnTangente -> {

                val radianes = Math.toRadians(op1.toDouble())
                resultado = kotlin.math.tan(radianes).roundToInt() // Calcula y aproxima porque ya tenía toda la calculadora hecha en Int
                binding.textoInicio.text = resultado.toString() // Muestra el resultado aproximado

                operador =""
            }
            R.id.btnCuadrado -> {
                op1 = binding.textoInicio.text.toString().toInt()
                println("Valor de op1 antes de cuadrar: $op1")
                resultado = op1 * op1
                binding.textoInicio.text = resultado.toString()
                operador =""
            }

            R.id.btnSumar -> {
                op1 = binding.textoInicio.text.toString().toInt()
                operador = "+"//Necesito guardar el operador porque lo voy a necesitar en el when
                binding.textoInicio.text = ""
            }
            R.id.btnRestar -> {
                op1 = binding.textoInicio.text.toString().toInt()
                operador = "-"
                binding.textoInicio.text = ""
            }
            R.id.btnMultiplicar -> {
                op1 = binding.textoInicio.text.toString().toInt()
                operador = "x"
                binding.textoInicio.text = ""
            }
            R.id.btnDividir -> {
                op1 = binding.textoInicio.text.toString().toInt()
                operador = "÷"
                binding.textoInicio.text = ""
            }
            R.id.btnIgual -> {
                op2 = binding.textoInicio.text.toString().toIntOrNull() ?:0
                resultado = when (operador) {
                    "+" -> op1 + op2
                    "-" -> op1 - op2
                    "x" -> op1 * op2
                    "÷" -> if (op2 != 0) {op1 / op2
                            }else {
                                 binding.textoInicio.text = "0"
                        return
                    }

                    else -> 0// Si no se pulsa ninguno, volvemos a cero
                }
                binding.textoInicio.text = resultado.toString() //Guardamos el resultado como String
                operador =""
            }
            R.id.btnBorrar-> {
                op1 = 0
                op2=0
                resultado = 0
                operador = ""
                binding.textoInicio.text="0"
            }
        }
    }

}