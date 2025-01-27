package javaprojects;

public class StringPrograme {

	public static void main(String[] args) {
		String s="hello";
		System.out.println(s);
		String s1=new String("word" );
		System.out.println(s1);
		char c[]= {'A','B','C'};
		String s2=new String(c);
		System.out.println(s2);
		//Length 
		int a=s.length();
		System.out.println(a);
		//charAt specified index

		char d=s.charAt(4);
		System.out.println(d);
		//concat
		System.out.println(s.concat(s1));
		//contains
		String e="hello";
		System.out.println(e.contains("word"));
		//compaireto
		System.out.println(s.compareTo(e));
		//to uppercase;
		String f="project";
				System.out.println(f.toUpperCase());
		String b="GOOD";
		System.out.println(b.toLowerCase());
		String o="java";
		String k="java";
		String h= "Java";
		String m = "Selenium";
		//equals
		System.out.println(o.equals(k));
		System.out.println(o.equals(h));
		System.out.println(o.equals(m));
		// equal ignore case
		System.out.println(o.equalsIgnoreCase(h));
	}
	
}
