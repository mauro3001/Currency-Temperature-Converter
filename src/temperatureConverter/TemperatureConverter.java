package temperatureConverter;

import javax.swing.*;

public class TemperatureConverter {
    public double ConvertCelciusToFarenheit(double value){
        double farenheit = value * 1.8 + 32;
        farenheit = Math.round(farenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, + value + " Grados Celcius son " + farenheit + " Grados Farenheit ");
        return farenheit;
    }
    public void ConvertCelciusToKelvin(double value){
        double kelvin = value + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, + value + " Grados Celcius son " + kelvin + " Kelvin");
    }

    public void ConvertFarenheitToCelcius(double value) {
        double celcius = (value - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, + value + " Grados Farenheit son " + celcius + " Celcius");
    }

    public double ConvertKelvinToCelcius(double value) {
        double celcuis = value - 273.15;
        celcuis = (double) Math.round(celcuis *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " Kelvin son " + celcuis + " Celcius");
        return celcuis;
    }

    public void ConvertKelvinToFarenheit(double value) {
        double kelvinFarenheit = ConvertKelvinToCelcius(value);
        kelvinFarenheit = ConvertCelciusToFarenheit(kelvinFarenheit);
        kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " Kelvin son " + kelvinFarenheit + " Celcius");
    }
}
