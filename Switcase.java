//ini test switch case

public class Switcase{
    public static void main (String[] args){
        int angka = Integer.parseInt(args[0]); //diconvert int karena aslinya string dan supaya bisa input sendiri

        switch(angka){
            case 100:
                System.out.println("perfect");
                break; //supaya bisa pilih case dariawal lagi
            case 50:
                System.out.println("setengah");
                break;
            case 0:
                System.out.println("nol");
                break;
            default:
                System.out.println("undefined");
        }
    }
}

