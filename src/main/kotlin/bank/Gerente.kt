package bank

import bank.Funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome,
    cpf,
    salario
) {
    override fun calculaAuxilio(): Double = salario * 0.4
}