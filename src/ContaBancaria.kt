open class ContaBancaria(
     var nomeCliente: String,
     var numConta: String,
     var saldo: Float
) {
    open fun sacar(valor: Float) {
        if (valor > saldo){
            println("Saldo insuficiente")
        } else {
            saldo -= valor
        }
    }
    fun depositar(valor: Float) {
        if (valor > 0){
            saldo += valor
        } else {
            println("O valor deve ser positivo")
        }
    }
    open fun exibirDados() {
        println("Nome do Cliente: $nomeCliente")
        println("Número da Conta: $numConta")
        println("Saldo: R$ $saldo")
    }

}