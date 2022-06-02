package bank.test

import bank.Banco

fun main() {
    val digiOneBank = Banco("Digione", 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)
}