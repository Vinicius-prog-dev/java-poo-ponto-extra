import java.util.Scanner;

public class TestaEstoque {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
    // Cria o item com 10 unidades iniciais.
    ItemEstoque item = new ItemEstoque(1, "Notebook Dell", 10, 3500.00);
    
    int opcao; // Declara fora do laço para poder usada na condição do While.

    do { // do-while: executa o bloco ao menos uma vez e repete enquanto a condição for verdadeira.
        System.out.println( "\n----- CONTROLE DE ESTOQUE -----"   );
        System.out.println( "1 - Consultar Estoque e Valor Total" );
        System.out.println( "2 - Dar Baixa em Itens (Vendas/Uso"  );
        System.out.println( "3 - Reabastecer Estoque"             );
        System.out.println( "0 - Sair"                            );
        System.out.print  ( "Escolha uma opção: "                 );
        opcao = sc.nextInt();

        switch (opcao) {
            case 1: 
                System.out.println( "Item: " + item.getDescricao()                                       );
                System.out.println( "Quantidade: " + item.getQuantidade()                                );
                System.out.printf( "Valor total em estoque: R$ %.2f%n", item.calcularValorTotalEstoque() );
                break; // Sai do switch (sem o break, executaria o proxímo case).
            
            case 2:
                System.out.print( "Quantidade a dar baixa: ");
                int qtdBaixa = sc.nextInt();
                item.darBaixa( qtdBaixa );
                break;
            
            case 3:
                System.out.print( "Quantidade a reabastecer: " );
                int qtdRepor = sc.nextInt();
                item.reabastecer( qtdRepor );
                break;
                
            case 0:
                System.out.println( "Encerrando o sistema..." );
                break;

            default: 
                System.out.println( "Opção inválida! Tente novamente." );
        }
        } while (opcao != 0); // Repete o menu até o usuario digitar 0.
        sc.close();
    }
}