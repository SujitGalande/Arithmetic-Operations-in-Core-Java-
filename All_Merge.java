
public class All_Merge {
	// Create Non-Static Method 01
	public int addition (int g, int h){
		int add =g + h;
		return add;
	}
 // Create Non-Static Method 02
	public int subtraction (int w, int q) {
		int subtract = w-q;
		return subtract;
	}
	 // Create Non-Static Method 03
      public int multiplication (int e, int k) {
	   int multiply = e*k;
	   return multiply;
}
   // Create Non-Static Method 04
      public int division (int l, int t) {
	   int divide = l/t;
	   return divide;
      }
	
      public static void main(String[] args) {
		
    	  
    	  // initialization
    	  int mn = 98;
    	  int de = 65;
    	  int uy = 85;
    	  int sc =54;

    	  
    	  // create an object
    	  
    	  All_Merge myobj = new All_Merge();
    	  
    	  int store1 = myobj.addition(mn,de);         // method 01 call by object
    	  int store2 = myobj.subtraction(mn, uy);     // method 02 call by object
          int store3 = myobj.multiplication(uy, sc);
          int store4 = myobj.division(mn, sc);
      
          //control Statements
          
          // if else Statemennts
          
          if (mn<de && uy==sc) {
        	  
        	  System.out.println("de is greter than mn & uy is equal to sc ");
        	  
          }
          else {
        	  System.out.println("mn is greter than de & uy is not equal to sc");
          }
          // if else if ladder
          
          if(de>=mn & sc==uy) {
        	  System.out.println("de is greter than equal mn & uy is not equal to sc");
        	  
          }
          else if (sc>=de & uy==mn) {
        	  System.out.println ("sc is greter than equal to de & uy is equal to mn");
          }
          else {
        	  System.out.println("mn is greater de , sc& uy");
        	  
          }
           // Looping Statments
          // create a math table of for loop 
          
          for ( int g=1; g<10; g++) {
        	  System.out.println(sc+ "*"+g+ "=" +sc*g);
          }
          // while loop 
          int d =1;
          while (d<=10) {
        	  System.out.println(uy+ "*" +d+ "=" +uy*d);
        	 d++; 
          }
          // Do While Loop 
          int s=1;
          do {
        	  System.out.println(mn+ "*" +s+ "=" +mn*s);
        	  s++;
          }
          while (s<=10);
             
      }

}
