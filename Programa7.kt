var alfabeto = arrayListOf<String>("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")


fun main(){
    checkWord("infnet")
}

fun checkWord(word: String){
    var soma = arrayListOf<Int>()
    for ((index, value) in word.withIndex()) {
        soma.add((index + 1) * (alfabeto.indexOf(value.toString().uppercase()) + 1))

    }
    println(soma.sum())
}
