
//Verificando a igualdade de objetos
// == Comparação de estrutura (basta ser igual independente da posição)
// === Comparação referencial (tem que ser igual e na mesma posição(endereço na memoria))

fun main() {
    //setOf não aceita elementos duplicados.
    val autores = setOf("Machado de Assis", "Aluisio Azevedo", "Jorge Amado")
    val escritores = setOf("Jorge Amado", "Machado de Assis", "Aluisio Azevedo")

    println(autores == escritores)
    println(autores === escritores)
}