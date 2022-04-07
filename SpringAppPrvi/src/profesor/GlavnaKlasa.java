package profesor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaKlasa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Profesor profa = context.getBean("profaJave", Profesor.class);
		profa.pozdrav();
		profa.getPredmetKojiPredajem();
		
		Profesor profa2 = context.getBean("profaPhyton", Profesor.class);
		profa2.pozdrav();
		profa2.getPredmetKojiPredajem();
		
		
		
		context.close();
	}

}
