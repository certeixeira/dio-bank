package bank.test

import bank.Gerente

fun main() {
    val maria = Gerente("Maria", "45678912345", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}