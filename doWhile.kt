import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var nome: String

    do {
        println("Sair: 0 ")
        nome = sc.nextLine()
     if (nome != "0"){
         println("você digitou: $nome")
    }
    }while (nome != "0")
    println("Fim do programa")
}