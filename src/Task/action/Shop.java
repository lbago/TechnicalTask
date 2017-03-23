package Task.action;


import Task.entity.SportEquipment;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shop implements Serializable {
    private Map<SportEquipment, Integer> goods = new HashMap<SportEquipment, Integer>();
    private Map<SportEquipment, Integer> rentgoods = new HashMap<SportEquipment, Integer>();

    public Shop() {
    }

    public Shop(Map<SportEquipment, Integer> goods) {
        this.goods = goods;
    }

    public Shop(Map<SportEquipment, Integer> goods, Map<SportEquipment, Integer> rentgoods) {
        this.goods = goods;
        this.rentgoods = rentgoods;
    }

    public void setGoods(Map<SportEquipment, Integer> goods) {
        this.goods = goods;
    }

    public void setRentgoods(Map<SportEquipment, Integer> rentgoods) {
        this.rentgoods = rentgoods;
    }

    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public Map<SportEquipment, Integer> getRentgoods() {
        return rentgoods;
    }

    public void showSportEquipment() {
        System.out.println("Information about SportEquipment");
        for (Map.Entry<SportEquipment, Integer> entry : goods.entrySet()) {
            System.out.println(entry.getKey().toString() + ", amount: " + entry.getValue());
        }
    }

    public void showRentUnit() {
        System.out.println("Information about RentUnit");
        for (Map.Entry<SportEquipment, Integer> entry : rentgoods.entrySet()) {
            System.out.println(entry.getKey().toString() + "amount: " + entry.getValue());
        }
    }

    public void searchInfo(String title) {
        try {
            System.out.print("SportEquipment: " + search(title).toString() +", amount: "+ goods.get(search(title)));
        } catch (NullPointerException ex) {
            System.out.println("No information");
        }
    }

    public SportEquipment search(String title) {
        Set<SportEquipment> keys = goods.keySet();
        for (SportEquipment key : keys) {
            if (key.getTitle().equals(title)) {
                return key;
            }
        }
        return null;
    }
}
