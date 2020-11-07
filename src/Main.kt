

fun main() {

    var lista = listOf(Gato(2), Perro(20), Persona(89),Gato(3), Perro(15), Persona(79),Gato(3), Perro(25), Persona(99))


    // Haz un ejercicio como output tenga:

    var contadorPerro = 0
    var contadorGato = 0
    var contador = 0
    var mediaGato = 0
    var mediaPerros = 0
    var mediaPersonas = 0



    // El peso medio de los gatos es:
    lista.forEach{
        if (it is Gato) {
            mediaGato += it.peso
            contadorGato +1

        }
    }

    // El peso medio de los perros es:
    lista.forEach{
        if (it is Perro) {
            mediaPerros += it.peso
            contadorPerro +1
        }
    }
    // El peso medio de las personas es:
    lista.forEach{
        if (it is Persona) {
            mediaPersonas += it.peso
            contador +1
        }
    }

    println("El peso medio de los gatos es de "+ mediaGato/3 )
    println("El peso medio de los perros es de "+ mediaPerros/3 )
    println("El peso medio de los personas es de "+ mediaPersonas/3 )



}