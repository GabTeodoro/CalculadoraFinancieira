package model;

public class JurosComposto extends Juros {


    public void calcularMontanteComposto() {

        double montante = getValorInicial() * Math.pow((1 + getTaxa() / 100), getTempo());
        setValorFinal(montante);

    }

    public void calcularJurosComposto(){

        double juros = getValorFinal() - getValorInicial();
        setLucro(juros);
    }
    
}
