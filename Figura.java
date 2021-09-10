public abstract class Figura {
	private double Base;
	private double Altura;
	
	public double getBase() {
		return Base;
	}
	
	public void setBase(double base) {
		Base = base;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	
	public double calculaArea(double base, double altura) {
		return base * altura;
	}
	
	public void imprimirArea() {
		System.out.println("A area da figura é" + this.calculaArea(Base, Altura));
	}
}
