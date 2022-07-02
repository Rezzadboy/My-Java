import java.util.Scanner;

public class operasi {
    
    static float penjumlahan(float a, float b){
        return a + b;
    }

    static float pengurangan(float a, float b){
        return a - b;
    }

    static float perkalian(float a, float b){
        return a * b;
    }

    static float pembagian(float a, float b){
        return a / b;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int c;
        float d, e;

        System.out.print("Masukkan Pilihan: ");
        c = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        d = input.nextFloat();

        System.out.print("Masukkan angka kedua: ");
        e =input.nextFloat();

        input.close();

        switch (c) {
            case 1:
                System.out.println(penjumlahan(d, e));
                break;
            
            case 2:
                System.out.println(pengurangan(d, e));
                break;
            
            case 3:
                System.out.println(perkalian(d, e));
                break;
            
            case 4:
                System.out.println(pembagian(d, e));
                break;
            
            default:
                System.out.println("Inputan anda salah");
                break;
        }
        
    }
}
