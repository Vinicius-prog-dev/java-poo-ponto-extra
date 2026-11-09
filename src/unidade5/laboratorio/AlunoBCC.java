package unidade5.laboratorio; // Define o pacote (pasta lógica) onde a classe está.

public class AlunoBCC {  // Declara a classe pública, que modela um aluno.

    // Atributos privados: só podem ser acessados dentro desta classe (encapsulamento).
    private String ra;
    private String nome;
    private double notaN1;
    private double notaN2;

    // Construtor: roda ao criar o objeto com "new". Recebe só ra e nome.
    public AlunoBCC ( String ra, String nome ) {
        this.ra   = ra;   // "this.ra" é o atributo; "ra" é o parâmetro.
        this.nome = nome; // idem.
    }

    // Getters: métodos públicos que devolvem o valor dos atributos privados.
    public String getRa    () { return ra;     }
    public String getNome  () { return nome;   }
    public double getNotaN1() { return notaN1; }
    public double getNotaN2() { return notaN2; }

    // Setters sem regra: só atribuem o novo valor
    public void setRa   ( String ra   ) { this.ra = ra;     }
    public void setNome ( String nome ) { this.nome = nome; }

    // Setter com validação: só aceita notas de 0.0 a 10.0
    public void setNotaN1 ( double notaN1 ){ 
        if ( notaN1 >= 0.0 && notaN1 <= 10.0 ){ // && = "e": as duas condições devem ser verdadeiras
            this.notaN1 = notaN1;               // nota válida: guarda no atributo
        }else{
            System.out.println("Erro: A nota da N1 tem que estar entre 0.0 e 10.0!"); // nota inválida: avisa e não altera
        }
    }

    public void setNotaN2 ( double notaN2 ){
        if ( notaN2 >= 0.0 && notaN2 <= 10.0 ){
            this.notaN2 = notaN2;
        }else{
            System.out.println("Erro: A nota da N2 tem que estar entre 0.0 e 10.0!");
        }
    }

    // Média ponderada: N1 tem peso 40% e N2 tem peso 60%
    public double calcularMediaSemestral(){
        return notaN1 * 0.4 + notaN2 * 0.6;
    }

    public String obterSituacao(){
        if (calcularMediaSemestral() >= 0.6){
            return "Aprovado!";
        }else{
            return "Reprovado!";
        }
    }
}