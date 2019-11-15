package resturantmenu;

public class MenuItem {

    private String name;
    private float price;
    private String category;
    private boolean isNew;

    public MenuItem() {}

    public MenuItem(String name, float price, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
