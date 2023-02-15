import java.util.ArrayList;
import java.util.List;

public class StringLoops {

  // static methods go here

  //works\/
  public static String reverseCharacters(String str){
    String revtext = "";
    char letter;
    for(int num=0;num<str.length();num++){
      letter=str.charAt(num);
      revtext= letter +revtext;
    }
    // 
    return revtext;
  }

  //works \/
  public static void indexesOfAll(String str,char seaching){
    List<Integer> list = new ArrayList<Integer>();
    for (int a =0;a<str.length();a++){
      if(str.charAt(a)==seaching){
        list.add(a+1);
      }
    }
    System.out.println(list);
  }

  // works \/
  public static boolean hasRepeatedConsecutives(String str){
    boolean tf = false;
    
    for (int a =0;a<str.length();a++){
      if(a+1<str.length()){
        if(str.charAt(a)==str.charAt(a+1)){
          tf = true;
        }
      }
    }
    return tf;
  }
//works \/
  public static void reverseWords(String str){
    String revtext = "";
    String[] word= str.split(" ");
    for(String ss : word){
      
      revtext= ss+" " +revtext;
    }
    System.out.println(revtext);
  }



  public static void main(String[] args) {

    // testing of static methods goes here
    System.out.println(reverseCharacters("null"));
    indexesOfAll("null plus skill issue numnnnnber",'n');
    System.out.println(hasRepeatedConsecutives("try hard"));
    reverseWords("Something longer than pie.");
   
    
  }
}




//javac StringLoops.java; java StringLoops