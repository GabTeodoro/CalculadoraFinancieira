package model;

public class TaxaVariavel extends JurosSimples {

    private double taxaVariavel;
    
    public double getTaxaVariavel() {
        return taxaVariavel;
    }

    public void setTaxaVariavel(double taxaVariavel) {
        this.taxaVariavel = taxaVariavel;
    }

    @Override
    public void calcularLucroSimples() {
        
        double lucro = getValorInicial() * (getTaxa() / 100 + getTaxaVariavel() / 100) * getTempo();
        setLucro(lucro);
    }

    @Override
    public void calcularValorFinal() {
        
        super.calcularValorFinal();
    }

    
}
