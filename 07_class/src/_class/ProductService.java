package _class;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductService {
	
	private ProductDTO[] product = new ProductDTO[5];
		
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num; 
//		int count=0;
		
		while(true) {
			System.out.println("");
			System.out.println("****************************");
			System.out.println("*     1. 물건 담기         *");
			System.out.println("*     2. 담은 물건 보기    *");
			System.out.println("*     3. 종료하기          *");
			System.out.println("****************************");
			System.out.print("     - 번호 선택: ");
			num = scan.nextInt();
			
			System.out.println();
			
			if(num==3) break;
			else if(num==2) {
//				displayProduct(this.product, count);
				displayProduct();
			}
			else {
				insertProduct();
//				if(count<5) {
//					this.product[count] = new ProductDTO();
//					this.product[count] = insertProduct(this.product[count]);
//					count++;
//				}
//				else	System.out.println("더이상 담을 수 없습니다.");
			}
		}
		scan.close();
		System.out.println(" >> 프로그램을 종료합니다.");
		
	}

	private void insertProduct() {
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<product.length; i++) {
			if(product[i] == null) {
				product[i] = new ProductDTO();
				System.out.print(" >> 물건 이름: ");
				product[i].setItem(scan.next());
				System.out.print(" >> 물건 가격: ");
				product[i].setPrice(scan.nextInt());
				System.out.print(" >> 물건 수량: ");
				product[i].setQty(scan.nextInt());
				product[i].setTotal(product[i].getQty()*product[i].getPrice());
				break;
			}
		}
		scan.close();
	}
	
//	public ProductDTO insertProduct(ProductDTO product) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print(" >> 물건 이름: ");
//		product.setItem(scan.next());
//		System.out.print(" >> 물건 가격: ");
//		product.setPrice(scan.nextInt());
//		System.out.print(" >> 물건 수량: ");
//		product.setQty(scan.nextInt());
//		product.setTotal(product.getQty()*product.getPrice());
//		
//		return product;
//	}
	
	
	private void displayProduct() {
		DecimalFormat ft = new DecimalFormat();
		
		for(int i=0; i<product.length; i++) {
			if(product[i]!=null) {
				System.out.println(" >> 이름\t가격\t수량\t총금액");
				System.out.println("    " + product[i].getItem() + "\t" + ft.format(product[i].getPrice()) + "\t" + product[i].getQty() + "\t" + ft.format(product[i].getTotal()));
			}
		}
		
	}

	
//	public void displayProduct(ProductDTO[] product, int count) {
//		DecimalFormat ft = new DecimalFormat();
//		
//		if(count == 0) {
//			System.out.println(" >> 담긴 물건이 없습니다.");
//		}
//		
//		for(int i=0; i<count; i++) {
//			System.out.println(" >> 이름\t가격\t수량\t총금액");
//			System.out.println("    " + product[i].getItem() + "\t" + ft.format(product[i].getPrice()) + "\t" + product[i].getQty() + "\t" + ft.format(product[i].getTotal()));
//		}
//	}
}
