//Funções padrões no kotlin

//Abaixo temos Parametros com valor padrão e Argumentos nomeados dentro do kotlin

fun imprimirMensagem(mensagem: String): Unit {
    println(mensagem)
}

fun imprimirMensagemComPrefixo(mensagem: String, prefixo: String = "Informação") {
    println("[$prefixo] $mensagem")
}

fun somar(x: Int, y: Int): Int {
    return x + y;
}

fun multiplicar(x: Int, y: Int) = x * y


//função main executa o código
fun main() {
    imprimirMensagem("Olá")
    imprimirMensagemComPrefixo("Olá", "Log")
    imprimirMensagemComPrefixo("Hello")
    imprimirMensagemComPrefixo(prefixo = "Log", mensagem = "Olá")
    println(somar(20, 30))
    println(multiplicar(10, 5))

    
    //Funções com Parametros vararg
    //Essas funções permitem que você passe qualquer número de argumentos, separando-os por vírgulas, como array

    fun imprimaTudo(vararg mensagens: String){
        for (m in mensagens) {
            println(m)
        }    
    }
    imprimaTudo("Olá ", "Me ", "Chamo ", "Wesley ", "Martins ", "Sou ", "Dev ", "Mobile ")


    fun imprimaTudoComPrefixo(vararg mensagens: String, prefixo: String){
        for (m in mensagens) {
            println(prefixo + m)
        }    
    }
    imprimaTudoComPrefixo("Lógica ", "Kotlin ", "Android Studio ", "Banco de dados ", "Soft Skills ", prefixo = "Estudando: ")

    //Podemos usar a notação * para chamar um função vararg dentro de outra função vararg
    fun log(vararg entradas: String){
        imprimaTudo(*entradas)
    }
    log("Olá ", "Me ", "Chamo ", "Wesley ", "Martins ", "Sou ", "Dev ", "Mobile ")
}



