fun main(args:Array<String>){

    println("Mis primeras líneas en Kotlin")
    var nombre = "Carla"
    var apellido : String?=null//RECUERDA: null es un tipo, por tanto si puede ser null usa ?
    println("Mi nombre es $nombre y mi apellido ${apellido?:"está sin definir"}")
    sumar(2,3)
    println("El resultado de doblar es ${doblar(op=7)}")
    println("El resultado de incrementar es ${incremento(9)}")
    dividir(10,5)//Esto es una variable
    println("Dime tu nombre")
    var name= readln()
    println("Dime tu edad")
    var edad: Int?= readln().toInt()
}
fun sumar(op1: Int, op2: Int){
    println("El resultado de la operación es ${op1+op2}")
}
fun doblar(op: Int):Int{
    return op*2
}
fun incremento (op:Int):Int{
    return op?.inc() ?:0
}
val dividir = {op1:Int, op2:Int ->
    println("El resultado es ${op1/op2}")
}