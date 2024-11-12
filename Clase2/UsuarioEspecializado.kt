import java.io.Serializable

class UsuarioEspecializado(nombre:String, apellido:String, var nSS:Int):Usuario(nombre, apellido),Serializable {

    override fun mostrarDatos() {//Sobreescritura desde la clase Usuario
        super.mostrarDatos()//Esto es lo que hace el método original y puedo añadir abajo
        println(nSS)
        //Con este método va a coger las funcionalidades del constructor primario(nombre y apellido) y nSS.
        //Correo y tel no lo coge porque están en un constructor secundario
    }


}

/*Para heredar (equivale al extends)-> NombreClase()
* Para implementar(equivale implements)-> NombreInterfaz
* Para que herede correctamente la clase tiene que tener obligatoriamente nombre y apellido como en el
* constructor primario, además debo pasárselo y añadirle atruibutos propios
* Todas las variables nuevas que queramos que sean de clase deben ir en la firma de la clase(var nSS:Int)
* Por defecto todas las clases de Kotlin son finales, hay que hacerlas explícitamente open para poder
* heredar. Hay que ir a la clase padre y hacerla open*/