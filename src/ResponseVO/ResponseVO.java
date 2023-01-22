package ResponseVO;

import Models.Cliente;
import enums.Servicos;

import java.math.BigDecimal;

public class ResponseVO {

    private int id;
    private Servicos servico;
    private BigDecimal valor;
    private Cliente cliente;
    public ResponseVO(){}
    public ResponseVO(int id, Servicos servico, BigDecimal valor, Cliente cliente) {
        this.id = id;
        this.servico = servico;
        this.valor = valor;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Servicos getServico() {
        return servico;
    }
    public void setServico(Servicos servico) {
        this.servico = servico;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ResponseVO.ResponseVO{" +
                "id=" + id +
                ", servico=" + servico +
                ", valor=" + valor +
                ", cliente=" + cliente.getId() +
                '}';
    }
}
