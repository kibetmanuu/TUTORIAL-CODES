
import java.util.Scanner;;
public class forloop {
    public static void main(String[] args) {
        int[] ages={45,78,65,90,34,23};
        int count=0;
        for(int i=0;i<ages.length;i++){/*looping through an array */
    
            System.out.println(ages[i]+ "_ " +count);/*shows index at the array */
            count++;
if(ages[i]==45){
System.out.println("good");}
}
 /*used to input arrays and loop*/  
     
   String[] names= new String[5]; 
   Scanner sc = new  Scanner(System.in);    
   for( int x=0;x<names.length;x++){
System.out.print("INPUT: ");
String INPUT=sc.nextLine();
names[x]=INPUT;}/*used to add user input to an array*/
for(String N:names){
    System.out.println(N);
    if (N.equals("manuu")) {
        break;
        
    }
    
    }
    
   

   }
}
        
    

