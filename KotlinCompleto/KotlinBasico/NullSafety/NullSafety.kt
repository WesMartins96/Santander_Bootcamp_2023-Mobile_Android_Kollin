
//Em kotlin ele lida muito bem com o 'nullPointerException' pois ele é Null Safety

fun main() {
    //Exemplos trabalhando com Null, segurança nula

    var nuncaNulo: String = "Isso não pode ser nulo"
    //Abaixo da erro, pois após declarar o tipo não é possivel que ela seja nula
    // nuncaNulo = null


    //Desta forma podemos sim reatribuir a variavel como nulo usando '?'
    var nulo : String? = "Podemos deixar nulo desta forma"
    nulo = null

    //Como nao foi explicitamente tipado, ele infere o tipo como String, no caso ocasionando o mesmo erro do primeiro exemplo
    var inferenciaNaoNulo = "O Compilador assume que é non-null"
    // inferenciaNaoNulo = null

    fun strLength(str: String?): Int {
        //Desta forma retorna zero caso seja null
        return str?.length ?: 0
    }

    println(strLength(nuncaNulo))
    println(strLength(nulo))

    println(descricaoString(null))
    println(descricaoString(""))
    println(descricaoString("Sou Desenvolvedor Mobile"))
}

//Função que verifica o tamanho da string com .length e se caso for vazio ou nulo, retorna um null com uma mensagem personalizada criada na função
fun descricaoString(talvezString: String?): String{
    if(talvezString != null && talvezString.length > 0){
        return "String de Tamanho: ${talvezString.length}"
    } else {
        return "String vazia ou nula"
    }
}