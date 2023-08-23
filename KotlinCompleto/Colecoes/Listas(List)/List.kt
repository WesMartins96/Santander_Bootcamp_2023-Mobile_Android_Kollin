
//Estrutura de dados do tipo List

//listOf() é read-only
//mutableListOf() é lista mutavel

fun main() {
    val usuarios: MutableList<Int> = mutableListOf(1, 2, 3)
    val sistema: List<Int> = usuarios

    fun addUsuario(novoUsuario: Int){
        usuarios.add(novoUsuario)
    }

    fun getSistema(): List<Int>{
        return sistema
    }

    addUsuario(5)
    println("Sistema list: ${getSistema().size}")

    getSistema().forEach{
        i -> println("Informação: $i")
    }
}