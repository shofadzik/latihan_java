//ini test loop for

public class ForLoop{
    public static void main (String[] args){
        String[] list_mahasiswa = new String[10];
        list_mahasiswa[0]="budi";
        list_mahasiswa[1]="udin";
        list_mahasiswa[2]="dino";

        for (int i=0; i<list_mahasiswa.length; i++){
            System.out.println("ini mahasiswa "+list_mahasiswa[i]);
        }
        for (int i=0; i<100; i++){
            System.out.println(i);
        }
        for (int i=100; i>1; i--){
            System.out.println(i);
        }
    }
}
