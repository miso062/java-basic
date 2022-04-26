package _abstract;

public class AbstractMain extends AbstractTest {
		
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		AbstractTest at = new AbstractMain();
		
		at.setName("미소");
		
		System.out.println(at.getName());
	}
}
