package restaurantmenu;

import java.util.Objects;

public class MenuItem {

    private String name;
    private double price;
    private String category;
    private String description;
    private boolean isNew;

    public MenuItem() {}

    public MenuItem(String name, double price, String category, String description, boolean isNew) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = isNew;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                name.equals(menuItem.name) &&
                category.equals(menuItem.category) &&
                description.equals(menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category, description);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", isNew=" + isNew +
                "}\n" ;
    }
}
