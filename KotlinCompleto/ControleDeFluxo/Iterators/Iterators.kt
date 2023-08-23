

class Animal(val nome: String)

class Zoologico(val animais: List<Animal>){
    // função que cria uma iterator na classe Zoologico
    operator fun iterator(): Iterator<Animal>{
        return animais.iterator()
    }
}

fun main() {
    
    val animais = listOf(Animal("Zebra"), Animal("Leão"))
    val zoologico = Zoologico(animais)

    for (animal in zoologico) {
        println("Lista de animais no zoologico: ${animal.nome}")
    }
}