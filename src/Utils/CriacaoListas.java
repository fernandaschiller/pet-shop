package Utils;

import Models.Alimentos;
import Models.Remedio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class CriacaoListas {
    public static List<Alimentos> criarListaAlimentos(){
        Alimentos alimento1 = new Alimentos(130, "Ração Filhotes Cães", new BigDecimal(15.90).setScale(2, RoundingMode.FLOOR));
        Alimentos alimento2 = new Alimentos(131, "Ração Adultos Cães", new BigDecimal(13.90).setScale(2, RoundingMode.FLOOR));
        Alimentos alimento3 = new Alimentos(132, "Petiscos", new BigDecimal(3.90).setScale(2, RoundingMode.FLOOR));
        Alimentos alimento4 = new Alimentos(133, "Sachê Frango", new BigDecimal(5.90).setScale(2, RoundingMode.FLOOR));
        Alimentos alimento5 = new Alimentos(134, "Sachê Carne", new BigDecimal(5.90).setScale(2, RoundingMode.FLOOR));
        Alimentos alimento6 = new Alimentos(135, "Sachê Vegetais", new BigDecimal(5.90).setScale(2, RoundingMode.FLOOR));
        Alimentos alimento7 = new Alimentos(136, "Ração Filhotes Gato", new BigDecimal(12.90).setScale(2, RoundingMode.FLOOR));
        Alimentos alimento8 = new Alimentos(137, "Ração Adultos Gato", new BigDecimal(14.90).setScale(2, RoundingMode.FLOOR));
        Alimentos alimento9 = new Alimentos(138, "Ração Cães Diabéticos", new BigDecimal(21.90).setScale(2, RoundingMode.FLOOR));
        Alimentos alimento10 = new Alimentos(139, "Ração Filhotes sem gluten", new BigDecimal(19.90).setScale(2, RoundingMode.FLOOR));

        return Arrays.asList(alimento1, alimento2, alimento3, alimento4, alimento5, alimento6, alimento7, alimento8, alimento9, alimento10);
    }

    public static List<Remedio> criarListaRemedios() {

        Remedio remedio1 = new Remedio(230, "Vermifugo", new BigDecimal(10.90).setScale(2, RoundingMode.FLOOR));
        Remedio remedio2 = new Remedio(231, "Front-line", new BigDecimal(55.90).setScale(2, RoundingMode.FLOOR));
        Remedio remedio3 = new Remedio(232, "Colírio", new BigDecimal(12.90).setScale(2, RoundingMode.FLOOR));
        Remedio remedio4 = new Remedio(233, "Bravecto", new BigDecimal(120.90).setScale(2, RoundingMode.FLOOR));
        Remedio remedio5 = new Remedio(234, "Otolin", new BigDecimal(28.90).setScale(2, RoundingMode.FLOOR));
        Remedio remedio6 = new Remedio(235, "Chemitril", new BigDecimal(12.90).setScale(2, RoundingMode.FLOOR));
        Remedio remedio7 = new Remedio(236, "Neotopic", new BigDecimal(25.90).setScale(2, RoundingMode.FLOOR));
        Remedio remedio8 = new Remedio(237, "Carbovet", new BigDecimal(21.90).setScale(2, RoundingMode.FLOOR));
        Remedio remedio9 = new Remedio(238, "Drontal", new BigDecimal(34.90).setScale(2, RoundingMode.FLOOR));
        Remedio remedio10 = new Remedio(239, "Otordemin", new BigDecimal(20.90).setScale(2, RoundingMode.FLOOR));

        return Arrays.asList(remedio1, remedio2, remedio3, remedio4, remedio5, remedio6, remedio7, remedio8, remedio9, remedio10);
    }
}
