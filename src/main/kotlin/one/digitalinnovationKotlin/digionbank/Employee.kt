package one.digitalinnovationKotlin.digionbank


abstract class Employee(
    override val name: String,
    override val cpf: String,
    val remuneration: Double
) : People(name, cpf){
    abstract fun calculateAux()
}

