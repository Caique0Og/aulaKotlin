import java.util.Scanner

fun main(){

   val sc = Scanner(System.`in`)
    var numero: Int

    println("Para sair digite 0")
  numero = sc.nextInt()

    while (numero != 0){
        println("$numero")
        println("Sair?")
        numero = sc.nextInt()

    }
    println("Fim da execução")
}