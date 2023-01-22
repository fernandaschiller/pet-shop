package enums;

import java.math.BigDecimal;

public enum Vacinas {

    VACINA_1(BigDecimal.valueOf(10)),
    VACINA_2(BigDecimal.valueOf(20)),
    VACINA_3(BigDecimal.valueOf(30)),
    VACINA_4(BigDecimal.valueOf(40)),
    VACINA_5(BigDecimal.valueOf(50));
    private BigDecimal valor;
    Vacinas(BigDecimal valorVacina){
        this.valor=valorVacina;
    }
    public BigDecimal getValor(){
        return valor;
    }

    public String toString(Vacinas vacina){
        return vacina.name();
    }
}
