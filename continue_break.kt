fun main(){
    var teste = 0
    while (teste < 10){
        println(teste+1)
        teste++
        if(teste == 7){
            break
        }
    }
    var i = 0
    while (i<10){
        if(i == 7){
            i++
            continue
        }
        println(i)
        i++
    }


}