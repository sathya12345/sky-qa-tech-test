
  
 class ScientificCalculator implements iScientificCalculator {
public function factorial(int n){
int f=1,i;
  System.out.println("Enter an integer to calculate a factorial");
  Scanner in= new Scanner(System.in);
  n=in.nextInt();
  if (n<0)
   System.out.println("Can not calculate fact");
  else{
  for(i=1;i<=n;i++){
  f=f*i;
  }
  System.out.println("Factorial of "+n+" is=" +f);
  }
}
}
