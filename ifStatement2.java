//ini test if statement dengan inputan/argument

public class ifStatement2{
    public static void main (String[] args){
        int angka = Integer.parseInt(args[0]); //diconvert int karena aslinya string

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
