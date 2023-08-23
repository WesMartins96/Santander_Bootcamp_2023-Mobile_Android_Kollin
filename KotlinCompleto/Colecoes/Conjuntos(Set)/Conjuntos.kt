
//Estrutura de dados Set, não são ordenados e não permitem duplicados

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean{
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String{
    return if(isAdded) "registered correctly." else "marked as duplicated and rejected." 
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $aNewIssue ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}