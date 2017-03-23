package Task.entity;


import java.io.Serializable;

public class Category implements Serializable {
    private String name;
    private String scopeofuse;

    public Category(String name, String scopeofuse) {
        this.name = name;
        this.scopeofuse = scopeofuse;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setScopeofuse(String scopeofuse){
        this.scopeofuse=scopeofuse;
    }
    public String getName(){
        return name;
    }
    public String getScopeofuse(){
        return scopeofuse;
    }
    @Override
    public String toString() {
        return "category(name = " + this.name + ", scope of use = " + this.scopeofuse + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Category other = (Category) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (scopeofuse == null) {
            if (other.scopeofuse != null)
                return false;
        } else if (!scopeofuse.equals(other.scopeofuse))
            return false;
        return true;
    }
}
