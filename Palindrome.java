import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    
    Scanner scanner = new Scanner(System.in);
    public <T> void get_string(){
        ArrayList<String> list= new ArrayList<String>();
        
        int count=1;
        int duplicates=0;
        for(int i=0; i<10;i++){
            System.out.println("Enter "+count +" palindrome: --> ");
            String palindrome="";
            String y = "";
            palindrome=scanner.nextLine();
            //list.add(palindrome);
            int l = palindrome.length();
            for(int k = l-1 ; k >= 0; k--){
                y = y + palindrome.charAt(k);
            }
            if(palindrome.equalsIgnoreCase(y)){
                if(!list.contains(palindrome)){
                    list.add(palindrome);
                }else{
                    duplicates++;
                }
                
            }else{
                System.out.println("Not palindrome.");
            }

            count++;
        }
        System.out.println("---------------------------------------\n");
        System.out.println("There are "+duplicates+" duplicate palindromes.\n");
        System.out.println("List of palindromes: \n");
        System.out.println(list);
    }
     
    }
     



