package one.digitalinnovationKotlin.digionbank

import java.math.BigDecimal

class Account (

    val agency: String,
    val number_account: String,
    val remuneration: BigDecimal

) {

    fun deposit (money: BigDecimal){}
    fun withdraw (money: BigDecimal){}
}