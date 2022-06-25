import java.util.Scanner; // untuk input

public class latihan{
  public static void main(String[] args) {
    // System.out.println("Hello World!");
    // System.out.println(3+3);

    // int angka = 20;
    // System.out.println(angka);

    // Input dan output
    // Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // int b = scanner.nextInt();
    // int c = scanner.nextInt();
    // scanner.close();

    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);

    
    // if else
    // Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // scanner.close();

    // if(a % 2 == 0 && a < 5){
    //   System.out.println("Not Weird");

    // }else if(a % 2 == 0 && a < 20){
    //   System.out.println("Weird");

    // }else if(a % 2 == 0 && a > 20){
    //   System.out.println("Not Weird");

    // }else{
    //   System.out.println("Weird");

    // }
    
    // input dengan spasi
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    double b = scanner.nextDouble();
    String c = scanner.nextLine();
    c = scanner.nextLine();
    scanner.close();

    System.out.println(c);
    System.out.println("Double: " + b);
    System.out.println("Int: " + a);

  }
}
