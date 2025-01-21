class ContaEspecial(
    nomeCliente: String,
    numConta: String,
    saldo: Float,
    var limite: Float
): ContaBancaria(nomeCliente, numConta, saldo) {
    override fun sacar(valor: Float) {
        if (valor > saldo + limite){
            println("O seu valor ultrapassou o saldo. Seu saldo é $saldo")
        } else {
            saldo -= valor
        }
    }

}