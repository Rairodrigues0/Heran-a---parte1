class ContaPoupanca(
    nomeCliente: String,
    numConta: String,
    saldo: Float,
    val diaRendimento: Int,

): ContaBancaria(nomeCliente, numConta, saldo) {
    fun calcularNovoSaldo(taxaDeRendemento: Float){
        if (taxaDeRendemento > 0){
            saldo *= (1 + taxaDeRendemento / 100)
        } else {
            println("A taxa de rendimento não pode ser negativa")
        }
    }
}