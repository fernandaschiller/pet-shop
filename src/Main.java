import Models.*;
import ResponseVO.ResponseVO;
import enums.EstadoAnimal;
import enums.Higiene;
import enums.Porte;
import enums.Vacinas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        PetShop petShop947 = new PetShop();

        List<ResponseVO> listaServicosPrestados = new ArrayList<ResponseVO>();

        // Criação pets:
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Lola");
        cachorro1.setEstado(EstadoAnimal.SUJO);
        cachorro1.setNascimento(new SimpleDateFormat( "ddMMyyyy" ).parse( "02032015"));
        cachorro1.setRaca("Yorkzu");
        cachorro1.setPorte(Porte.PEQUENO);
        cachorro1.setPeso(9.88);
        cachorro1.setObservacoes("Chegando no PetShop");

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Xerife");
        cachorro2.setEstado(EstadoAnimal.SUJO);
        cachorro2.setNascimento(new SimpleDateFormat( "ddMMyyyy" ).parse( "08032020"));
        cachorro2.setRaca("São Bernardo");
        cachorro2.setPorte(Porte.GRANDE);
        cachorro2.setPeso(62.5);
        cachorro2.setObservacoes("Chegando no PetShop");

        Gato gato1 = new Gato();
        gato1.setNome("Arturo");
        gato1.setEstado(EstadoAnimal.NORMAL);
        gato1.setNascimento(new SimpleDateFormat( "ddMMyyyy" ).parse( "08122019"));
        gato1.setRaca("Persa");
        gato1.setPorte(Porte.PEQUENO);
        gato1.setPeso(5.75);
        gato1.setObservacoes("Chegando no PetShop");

        List<Animal> animaisCliente1 = new ArrayList<>();
        animaisCliente1.add(cachorro1);

        List<Animal> animaisCliente2 = new ArrayList<>();
        animaisCliente2.add(cachorro2);
        animaisCliente2.add(gato1);

        // Criação clientes:
        // IDs Cliente -> 10001, 10002, 10003...

        Cliente cliente1 = new Cliente(10001, animaisCliente1);
        cliente1.setNome("Fernando");
        cliente1.setAnimal(animaisCliente1);

        Cliente cliente2 = new Cliente(10002, animaisCliente2);
        cliente2.setNome("Fernanda");
        cliente2.setAnimal(animaisCliente2);

        // Testes com Cliente 1:

        ResponseVO respostaAtendimento;
        System.out.println("Cliente: " + cliente1.getNome() + " || ID Cliente: " + cliente1.getId());
        System.out.println(cliente1.getAnimal().toString());

        System.out.println("----------------ATENDIMENTO----------------");
        respostaAtendimento = petShop947.atendimentoClinico(cliente1, cliente1.getAnimal(), String.valueOf(Vacinas.VACINA_2));
        listaServicosPrestados.add(respostaAtendimento);
        System.out.println(respostaAtendimento);
        System.out.println(respostaAtendimento.getCliente().getAnimal().toString());

        System.out.println("----------------VACINAÇÃO----------------");
        ResponseVO respostaVacinacao;
        respostaVacinacao = petShop947.vacinacao(respostaAtendimento.getCliente(), respostaAtendimento.getCliente().getAnimal(), respostaAtendimento.getCliente().getAnimal().get(0).getVacinas() ,respostaAtendimento.getCliente().getAnimal().get(0).getObservacoes());
        listaServicosPrestados.add(respostaVacinacao);
        System.out.println(respostaVacinacao);
        System.out.println(respostaVacinacao.getCliente().getAnimal().toString());

        System.out.println("----------------HIGIENIZAÇÃO----------------");
        ResponseVO respostaHigienizacao;
        respostaHigienizacao = petShop947.higienizacao(cliente1, cliente1.getAnimal(), Higiene.BANHO_E_TOSA, "Indo para banho e tosa");
        listaServicosPrestados.add(respostaHigienizacao);
        System.out.println(respostaHigienizacao);
        System.out.println(respostaHigienizacao.getCliente().getAnimal().toString());

        System.out.println("----------------VITRINE-ALIMENTOS----------------");
        petShop947.verAlimentos();
        System.out.println("----------------VITRINE-REMEDIOS----------------");
        petShop947.verRemedios();

        List<Remedio> listaRemediosComprados = new ArrayList<>();
        List<Alimentos> listaAlimentosComprados = new ArrayList<>();

        int numeroRemediosAleatorio = (int)(Math.random()*4+1);

        for(int i = 0; i <= numeroRemediosAleatorio; i++){
            listaRemediosComprados.add(petShop947.getRemediosList().get((int)(Math.random()*(10))));
        }

        int numeroAlimentosAleatorio = (int)(Math.random()*4+1);

        for(int i = 0; i <= numeroAlimentosAleatorio; i++){
            listaAlimentosComprados.add(petShop947.getAlimentosList().get((int)(Math.random()*(10))));
        }

        petShop947.pagamento(listaServicosPrestados, listaRemediosComprados, listaAlimentosComprados);
        System.out.println("******************************************************************************");

        // Testes com Cliente 2:

        listaServicosPrestados.clear();

        System.out.println("Cliente: " + cliente2.getNome() + " || ID Cliente: " + cliente2.getId());
        System.out.println(cliente2.getAnimal().toString());

        System.out.println("----------------ATENDIMENTO----------------");
        respostaAtendimento = petShop947.atendimentoClinico(cliente2, cliente2.getAnimal(), String.valueOf(Vacinas.VACINA_3));
        listaServicosPrestados.add(respostaAtendimento);
        System.out.println(respostaAtendimento);
        System.out.println(respostaAtendimento.getCliente().getAnimal().toString());

        System.out.println("----------------VACINAÇÃO----------------");

        respostaVacinacao = petShop947.vacinacao(respostaAtendimento.getCliente(), respostaAtendimento.getCliente().getAnimal(), respostaAtendimento.getCliente().getAnimal().get(0).getVacinas(), respostaAtendimento.getCliente().getAnimal().get(0).getObservacoes());
        listaServicosPrestados.add(respostaVacinacao);
        System.out.println(respostaVacinacao);
        System.out.println(respostaVacinacao.getCliente().getAnimal().toString());

        System.out.println("----------------HIGIENIZAÇÃO----------------");
        respostaHigienizacao = petShop947.higienizacao(cliente2, cliente2.getAnimal(), Higiene.BANHO, "Indo para banho");
        listaServicosPrestados.add(respostaHigienizacao);
        System.out.println(respostaHigienizacao);
        System.out.println(respostaHigienizacao.getCliente().getAnimal().toString());

        System.out.println("----------------ALIMENTOS----------------");
        petShop947.verAlimentos();
        System.out.println("----------------REMEDIOS----------------");
        petShop947.verRemedios();

        listaRemediosComprados.clear();
        listaAlimentosComprados.clear();

        numeroRemediosAleatorio = (int)(Math.random()*4+1);

        for(int i = 0; i <= numeroRemediosAleatorio; i++){
            listaRemediosComprados.add(petShop947.getRemediosList().get((int)(Math.random()*(10))));
        }

        numeroAlimentosAleatorio = (int)(Math.random()*4+1);

        for(int i = 0; i <= numeroAlimentosAleatorio; i++){
            listaAlimentosComprados.add(petShop947.getAlimentosList().get((int)(Math.random()*(10))));
        }

        petShop947.pagamento(listaServicosPrestados, listaRemediosComprados, listaAlimentosComprados);
    }
}
