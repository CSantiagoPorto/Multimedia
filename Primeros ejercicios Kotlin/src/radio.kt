fun main() {
    class Circulo{//Creo un método que me calcule
        fun calcularArea(radio:Double){
            var area=Math.PI*radio*radio
            println("El área de este círculo es $area")
        }
    }
    var circulo=Circulo()//Instancio para poder usar los métodos
    println("Dime el radio")
    var radio:Double= readln().toDouble()//parseo porque sólo lee Strings

    circulo.calcularArea(radio)//llamo al método y le paso el radio por parámetro
}
