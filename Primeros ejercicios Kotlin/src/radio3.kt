fun main(){

        println("Dime el radio")
        var r: Double = readln().toDouble()
        var resultado = { radio: Double -> println("El resultado es ${Math.PI * radio * radio}") }
        resultado(r)

}