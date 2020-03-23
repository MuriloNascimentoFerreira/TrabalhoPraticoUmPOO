class AgendaServico{

	private Data dataServico;
	private double valor;

	public static void main(String args[]){

		Servico escova = new Servico("Escova");
		escova.setMaterial("Nada");

		Endereco endUm = new Endereco("Aldair santana", "904", "Jardim Graziela");

		Cliente maria = new Cliente("Maria Santos", "000000-0", "9999999999", endUm);
		System.out.println(maria.getCliente(endUm));
	}
}
