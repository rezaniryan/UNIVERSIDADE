package universidade;

public class universidade {
	
	    // classe atributos
	    private String nome;           
	    private String ra;             
	    private double[] notas;        
	    private boolean ead;          
	    private double frequencia;    

	    // construtor de diciplinas
	    public universidade(String nome, String ra, double[] notas, double frequencia) {
	        this.nome = nome;
	        this.ra = ra;
	        this.notas = notas;
	        this.ead = false; // nao e ead
	        this.frequencia = frequencia;
	    }

	    // construtor ead
	    public universidade(String nome, String ra, double[] notas) {
	        this.nome = nome;
	        this.ra = ra;
	        this.notas = notas;
	        this.ead = true; // é ead
	        this.frequencia = 100;
	    }

	    // calcula a nota final 
	    public double calcularNotaFinal() {
	        int n = notas.length;

	        if (n == 1) return notas[0];
	        if (n == 2) return (notas[0] + notas[1]) / 2;
	        if (n == 3) return (notas[0] + 2 * notas[1] + 4 * notas[2]) / 7;
	        if (n == 4) return (notas[0] * 0.15 + notas[1] * 0.30 + notas[2] * 0.10 + notas[3] * 0.45);
	        
	        return 0; // se nao ouver notas
	    }

	    // indentifica se o aluno foi aprovado ou reprovado
	    public String verificarSituacao() {
	        double notaFinal = calcularNotaFinal();
	        if (ead) return notaFinal >= 5 ? "Aprovado" : "Reprovado";
	        return (notaFinal >= 5 && frequencia >= 75) ? "Aprovado" : "Reprovado";
	    }

	    // imprime as informaçoes do aluno
	    public void imprimirDetalhes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("RA: " + ra);
	        System.out.println("Nota Final: " + calcularNotaFinal());
	        System.out.println("Situação: " + verificarSituacao());
	    }

	    // testa a classe
	    public static void main(String[] args) {
	    	universidade alunoPresencial = new universidade("Ryan", "247548", new double[]{9.7, 7.0, 8.0, 6.0}, 80);
	        alunoPresencial.imprimirDetalhes();

	        universidade alunoEAD = new universidade("Aryalice", "243561", new double[]{3.0, 5.3, 5.0});
	        alunoEAD.imprimirDetalhes();
	    }
	}



