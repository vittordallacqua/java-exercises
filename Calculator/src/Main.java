public class Main {
  public static void main(String[] args) {
    double vetorEntrada[] = { 20.0, 30.0, 40.0, 0.0 };
    Calculadora c1 = new Calculadora(vetorEntrada);
    System.out.println("\nSoma: " + c1.soma());
    System.out.println("\nSubtraçao: " + c1.subtracao());
    System.out.println("\nMultiplicaçao: " + c1.multiplicacao());
    System.out.println("\nDivisao: " + c1.divisao());
  }
}