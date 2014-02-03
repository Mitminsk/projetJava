
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a2.name);
		
		Animal a3= new Animal("Felix");
		Boolean test;
		test=a3.equals(a1);
		if(test==true)
		{
			System.out.println("Le nom des deux chiens sont égaux");
		}
		else
		{
			System.out.println("Ces chiens n'on pas les même noms");
		}
		
		Animal a4=new Animal("felix");
		test=a4.equals(a1);
		
		if(test==true)
		{
			System.out.println("Le nom des deux chiens sont égaux");
		}
		else
		{
			System.out.println("Ces chiens n'on pas les même noms");
		}
		
	}

}
