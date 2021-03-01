package one.digitalinnovationKotlin.digionbank.testes

import one.digitalinnovationKotlin.digionbank.Client
import one.digitalinnovationKotlin.digionbank.TypeClient

fun main(){

    val client = Client(
        name = "Suellen",
        cpf = "1234567",
        typeClient = TypeClient.PF,
        password = "123456"
    )

    println(client)
    TestLogin().login(client)

}