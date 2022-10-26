package sonysony;

public class SonyClass  {

	static int a=1000;
	 int Swing2 = 1200;
	static int Swing1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SonyClass obj = new SonyClass();
		System.out.println("Sony Class helloooo");
		method();
		// obj.methods();
		method6();
		System.out.println("method 6 o/p calculation last updated value:Swing2 :   " + obj.Swing2);
		

	}
	
	public static void method()
	{
		SonyClass obj = new SonyClass();
		System.out.println("Swing2:  "+obj.Swing2 );
	}
	
	public void methods()
	{
		
		System.out.println("methods O/P - Swing1:  "+ Swing2);
		
	}
	public static void method6() {
		// TODO Auto-generated method stub
		System.out.println("method 6 o/p from interface final variable :Swing 1 :    " + Swing1);
		SonyClass obj = new SonyClass();
		obj.Swing2 = Swing1+100;
		System.out.println("method 6 o/p calculation direct: Swing2 :  " + obj.Swing2);
	}
	
	

}
