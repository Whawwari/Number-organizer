import java.util.Scanner;

public class numComp
{

  public static void main (String[]args)
  {
    int n;
    int C=0;
   double dist=0;

    Scanner input = new Scanner (System.in);
    System.out.println(" ");
      System.out.print ("Enter the number of elements you want to store: ");
      System.out.println(" ");
      n = input.nextInt();	//reading the number of elements from the user
        

    double num_array[] = new double[n];

      System.out.println ("Enter the elements of the array: ");
    for (int i = 0; i < n; i++)
      {
//reading array elements from the user   
	num_array[i] = input.nextDouble ();
      }
      System.out.println(" ");
      System.out.println ("The values you inputed are");
      for(int i=0; i<num_array.length; i++) {
           System.out.print( C +")");
           C++;
          System.out.println(num_array[i]);
      }

      //int t = 0;

    //while(t != 5){

    System.out.println (" ");
    System.out.print("what would you like to know about the given numbers?");
    System.out.println(" (input the listed number)");
System.out.println(" ");
    System.out.println ("1.Greatest & smallest value.");
    System.out.println ("2.Difference between values");
    System.out.println ("3.calculations with values.");
    System.out.println ("4.approximations of values.");
    System.out.println ("5.Exit.");

System.out.println(" ");
    
    int t = input.nextInt();

    if (t == 1)
      {
        order(num_array,n);

      }
    if (t == 2)
      {
        distance(num_array,n,dist);
      }
    if (t == 3)
      {
        math(num_array,n);
      }
    if (t == 4)
      {
        round(num_array,n);
      }

   // }
    input.close();
//each statement returns something, meed to use them afterwards to display information.
  }
  
static double order(double num_array[], int n) {  //reprints the max number, min number and print out the array in order.
    double maxtemp = 0;
    double mintemp;
    // double average = 0;
    
        for(int i = 0;i < num_array.length; i++) {
            if (num_array[i] > maxtemp){
                    maxtemp = num_array[i];
                
            }
        }
        mintemp = num_array[0];
        for(int i = 0;i < num_array.length; i++) {
            if (num_array[i] < mintemp){
                    mintemp = num_array[i];
            }
        }

                System.out.println(" ");
        for(int i=0; i<num_array.length; i++) {
                System.out.print(num_array[i] + ", " );
       }
       System.out.println(" ");
            System.out.println("The largest value is: " + maxtemp);
            System.out.println("The smallest value is: " + mintemp);
            // System.out.println("The averge of the given values is: " average);
    
        return maxtemp;// i wanna return more varables because i wanna link these to doing more actions later on.
    }

static double distance (double num_array[], int n, double dist)
    {				//calculate the distance between numbers
      int loc1 = 0;
      int C = 0;
  
      Scanner input = new Scanner (System.in);	//pick the numbers given the location, than assign them to loc1 & 2, than give the user options to do stuff.
    System.out.println(" ");
        System.out.println("please pick the value that will be measured with the rest. ");
    System.out.println(" ");
  
      System.out.println ("The values you inputed are");
      for (int i = 0; i < num_array.length; i++)
        {
      System.out.print (C + ")");
      C++;
      System.out.println (num_array[i]);
        }
  
      System.out.println ("(Input the listed number of the chosen value}");
      System.out.println(" ");
      loc1 = input.nextInt ();
      input.close();
  
      //compares the picked value to all others
      for (int i = 0; i < num_array.length; i++)
        {
          System.out.println ("The difference between "+num_array[loc1]+" and "+num_array[i]+" is "+ (num_array[loc1]-num_array[i]) );
        }
        return 0;
    }
  
static double math(double num_array[], int n){//calcuator basically

    int num1, num2 = 0;
    int C = 0;

System.out.println("pick the numebrs from the array to mathmazize. ");
System.out.println(" ");

Scanner input = new Scanner(System.in);    
    for(int i = 0; i< num_array.length; i++){

        System.out.print (C + ")");
        C++;
        System.out.println (num_array[i]);
}
num1 = input.nextInt();
num2 = input.nextInt();

System.out.println(" ");
System.out.println("enter the operation (+, -, x, /)");

char op = input.next().charAt(0);

System.out.println(op);
double o = 0;

switch (op) {

    case '+':
 
    o = num_array[num1] + num_array[num2] ;

    break;

// case to subtract two numbers
case '-':

    o = num_array[num1]- num_array[num2] ;

    break;

// case to multiply two numbers
case '*':

    o = num_array[num1] * num_array[num2] ;

    break;

// case to divide two numbers
case '/':

    o = num_array[num1] / num_array[num2] ;

    break;


default:

    System.out.println("error occured, please try again.");
}
System.out.println(num_array[num1]  + " " + op + " " + num_array[num2]  + " = " + o);



input.close();

return o;
}

static double round(double num_array[],int n){//rounds numbers
int numnum= 0;
//int round= 0;
int C= 0;
double approx= 0;

Scanner input = new Scanner(System.in);
System.out.println(" ");
System.out.println("Please pick the value youd like to approximate.");
System.out.println(" ");
for(int i = 0; i < num_array.length; i++){
    System.out.print (C + ")");
    C++;
    System.out.println (num_array[i]);
}
numnum = input.nextInt();


System.out.println(" ");
System.out.println("How would you like to approximate this value.");
System.out.println(" ");
System.out.println("1) Rounding");
System.out.println("2) cutting");
System.out.println("3) sigdigs");

approx = input.nextDouble();
input.close(); 

if(approx == 1){
  approx = Math.round(num_array[numnum]);
  System.out.print("The approximated number is: " + approx);
}
if(approx == 2){

    approx = ((int)num_array[numnum]);
    System.out.print("The approximated number is: " + approx);
}
if(approx == 3){
approx = numnum; //bigdecimal is used here i think, i have no idea how tf thats done
System.out.print("The approximated number is: " + approx);
}

return approx;  //depending on how user wants it to be rounded, return one.
    
}


}
