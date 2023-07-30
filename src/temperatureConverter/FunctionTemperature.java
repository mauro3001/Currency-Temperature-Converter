package temperatureConverter;

import enums.ConverterMessages;

import javax.swing.*;

public class FunctionTemperature {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    public void TemperatureConverter(double temperature){
        String option = (String) JOptionPane.showInputDialog(
                null,
                ConverterMessages.TEMPERATURE_OPTION.getMessage(), // Dialog box message
                ConverterMessages.TEMPERATURE_DIALOG.getMessage(),// Dialog box title
                JOptionPane.PLAIN_MESSAGE,               // Message type
                null,                                    // Dialog Box Icon
                new Object[] {                           // Options to choose
                        "Grados Celcius a Grados Farenheit",
                        "Grados Celcius a Kelvin",
                        "Grados Farenheit a Grados Celcius",
                        "Kelvin a Grados Celcius",
                        "Kelvin a Grados Farenheit",
                },
                ConverterMessages.DEFAULT_DIALOG.getMessage()   // Default value selected
        ).toString();
        switch (option){
            case "Grados Celcius a Grados Farenheit":
                temperatureConverter.ConvertCelciusToFarenheit(temperature);
                break;
            case "Grados Celcius a Kelvin":
                temperatureConverter.ConvertCelciusToKelvin(temperature);
                break;
            case "Grados Farenheit a Grados Celcius":
                temperatureConverter.ConvertFarenheitToCelcius(temperature);
                break;
            case "Kelvin a Grados Celcius":
                temperatureConverter.ConvertKelvinToCelcius(temperature);
                break;
            case "Kelvin a Grados Farenheit":
                temperatureConverter.ConvertKelvinToFarenheit(temperature);
                break;
        }
    }
}
