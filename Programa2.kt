val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
val vazio = listOf<Int>()


fun main(){
    checkList(triangulo)
    checkList(fibonacci)
    checkList(vazio)

}

fun checkList(list: List<Int>){
    when(list.first() < list.last()){
        true -> println("Infnet")
        false -> println("Tenfni")
        null -> println("EmptyList")
    }
}



