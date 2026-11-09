public class Veiculo { // Superclasse (Classe mãe).

    // protected: Acessível nesta classe, nas subclasse e no mesmo pacote.
    protected String placa;
    protected double valorDiaria;

    public Veiculo( String placa, double valorDiaria ) {
        this.placa       = placa;
        this.valorDiaria = valorDiaria;
    }

    // Calcular padrão: dias x valor da diária.
    public double calcularAluguel( int dias ) {
        return dias * valorDiaria;
    }
}