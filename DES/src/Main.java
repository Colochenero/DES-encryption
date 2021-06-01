
public class Main {
	public static void main(String args[])
    {
		String text = "hello";
		String key = "0E329232EA6D0D73";
		DES des = new DES();
		String result = des.encrypt(text, key);
		
		System.out.println(
	            "\n encrypted: " + result.toUpperCase() + "\n");
    }

}
