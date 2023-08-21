
//Generics da uma flexibilidade na tipagem das informações, muito comum ver generics em listas

fun main() {
    
    val pilha = pilhaMutavel(0.62, 3.12, 2.7) //Pilha iniciada
    pilha.push(9.87) //Adiciona a pilha
    println(pilha) 

    println("peek(): ${pilha.peek()}") // pega o ultimo valor da pilha porem peek não remove
    println(pilha)

    for (i in 1..pilha.size()) {
        println("pop(): ${pilha.pop()}") //remove a pilha com pop, por conta do for ele remove 1 por 1 até o size total.
        println(pilha)
    }

    //funções genericas dentro do kotlin, da mesma for que é feito em classe
    val pilhaF = pilhaMutavelDe("Wesley", "Desenvolvedor", "Santander", "DIO")
    println(pilhaF)
}


//classe usando generics '<>' no contexto de uma pilha mutavel
class pilhaMutavel<E>(vararg itens: E){

    private val elementos = itens.toMutableList()

    fun push(elemento: E) = elementos.add(elemento)

    fun peek(): E = elementos.last()

    fun pop(): E = elementos.removeAt(elementos.size - 1)

    fun isEmpty() = elementos.isEmpty()

    fun size() = elementos.size
    
    override fun toString() = "pilhaMutavel(${elementos.joinToString()})"
}

//Temos tambem funções genericas
fun <E> pilhaMutavelDe(vararg elementos: E) = pilhaMutavel(*elementos)