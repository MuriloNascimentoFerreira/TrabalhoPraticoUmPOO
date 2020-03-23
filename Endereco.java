class Endereco{
	private String rua;
	private String numero;
	private String bairro;
	private String complemento;

	public Endereco(String rua, String numero, String bairro){
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
	}

	public String getEndereco(){
		String strEndereco = "";
		strEndereco += "Rua: " + rua + "\n" +
		"Número: " + numero + "\n" +
		"Bairro: " + bairro;

		return strEndereco;
	}

}
