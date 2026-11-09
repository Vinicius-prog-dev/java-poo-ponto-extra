public class TestaFrota {
    public static void main( String[] args ) {
        int dias = 5;

        CarroPasseio carro = new CarroPasseio("ABC-1234", 100.00, 5);
        ViaturaUtilitaria viatura = new ViaturaUtilitaria("XYZ-9876", 200.00, 1500.00);

        System.out.printf("Aluguel do carro de passeio (%d dias): R$ %.2f%n", dias, carro.calcularAluguel(dias));
        System.out.printf("Aluguel da viatura utilitária (%d dias): R$ %.2f%n", dias, viatura.calcularAluguel(dias));
    }
}