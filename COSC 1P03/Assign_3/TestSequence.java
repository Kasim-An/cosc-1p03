package Assign_3;

import BasicIO.*;

public class TestSequence {
    
    private ASCIIDisplayer out;
    
    public TestSequence ( ) {
        
        boolean ans1;
        int ans2;
        char ans3;
        CharSequence ans4;
        String ans5;
        CharacterSequence  a, b, c, d, result; // strings for testing
        char[] n = new char[] {'u','i','o','p'};
        
        out = new ASCIIDisplayer();
        
        a = new ConCharacterSequence();
        b = new ConCharacterSequence('x');
        c = new ConCharacterSequence("   x yz ");
        d = new ConCharacterSequence(n);
        
        ans1 = c.equals(d);
        out.writeBoolean(ans1);
        out.newLine();
        
        ans2 = c.compareTo(d);
        out.writeInt(ans2);
        out.newLine();
        
        result = b.toLowerCase();
        out.writeString(result.toString());
        out.newLine();
        
        result = c.toUpperCase();
        out.writeString(result.toString());
        out.newLine();
        
        result = c.trim();
        out.writeString(result.toString());
        out.newLine();
        
        result = d.replace('i','u');
        out.writeString(result.toString());
        out.newLine();
        
        result = b.concat("hello");
        out.writeString(result.toString());
        out.newLine();
        
        ans3 = c.charAt(2);
        out.writeChar(ans3);
        out.newLine();

        ans2 = c.length();
        out.writeInt(ans2);
        out.newLine();
        
        ans4 = c.subSequence(3,5);
        out.writeString(ans4.toString());
        out.newLine();
        
        ans5 = d.toString();
        out.writeString(ans5);
        out.newLine();
        
        try {
            ans3 = c.charAt(20);
            out.writeChar(ans3);
        }
        catch ( IndexOutOfBoundsException e ) {
            out.writeString("Index is out of bounds.");
        };
        out.newLine();
        
        out.close();
        
    }; // constructor
    
    
    public static void main ( String[] args ) { TestSequence t = new TestSequence(); };
    
    
} // TestSequence
//Xinan Wang No.5535802