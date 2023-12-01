public class CarroEsportivo extends Carro {
    // Atributos
    private int velocidadeMaxima;
    private int velocidadeAtual;

    // Construtores
    public CarroEsportivo() {
    };

    public CarroEsportivo(String marca, String modelo, int ano, int quilometragem, int velocidadeMaxima) {
        super(marca, modelo, ano, quilometragem);
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    // Metodos
    public void acelerar(int aceleracao) {

        if (aceleracao > 0) {
            System.out.println("Acelerando o carro esportivo!");
            this.velocidadeAtual += aceleracao;
            if (this.velocidadeAtual > this.velocidadeMaxima) {
                this.velocidadeAtual = this.velocidadeMaxima;
            }
        }
    }

    public void exibirVelocidadeMaxima() {
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
    }

}
