public class Contas {
    private double numeroUm;
    private double numeroDois;

    public double setNumeroUm(double novoValorNumeroUm) {
        return numeroUm = novoValorNumeroUm;
    }

    public double setNumeroDois(double novoValorNumeroDois) {
        return numeroDois = novoValorNumeroDois;
    }

    public double getNumeroUm() {
        return numeroUm;
    }

    public double getNumeroDois() {
        return numeroDois;
    }

    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtracao() {
        return numeroUm - numeroDois;
    }

    public double multiplicacao() {
        return numeroUm * numeroDois;
    }

    public double divisao() {
        return numeroUm / numeroDois;
    }

    public double potencia() {
        return Math.pow(numeroUm, numeroDois);
    }

    public double raiz() {
        return Math.sqrt(numeroUm);
    }
}