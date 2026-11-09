public class CarroPasseio extends Veiculo { // extends = herda de Veiculo.
    private int quantidadePassageiros;

    public CarroPasseio( String placa, double valorDiaria, int quantidadePassageiros ) {
        super( placa, valorDiaria ); // Chama o construtor da superclasse (deve ser a 1º linha).
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public int getQuantidadePassageiros() { return quantidadePassageiros; }

    @Override // Indica que estamos sobrescrevendo um método de superclasse.
    public double calcularAluguel( int dias ) {
        return super.calcularAluguel( dias ) + 50.00;
    }
}