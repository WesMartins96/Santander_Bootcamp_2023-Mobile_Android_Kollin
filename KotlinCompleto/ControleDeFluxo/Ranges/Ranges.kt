
//Ranges são intervalos, abaixo alguns exemplos de uso dos Ranges

fun main(){

//vai de 0 até 3 inclusive
    for (i in 0..3) {
        print(i) //0123
    }
    print(" ")

//vai de 0 até menor que 3
    for (i in 0 until 3) {
        print(i) //012
    }
    print(" ")

//vai de 2 até 8 contando de 2 em 2 steps
    for (i in 2..8 step 2) {
        print(i) //2468
    }
    print(" ")

//vai de 3 decrementando até 0 usando downTo
    for (i in 3 downTo 0) {
        print(i) //3210
    }
    print(" ")


    //Char(caracteres) Ranges tambem é possivel no kotlin
//vai de a até d inclusive    
    for (c in 'a'..'d') {
        print(c) //abcd
    }
    print(" ")

//vai decrementando de z até s com step de 2
    for (c in 'z' downTo 's' step 2) {
        print(c) //zvxt
    }
    println(" ")


    //Ranges tambem são suportados em estruturas condicionais (exemplo com if)
    val x = 2

    if(x in 1..5){
        println("${x} esta no range de 1 a 5")
    }

    if(x !in 6..10){
        println("${x} não está no range de 6 a 10")
    }

}