package com.tristus;

/**
 * Hello world!
 *
 *
 * /**
 * Created by a on 27/02/17.
 *
 * package com.simplon;

 public class LetterCompress {

 public String compress(String str) {
 String compressedStr = "";
 if (str.equals("")) {
 return compressedStr;
 }
 for (int i = 0; i < str.length(); i++) {
 int count = 0;
 if (!compressedStr.contains(Character.toString(str.charAt(i)))) {
 compressedStr += Character.toString(str.charAt(i));
 for (int y = 0; y < str.length(); y++) {
 if (str.charAt(i) == str.charAt(y)) {
 count++;
 }
 }
 compressedStr += count;
 }
 }
 return compressedStr;
 }
 }
 */
 *
 */
public class App 
{
    public static void main( String[] args )
    {




        String resultat = new Unique().checkForUnique("dsadsadad");




        System.out.println( "Hello World! " +resultat );
    }
}
