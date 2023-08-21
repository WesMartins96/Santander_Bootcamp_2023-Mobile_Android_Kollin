
//Criação de classes
class Cliente

class Contato(val id: Int, var email: String)

fun main() {
    
    //Exemplo de como instanciar uma classe com Koltin
    val cliente = Cliente()

    val contato = Contato(1, "wesmartins96@gmail.com")

    println(contato.id)
    println(contato.email)
    
    contato.email = "wesleyomega2000@gmail.com"
    println("Novo email cadastrado: ${contato.email}")


}