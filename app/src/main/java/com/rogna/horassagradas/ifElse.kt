package com.rogna.horassagradas

fun main(){
    ifAnidado()
}

fun ifAnidado(){
    val animal = "dog"
    if (animal == "dog"){
        println("Esto es un perro")
    }else{
        ("no es un perrito")
    }

    if (animal == "gato"){
        println("Es un gato")
    }
    else{
        println("No es un gato")
    }
}


// es una condicion
// if (si "val" haz esto)
fun ifBasico(){
    val name = "Noe" // "=" a este valor asignale esto (asigna valores)

    if(name == "Noe"){    // dos "==" compara  // en name.lowercase = minusculas y uppercase = mayusculas
        println("oye, la variable name es Noe")
    }else{
        println("Este no es aris")
    }

}