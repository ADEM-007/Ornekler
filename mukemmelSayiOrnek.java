import java.util.Scanner;

public class mukemmelSayiOrnek {

	public static void main(String[] args) {  
    	
    	int sayý,toplam=0;
    	boolean durum =true;
   		   Scanner scanner=new Scanner(System.in); 
   		   
   		   System.out.printf("Sayý: ");
   		   sayý=scanner.nextInt();
   		   
   		   for(int i=1; i<=(sayý/2); i++) {
   			   if(sayý%i==0) {
   				   toplam+=i;
   			   }
   		   }
   		   if(toplam==sayý) {
   			   System.out.println("Girilen sayý mükemmel sayý");
   		   }
   		   else {	   			   
   			   while(durum==true) {
   				  toplam=0;
   				  sayý=sayý+1; 
   				   
   				for(int i=1; i<=(sayý/2); i++) {
 	   			   if(sayý%i==0) {
 	   				   toplam+=i;
 	   			   }	   				   
   			    }
   				if(sayý==toplam) {
   					System.out.println("Girilen sayýdan sonraki en yakýn mükemmel sayý: "+sayý);
   					durum=false;  					
   				}
   				
   		     } 			    
        } 
   		   scanner.close();
 }
}
