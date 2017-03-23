package Task.action;


import Task.entity.SportEquipment;

import java.util.Scanner;

public class RentUnit {
    private SportEquipment[] units = new SportEquipment[3];
    private Shop shop;
    private int count = 0;

    public RentUnit(Shop shop) {
        this.shop = shop;
    }

    public RentUnit(SportEquipment[] units, Shop shop, int count) {
        this.units = units;
        this.shop = shop;
        this.count = count;
    }

    public void setUnits(SportEquipment[] units) {
        try {
            this.units = units;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array size exceeded");
        }
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public SportEquipment[] getUnits() {
        return units;
    }

    public Shop getShop() {
        return shop;
    }

    public void getSportEquipment() {
        System.out.println("Information about the user rented goods");
        for (int i = 0; i < count; i++) {
            System.out.println(units[i].toString());
        }
    }


    public void addInRent() {
        Scanner in = new Scanner(System.in);
        System.out.print("Select guipment: ");
        String title = in.nextLine();
        try {
            int num1 = shop.getGoods().get(shop.search(title));
            units[count] = shop.search(title);
            shop.getGoods().put(shop.search(title), num1 - 1);
            if (shop.getRentgoods().containsKey(shop.search(title))) {
                int num2 = shop.getRentgoods().get(shop.search(title));
                shop.getRentgoods().put(shop.search(title), num2 + 1);
            } else {
                shop.getRentgoods().put(shop.search(title), 1);
            }
            count++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print(("Exceeds the limit of rent goods"));
        } catch (NullPointerException ex) {
            System.out.println("There is no such equipment");
        }

    }
}
