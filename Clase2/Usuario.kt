open class Usuario(var nombre:String, var apellido: String){

    private var correo: String?=null
    private var telefono: Int? =null
    constructor(nombre:String, apellido:String, correo: String?):this (nombre, apellido){
        this.correo=correo

    }
    constructor(nombre:String, apellido:String, telefono: Int?):this (nombre, apellido){
        this.telefono=telefono

    }
    /*
* Al tener 3 constructores puedo tener usuario sólo con nombre y apellido, con nombre, apellido y correo
* o con nombre, apellido y teléfono
* Puedo añadir un constructor que lo aúne todo*/
    constructor(nombre:String, apellido:String, correo:String?=null, telefono:Int?=null):this(nombre, apellido){
        this.correo=correo
        this.telefono=telefono
    }
    fun getTelefono():Int?{
        return telefono
    }

    fun setTelefono(telefono:Int?){
        this.telefono=telefono
    }
    fun getCorreo():String?{
        return correo
    }
    fun setCorreo(correo: String?){
        this.correo=correo
    }
    /*Los getter y los setter hay que hacerlos explícitos al ser private*/
    //Podemos hacer métodos y para que sean sobreescribibles tienen que ser open:
    open fun mostrarDatos(){
        println(nombre)
        println(apellido)
        println(correo)
        println(telefono)
    }

}
