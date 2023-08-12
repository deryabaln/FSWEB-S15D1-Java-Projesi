package GroceryList;

import java.util.*;

public class GroceryList {

    public static List<String> groceryList = new LinkedList<>();

    private static String getProduct() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void addItems() {
       String product = getProduct();
        if (product.contains(",")) {
            String[] elements = product.split(",");
            for (String element : elements) {
                if (element != null && !element.trim().isEmpty() && !checkItemIsInList(element)) {
                        groceryList.add(element.trim());
                }else if(checkItemIsInList(element)){
                    System.out.println("!!!!" + element + " daha önce listeye eklendi");
                }
            }
        } else {
            if (product != null && !product.trim().isEmpty() && !checkItemIsInList(product)) {
                groceryList.add(product);
            }else if(checkItemIsInList(product)){
                System.out.println("!!!!"+ product +" daha önce listeye eklendi");
            }
        }
        printSorted();
    }

    ;

    public static void removeItems() {
        String product = getProduct();
        if (product.contains(",")) {
            String[] elements = product.split(",");
            for (String element : elements) {
                if (element != null && !element.trim().isEmpty() && checkItemIsInList(element)) {
                    groceryList.remove(element.trim());
                }else if(!checkItemIsInList(element)){
                    System.out.println("!!!!" + element + " zaten liste de yok");
                }
            }
        } else {
            if (product != null && !product.trim().isEmpty() && checkItemIsInList(product)) {
                groceryList.remove(product);
            }else if(!checkItemIsInList(product)){
                System.out.println( "!!!!"+ product + " zaten liste de yok");
            }
        }
        printSorted();
    }

    ;

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product.trim());
    }

    ;

    public static void printSorted() {
        Collections.sort(groceryList);
        for(String product: groceryList){
            System.out.println(product);
        }
    }


}
