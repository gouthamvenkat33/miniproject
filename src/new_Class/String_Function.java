package new_Class;

public class String_Function {
	
	
	
	public static void main(String[] args) {
		
		String s = "comred";
		
		
	int length = s.length();
		
        System.out.println(length);  		
		
        String ss = "comred";
		
        boolean equals = ss.equals(ss);
        
        System.out.println(equals);
        
        boolean equalsIgnoreCase = ss.equalsIgnoreCase(s);
        
        System.out.println(equalsIgnoreCase);
        
        String upperCase = ss.toUpperCase();
        System.out.println(upperCase);
        
        String lowerCase = s.toLowerCase();
        
        System.out.println(lowerCase);
        
        boolean startsWith = s.startsWith("com");
        
        System.out.println(startsWith);
        
        boolean endsWith = ss.endsWith("mre");
        System.out.println(endsWith);
        
       boolean contains = s.contains("c");
        
        System.out.println(contains);
        
        int indexOf = s.indexOf("o");
        
        System.out.println(indexOf);
        
        int lastIndexOf = s.lastIndexOf("m");
        
        System.out.println(lastIndexOf);
        
        char charAt = s.charAt(5);
        
        System.out.println(charAt);
        
        String replace = s.replace("c","a");
        
        System.out.println(replace);
        
        String valueOf = s.valueOf("1");
        		
        System.out.println(valueOf);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
