package esercizio_5e;

public class Moneta {
	
	/*astratto il concetto di moneta - ogni istanza ha una valuta, un valore e un boolean centesimi
	che se settato a true restituisce la stringa "moneta" altrimenti "banconota" nel metodo toString()*/
	
	private String valuta;
	private int valore;
	private boolean centesimi;//true in caso di centesimi
	
	public Moneta(String valuta,int valore, boolean centesimi) {
		setValuta(valuta);
		setValore(valore);
		setCentesimi(centesimi);
	}
	
	public void setValuta(String valuta) {
		this.valuta = valuta;
	} 
		
	public String getValuta() {
		return valuta;
	}
	
	public void setValore(int valore) {
		this.valore = valore;
	} 
			
	public int getValore() {
		return valore;
	}

	public boolean isCentesimi() {
		return centesimi;
	}

	public void setCentesimi(boolean centesimi) {
		this.centesimi = centesimi;
	}

	@Override
	public String toString() {
		String cong = centesimi ? " cent di " : " ";
		String cartaOMoneta = centesimi ? "Moneta da " : "Banconota da ";
		return cartaOMoneta + valore + cong + valuta ;
	}
	
	
	
	
}
