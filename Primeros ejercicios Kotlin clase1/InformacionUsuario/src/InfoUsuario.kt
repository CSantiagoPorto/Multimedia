fun main(){
    println("Dime tu nombre")
    var nombre= readln()

    var apellidos:String?//Puede ser String o null
    do{
        println("Dime tus apellidos")
        apellidos= readln()
        if(apellidos.isNullOrEmpty()){
            println("lo siento, necesito un apellido")
        }
    }while(apellidos.isNullOrEmpty())
    println("Dime tu edad")
    var edad:Int? = readln().toIntOrNull()?:18// He declarado edad como Int pero le digo que puede ser nulo
    // Lo parseo a Int/null y le digo que si es null haga lo que le dice el Elvis
    var dni:String?
    do{
    println("Dime tu dni")
    dni= readln()
      if(dni.isNullOrEmpty()|| dni.length!=9){
          println("Es dni no es válido")
      }
    } while(dni.isNullOrEmpty()|| dni.length!=9)

    println("Tu nombre $nombre $apellidos, tienes $edad años y tu dni es $dni")
}