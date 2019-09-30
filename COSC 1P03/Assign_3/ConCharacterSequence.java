package Assign_3;

import java.io.Serializable;

public class ConCharacterSequence implements CharacterSequence, Serializable {
 
  private char[] seq;
  
  public ConCharacterSequence () {
    
    seq = new char[0];
    
  }
  
  public ConCharacterSequence (char c) {
   
    seq = new char[1];
    
    seq[0] = c;
    
  }
  
  public ConCharacterSequence (CharSequence cs) {
   
    seq = new char[cs.length()];
    
    for (int i=0; i<cs.length(); i++) {
      
      seq[i] = cs.charAt(i);
    }
  }
  
  public ConCharacterSequence (char[] c) {
   
    seq = new char[c.length];
    
    for (int i=0; i<c.length; i++) {
      
      seq[i] = c[i];
    }
    
  }

    
  public boolean equals ( CharSequence cs ) {
    
    boolean result = true;
    
    if (cs.length() == 0) {
      
      result = false;
      
    }
    
    for (int i=0; i<cs.length(); i++) {
      
      if (seq[i] != cs.charAt(i)) { 
      
        result = false;
        
      }
    }
    
    return result;

  }
 
  public int compareTo ( CharSequence cs ) {// compare the length of two string
    
    int result;
    
    result = seq.length - cs.length();

    return result;
    
  }
 
  public ConCharacterSequence toLowerCase ( ) {// to lower case
    
    char[] result;
    
    result = new char[seq.length];
    
    for (int i=0; i<seq.length; i++) {

      if (Character.isUpperCase(seq[i])) {
       
         result[i] = Character.toLowerCase(seq[i]);

      }
      else {
        
         result[i] = seq[i];
         
      }
    }
    
    
    return new ConCharacterSequence(result);
    
  }
 
  public ConCharacterSequence toUpperCase() {// to upper case
 
    char[] result;
    
    result = new char[seq.length];
    
    for (int i=0; i<seq.length; i++) {
     
      if (Character.isLowerCase(seq[i])) {
       
        result[i] = Character.toUpperCase(seq[i]);
      }
      else {
        
         result[i] = seq[i];
         
      }
    }
    
    return new ConCharacterSequence(result);
    
    
    
  }
 
 public ConCharacterSequence trim ( ) {
   
   char[] result;
   int pos=0;
   int start=0;
   int end=seq.length-1;
 
     while (Character.isWhitespace(seq[start])) {
       
       start=start+1;

       
     }
  
     while (Character.isWhitespace(seq[end])) {
       
       end=end-1;
       
     }

   
   result = new char[end-start+1];
   
   for (int i=start; i<=end; i++) {
     
     result[pos] = seq[i];
     pos = pos + 1;
     
   }
   
   return new ConCharacterSequence(result);
   
 }
 
 public ConCharacterSequence trimAll ( ) {// this method is remove all the space
   
   char[] result;
   int count=0;
   int pos=0;
 
   for (int i=0; i<seq.length; i++) {
     
     if (Character.isWhitespace(seq[i])) {
       
       count++;
       
     }
     
   }
 
   result = new char[seq.length-count];
   
   for (int i=0; i<seq.length; i++) {
     
     if (! Character.isWhitespace(seq[i])) {
       
       result[pos] = seq[i];
       pos = pos + 1;
       
     }

   }
   
   return new ConCharacterSequence(result);
   
 }
 
 public ConCharacterSequence replace ( char oldChar, char newChar ) {//this method is used to replace char to char
   
   for (int i=0; i<seq.length; i++) {
     
     if (seq[i] == oldChar) {
       
       seq[i] = newChar; 
       
     }
     
   }
   
   return new ConCharacterSequence(seq);
   
 }

 public ConCharacterSequence concat ( CharSequence tail ) {//this method is used to concat strings
   
   char [] result;
   int pos=0;
   result = new char[seq.length+tail.length()];
   
   if (tail.length() == 0) {
     
     return new ConCharacterSequence(seq);
       
   }
   else {
   
     for (int i=0; i<seq.length; i++) {
      
       result[i] = seq[i];
       
       
     }
     
     for (int i=seq.length; i<seq.length+tail.length(); i++) {
       
       result[i] = tail.charAt(pos);
       pos = pos + 1;
       
     }
     
     return new ConCharacterSequence(result);
   }
 }
 
 public boolean isPalindrome ( ) {// this method is used to check if the string is palindrome in the lowercase and removed space
    
    int pos=0;
    char[] reverse = new char[seq.length];
    boolean result = true;
    
    if (seq.length == 0) {
      
      result = false;
      
    }
      
    for (int i=seq.length-1; i>=0; i--) {
      
      
      reverse[pos] = seq[i];
      pos = pos + 1;
 
    }
    
    if (! seq.equals(reverse)) {
      
      result = false;
      
    }
    
    return result;

 }
 
 public char charAt( int index ) {// to check the index's length
  
   if (index < 0 || index >= seq.length) {
     
      throw new IndexOutOfBoundsException();
   }
   else {
     
      return seq[index];
      
   }
   
 }

 
 public int length ( ) {
   
   return seq.length;
   
   
 }
 
 public ConCharacterSequence subSequence ( int start, int end ) {
  
   char[] result;
   int pos=0;
   
   result = new char[end-start+1];
   
   if (start < 0 || start >= seq.length || end < 0 || end >= seq.length) {
     
     throw new IndexOutOfBoundsException();
     
   }
   else {
     
     for (int i=start; i<=end; i++) {
       
       result[pos] = seq[i];
       pos = pos + 1;
       
     }
     
   }
   
   return new ConCharacterSequence(result);
   
 }
 
 public String toString() {
  
    String result = "";
   
    result = new String(seq);
    
    return result;
 
 }
 
}//Xinan Wang No.5535802