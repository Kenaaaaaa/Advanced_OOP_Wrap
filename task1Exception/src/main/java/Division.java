import java.sql.SQLOutput;
/*Create the  divide  method which has to divide the two numbers that are the
attributes of the method. In case the second parameter of the method is 0, a
non-default exception should be thrown:  CannotDivideBy0Exception */
public class Division {

    public static double Divide(double numerator, double demoninator)throws CannotDivideBy0Exception{
        if(demoninator==0){
            throw new CannotDivideBy0Exception("Nuk lejohet pjesetimi me 0");
        }
        return numerator/demoninator;
    }

    public static void main(String[] args) {
        try{
            //rastet
            double result1=Divide(10,2); // 5.0//rasti normal
            System.out.println("Rezultati i pjesetimit te 10 me 2 eshte: " + result1);

            double result2=Divide(10,0);//hidhet exception
            System.out.println("Rezultati "+result2);
        }
        catch(CannotDivideBy0Exception e){
            System.out.println("Exception u kap: "+ e.getMessage());
        }
    }
}
