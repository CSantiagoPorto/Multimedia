fun main(){

    println("Dime el primer número")
    var op1= readln().toDouble()
    println("Dime el segundo número")
    var op2 = readln().toDouble()
    println("Qué operación quieres realizar?")
    var eleccion= readln().toInt()
    while(eleccion!=1) {
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")
    }

}

fun sumar(op1:Double, op2:Double):Double{
    var resultado = op1+op2
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