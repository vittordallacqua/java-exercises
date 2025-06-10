public class Carro {
  private int ano;
  private String modelo;
  private static int contador = 0;

  Carro(String modelo, int ano) {
    this.ano = ano;
    this.modelo = modelo;
    this.contador++;
  }

  public int getAno() {
    return ano;
  }

  public String getModelo() {
    return modelo;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getContador() {
    return this.contador;
  }

  public Carro buzina() {
    System.out.println("BIIIIIIIIII!");
    return this;
  }

  public Carro acenderFarol(int n) {
    System.out.println("Farois acesos " + n);
    return this;
  }

  @Override
  public String toString() {

    return "Modelo: " + this.modelo + "Ano: " + this.ano;
  }

}
