public class Calculadora {
  private double[] vetorEntrada;

  Calculadora(double[] vetorEntrada) {
    this.vetorEntrada = vetorEntrada;
  }

  public double soma() {
    double resultado = 0;
    for (int i = 0; i < this.vetorEntrada.length; i++) {
      resultado += this.vetorEntrada[i];
    }
    return resultado;
  }

  public double subtracao() {
    double resultado = this.vetorEntrada[0];
    for (int i = 1; i < this.vetorEntrada.length; i++) {
      resultado -= this.vetorEntrada[i];
    }
    return resultado;
  }

  public double multiplicacao() {
    double resultado = 1;
    for (int i = 0; i < this.vetorEntrada.length; i++) {
      resultado *= this.vetorEntrada[i];
    }
    return resultado;
  }

  public double divisao() {
    double resultado = this.vetorEntrada[0];
    for (int i = 1; i < this.vetorEntrada.length; i++) {
      if (this.vetorEntrada[i] == 0) {
        System.out.println("\nNao é possível dividir por 0!");
        return Double.NaN;
      } else {
        resultado /= this.vetorEntrada[i];
      }
    }
    return resultado;
  }
}