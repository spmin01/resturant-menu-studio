package resturantmenu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menu;
    private LocalDate lastUpdatedDate;

    public Menu() {
        this.menu = new ArrayList();
        this.lastUpdatedDate = LocalDate.now();
    }

    public Menu(ArrayList<MenuItem> newMenu) {
        this.menu = newMenu;
        this.lastUpdatedDate = LocalDate.now();
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> newMenu) {
        this.menu = newMenu;
    }

    public void addMenuItem(MenuItem newItem) {
        this.menu.add(newItem);
    }

    /**
     * Finds item on menu by name
     * @param name String to search for
     * @return first item on menu matching name, null if no item found
     */
    public MenuItem getMenuItemByName(String name) {
        for(MenuItem item : menu) {
            if(item.getName().equals(name)) {
                return item;
            }
        }
        return null; // item not found
    }

    /**
     * Gets all MenuItems in menu with category matching category param
     * @param category String to search for
     * @return ArrayList of MenuItems with category matching param category
     */
    public ArrayList<MenuItem> getMenuItemsByCategory(String category) {
        ArrayList <MenuItem> returnList = new ArrayList();
        for(MenuItem item : menu) {
            if(item.getCategory().equals(category)) {
                returnList.add(item);
            }
        }
        return returnList;
    }

    /**
     * Returns all new items on menu
     * @return ArrayList of MenuItems where isNew == true
     */
    public ArrayList<MenuItem> getNewMenuItems() {
        ArrayList <MenuItem> returnList = new ArrayList();
        for(MenuItem item : menu) {
            if(item.isNew()) {
                returnList.add(item);
            }
        }
        return returnList;
    }

    /**
     * Removes MenuItem from menu ArrayList by name field
     * @param name String of item to remove
     * @return true if item found and removed, false otherwise
     */
    public boolean removeMenuItemByName(String name) {
        for(MenuItem item : menu) {
            if(item.getName().equals(name)) {
                menu.remove(item);
                return true;
            }
        }
        return false; // item not found
    }

    /**
     *
     * @return returns LocalDate field as string in format dd-mm-yyyy
     */
    public String getLastUpdatedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return lastUpdatedDate.format(formatter);
    }

    /**
     * updates lastUpdatedDate to today's date
     */
    public void updateDate() {
        this.lastUpdatedDate = LocalDate.now();
    }
}
