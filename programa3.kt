fun main(){
    checkBiggerElement(triangulo)
    checkBiggerElement(fibonacci)
    checkBiggerElement(vazio)

}

fun checkBiggerElement(list: List<Int>){
    println(list.maxOrNull())

}