
public class Circulo extends Figura {
	
	private double Raio;
	
	
	public double getRaio() {
		return Raio;
	}


	public void setRaio(double raio) {
		Raio = raio;
	}
	
	public double calculaRaio (double raio) {
		return 3.14 * (raio*raio);
	}
	
}
