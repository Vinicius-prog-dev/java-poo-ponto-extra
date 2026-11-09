public class ViaturaUtilitaria extends Veiculo {

    private double capacidadeCargaKg;

    public ViaturaUtilitaria( String placa, double valorDiaria, double capacidadeCargaKg ) {
        super( placa, valorDiaria );
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public double getCapacidadeCargaKg() { return capacidadeCargaKg; }

    @Override 
    public double calcularAluguel( int dias ) {
        double total = super.calcularAluguel( dias );
        if ( capacidadeCargaKg > 1000 ){
            total = total * 1.10;
        }
        return total;
    }
}