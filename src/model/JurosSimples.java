package model;

public class JurosSimples extends Juros {

    public void calcularLucroSimples() {

        double lucro = getValorInicial() * getTaxa() / 100 * getTempo();
        setLucro(lucro);

    }

    public void calcularValorFinal(){

        double valorFinal = getValorInicial() + getLucro();
        setValorFinal(valorFinal);
        
    }
}
