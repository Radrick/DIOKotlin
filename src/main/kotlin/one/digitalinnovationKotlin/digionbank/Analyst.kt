package one.digitalinnovationKotlin.digionbank

class Analyst(name: String, cpf: String, remunaration: Double) : Employee(name, cpf, remunaration) {
    override fun calculateAux() = remuneration * 0.1

}