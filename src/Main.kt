fun main(){
    val visualizar = ContaPoupanca("Rai","555-3", 2000.0f, 10)
    val visualiza = ContaEspecial("Rai","544-3", 2450.0f, 10f)

    visualizar.sacar(200f)
    visualiza.sacar(400f)

    visualizar.depositar(500f)
    visualiza.depositar(200f)

    visualizar.calcularNovoSaldo(5f)

    visualizar.exibirDados()
    visualiza.exibirDados()

}