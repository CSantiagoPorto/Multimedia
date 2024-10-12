fun main(){
    // Utiliza la fórmula Área = π * radio^2.
   
    println("Dime el radio")
    var r: Double= readln().toDouble()
    println("El área es ${Math.PI*Math.pow(r,2.0)}")
}