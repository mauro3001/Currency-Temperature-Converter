package currencyConverter;
import javax.swing.JOptionPane;

public class CurrencyConverter {
    public void ConvertPesosToDollars(double value){
        double valueDollar = value / 3924.78;
        valueDollar = (double) Math.round(valueDollar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+ valueDollar + " Dolares");
    }

    public void ConvertPesosToEuros(double value){
        double valueEuro = value / 4328.87;
        valueEuro = (double) Math.round(valueEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+ valueEuro + " Euros");
    }

    public void ConvertPesosToWon(double value){
        double valueWon = value / 3.09;
        valueWon = (double) Math.round(valueWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+ valueWon + " Wons");
    }
    public void ConvertPesosToLibras(double value){
        double valueLibra = value / 5050.09;
        valueLibra = (double) Math.round(valueLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+ valueLibra + " Libras Esterlinas");
    }
    public void ConvertPesosToYen(double value){
        double valueYen = value / 27.87;
        valueYen = (double) Math.round(valueYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ "+ valueYen + " Yuanes");
    }
}
