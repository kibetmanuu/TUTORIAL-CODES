/**
 * Tutorial
 */

public class Tutorial {

    public static void main(String[] args) {
        System.out.println("This is my java tutorial");
        String name ="EMMANUEL";
        System.out.println(name);
        double height = 5.0; 
    System.out.println("MY HEIGHT IS\t"+height);
    boolean HEIGHT =true;
    System.out.println(HEIGHT+"\t5.0 is your height");
    int weight=78;
    System.out.println("MY WEIGHT IS\t"+weight);
    double BMI=weight/height;
    int x=78%5;/*modulus used to show remainder */
    System.out.println(x);
    System.out.println("YOUR BMI IS\t"+BMI);
    double minimum =Math.min(height, weight);/* mminum btween height and weight*/
    System.out.println(minimum);
    int z=40;
    int s=909;
    int r=76;
    boolean compare=z>=r;/*use for comparison */
    boolean det=z>r&&s<z;/*&& rep and // rep or */
    boolean analyse=s!=r ||s>r;
    System.out.println(compare);
    System.out.println(det);
    System.out.println(analyse);
    

     
    

    
    
    }
}