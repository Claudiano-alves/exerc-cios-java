package Atividade.Ex6;

public class Main {
    public static void main(String[] args) {
    
        Agenda agenda = new Agenda();

        agenda.adicionarContato(new Contato("João", "123456789"));
        agenda.adicionarContato(new Contato("Maria", "987654321"));
        agenda.adicionarContato(new Contato("Pedro", "456789123"));

        agenda.exibirContatos();

        Contato contatoEncontrado = agenda.buscarContato("Maria");
        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado: " + contatoEncontrado);
        } else {
            System.out.println("Contato não encontrado.");
        }

        agenda.removerContato("Pedro");

        agenda.exibirContatos();
    }
}

