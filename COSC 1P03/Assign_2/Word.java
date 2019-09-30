package Assign_2;

public class Word {
 private String word;
 private int freq;
 public Word( String a, int b)
 {
  word = a;
  freq = b;
 }//constructor
 public String getWord()//to get a real word
 {
  return word;
 }
 public int getFreq()//to get the frequence of each word
 {
  return freq;
 }
 public int theFreq(int a) 
 {
     freq = a;
  return freq;
 }
}
//xinan wang NO.5535802