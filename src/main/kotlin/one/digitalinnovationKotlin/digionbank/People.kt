package one.digitalinnovationKotlin.digionbank

//class declaration
class People {

    var name: String = "João"

    //private set of cpf
    var cpf: String = "122.221.345-67"
    private set

    //internal class
    /*inner class Address {
        var street: String = "Rua dez"
    }*/

}

fun main () {
    val joao = People()

    println(joao.name)
    println(joao.cpf)

}