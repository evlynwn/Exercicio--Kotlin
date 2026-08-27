fun main() {

    val numero = 3
    println(par(numero))
    val idade = 60
    idade(idade)
    val numeros = 89
    numeros(numeros)
    val tabuada = 4
    tabuada(tabuada)
    val soma = 5
    soma(soma)
    val lista = 2
    lista(lista)
    val listaNumeros = 10
    listaNumeros(listaNumeros)
    val dobro = 5
    dobro(dobro)

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

    val numeros = -89

    when  {
        numeros > 0 -> println("Positivo")
        numeros < 0 -> println("Negativo")
        else -> println("Zero")

    }

}

fun idade ( classificacao: Int){

    val idade = 60

    when (idade) {
        in 0 .. 12 -> println("Crianca")
        in 12 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        else -> println("Idoso")
    }

}
fun tabuada( divisao: Int){
    var numeroEscolhido = 4

}
fun soma (somas: Int){

    var soma = arrayOf(1,2,3,4,5).toList()

    println(soma - 2)

}
fun lista (valor: Int){

    val lista = arrayOf(1,2,10,3)

    var maiorNumero = lista[0]

    for (numero in lista){
        if (maiorNumero < numero){
            maiorNumero = numero
        }
    }
    println(maiorNumero)

}
fun listaNumeros( numero: Int) {
    var i = 10

    while ( i >= 0 ) {

        i--
        println(i)
    }
}
fun pares ( soma: Int) {
    val somaPares = arrayOf(1,2,3,4,5)

    val par = 0

}
fun dobro (valor : Int) {

    val dobro = 5
    println( dobro * 2)
}
fun media () {
    val nota1 = 3
    val nota2 = 6
    val nota = 7



    println()

}

