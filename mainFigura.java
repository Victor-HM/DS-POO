import java.util.Scanner;


public class mainFigura{

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
		
		double base, altura, raio;
		
		String condicao;
		
		System.out.println("Digite o valor da base:");
		base = in.nextDouble();
		
		System.out.println("Digite o valor da altura:");
		altura = in.nextDouble();
		
		
		Triangulo t1 = new Triangulo();
		  System.out.println(t1.calculaArea(base, altura));
		  
		  Quadrado q1 = new Quadrado();
		  System.out.println(q1.calculaArea(base, altura));
		  
		  Quadrado r1 = new Quadrado();
		  System.out.println(r1.calculaArea(base, altura));
		  
		  Circulo c1 = new Circulo();
		 System.out.println(" Deseja Calcular o RAIO do circulo ?");
		 condicao= in.next();
		 
		 condicao=condicao.toLowerCase();
		 
		 if (condicao.equals("sim")){
			 System.out.println("Digite o valor da raio:");
			 raio = in.nextDouble();
			 System.out.println(c1.calculaRaio(raio));
				
		 }
			
	}

}
