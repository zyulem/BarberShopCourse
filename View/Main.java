package View;

import Model.Agendamento;
import Model.Servico;
import Model.Cliente;
import Model.Usuario;
        
public class Main {
    
    public static void main(String[] args) {
        String nome = "Thiago";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "Barba", 30.0F);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente("Rua Paraná","123456",1,"João");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario("senha",2,"Pedro");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30.0F,"11/04/2020 09:15");
        System.out.println(agendamento.getCliente().getNome());
    }
}
