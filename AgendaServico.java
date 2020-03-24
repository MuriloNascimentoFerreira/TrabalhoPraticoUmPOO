class AgendaServico{

	private Cliente cliente;
	private Data dataServico;
	private double valor;
	private Servico servico;
	private String horario;

	public AgendaServico(Cliente cliente, Data dataServico, double valor, Servico servico, String horario){
		this.cliente = cliente;
		this.dataServico = dataServico;
		this.valor = valor;
		this.servico = servico;
		this.horario = horario;
	}

	public String getAgendaServico(){
		String strAgendaServico = "";
		strAgendaServico += "============================\n" +
		"Cliente: " + this.cliente.getNome() + "\n" +
		"Data agendada: " + this.dataServico.getData() + "\n" +
		"Valor: " + valor + "\n" +
		"Horário: " + horario + "\n" +
		"Serviço " + "\n" + servico.getServico() + "\n============================\n";

		return strAgendaServico;
	}
}
