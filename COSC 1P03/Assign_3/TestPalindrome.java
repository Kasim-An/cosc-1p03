package Assign_3;

import BasicIO.*;

public class TestPalindrome {
    
    private ASCIIDataFile data;
    private ASCIIDisplayer out;
    
    /** The constructor opens the displayer and performs the test of palindrome.*/
    
    public TestPalindrome ( ) {
      
      boolean check;
      String sequence = "";
      CharacterSequence result; // strings for testing
        
      data = new ASCIIDataFile();
      out = new ASCIIDisplayer();
      
      for (; ;) {
        
        sequence = sequence + data.readString(); 
        
        if (data.isEOF()) break;
        
      }

        result = new ConCharacterSequence(sequence);
        
        out.writeString(result.toString());
        out.newLine();
        
        result = result.trimAll(); //removes all spaces
        out.writeString(result.toString());
        out.newLine();
        
        result = result.toLowerCase(); //convert to lowercase
        out.writeString(result.toString());
        out.newLine();
        
        check = result.isPalindrome();
        if (check == true) {
         
          out.writeBoolean(check);
          out.newLine();
          out.writeString("This sequence is a palindrome.");
        }
        else {
          
          out.writeBoolean(check);
          out.newLine();
          out.writeString("This sequence is not a palindrome.");
        }

        data.close();
        out.close();
        
    }; // constructor
    
    
    public static void main ( String[] args ) { TestPalindrome t = new TestPalindrome(); };
    
    
} // TestPalindrome
//Xinan Wang No.5535802