package one.digitalinnovationKotlin.digionbank

//class declaration
class People {

    var name: String = "João"
    var cpf: String = "122.221.345-67"

}

fun main () {
    val joao = People()

    println(joao.name)
    println(joao.cpf)

}