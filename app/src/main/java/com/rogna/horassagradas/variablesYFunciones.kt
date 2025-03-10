package com.rogna.horassagradas

val age:Int = 30 // funcion de portafolio

fun main(){  //contenedor de codigo

    // variablesNumericas() //llama a la funcion

    showMyName()
    showMyAge(currentAge = 30)
    add(25, 76)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
}

fun showMyName(){
    println("Me llamo Noe Antonio")
}

fun showMyAge(currentAge:Int = 30){
    println("tengo $currentAge años")
}

fun add(firstNumber:Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber:Int, secondNumber:Int): Int{ // parametros de entrada
    return firstNumber - secondNumber // parametro de salida (devolver "return")
}

fun subtractCool(firstNumber:Int, secondNumber:Int) = firstNumber - secondNumber

fun variablesAlfanumericas(){

    /**
     * variables alfanumericas
     */

    //Char (caracter solo 1)
    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    //String (muchos caracteres)
    val stringExample:String = "Hola Mundo"
    val stringExample2 = "Noe Antonio"
    val stringExample3 = "Hola"
    val stringExample4 = "Mundo"

    var stringConcatenada:String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    print(stringConcatenada)

    val example123:String = age.toString()

    // concatenacion de string
    // println(stringExample3 + stringExample4)
}

fun variablesBooleanas(){

    /**
     * variables booleanas
     */

    //Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3:Boolean = true
}

fun variablesNumericas(){
    /**
     * variables númericas
     */

    //Int -2,147,483,647 a 2,147,483,647
    val age:Int = 30 // val es una variable inmutable
    var age2:Int = 30 // var es una variable mutable valor
    //println(age)
    age2 = 29
    //println(age2)

    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example:Long = 30

    //Float (camel kase "floatExample  "6 decimales" mayuscula despues de la 1er letra)
    val floatExample:Float = 30.5f

    //Double (soporta 12 o 14 decimales)
    val doubleExample:Double = 3241.3123123

    println("Suma")
    println(age + age2)

    println("Resta")
    println(age-age2)

    println("Multiplicacion")
    println(age*age2)

    println("Division")
    println(age/age2)

    println("Modulo")
    println(age%age2)
}

