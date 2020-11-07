

fun main() {

    var lista = listOf(Gato(2), Perro(20), Persona(89),Gato(3), Perro(15), Persona(79),Gato(3), Perro(25), Persona(99))


    // Haz un ejercicio como output tenga:
    // El peso medio de los gatos es:
    // El peso medio de los perros es:
    // El peso medio de las personas es:



    var contadorPerro = 0
    var pesoPerro = 0

    var contadorGato = 0
    var pesoGato = 0

    var contadorPersona = 0
    var pesoPersona = 0


    //Bucle para recorrer la Lista
    lista.forEach {

        when(it){

            is Perro -> {
                contadorPerro++
                pesoPerro += it.peso
            }

            is Gato -> {
                contadorGato++
                pesoGato += it.peso
            }

            is Persona -> {
                contadorPersona++
                pesoPersona += it.peso
            }
        }
    }
    // es importante seguir el orden peso / contador
    println("El peso medio de los gatos es:${pesoGato/contadorGato}")
    println("El peso medio de los perros es:${pesoPerro/contadorPerro}")
    println("El peso medio de las personas es:${pesoPersona/contadorPersona}")









}