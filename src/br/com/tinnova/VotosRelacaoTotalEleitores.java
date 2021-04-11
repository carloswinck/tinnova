package br.com.tinnova;

import java.math.BigDecimal;

public class VotosRelacaoTotalEleitores {
	
    private BigDecimal votosValidos;
    private BigDecimal votosBrancos;
    private BigDecimal votosNulos;
    private BigDecimal totalEleitores;

    public VotosRelacaoTotalEleitores(long validos, long brancos, long nulos) {
        this.votosValidos = BigDecimal.valueOf(validos);
        this.votosBrancos = BigDecimal.valueOf(brancos);
        this.votosNulos = BigDecimal.valueOf(nulos);

        this.totalEleitores = votosValidos.add(votosBrancos).add(votosNulos);
    }

    public BigDecimal getPercentualVotosValidos() {
    	return (votosValidos.divide(totalEleitores)).multiply(BigDecimal.valueOf(100l));
    }

    public BigDecimal getPercentualVotosBrancos() {
        return (votosBrancos.divide(totalEleitores)).multiply(BigDecimal.valueOf(100l));
    }

    public BigDecimal getPercentualVotosNulos() {
        return (votosNulos.divide(totalEleitores)).multiply(BigDecimal.valueOf(100l));
    }

	public static void main(String[] args) {
		
        final long votosValidos = 800;
        final long votosBrancos = 150;
        final long votosNulos = 50;

        VotosRelacaoTotalEleitores eleicao = new VotosRelacaoTotalEleitores(votosValidos, votosBrancos, votosNulos);

        System.out.println("Válidos: " + eleicao.getPercentualVotosValidos() + " %");
        System.out.println("Brancos: " + eleicao.getPercentualVotosBrancos() + " %");
        System.out.println("Nulos: " + eleicao.getPercentualVotosNulos() + " %");
		
	}

}