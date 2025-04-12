public class Funcionario extends Pessoa{
  private int numeroMatricula;
  private String cargo;

  Funcionario(int numeroMatricula, String cargo, String nome, int rg){
    super(rg, nome);
    this.numeroMatricula = numeroMatricula;
    this.cargo = cargo;
  }

  public int getNumeroMatricula() {
    return numeroMatricula;
  }

  public void setNumeroMatricula(int numeroMatricula) {
    this.numeroMatricula = numeroMatricula;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

}


