import Models.*;
import ResponseVO.ResponseVO;
import Utils.CriacaoListas;
import enums.EstadoAnimal;
import enums.Higiene;
import enums.Servicos;
import enums.Vacinas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PetShop {
    private String cnpj;
    private Endereco endereco;
    private List<Remedio> remediosList = CriacaoListas.criarListaRemedios();
    private List<Alimentos> alimentosList = CriacaoListas.criarListaAlimentos();

    public PetShop(String cnpj, Endereco endereco, List<Remedio> remediosList, List<Alimentos> alimentosList) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.remediosList = remediosList;
        this.alimentosList = alimentosList;
    }

    public PetShop() {}

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public List<Remedio> getRemediosList() {
        return this.remediosList;
    }
    public List<Alimentos> getAlimentosList() {
        return this.alimentosList;
    }

    final int ID_HIGIENIZAR = 1;
    final int ID_ATENDIMENTO = 2;
    final int ID_VACINAR = 3;
    final BigDecimal PRECO_BANHO = BigDecimal.valueOf(40);
    final BigDecimal PRECO_BANHO_TOSA = BigDecimal.valueOf(60);
    final BigDecimal PRECO_TOSA = BigDecimal.valueOf(50);
    final BigDecimal PRECO_ATENDIMENTO = BigDecimal.valueOf(100);
    final BigDecimal PRECO_VACINACAO = BigDecimal.valueOf(30);

    public ResponseVO higienizacao (Cliente cliente, List<Animal> animais, Higiene higiene, String observacao) {

        ResponseVO higienizado = new ResponseVO();
        List<Animal> listaTempPets= new ArrayList<Animal>();

        for (int i = 0; i < animais.size(); i++) {
            Animal bicho = animais.get(i);
            if (higiene.equals(Higiene.BANHO)) {
                bicho.setEstado(EstadoAnimal.LIMPO);
                bicho.setObservacoes("Limpinho!");
                higienizado.setValor(PRECO_BANHO);
            }
            if (higiene.equals(Higiene.TOSA)) {
                bicho.setEstado(EstadoAnimal.TOSADO);
                bicho.setObservacoes("Tosado!");
                higienizado.setValor(PRECO_TOSA);
            }
            if (higiene.equals(Higiene.BANHO_E_TOSA)){
                bicho.setEstado(EstadoAnimal.LIMPO_E_TOSADO);
                bicho.setObservacoes("Limpinho e tosado!");
                higienizado.setValor(PRECO_BANHO_TOSA);
            }
            listaTempPets.add(bicho);
            higienizado.setId(ID_HIGIENIZAR);
            higienizado.setServico(Servicos.HIGIENIZAR);
            higienizado.setCliente(cliente);
        }
        return higienizado;
    }

    public ResponseVO atendimentoClinico (Cliente cliente, List<Animal> animais, String observacao) {

        ResponseVO diagnostico = new ResponseVO();
        List<Animal> listaTempPets= new ArrayList<Animal>();

        for (int i = 0; i < animais.size(); i++) {
            Animal bicho = animais.get(i);

            if (observacao.equals(Vacinas.VACINA_1.name())){
                bicho.setObservacoes(Vacinas.VACINA_1.name());
            }
            if (observacao.equals(Vacinas.VACINA_2.name())) {
                bicho.setObservacoes(Vacinas.VACINA_2.name());
            }
            if (observacao.equals(Vacinas.VACINA_3.name())) {
                bicho.setObservacoes(Vacinas.VACINA_3.name());
            }
            if (observacao.equals(Vacinas.VACINA_4.name())) {
                bicho.setObservacoes(Vacinas.VACINA_4.name());
            }
            if (observacao.equals(Vacinas.VACINA_5.name())) {
                bicho.setObservacoes(Vacinas.VACINA_5.name());
            }

            listaTempPets.add(bicho);
            cliente.setAnimal(listaTempPets);
            diagnostico.setId(ID_ATENDIMENTO);
            diagnostico.setServico(Servicos.ATENDIMENTO_CLINICO);
            diagnostico.setValor(PRECO_ATENDIMENTO);
            diagnostico.setCliente(cliente);
        }
        return diagnostico;
    }

    public ResponseVO vacinacao (Cliente cliente, List<Animal> animais, List<EsquemaVacinal> vacinas,  String observacao) {

        ResponseVO vacinado = new ResponseVO();
        List<Animal> listaTempPets= new ArrayList<Animal>();
        EsquemaVacinal esquemaVacinal = new EsquemaVacinal();
        List<EsquemaVacinal> listaTempVacinas= new ArrayList<EsquemaVacinal>();
        BigDecimal totalVacinas = new BigDecimal(0);

        esquemaVacinal.setData(new Date());

        for (int i = 0; i < animais.size(); i++) {
            Animal bicho = animais.get(i);
            if (observacao.equals(Vacinas.VACINA_1.name())){
                esquemaVacinal.setVacina(Vacinas.VACINA_1);
                totalVacinas = totalVacinas.add(PRECO_VACINACAO.add(Vacinas.VACINA_1.getValor()));
            }
            if (observacao.equals(Vacinas.VACINA_2.name())) {
                esquemaVacinal.setVacina(Vacinas.VACINA_2);
                totalVacinas = totalVacinas.add(PRECO_VACINACAO.add(Vacinas.VACINA_2.getValor()));
            }
            if (observacao.equals(Vacinas.VACINA_3.name())) {
                esquemaVacinal.setVacina(Vacinas.VACINA_3);
                totalVacinas = totalVacinas.add(PRECO_VACINACAO.add(Vacinas.VACINA_3.getValor()));
            }
            if (observacao.equals(Vacinas.VACINA_4.name())) {
                esquemaVacinal.setVacina(Vacinas.VACINA_4);
                totalVacinas = totalVacinas.add(PRECO_VACINACAO.add(Vacinas.VACINA_4.getValor()));
            }
            if (observacao.equals(Vacinas.VACINA_5.name())) {
                esquemaVacinal.setVacina(Vacinas.VACINA_5);
                totalVacinas = totalVacinas.add(PRECO_VACINACAO.add(Vacinas.VACINA_5.getValor()));
            }

            esquemaVacinal.setObservacao("Vacina Realizada");
            listaTempVacinas.add(esquemaVacinal);
            bicho.setVacinas(listaTempVacinas);
            bicho.setObservacoes(null);
            listaTempPets.add(bicho);
            cliente.setAnimal(listaTempPets);
            vacinado.setId(ID_VACINAR);
            vacinado.setServico(Servicos.VACINACAO);
            vacinado.setCliente(cliente);

        }
        vacinado.setValor(totalVacinas);
        return vacinado;
    }

    void verRemedios() {
        remediosList.forEach(remedio -> System.out.println(remedio));
    }

    void verAlimentos() {
        alimentosList.forEach(alimento -> System.out.println(alimento));
    }

    public void pagamento (List<ResponseVO> listaServicos, List<Remedio> listaRemediosComprados, List<Alimentos> listaAlimentosComprados) {

        BigDecimal total = new BigDecimal(0);

        System.out.println("------------RELATÓRIO DE SERVIÇOS PRESTADOS------------");
        for(ResponseVO servico : listaServicos) {
            System.out.print("Id serviço = " + servico.getId() + " ");
            System.out.print("Serviço = " + servico.getServico() + " ");
            System.out.print("Valor = " + servico.getValor() + " ");
            System.out.println("");
            total = total.add(servico.getValor());
        }
        System.out.println("------------RELATÓRIO DE COMPRAS DE PRODUTOS------------");
        for (Remedio remedio : listaRemediosComprados) {
            System.out.print("Id remédio = " + remedio.getIdRemedio() + " ");
            System.out.print("Nome = " + remedio.getNome() + " ");
            System.out.print("Valor = " + remedio.getPreco() + " ");
            System.out.println("");
            total = total.add((remedio.getPreco()));
        }
        for (Alimentos alimento : listaAlimentosComprados) {
            System.out.print("Id alimento = " + alimento.getIdAlimentos() + " ");
            System.out.print("Nome = " + alimento.getNome() + " ");
            System.out.print("Valor = " + alimento.getPreco().toString() + " ");
            System.out.println("");
            total = total.add((alimento.getPreco()));
        }
        System.out.println("-------------------------TOTAL-------------------------");
        System.out.println("Total a pagar= " + total);
    }
}
