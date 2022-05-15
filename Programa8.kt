fun main(){
    map()
    contains()
    isEmpty()
}


fun map(){
//    Com o metodo map podemos retornar uma nova lista diante do resultado que queremos, por exemplo:
    var novaLIsta = triangulo.map { it * 2 }
//    Pegamos o elemento na lista e multiplicamos por 2, retornando uma nova lista com todos os numeros multiplicados por 2
    println(novaLIsta)
}

fun contains(){
//    COntains é um metodo bastante utilizado para ver se um item ou valor, se contem na lista:
    println(triangulo.contains(1))
//    O resultado vai ser true or false, o que facilita se você quer achar ou fazer alguma estrutura condicional em um programa se tiver tal elemento

}

fun isEmpty(){
//    isEmpty checa se uma certa lista está vazia. O que ajuda muito nas questões onde o usuário que mantem o controle dessa lista
    println(triangulo.isEmpty())
//    Dando o resultado também de true or false pode-se fazer uma estrutura condicional para que cheque se a lista deve ou nao permanecer vazia
}