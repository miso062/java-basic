package _inheritance;

import java.util.Scanner;

class ShapeTest {
	protected double area;
	Scanner scan = new Scanner(System.in);
	
	public ShapeTest() {	System.out.println("ST 기본 생성자");	}
	
	public void calcArea() {
		System.out.println("도형을 계산합니다.");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다.");
	}
	
}

class Triangle extends ShapeTest {
	protected int base, height;
	
	public Triangle() {
		System.out.println("Triangle 기본 생성자");
		
		System.out.print("밑변: ");
		this.base = scan.nextInt();
		System.out.print("높이: ");
		this.height = scan.nextInt();
	}
	
	@Override
	public void calcArea() {
		super.area = base*height/2.0;
	}
	
	public void dispArea() {
		System.out.println("넓이 = " + super.area + "cm²\n");
	}
}

class Rectangle extends ShapeTest{
	protected int width, height;
	
	public Rectangle() {
		System.out.println("Rectangle 기본 생성자");
		
		System.out.print("너비: ");
		this.width = scan.nextInt();
		System.out.print("높이: ");
		this.height = scan.nextInt();
	}
	
	public void calcArea() {
		super.area = width*height;
	}
	public void dispArea() {
		System.out.println("넓이 = " + super.area + "cm²\n");
	}
	
}

class Trapezoid extends ShapeTest{
	protected int top, bottom, height;
	
	public Trapezoid() {
		System.out.println("Trapezoid 기본 생성자");
		
		System.out.print("윗변: ");
		this.top = scan.nextInt();
		System.out.print("밑변: ");
		this.bottom = scan.nextInt();
		System.out.print("높이: ");
		this.height = scan.nextInt();
	}
	
	public void calcArea() {
		super.area = (top+bottom)*height/2.0;
	}
	public void dispArea() {
		System.out.println("넓이 = " + super.area + "cm²\n");
	}
}

public class ShapeMain {
	public static void main(String[] args) {
		ShapeTest shap;
		
		// 다형성을 통해 결합도 낮추기
		shap = new Triangle();
		shap.calcArea();
		shap.dispArea();
		
		shap = new Rectangle();
		shap.calcArea();
		shap.dispArea();
		
		shap = new Trapezoid();
		shap.calcArea();
		shap.dispArea();

//		결합도 1:1 100%의 결합도!
//		Triangle tri = new Triangle();
//		tri.calcArea();
//		tri.dispArea();
//		
//		Rectangle rec = new Rectangle();
//		rec.calcArea();
//		rec.dispArea();
//		
//		Trapezoid tra = new Trapezoid();
//		tra.calcArea();
//		tra.dispArea();
	}
}
