class Servico{
	private String tipoServico;
	private String material;

	public Servico(String tipoServico){
		this.tipoServico = tipoServico;
	}
	public void setMaterial(String material){
		this.material = material;
	}

	public String getServico(){
		String strServico = "";
		strServico += "Tipo do Serviço: " + this.tipoServico + "\n" +
		"Material: " + this.material;

		return strServico;
	}

}
