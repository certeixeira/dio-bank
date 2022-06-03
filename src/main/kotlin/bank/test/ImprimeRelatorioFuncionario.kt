package bank.test

import bank.Funcionario

class ImprimeRelatorioFuncionario {

    companion object {
        fun imprime(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}