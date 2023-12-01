public class Carro {

  // Atributos
  private String marca;
  private String modelo;
  private int ano;

  // Construtores
  public Carro() {
  };

  public Carro(String marca, String modelo, int ano, int quilometragem) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  // Metodos

  public void setCarroInfo(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public void exibirCarroInfo() {
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ano: " + this.ano);
  }

}
