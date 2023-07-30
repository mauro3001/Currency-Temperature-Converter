package enums;

public enum ConverterMessages {
    OPTIONS_CONVERTER("Seleccione una opcion de conversion"),
    CHOOSE_OPTION_CONVERT("Elije la moneda a la que deseas convertir tu dinero"),
    TITLE_DIALOG("Monedas"),
    DEFAULT_DIALOG("Seleccion"),
    MENU_DIALOG("Menu"),
    MONEY_COUNT("Igresa la cantidad de dinero que desea convertir: "),
    INVALID_VALUE("Valor invalido"),
    OTHER_CONVERTION("¿Deseas realizar otra conversión?"),
    PROCESS_END("Programa terminado"),
    TEMPERATURE_VALUE("Ingrese el valor de la temperatura que desea convertir: "),
    TEMPERATURE_OPTION("Elige una opcion para convertir"),
    TEMPERATURE_DIALOG("Temperatura"),
    SERIE_SUBSERIE_FIELDSAGAC("Campos de la serie/subserie incorrectos."),
    SERIE_SUBSERIE_NOT_FOUND("Serie/subserie no encontrada.");
    private final String message;
    ConverterMessages(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }

}
