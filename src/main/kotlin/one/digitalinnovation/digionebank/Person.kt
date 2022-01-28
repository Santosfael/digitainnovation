package one.digitalinnovation.digionebank

class Person {
    var name: String = "Rafael"
    var cpf: String = "123.123.123-12"
    private set

}

fun main() {
    val rafael = Person()

    println(rafael.name)
    println(rafael.cpf)
}