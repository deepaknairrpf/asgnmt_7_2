
public class asgnmt_7_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int num=Integer.parseInt("XYZ");
		System.out.println(num);
	}
		catch(NumberFormatException e)
		{
			System.out.println(e+"\n A String cannot be parsed into an int");
		}
	}

}
