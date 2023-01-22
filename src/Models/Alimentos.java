package Models;

import java.math.BigDecimal;
import java.util.Locale;

public class Alimentos {

    int idAlimentos;
    String nome;
    BigDecimal preco;

    public Alimentos(int idAlimentos, String nome, BigDecimal preco) {
        this.idAlimentos = idAlimentos;
        this.nome = nome;
        this.preco = preco;
    }
    public Alimentos(){};
    public int getIdAlimentos() {
        return idAlimentos;
    }

    public void setIdAlimentos(int idAlimentos) {
        this.idAlimentos = idAlimentos;
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
        return "Alimentos{" +
                "idAlimentos=" + idAlimentos +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
