/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickSort;

/**
 *
 * @author 92019179
 */
class CatalogueItem {

    private Integer id;
    private String itemName;
    private String category;

    // getter methods
    public int getItemId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    // constructor
    public CatalogueItem(Integer newId, String newName, String newCategory) {

        id = newId;
        itemName = newName;
        category = newCategory;
    }

}
