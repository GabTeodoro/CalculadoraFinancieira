package model;

public abstract class Juros {
   
    protected double valorInicial;
    protected double taxa;
    protected double tempo;
    protected double lucro;
    protected double valorFinal;

    public Juros() {
    }
    
    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    @Override
    public String toString() {
        return "Juros [lucro=" + lucro + ", taxa=" + taxa + ", tempo=" + tempo + ", valorFinal=" + valorFinal
                + ", valorInicial=" + valorInicial + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(lucro);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(taxa);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tempo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valorFinal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valorInicial);
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
        Juros other = (Juros) obj;
        if (Double.doubleToLongBits(lucro) != Double.doubleToLongBits(other.lucro))
            return false;
        if (Double.doubleToLongBits(taxa) != Double.doubleToLongBits(other.taxa))
            return false;
        if (Double.doubleToLongBits(tempo) != Double.doubleToLongBits(other.tempo))
            return false;
        if (Double.doubleToLongBits(valorFinal) != Double.doubleToLongBits(other.valorFinal))
            return false;
        if (Double.doubleToLongBits(valorInicial) != Double.doubleToLongBits(other.valorInicial))
            return false;
        return true;
    }

}
