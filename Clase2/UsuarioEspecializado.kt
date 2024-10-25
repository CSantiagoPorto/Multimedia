import java.io.Serializable

class UsuarioEspecializado(nombre:String, apellido:String, var nSS:Int):Usuario(nombre, apellido),Serializable {
}

/*Para heredar (equivale al extends)-> NombreClase()
* Para implementar(equivale implements)-> NombreInterfaz
* Para que herede correctamente la clase tiene que tener obligatoriamente nombre y apellido como en el
* constructor primario, además debo pasárselo y añadirle atruibutos propios
* Todas las variables nuevas que queramos que sean de clase deben ir en la firma de la clase(var nSS:Int)
* Por defecto todas las clases de Kotlin son finales, hay que hacerlas explícitamente open para poder
* heredar. Hay que ir a la clase padre y hacerla open*/