
package errorizzatore;



import java.util.Scanner;

public class Errorizzatore {

    
    public static void main(String[] args) {
       int[] v=new int[10];
       int i;
       Scanner s=new Scanner(System.in); 
       try{
       for(i=0;i<11;i++){
           
        System.out.printf("Inserisci il numero:\n");  
           v[i]=s.nextInt();
           }
       
       }
    catch(ArrayIndexOutOfBoundsException e){
    System.out.println("ERROR:Troppa roba,il massimo e di dieci elementi\n");
}
    catch(Exception e){
        System.out.printf("ERROR\n");
    }
    }   
}
