//ini test whileloop

public class WhileLoop{
    public static void main (String[] args){
        int total=0;
        while (total<1000){
            System.out.println("total= " + String.valueOf(total)); //string.valueof ini convert dari int ke string
            total+=100; 
        } //atau bisa coba dibawah ini
        
        /*
        do {
            System.out.println("total= " + String.valueOf(total)); //string.valueof ini convert dari int ke string
            total+=100;
        } while (total<1000); //do while ini beda ururtan doang
         */

    }
}
