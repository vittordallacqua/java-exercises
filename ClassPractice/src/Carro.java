public class Carro {
  public String modelo;
  public int ano;
  public int velocidadeAtual;

  Carro(String modelo, int ano) {
    this.modelo = modelo;
    this.ano = ano;
    this.velocidadeAtual = 0;
  }

  void acelerar(int v) {
    this.velocidadeAtual += v;
  }

  void frear() {
    this.velocidadeAtual -= 10;
    if (this.velocidadeAtual < 0) {
      this.velocidadeAtual = 0;
    }
  }

  public void exibirVelocidade() {
    System.out.println("Velocidade atual: " + this.velocidadeAtual + "Km/h");
  }

  public String getModelo() {
    return this.modelo;
  }

  public int getAno() {
    return this.ano;
  }

}