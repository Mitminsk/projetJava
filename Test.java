
public class Test {

	/**
	 * @param args
	 */
	private static  Test test= new Test();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String chaine="";
	chaine =test.sayStatic();
	System.out.println(chaine);
	test=new Test();
	chaine=test.sayHello();
	System.out.println(chaine);
	
		
	

	}
	/*public Test(){
		System.out.println("instanciation");
	}*/
	public String sayHello(){return "Hello eXars";}
	public static String sayStatic(){return "Hello Static";}
	

}
