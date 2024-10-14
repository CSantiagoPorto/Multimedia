fun main() {
    println("Dime el primer número")
    var op1= readln().toInt()
    println("Dime el segundo número")
    var op2= readln().toInt()

    fun calcular(op1: Int, op2:Int){
        if (op1 > op2) {
            println("$op1 es mayor")
        } else if (op1 < op2) {
            println("$op2 es mayor")
        }
    }

    calcular(op1,op2)
}