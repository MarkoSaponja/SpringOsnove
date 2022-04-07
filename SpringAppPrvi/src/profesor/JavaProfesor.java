package profesor;

public class JavaProfesor implements Profesor {

	private Predmet predmet;
	private String ime;
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	@Override
	public void pozdrav() {

		System.out.println("Pozdrav od profesora " + getIme());
	}

	@Override
	public void getPredmetKojiPredajem() {
		predmet.dajMiPredmetPredmet();
	}

}
