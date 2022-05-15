fun main(){

    plus(triangulo)
    plus(fibonacci)
    plus(vazio)

    times(triangulo)
    times(fibonacci)
    times(vazio)

}

fun plus(list: List<Int>){
    var total = arrayListOf<Int>()

    for (item in list){
        if (item % 2 != 0){
            total.add(item)

        }
    }
    println(total.sum())
}


fun times(list: List<Int>){
    var total = arrayListOf<Int>()

    for (item in list){
        if (item % 2 !== 0){
            total.add(item)

        }
    }
    val total2 = total.reduce { sum, element ->  sum * element}
    println(total2)

}