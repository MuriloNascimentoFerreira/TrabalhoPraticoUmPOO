class Data{
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getData(){
		String strConsulta = "";
		strConsulta += dia + "/" + mes + "/" + ano;

		return strConsulta;
	}
}
