public class Calculadora {

  public Calculadora(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
}

  public static double soma(double num1, double num2) {
      return num1 + num2;
  }

  public static double subtracao(double num1, double num2) {
      return num1 - num2;
  }

  public static double multiplicacao(double num1, double num2) {
      return num1 * num2;
  }

  public static double divisao(double num1, double num2) {
      if (num2 != 0) {
          return num1 / num2;
      } else {
          System.out.println("Erro: Divisão por zero!");
          return 0;
      }
  }

  public static double potencia(double num1, double num2) {
      return Math.pow(num1, num2);
  }

  public static double raizQuadrada(double num1) {
      if (num1 >= 0) {
          return Math.sqrt(num1);
      } else {
          System.out.println("Erro: Raiz quadrada de número negativo!");
          return 0;
      }
  }
}

