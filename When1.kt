fun main(){
    //When é basicamente um Switch case
    print("Salve: ")
    val dia = readln()
    val day = dia?.toInt()
    val result = when(day){
        1 -> "1"
        2 -> "2"
        3 -> "3"
        4 -> "4"
            else -> "aqui não, patrao"

    }
    println(result)
}