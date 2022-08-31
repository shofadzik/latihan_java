//ini test if statement

public class ifStatement{
    public static void main (String[] args){
        int angka = 100;

        if (angka>50 && angka<200){
            System.out.println("angka besar");
        } 
        else if (angka <= 50){
            System.out.println("angka kecul");
        }
        else{
            System.out.println("undefined");
        }
    }
}