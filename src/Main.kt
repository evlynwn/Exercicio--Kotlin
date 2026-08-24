fun main() {

    val numero = 3
    println(par(numero))
    val idade = 17
    idade(idade)
    val numeros = 89
    numeros(numeros)

}

fun par(numero:Int): String{

    var result = ""

    if (numero % 2 == 0){

        result = "Par"
    } else {
        result = "Impar"
    }
    return result
}
fun numeros ( positNegZer : Int){

    val numeros = 89

    when  {
        numeros >= 0 -> println("Zero")
        numeros == 0 -> println("Negativo")
        else -> println("Positivo")

    }

}

fun idade ( caai: Int){

    val idade = 17

    when (idade) {
        in 0 .. 12 -> println("Crianca")
        in 12 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        else -> println("Idoso")
    }

}
