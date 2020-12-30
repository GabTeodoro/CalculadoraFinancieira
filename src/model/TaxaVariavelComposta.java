package model;

public class TaxaVariavelComposta extends JurosComposto{

    private double taxaVariavel;
    
    public double getTaxaVariavel() {
        return taxaVariavel;
    }

    public void setTaxaVariavel(double taxaVariavel) {
        this.taxaVariavel = taxaVariavel;
    }
    
    @Override
    public void calcularMontanteComposto() {
      
        double montante = getValorInicial() * Math.pow((1 + (getTaxa() / 100) + (getTaxaVariavel() / 100)), getTempo());
        setValorFinal(montante);
    }

    @Override
    public void calcularJurosComposto() {
        
        super.calcularJurosComposto();
    }
}
