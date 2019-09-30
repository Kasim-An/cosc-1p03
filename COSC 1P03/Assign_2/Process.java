package Assign_2;

import BasicIO.*;

public class Process 
{
 private WordReader read;
 private Node list;
 private ASCIIDisplayer display;
 
 public Process()
 {
  String words;
  read = new WordReader();
  display = new ASCIIDisplayer();
  
  for(;;)
  {
   words = read.readWord();
   search(words);
   if (read.isEOF())  break;
  }
  sortList();
  printOut(list);
 }// constructor
 private void search(String words)//this method use to search the actual word
 {
  Node p;
  Word word;
  p = list;
  for(;;)
  {
   if(p == null) break;
   if (words.equalsIgnoreCase(p.item.getWord())) 
   {
     int frequency = p.item.getFreq();
     p.item.theFreq(frequency + 1);
     return;
   }
   p = p.next;               
  }
  word = new Word(words, 1);
  if (list == null) 
  {
    list = new Node(word, null);
  } 
  else 
  {
    Node q = new Node(word, null);
    q.next = list;
    list = q;
  }
 }
 private void sortList() //this method used node to move and save the information
 {
   Node p;
   Node q;
        
   p = list;
        
   if (list.next == null)  return;
        
   while (p != null) 
   {
     q = p.next;
     while (q != null) 
     {
       if (p.item.getFreq() < q.item.getFreq())
       {
         Word word = p.item;
         p.item = q.item;
         q.item = word;
       }
       q = q.next;
     }
     p = p.next;
   }
 }
 private void printOut(Node list) {//this method is used to output the data
   Node p;
   p = list;
   while (p != null) {
     display.writeInt(p.item.getFreq());
     display.writeString(p.item.getWord());
     display.newLine();
     p = p.next;
   }
   display.close();
 }
 public static void main(String[] args) {Process a = new Process();}

}
//xinan wang NO.5535802