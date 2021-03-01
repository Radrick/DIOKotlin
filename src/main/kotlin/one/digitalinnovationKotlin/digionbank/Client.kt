package one.digitalinnovationKotlin.digionbank

class Client (
    name: String,
    cpf: String,
    val typeClient: TypeClient,
    val password: String
    ) : People(name, cpf), Login {

    override fun login(): Boolean = "123456" == password

    override fun toString(): String = """
        Nome: $name
        CPF: $cpf
        Tipo cliente: ${typeClient.description}
        Autenticado: ${login()}
    """.trimIndent()
}