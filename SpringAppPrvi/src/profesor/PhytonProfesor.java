package profesor;

public class PhytonProfesor implements Profesor {

	private Predmet predmet;
	
	

	public PhytonProfesor(Predmet predmet) {
		this.predmet = predmet;
	}

	@Override
	public void pozdrav() {

		System.out.println("Pozdrav od profesora Pythona" );
	}

	@Override
	public void getPredmetKojiPredajem() {
		predmet.dajMiPredmetPredmet();
	}

}
