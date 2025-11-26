package oopsProgs;



class Shapes{
	
	public double area(int r) {
		return Math.PI * (r*r);
	}
	
	public double area(int l,int b) {
		return l*b;
	}
	
	public double area(int l,int b,int h) {
		return (l*b*h);
	}
}

public class PolymorphExamp {

	public static void main(String[] args) {
		
		Shapes cir = new Shapes();
		System.out.println("Area of circle : "+ cir.area(45)+" cm");
		
		Shapes rect = new Shapes();
		System.out.println("Area of rectangle : "+ rect.area(55, 4)+" cm^2");
		
		Shapes cub = new Shapes();
		System.out.println("Area of cuboid : "+ cub.area(5, 7, 3)+" c cm"); 
	}

}
