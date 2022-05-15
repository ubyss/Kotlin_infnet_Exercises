fun main(){
    replaceList(triangulo)
    replaceList(fibonacci)
    replaceList(vazio)


}

fun replaceList(list: List<Int>){
    var newList = arrayListOf<Int?>()
    for (item in list ){
        when(item % 2 !== 0){
            true -> newList.add(1)
            false -> newList.add(0)
        }
    }
    println(newList)

}
