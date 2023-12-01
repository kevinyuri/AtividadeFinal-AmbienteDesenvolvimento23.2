public class ProjetoCarro {
    public static void main(String[] args) throws Exception {
        System.out.println(" --- Implementaçao dos dois métodos ---");
        Carro meuCarro = new Carro();
        meuCarro.setCarroInfo("Toyota", "Corolla", 2022);
        meuCarro.exibirCarroInfo();

        System.out.println("\n--- Segunda implementação---");
        CarroEsportivo meuCarroEsportivo = new CarroEsportivo("Ferrari", "488 GTB", 2023, 330, 200);

        meuCarroEsportivo.exibirVelocidadeMaxima();
        meuCarroEsportivo.acelerar(20);
    }
}
