fun main(){
    /*
    * Hay dos tipos de constructores en kotlin, primarios y secundarios
    * PRIMARIOS->
    *           Se ponen en la firma OBLIGATORIAMENTE.
    *           Todos los demás constructores se basan en él
    * class Usuario(var nombre:String, var apellido: String){}
    * De esta manera todos los usuarios que cree tendrán OBLIGATORIAMENTE nombre y apellido
    *
    * SECUNDARIOS->
    *               Se crean con la palabra constructor
    *               Aquí van todas las variables que quiera ponerle pero siempre debe incluir las del
    *               constructor primario
    * constructor(nombre:String, apellido:String, correo String):this(nombre, apellido){
    * this.correo=correo}
    *
    * En este ejemplo debemos fijarnos en varias cosas:
    * 1- no tiene sentido declarar la variable correo en el constructor, porque algunos usuarios lo tendrán y
    * otros no.
    * 2- Para que correo sea una variable de clase debemos declararla antes de la siguiente manera:
    *       private var correo: String? null y usamos this.correo para pasarsela al constructor
    *       Debemos inicializarla a null o bien a lateinit */

    var usuario= Usuario("Carla", "Santiago","lololo@gmail.com")
    var usuario2=Usuario("Pepe", "Perez",123)
    var usuario3=Usuario("Lolo", "Lopez", "lolilopi@gmail.com",123)
    var usuarioEspecializado=UsuarioEspecializado("María","Martinez",123)
    usuarioEspecializado.mostrarDatos()/*Muestra Nombre, apellido y nSS y da como nulo el correo y el tel*/
}
