//while(enquanto)

// uso do While e Do-while

fun main() {
    var bolosComidos = 0
    var bolosAssados = 0

//usando while
    while(bolosComidos < 5){
        comerBolo()
        bolosComidos++
    }

//usando do-while
    do{
        fazerBolo()
        bolosAssados++
    } while(bolosAssados < bolosComidos)
}

fun comerBolo(){
    println("Comendo o Bolo")
}

fun fazerBolo() = println("Fazendo o Bolo")