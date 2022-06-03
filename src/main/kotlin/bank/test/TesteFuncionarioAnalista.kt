package bank.test

import bank.Analista
import bank.Funcionario

fun main() {
    val carlos = Analista("Carlos Teixeira", "123465789", 2000.0)



}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())