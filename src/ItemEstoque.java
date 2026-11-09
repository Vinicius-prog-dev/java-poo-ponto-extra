public class ItemEstoque {

    private int    codigo;
    private String descricao;
    private int    quantidade;
    private double precoUnitario;

    // Construtor parametrizado: inicializa todos os campos de uma vez.
    public ItemEstoque( int codigo, String descricao, int quantidade, double precoUnitario ){
        this.codigo =        codigo;
        this.descricao =     descricao;
        this.quantidade =    quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Getters para a classe de teste conseguir ler os dados privados.
    public int    getCodigo()        { return codigo; }
    public String getDescricao()     { return descricao; }
    public int    getQuantidade()    { return quantidade; }
    public double getPrecoUnitario() { return precoUnitario;}

    // Retira itens do estoque, mas só se houver quantidade suficiente
    public void darBaixa( int qtd ){
        if ( qtd <= 0 ){                              // Impede valores zero ou negativos.
            System.out.println( "Quantidade inválida" );
        } else if ( qtd > quantidade ){               // Pediu mais do que existe.
            System.out.println( "Estoque insuficiente! Disponivel: " + quantidade );
        } else {
            quantidade -= qtd;                        // mesmo que quantidade = quantidade - qtd
            System.out.println( "Baixa realizada com sucesso." );
        }
    }

    // Adiciona itens ao estoque.
    public void reabastecer( int qtd ){
        if ( qtd <= 0 ){
            System.out.println( "Quantidade inválida." );
        } else {
            quantidade += qtd;                            // mesmo que quantidade = quantidade + qtd
            System.out.println("Estoque reabastecido com sucesso,");
        }
    }

    // Valor total em estoque = quantidade x preço unitário.
    public double calcularValorTotalEstoque(){
        return quantidade * precoUnitario;
    }
}