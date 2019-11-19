package restaurantmenu;

public class Restaurant {

    public static void main(String[] args) {
        Menu restaurantMenu = new Menu();

        restaurantMenu.addMenuItem(new MenuItem("Tacos", 1.49, "Main course", "They're tacos", true));
        restaurantMenu.addMenuItem(new MenuItem("Burrito", 3.99, "Main Course", "A burrito, steak probably", true));
        restaurantMenu.addMenuItem(new MenuItem("Cake", 3.99, "Dessert", "Not a lie", false));

        restaurantMenu.addMenuItem(new MenuItem("Cake", 3.99, "Dessert", "Not a lie", false)); // should fail


        System.out.println(restaurantMenu);
        System.out.println(restaurantMenu.getMenuItemByName("tacos"));
        restaurantMenu.removeMenuItemByName("cakE");

        System.out.println(restaurantMenu);
    }
}
