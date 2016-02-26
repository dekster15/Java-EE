public class Calculate{
   public static void main(String[] args){

       int a = Integer.valueOf(args[0]);
       int b = Integer.valueOf(args[1]);
      String oper = args[2];
      double summ;

      if(oper.equals("plus")) {
         summ = a + b;
         System.out.println(oper + " " + summ);
      }
         else if(oper.equals("minus")) {
            summ = a - b;
            System.out.println(oper + " " + summ);
         }

      else if(oper.equals("div")) {
         summ = a / b;
         System.out.println(oper + " " + summ);
      }
      else if(oper.equals("multi")) {
         summ = a * b;
         System.out.println(oper + " " + summ);
      }
            else
            System.out.println("Not operation!!!");

      }
}
