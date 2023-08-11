package GroceryList;

import java.util.Scanner;

public class Main{

    public static void createGroceryList () {
        Scanner scanner = new Scanner(System.in) ;
        while (true){
            try {
                System.out.println("yapmak istediğiniz işlemi seçin");
                int x = scanner.nextInt();
                if(x>2 || x<0){
                    System.out.println("lütfen 0-2 aralığında bir sayı girin");
                }
                if(x == 0){
                    System.exit(0);
                }if(x == 1){
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    GroceryList.addItems();
                }if(x == 2){
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    GroceryList.removeItems();
                }
            } catch (Exception ex){
                System.out.println("invalid input");
                break;
            }
        }
    }

    public static void main(String[] args) {
       createGroceryList();

    }
}