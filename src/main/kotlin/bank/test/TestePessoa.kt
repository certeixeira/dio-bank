package bank.test

import bank.Pessoa

fun main() {
    val carlos = Pessoa(nome = "Carlos Eduardo", cpf = "123456789")
    println(carlos.nome)
    println(carlos.cpf)
}