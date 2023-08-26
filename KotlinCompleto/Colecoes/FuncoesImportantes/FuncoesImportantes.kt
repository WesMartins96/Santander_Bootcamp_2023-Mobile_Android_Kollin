
//Funções uteis em kotlin em coleções

fun main() {
    
    //FILTER
    val numeros = listOf(1, -2, 3, -4, 5, -6)
    val positivos = numeros.filter { it > 0}
    val negativos = numeros.filter { it < 0}
    println("Todos os numeros: $numeros")
    println("Filtro Numeros positivos: $positivos")
    println("Filtro Numeros negativos: $negativos")

    //MAP
    val dobro = numeros.map { it * 2 }
    val triplo = numeros.map { it * 3 }  
    println("Numeros dobrados: $dobro")
    println("Numeros triplicados: $triplo")

    //ANY  retorna true ou false
    val qualquerNegativo = numeros.any { it < 0}
    val qualquer6 = numeros.any { it > 6}
    println("Qualquer numero negativo: $qualquerNegativo")
    println("Qualquer numero 6: $qualquer6")


    //FLATMAP
    val bolsaFrutas = listOf("Banana", "Abacaxi", "Limão")
    val bolsaRoupas = listOf("Camisa", "Tênis", "Moleton")
    val mochila = listOf(bolsaFrutas, bolsaRoupas)
    val mapMochila = mochila.map {it}
    val flatMapMochila = mochila.flatMap {it}
    println("MapMochila: $mapMochila")
    println("FlatMap: $flatMapMochila")



}