import currencyConverter.FunctionCurrency;
import enums.ConverterMessages;
import temperatureConverter.FunctionTemperature;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        FunctionCurrency functionCurrency = new FunctionCurrency();
        FunctionTemperature functionTemperature = new FunctionTemperature();

        while(true){

            String options = ( (String) JOptionPane.showInputDialog(
                    null,
                    ConverterMessages.OPTIONS_CONVERTER.getMessage(),
                    ConverterMessages.MENU_DIALOG.getMessage(),
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[] {
                            "Conversor de Moneda",
                            "Conversor de Temperatura"
                    },
                    ConverterMessages.DEFAULT_DIALOG.getMessage())).toString();

            switch (options) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog(ConverterMessages.MONEY_COUNT.getMessage());
                    if (NumberValidate(input) == true) {
                        double optionSelected = Double.parseDouble(input);
                        functionCurrency.CurrencyConverter(optionSelected);

                        int answer = JOptionPane.showConfirmDialog(null,
                                ConverterMessages.OTHER_CONVERTION.getMessage());
                        if (JOptionPane.OK_OPTION == answer) {
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    ConverterMessages.PROCESS_END.getMessage());
                        }

                    } else {
                        JOptionPane.showMessageDialog(null,
                                ConverterMessages.INVALID_VALUE.getMessage());
                    }
                    break;
                case "Conversor de Temperatura":
                    String data = JOptionPane.showInputDialog(ConverterMessages.TEMPERATURE_VALUE.getMessage());
                    if (NumberValidate(data) == true) {
                        double selectedOption = Double.parseDouble(data);
                        functionTemperature.TemperatureConverter(selectedOption);

                        int answer = JOptionPane.showConfirmDialog(null,
                                ConverterMessages.OTHER_CONVERTION.getMessage());
                        if (JOptionPane.OK_OPTION == answer) {
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    ConverterMessages.PROCESS_END.getMessage());
                        }

                    } else {
                        JOptionPane.showMessageDialog(null,
                                ConverterMessages.INVALID_VALUE.getMessage());
                    }
                    break;
            }
        }
    }
    public static boolean NumberValidate(String input) {

        try {
            double number = Double.parseDouble(input);
            if (number >= 0) {
                return true;
            }
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}