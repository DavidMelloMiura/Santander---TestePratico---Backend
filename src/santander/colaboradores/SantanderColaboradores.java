package santander.colaboradores;

public class SantanderColaboradores {

	public static void main(String[] args) {
		
		Colaborador c1 = new Colaborador();
		c1.setNome("David");
		c1.setSobrenome("Miura");
		c1.setCargo("Desenvolvedor FullStack");
		c1.setDataNascimento("26/10/1981");
		c1.setEndereco("Rua Pirai do Sul, 457 - Vila Flórida - CEP: 11111-222 - Guarulhos - SP");
		
		
		System.out.println("Nome: " + c1.getNome() +" "+ c1.getSobrenome());
		System.out.println("Cargo: " + c1.getCargo());
		System.out.println("Data Nascimento: " + c1.getDataNascimento());
		System.out.println("Endereço: " + c1.getEndereco());
		
		
	}

}
