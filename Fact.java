import java.util.Scanner;
class Fact{
  public static void main(String[] args){
  int i,fact=1,num;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  num=sc.nextInt();
  for(i=1;i<num;i++)
  {
     fact=fact*i;
  }
   System.out.println("factorial number is:"+ fact);
}
}
  