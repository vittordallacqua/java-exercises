public class Pessoa {
  private int rg;
  private String nome;

  Pessoa(int rg, String nome) {
    this.rg = rg;
    this.nome = nome;
  }
  
  public int getRg(){
    return this.rg;
  }

  public void setRg(int rg){
    this.rg = rg;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }
}
