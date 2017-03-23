package Task.entity;


import java.io.Serializable;

public class SportEquipment implements Serializable {
    private Category category;
    private String title;
    private int price;
    public SportEquipment (Category category,String title,int price){
        this.category=category;
        this.title=title;
        this.price=price;
    }
    public void setCategory(Category category){
        this.category=category;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public Category getCategory(){
        return category;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }
     @Override
    public String toString(){
         return "SportEquipment:  title = " + title + ", " + category + ", price = " + price + "";
     }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SportEquipment other = (SportEquipment) obj;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (price != other.price)
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
}
