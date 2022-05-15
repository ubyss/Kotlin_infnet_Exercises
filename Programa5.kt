fun main(){
    factorial(triangulo)
    factorial(fibonacci)
    factorial(vazio)

}


fun factorial(list: List<Int>){
    var factorial: Int = 1
    for (item in list) {
        factorial *= item
        println("Factorial of $item = $factorial")
    }

}
