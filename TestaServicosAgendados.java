class TestaServicosAgendados{

	public static void main(String args[]){

		Endereco endUm = new Endereco("Aldair santana", "904", "Jardim Graziela");
		Cliente maria = new Cliente("Maria Santos", "000000-0", "9999999999", endUm);
		Servico escova = new Servico("Escova");
		escova.setMaterial("Nada");
		Data dataServicoUm = new Data(24, 03, 2020);

		Cliente clienteDois = new Cliente("Edite", "000000-0", "9999999999", endUm);
		Servico pintar = new Servico("Pintar");
		pintar.setMaterial("Tinta");

		AgendaServico servicoUm = new AgendaServico(maria, dataServicoUm, 20, escova, "13:30");
		AgendaServico servicoDois = new AgendaServico(clienteDois, dataServicoUm, 30, pintar, "15:00");

		System.out.println(servicoUm.getAgendaServico());
		System.out.println(servicoDois.getAgendaServico());

	}
}
