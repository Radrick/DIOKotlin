package one.digitalinnovationKotlin.digionbank.testes

import one.digitalinnovationKotlin.digionbank.Bank

fun main(){
    val digiOneBank = Bank(name = "DigiOne",cod = 12)

    println(digiOneBank.name)
    println(digiOneBank.cod)
}