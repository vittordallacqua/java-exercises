public class calculadoraCientifica {
    protected double num1;
    protected double num2;

    public calculadoraCientifica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public calculadoraCientifica(double num1) {
        this.num1 = num1;
        this.num2 = 0;
    }

    public double calcular() {
        return 0;
    }
}

class Soma extends calculadoraCientifica {
    public Soma(double num1, double num2) {
        super(num1, num2);
    }

    public double calcular() {
        return num1 + num2;
    }
}

class Subtracao extends calculadoraCientifica {
    public Subtracao(double num1, double num2) {
        super(num1, num2);
    }

    public double calcular() {
        return num1 - num2;
    }
}

class Multiplicacao extends calculadoraCientifica {
    public Multiplicacao(double num1, double num2) {
        super(num1, num2);
    }

    public double calcular() {
        return num1 * num2;
    }
}

class Divisao extends calculadoraCientifica {
    public Divisao(double num1, double num2) {
        super(num1, num2);
    }

    public double calcular() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Não é possível dividir por zero.");
            return 0;
        }
    }
}

class Potencia extends calculadoraCientifica {
    public Potencia(double num1, double num2) {
        super(num1, num2);
    }

    public double calcular() {
        return Math.pow(num1, num2);
    }
}

class raizQuadrada extends calculadoraCientifica {
    public raizQuadrada(double num1) {
        super(num1);
    }

    public double calcular() {
        if (num1 >= 0) {
            return Math.sqrt(num1);
        } else {
            System.out.println("Erro: Não é possível calcular a raíz de um número negativo.");
            return 0;
        }
    }
}