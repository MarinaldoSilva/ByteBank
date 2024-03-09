
fun main() {
    var contaMario = Conta()
    var contaFran = Conta()
    
    contaMario.titular = "Marinaldo"
    contaMario.deposito(1500.0)
    contaMario.retirarDaConta(100.0)
    contaMario.alteraNumeroConta(1547)
    contaMario.saudacao()
    contaMario.mostrarSaldo()
    contaMario.mostrarNumeroConta();
    contaFran.titular = "Franci"
    //contaFran.deposito(1200.0)
    //contaFran.mostrarSaldo()
    contaMario.transfere(890.0, contaFran)
    contaFran.mostrarSaldo()

}

class Conta {
    var titular: String =""
    var numero: Int = 0
        set(numero){
            if(numero > 0){
                field = numero
            }else{
                println("Numero da conta é negativo ou nulo, tente novamente")
            }
        }
        get(){
            return field
        }
    
    var saldo: Double = 0.0
        set(valor){
            //field é igual ao valor recebido por parametro
            if(valor >= 0.1){
                field = valor
            }
            
        }
        get(){
            return field
        }
    
    fun alteraNumeroConta(numeroConta: Int){
        this.numero = numeroConta
    }

    fun mostrarSaldo(){
        println("Olá ${this.titular} seu saldo é: ${this.saldo} reais")
    }

    fun saudacao(){
        println("Bem-vindo ao Byte Bank ${this.titular}")
    } 
    fun mensagemErroDeSaldo(){
        println("Saldo insuficiente. Operação não efetuada.")
    }
    fun deposito(valor: Double){
        this.saldo += valor
    }

    fun verificaSaldo(valor: Double): Boolean{
        if(this.saldo >= valor){
            this.saldo
            return true
        }else{
            mensagemErroDeSaldo();
            return false
        }
    }
    fun retirarDaConta(valor: Double){
        verificaSaldo(valor)
        this.saldo -= valor
    }
    fun transfere(valor:Double, destino:Conta): Boolean{
        verificaSaldo(valor)
        //this.saldo.retirarDaConta(valor);
        this.saldo -= valor
        destino.deposito(valor)
        return true
    }
}



