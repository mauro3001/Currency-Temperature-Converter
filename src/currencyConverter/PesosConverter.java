package currencyConverter;

import javax.swing.*;

public class PesosConverter {
    public void ConvertDollarsToPesos(double value) {
        double valuePesos = value * 3924.78;
        valuePesos = (double) Math.round(valuePesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + valuePesos + " Pesos Colombianos");
    }
    public void ConvertEurosToPesos(double value) {
        double valuePesos = value * 4328.87;
        valuePesos = (double) Math.round(valuePesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + valuePesos + " Pesos Colombianos");
    }
    public void ConvertirWonAPesos(double value) {
        double valuePesos = value * 3.09;
        valuePesos = (double) Math.round(valuePesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + valuePesos + " Pesos Colombianos");
    }
    public void ConvertLibrasToPesos(double value) {
        double pesosValue = value * 5050.09;
        pesosValue = (double) Math.round(pesosValue *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosValue + " Pesos Colombianos");
    }
    public void ConvertYenToPesos(double value) {
        double pesosValue = value * 27.87;
        pesosValue = (double) Math.round(pesosValue *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesosValue + " Pesos Colombianos");
    }
}
