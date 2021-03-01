package one.digitalinnovationKotlin.digionbank

class Manager(
    name: String,
    cpf: String,
    remunaration: Double,
    val password: String
)   :Employee(name, cpf, remunaration), Login {
    override fun calculateAux(): Double = remuneration * 0.4
    override fun login(): Boolean = "123456" == password
}