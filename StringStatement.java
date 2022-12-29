package String;

public class StringStatement {

	public static void main (String[]args) {
		
         //Strings Methods from Java docs

	    String stm="Aowtham hello ";
	    System.out.println(stm);   
	    String stm="gowtham hello ";
          System.out.println(stm);
	    String sam=new String("aio");
	    System.out.println(sam);
	    System.out.println(stm.length());
	    System.out.println(stm.charAt(5));
	    System.out.println(stm.toUpperCase());
	    System.out.println(stm.toLowerCase());
	    System.out.println(stm.indexOf('l'));
	    System.out.println(stm.replace("o","a"));
	    System.out.println(stm.replaceFirst("h","H"));
	    System.out.println(stm.replace("hello", "Hello"));
	    System.out.println(stm.replaceAll(" ","_"));//remove white space
	    System.out.println("fff"+stm.concat(sam));
	    System.out.println(stm.trim());
	    System.out.println(stm.compareTo(sam));
		
  }
}
