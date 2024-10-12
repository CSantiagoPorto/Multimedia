fun main(){

    println("Dime el primer número")
    var op1= readln().toDouble()
    println("Dime el segundo número")
    var op2 = readln().toDouble()
    println("Qué operación quieres realizar?")
    var eleccion= readln().toInt()
    do {
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")

    when (eleccion) {// Estructura de control equivalente al switch
        1 -> println("El resultado es: ${sumar(op1, op2)}")
        2 -> println("El resultado es: ${restar(op1, op2)}")
        3 -> println("El resultado es: ${multiplicar(op1, op2)}")
        4 -> {
            if (op2 != 0.0) {//Hay que evitar que divida por 0 o peta
                println("El resultado es: ${dividir(op1, op2)}")
            } else {
                println("No se puede dividir por cero")
            }
        }
        5 -> println("Saliendo del programa...")
        else -> println("Opción no válida, por favor elige una opción del menú.")
    }
}while(eleccion!=5)

fun sumar(op1:Double, op2:Double):Double{
    var resultado = op1+op2
    println("El resultado es $resultado")
    return resultado
}
fun restar(op1:Double, op2:Double):Double{
    var resultado= op1-op2
    return resultado
}
fun multiplicar(op1:Double, op2:Double):Double{
    var resultado= op1*op2
    return resultado
}
fun dividir(op1:Double, op2:Double):Double {
    var resultado = op1 / op2
    return resultado
}