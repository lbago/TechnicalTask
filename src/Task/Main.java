package Task;

import Task.action.RentUnit;
import Task.action.Shop;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){


        Shop shop = (Shop) deserData("file");
        RentUnit user = new RentUnit(shop);
        Scanner scn = new Scanner(System.in);
        int choice;
        String title;
        while(true){
            System.out.println("1. Show information about sport equipment;\n2. Show information about rent goods;\n3. Search sport equipment;\n4. Take the goods for rent;\n5. User's rent sport equipment\n6. Exit. ");
            choice = scn.nextInt();
            scn.nextLine();
            switch (choice){
                case 1:shop.showSportEquipment();break;
                case 2:shop.showRentUnit();break;
                case 3:System.out.print("Enter the title: ");
                title = scn.nextLine();
                shop.searchInfo(title);
                System.out.println("");break;
                case 4:user.addInRent();break;
                case 5: user.getSportEquipment();break;
                case 6: System.exit(0);

                default: System.out.print("You entered the wrong number. Try again.\n");
            }
        }
    }

    private static Object deserData(String file_name) {
        Object retObject = null;
        try {
            FileInputStream fileIn = new FileInputStream(file_name+".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            retObject = in.readObject();
            fileIn.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("file was not found");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error");
            System.exit(2);
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found");
        }
        return retObject;
    }

}
