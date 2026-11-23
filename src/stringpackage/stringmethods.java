package stringpackage;

public class stringmethods {

	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		String s3=new String("Hello");
//		if(s2==s3)//The result will be false because double equal to compares the reference numbers not the values
//		{
//			System.out.println("values are equal");
//		}
//		else
//		{
//			System.out.println("values are not equal");
//		}
		//equals
       if(s2.equals(s3))
       {
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
       //equalsignorecase()
       if(s1.equalsIgnoreCase(s2))
       {
    	   System.out.println("values are not equal");
    	   
       }
       else
       {
    	   System.out.println("values aare not equal");
       }
       //concat()

       String s4="world";
       System.out.println(s1.concat(s4));
       //contains
       System.out.println(s4.contains("wo"));//True
       //touppercase
       System.out.println(s1.toUpperCase());//Hello
 
       ///tolowercase
       System.out.println(s1.toLowerCase());//hello
       //length()
       System.out.println(s1.length());//5
       
       //trim() -remove white space
       String s5=" Hello ";
       
       
       System.out.println("Before trim " +s5);
       System.out.println("After trim " +s5.trim());
       //startsWith()-to check whether the word start with a specific word or letter
       String s6="Hello everyone Good morning";
       System.out.println(s6.startsWith("Hello"));
       System.out.println(s6.endsWith("morning"));
       //charAt(index position)
       System.out.println(s6.charAt(5));//to retrieve the letter at a specific index positiion
       //Substring(start index,end index)
       System.out.println(s6.substring(0,12));//zeroth index to 11th index
       //split() split a sentence based upon a condition
       String result[]=s6.split(" ");
       for(String v:result)
          {
    	   System.out.println(v);
          }
       System.out.println("number of words= " +result.length);//To find the number of words in a sentence
       //toCharArray()-to retrieve as single characters from a string
       String s7="Saniya M M";
       char ar[]=s7.toCharArray();
       System.out.println("result of char array");
       for(char c:ar)
       {
     	   System.out.println(c);
       }
       //replace() - to replace a specific word from a sentence
       System.out.println(s6.replace("Hello", "Haii"));
    	   }

}
