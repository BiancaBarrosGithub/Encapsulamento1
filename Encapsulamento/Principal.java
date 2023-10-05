package Encapsulamento;

import Encapsulamento.Cliente.Cliente;
import Encapsulamento.Endereco.Endereco;
import Encapsulamento.ItemTema.ItemTema;
import Encapsulamento.Tema.Tema;

public class Principal {

	public static void main(String[] args) {
		Tema tema = new Tema(1, "carnaval", 3000.00, "vermelho");
		ItemTema itemTema = new ItemTema(2,"Bianca", "Trabalho");
		Endereco endereco = new Endereco (3,"oi", 25,"completar", "vila sonia", "itapetininga", "california", "São Paulo");
		Cliente cliente = new Cliente (4, "Luiza", "1245-3467", "123123", "12345678");
		
		System.out.println(tema.getId());
		System.out.println(tema.getNome());
		System.out.println(tema.getValorAluguel());
		System.out.println(tema.getCorToalha());
		
		System.out.println(itemTema.getId());
		System.out.println(itemTema.getNome());
		System.out.println(itemTema.getDescricao());
		
		System.out.println(endereco.getId());
		System.out.println(endereco.getLograDouro());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getCep());
		System.out.println(endereco.getUf());
		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getRg());
	}
}
