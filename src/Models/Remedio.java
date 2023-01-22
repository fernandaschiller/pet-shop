package Models;

import java.math.BigDecimal;
import java.util.Locale;

public class Remedio {

    int idRemedio;
    String nome;
    BigDecimal preco;

    public Remedio(int idRemedio, String nome, BigDecimal preco) {
        this.idRemedio = idRemedio;
        this.nome = nome;
        this.preco = preco;
    }

    public Remedio(){}
    public int getIdRemedio() {
        return idRemedio;
    }

    public void setIdRemedio(int idRemedio) {
        this.idRemedio = idRemedio;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Remedio{" +
                "idRemedio=" + idRemedio +
                ", nome='" + nome + '\'' +
                ", preco=" + String.format(Locale.getDefault(), "%.2f",preco) +
                '}';
    }
}
