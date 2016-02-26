public class Calculate{
   public static void main(String[] args){

       int first = Integer.valueOf(args[0]);
       int second = Integer.valueOf(args[1]);
      String oper = args[2];
      double summ;

      if(oper.equals("plus")) {
         summ = first + second;
         System.out.println(oper + " " + summ);
      }
         else if(oper.equals("minus")) {
            summ = first - second;
            System.out.println(oper + " " + summ);
         }

      else if(oper.equals("div")) {
         summ = first / second;
         System.out.println(oper + " " + summ);
      }
      else if(oper.equals("multi")) {
         summ = first * second;
         System.out.println(oper + " " + summ);
      }
            else
            System.out.println("Not operation!!!");

      }
}
