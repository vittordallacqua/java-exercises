public class ContaBancaria {
  private String titular;
  private float saldo;

  ContaBancaria(String titular, float saldo){
    this.titular = titular;
    this.saldo = saldo;
  }

  void depositar(double valor){
    this.saldo += valor;
  }

  void sacar(double valor){
    if(this.saldo >= 0) this.saldo -= valor;
  }

  public void exibirSaldo(){
    System.out.println("Saldo: R$" + this.saldo);
  }

  public float getSaldo(){
    return this.saldo;
  }

  public String getTitular(){
    return this.titular;
  }
}


