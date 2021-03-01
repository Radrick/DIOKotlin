package one.digitalinnovationKotlin.digionbank.testes

import one.digitalinnovationKotlin.digionbank.Employee
import one.digitalinnovationKotlin.digionbank.People

fun main (){

    val people = People()
    println("Nome - ${people.name}")
    println("Nome - ${people.cpf}")

    val employee = Employee(name = "Rádrick", cpf = "605.520.173-96", remuneration = 3000.0)
    println("Nome - ${employee.name}")
    println("CPF - ${employee.cpf}")
    println("Remuneração - ${employee.remuneration}")
}


