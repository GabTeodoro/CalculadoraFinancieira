package model;

public class FundoImob {

    private double precoCota;
    private double dividendo;
    private double rendimentoAnual;
    private double custoAnual;
    private double tempoEmpate;

    public FundoImob() {
    }

    public double getPrecoCota() {
        return precoCota;
    }

    public void setPrecoCota(double precoCota) {
        this.precoCota = precoCota;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public double getCustoAnual() {
        return custoAnual;
    }

    public void setCustoAnual(double custoAnual) {
        this.custoAnual = custoAnual;
    }

    public double getTempoEmpate() {
        return tempoEmpate;
    }

    public void setTempoEmpate(double tempoEmpate) {
        this.tempoEmpate = tempoEmpate;
    }

    public void calcularCustoAnual(){

        double custoAnual = (getPrecoCota() * 12);
        setCustoAnual(custoAnual);

    }

    public void calcularRendimentoAnual(){

        double rendAnual = (getDividendo() * 12) + (getDividendo() * 11) + (getDividendo() * 10) + 
        (getDividendo() * 9) + (getDividendo() * 8) + (getDividendo() * 7) + (getDividendo() * 6) + 
        (getDividendo() * 5) +(getDividendo() * 4) + (getDividendo() * 3) + (getDividendo() * 2) + 
        (getDividendo() * 1);

        setRendimentoAnual(rendAnual);
    }

    public void calcularEmpate(){

        double tempoEmpate = getPrecoCota() / getRendimentoAnual();
        setTempoEmpate(tempoEmpate);
        
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(custoAnual);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dividendo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(precoCota);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rendimentoAnual);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tempoEmpate);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FundoImob other = (FundoImob) obj;
        if (Double.doubleToLongBits(custoAnual) != Double.doubleToLongBits(other.custoAnual))
            return false;
        if (Double.doubleToLongBits(dividendo) != Double.doubleToLongBits(other.dividendo))
            return false;
        if (Double.doubleToLongBits(precoCota) != Double.doubleToLongBits(other.precoCota))
            return false;
        if (Double.doubleToLongBits(rendimentoAnual) != Double.doubleToLongBits(other.rendimentoAnual))
            return false;
        if (Double.doubleToLongBits(tempoEmpate) != Double.doubleToLongBits(other.tempoEmpate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FundoImob [custoAnual=" + custoAnual + ", dividendo=" + dividendo + ", precoCota=" + precoCota
                + ", rendimentoAnual=" + rendimentoAnual + ", tempoEmpate=" + tempoEmpate + "]";
    }

}
