import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 print("Bó rodar um d20?: ")
 var sera = readLine()
 var  seraTrue = Random.nextInt(20)
 println(seraTrue)
 if (seraTrue <= 10) {
  println("Morreu, patrão")
 } else if (seraTrue >= 10 && seraTrue < 18) {
  println("Se pá que vive")
 } else {
  println("Vagabundo sobreviveu")
 }
}