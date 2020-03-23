class Cliente{
	private String nome;
	private String cpf;
	private String telefone;
	private Endereco endereco;

	public Cliente(String nome, String cpf,String telefone,Endereco endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getCliente(Endereco endereco){
		String strCliente = "";
		strCliente += "Nome: " + nome + "\n" +
		"CPF: " + cpf + "\n" +
		"Telefone: " + telefone + "\n" +
		"Endereço " + "\n" + endereco.getEndereco();

		return strCliente;
	}

}
