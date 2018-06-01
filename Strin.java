
public class Strin {
	static String s1= "jmnjujhowghowghy";
	static String s2= "how";
	static String s3= s1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		if(s1.contains(s2))
		{
			while(s3.contains(s2)){
//			for(int i=0;i<=s1.length();i++)
//			{
//				if(s1.contains(s2))
//				{
			System.out.println(s3.indexOf(s2));
			int index2= s3.indexOf(s2)-1;
			int index1 = s3.indexOf(s2)+ s2.length();
			if(s3.startsWith(s2))
			{
				if(s3.endsWith(s2))
				{
				System.out.println(s2);	
				}
				else{
			System.out.println(s2+s3.charAt(index1));	
			}}
			else{
			String s4 = ""+s3.charAt(index2)+s2+s3.charAt(index1);
			System.out.println(s4);
			s3= s3.substring(index1);
			
			System.out.println(s3);
			}
		}
			}
		}
		
		
	}

