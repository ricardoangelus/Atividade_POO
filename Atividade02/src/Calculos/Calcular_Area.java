package Calculos;

public class Calcular_Area {

	public static void main(String[] args) {
		
		int ql1 = 4;
		int ql2 = 4;
		
		float r = 15;
		float pi =  3.14159265358979323846f;
		
		int rlmenor = 5;
		int rlmaior = 10;
		
		int base = 3;
		int altura = 9;
		
		System.out.println("Área do Quadrado: " + area(ql1,ql2));
		System.out.println("Área do Círculo: " + area(r,pi));
		System.out.println("Área do Retângulo: " + area(rlmenor,rlmaior));
		System.out.println("Área do Triângulo Retângulo: " + areaTrianguloRetangulo(base,altura));
		
	}
	public static int area (int x, int y) {
		return(x*y);
	}
	public static float area (float x, float y) {
		return ((x*x)*y);
		
	}
	public static float areaTrianguloRetangulo (float x, float y) {
		return ((x*y)/2);
	}


}
