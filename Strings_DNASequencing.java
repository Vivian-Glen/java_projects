/*  Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
for example:
ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.
ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied
*/
public class DNA{
  public static void main(String[] args){
 String dna1 = "ATGCGATACGCTTGA";
 String dna2 = "ATGCGATACGTGA";
 String dna3 = "ATTAATATGTACTGA";
 String dna = dna3;
 int length = dna.length();
 System.out.println("Length:" +length);
 int start = dna.indexOf("ATG");
 System.out.println("Start:" + start);
 int stop = dna.indexOf("TGA");
 System.out.println("Stop:" + stop);
 /* the indexOf() string method will return -1 if the substring doesn’t exist within a String. */
 if(start != -1 && stop != -1 &&(stop- start)% 3 == 0){
  System.out.println("Condition 1, 2 and 3 are satisfied");
  String protein = dna.substring(start,stop+3);
  System.out.println("Protein:" +protein);
 }
 else{
  System.out.println("No protein");
 }


  }
}
