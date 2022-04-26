package _abstract;

import java.util.Scanner;

abstract class ShapeTest {
	protected double area;
	Scanner scan = new Scanner(System.in);
	
	public ShapeTest() {	System.out.println("ST 기본 생성자");	}

	public abstract void calcArea();
	public abstract void dispArea();	
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
		
		// 상속관계를 통해 결합도 낮추기 - 다형성
		shap = new Triangle();
		shap.calcArea();
		shap.dispArea();
		
		shap = new Rectangle();
		shap.calcArea();
		shap.dispArea();
		
		shap = new Trapezoid();
		shap.calcArea();
		shap.dispArea();

	}
}
