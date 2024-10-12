fun main(){
    fun esPrimo(n:Int) :Boolean {
        if (n <= 1) {
            return false
        }
        for (i in 2..n-1) {//Para saber si un número es primo debemos dividirlo por todos los números
        if (n % i == 0) {//hasta su raíz cuadrada, si hasta ahí no había un divisor que arrojase resto cero, ya no lo habrá
            return false
        }// Existe la posibilidad de usar until for (i in 2 until n)  que itera ya hasta n-1

    }
        return true
    }
    println("Dime el número")
    var numero = readln().toInt()
    var num = esPrimo(numero)
    if(num==true){
        println("$numero Es primo")
    }else{
        println("$numero no es primo")
    }


}