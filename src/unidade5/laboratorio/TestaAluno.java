package unidade5.laboratorio;

import java.util.Scanner; // Importa a classe Scanner, usada para ler do teclado.

public class TestaAluno {
    public static void main( String[] args ) { // Ponto de entrada do programa.

        Scanner sc = new Scanner( System.in ); // System.in = entrada padrão (teclado).

        System.out.print( "Digite o RA: ");
        String ra = sc.nextLine();             // Lê a linha inteira como texto.

        System.out.print( "Digite o seu nome: ");
        String nome = sc.nextLine();

        AlunoBCC aluno = new AlunoBCC ( ra, nome ); // Cria o objeto chamando o construtor.

        System.out.print( "Digite a nota N1 (use vírgula, ex: 7,5: " );
        double n1 = sc.nextDouble();                // Lê um número decimal
        aluno.setNotaN1( n1 );                        // O setter valida; se for inválida, mostra o erro.

        System.out.print( "Digite a nota N2 (use vírgula, ex: 7,5: " );
        double n2 = sc.nextDouble();
        aluno.setNotaN2( n2 );

        // Boletim final. %.2f formata com 2 casas decimais; %n quebra de linha
        System.out.println("\n----- BOLETIM FINAL -----");
        System.out.println("RA: " + aluno.getRa());
        System.out.println("Nome: " + aluno.getNome());
        System.out.printf("N1: %.2f%n", aluno.getNotaN1());
        System.out.printf("N2: %.2f%n", aluno.getNotaN2());
        System.out.printf("Média: %.2f%n", aluno.calcularMediaSemestral());
        System.out.println("Situação: " + aluno.obterSituacao());

        sc.close();// Fecha o Scanner e libera o recurso
    }
}