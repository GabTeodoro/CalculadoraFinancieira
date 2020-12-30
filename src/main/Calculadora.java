package main;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

import model.FundoImob;
import model.JurosComposto;
import model.JurosSimples;
import model.TaxaVariavel;
import model.TaxaVariavelComposta;

public class Calculadora {
        public static void main(String[] args) {

                int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                                "Qual o tipo de calculo que deseja escolher? " + "\n(1) Juros simples? "
                                                + "\n(2) Juros Composto?" + "\n(3) Taxa variável com juros simples? "
                                                + "\n(4) Taxa variável com juros compostos?"
                                                + "\n(5) Calcular lucro em fundo imobiliário?"));

                Locale localeBR = new Locale("pt", "BR");
                NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
                DecimalFormat df = new DecimalFormat("###,##0.0");

                if (escolha == 1) {

                        String valorInicial = JOptionPane.showInputDialog("Qual o valor que deseja investir?");
                        String taxa = JOptionPane.showInputDialog("Qual a taxa (%)?");
                        String tempo = JOptionPane.showInputDialog("Quanto tempo de investimento (anos)?");

                        JurosSimples js = new JurosSimples();

                        js.setValorInicial(Double.valueOf(valorInicial));
                        js.setTaxa(Double.valueOf(taxa));
                        js.setTempo(Double.valueOf(tempo));

                        js.calcularLucroSimples();
                        js.calcularValorFinal();

                        JOptionPane.showMessageDialog(null, "Calculando Juros Simples: " + "\nValor Inicial: R$"
                                        + dinheiro.format(js.getValorInicial()) + "\nTaxa: " + js.getTaxa() + "%"
                                        + "\nTempo: " + js.getTempo() + "\nLucro: R$" + dinheiro.format(js.getLucro())
                                        + "\nValor Final: R$" + dinheiro.format(js.getValorFinal()));

                } else if (escolha == 2) {

                        String valorInicial = JOptionPane.showInputDialog("Qual o valor que deseja investir?");
                        String taxa = JOptionPane.showInputDialog("Qual a taxa (%)?");
                        String tempo = JOptionPane.showInputDialog("Quanto tempo de investimento (anos)?");

                        JurosComposto jc = new JurosComposto();

                        jc.setValorInicial(Double.valueOf(valorInicial));
                        jc.setTaxa(Double.valueOf(taxa));
                        jc.setTempo(Double.valueOf(tempo));

                        jc.calcularMontanteComposto();
                        jc.calcularJurosComposto();

                        JOptionPane.showMessageDialog(null, "Calculando Juros Composto: " + "\nValor Inicial: R$"
                                        + dinheiro.format(jc.getValorInicial()) + "\nTaxa: " + jc.getTaxa() + "%"
                                        + "\nTempo: " + jc.getTempo() + "\nLucro: R$" + dinheiro.format(jc.getLucro())
                                        + "\nValor Final: R$" + dinheiro.format(jc.getValorFinal()));

                } else if (escolha == 3) {

                        String valorInicial = JOptionPane.showInputDialog("Qual o valor que deseja investir?");
                        String taxa = JOptionPane.showInputDialog("Qual a taxa (%)?");
                        String taxaVariavel = JOptionPane.showInputDialog("Qual a segunda taxa (%)?");
                        String tempo = JOptionPane.showInputDialog("Quanto tempo de investimento (anos)?");

                        TaxaVariavel tv = new TaxaVariavel();

                        tv.setValorInicial(Double.valueOf(valorInicial));
                        tv.setTaxa(Double.valueOf(taxa));
                        tv.setTaxaVariavel(Double.valueOf(taxaVariavel));
                        tv.setTempo(Double.valueOf(tempo));

                        tv.calcularLucroSimples();
                        tv.calcularValorFinal();

                        JOptionPane.showMessageDialog(null,
                                        "Calculando taxa variável com juros simples: " + "\nValor Inicial: R$"
                                                        + dinheiro.format(tv.getValorInicial()) + "\nTaxa: "
                                                        + (tv.getTaxa() + tv.getTaxaVariavel()) + "%" + "\nTempo: "
                                                        + tv.getTempo() + "\nLucro: R$" + dinheiro.format(tv.getLucro())
                                                        + "\nValor Final: R$" + dinheiro.format(tv.getValorFinal()));

                } else if (escolha == 4) {

                        String valorInicial = JOptionPane.showInputDialog("Qual o valor que deseja investir?");
                        String taxa = JOptionPane.showInputDialog("Qual a taxa (%)?");
                        String taxaVariavel = JOptionPane.showInputDialog("Qual a segunda taxa (%)?");
                        String tempo = JOptionPane.showInputDialog("Quanto tempo de investimento (anos)?");

                        TaxaVariavelComposta tvc = new TaxaVariavelComposta();

                        tvc.setValorInicial(Double.valueOf(valorInicial));
                        tvc.setTaxa(Double.valueOf(taxa));
                        tvc.setTaxaVariavel(Double.valueOf(taxaVariavel));
                        tvc.setTempo(Double.valueOf(tempo));

                        tvc.calcularMontanteComposto();
                        tvc.calcularJurosComposto();

                        JOptionPane.showMessageDialog(null, "Calculando taxa variável com juros compostos: "
                                        + "\nValor Inicial: R$" + dinheiro.format(tvc.getValorInicial()) + "\nTaxa: "
                                        + (tvc.getTaxa() + tvc.getTaxaVariavel()) + "%" + "\nTempo: " + tvc.getTempo()
                                        + "\nLucro: R$" + dinheiro.format(tvc.getLucro()) + "\nValor Final: R$"
                                        + dinheiro.format(tvc.getValorFinal()));

                } else {

                        String precoCota = JOptionPane.showInputDialog("Qual o preço da cota?");
                        String dividendo = JOptionPane.showInputDialog("Qual o dividendo?");

                        FundoImob fi = new FundoImob();

                        fi.setPrecoCota(Double.valueOf(precoCota));
                        fi.setDividendo(Double.valueOf(dividendo));

                        fi.calcularCustoAnual();
                        fi.calcularRendimentoAnual();
                        fi.calcularEmpate();

                        JOptionPane.showMessageDialog(null, "Calculando Valores do fundo imobiliário: "
                                        + "\nPreço da cota: R$" + dinheiro.format(fi.getPrecoCota())
                                        + "\nPreço do dividendo: R$" + dinheiro.format(fi.getDividendo())
                                        + "\nCusto estimado em um ano: R$" + dinheiro.format(fi.getCustoAnual())
                                        + "\nDividendo estimando em um ano: R$"
                                        + dinheiro.format(fi.getRendimentoAnual()) + "\nTempo de empate: "
                                        + df.format(fi.getTempoEmpate()));
                }
        }

}
