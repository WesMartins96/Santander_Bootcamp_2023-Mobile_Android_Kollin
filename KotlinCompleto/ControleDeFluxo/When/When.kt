

//utilizando when

fun main() {
    cases("Olá")
    cases(1)
    cases(0L)
    cases(MinhaClasse())
    cases("olá")

    println(whenTeste("Oi"))
    println(whenTeste(3L))
    println(whenTeste(2))
    println(whenTeste(MinhaClasse()))
}

//when é otimo para substituir em alguns casos o switch/case
fun cases(obj: Any){
    when (obj){
        1 -> println("Primeiro")
        "Olá" -> println("Bom dia")
        is Long -> println("Long")
        !is String -> println("Não é uma String")
        else -> println("Desconhecido")
    }
}

//when como expressão
fun whenTeste(obj: Any) : Any {
    val resultado = when(obj) {
        2 -> "Segundo"
        "Oi" -> 2
        is Long -> false
        else -> 42
    }
    return resultado
}

class MinhaClasse()

