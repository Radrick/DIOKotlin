package one.digitalinnovationKotlin.digionbank.testes

import one.digitalinnovationKotlin.digionbank.TypeClient

fun main() {
    TypeClient.values().forEach {
        println("${it.name} - ${it.description}")
    }
}