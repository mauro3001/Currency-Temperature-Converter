package currencyConverter;

import enums.ConverterMessages;

import javax.swing.*;

public class FunctionCurrency {

    CurrencyConverter currencyConverter = new CurrencyConverter();
    PesosConverter pesosConverter = new PesosConverter();
    public void CurrencyConverter(double money){
        String option = (String) JOptionPane.showInputDialog(
                null,
                ConverterMessages.CHOOSE_OPTION_CONVERT.getMessage(), // Dialog box message
                ConverterMessages.TITLE_DIALOG.getMessage(),// Dialog box title
                JOptionPane.PLAIN_MESSAGE,               // Message type
                null,                                    // Dialog Box Icon
                new Object[] {                           // Options to choose
                        "De Pesos a Dolares",
                        "De Pesos a Euros",
                        "De Pesos a Wons",
                        "De Pesos a Libras Esterlinas",
                        "De Pesos a Yuanes",
                        "De Dolar a Pesos",
                        "De Euros a Pesos",
                        "De Wons a Pesos",
                        "De Libras Esterlinas a Pesos",
                        "De Yuanes a Pesos"
                },
                ConverterMessages.DEFAULT_DIALOG.getMessage()   // Default value selected
        ).toString();
        switch (option){
            case "De Pesos a Dolares":
                currencyConverter.ConvertPesosToDollars(money);
                break;
            case "De Pesos a Euros":
                currencyConverter.ConvertPesosToEuros(money);
                break;
            case "De Pesos a Wons":
                currencyConverter.ConvertPesosToWon(money);
                break;
            case "De Pesos a Libras Esterlinas":
                currencyConverter.ConvertPesosToLibras(money);
                break;
            case "De Pesos a Yuanes":
                currencyConverter.ConvertPesosToYen(money);
                break;
            case "De Dolar a Pesos":
                pesosConverter.ConvertDollarsToPesos(money);
                break;
            case "De Euros a Pesos":
                pesosConverter.ConvertEurosToPesos(money);
                break;
            case "De Wons a Pesos":
                pesosConverter.ConvertirWonAPesos(money);
                break;
            case "De Libras Esterlinas a Pesos":
                pesosConverter.ConvertLibrasToPesos(money);
                break;
            case "De Yuanes a Pesos":
                pesosConverter.ConvertYenToPesos(money);
                break;
        }
    }
}
