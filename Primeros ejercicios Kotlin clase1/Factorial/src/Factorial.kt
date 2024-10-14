fun factorial(numero:Int) :Int {
    var resultado=1 // El resultado de 0!=1
    for (i in 1..numero){
        //necesito: Que multiplique cada número por el que le proporciono
        resultado=resultado*i//Necesito que lo vaya multiplicando por cada "posición"
    }
    return resultado
}
fun main(){
    println("Dime el número")
    var numero= readln().toInt()
    println("El factorial de este número es ${factorial(numero)}")//llamo a la función y ya le paso el número
}