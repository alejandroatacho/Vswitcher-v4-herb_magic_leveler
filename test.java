// Define item IDs for clarity and ease of use
int dirtyHerbId = 215;
int cleanHerbId = 265;
int clean_herb_price = 50;
int dirty_herb_price = 20;
int nature_rune_price = 88;
// Check if the local player is not engaged in an animation
if(v.getLocalPlayer().hasAnimation(-1)) {

    // If there are more than one clean herbs in the inventory
    if(v.getInventory().amountInInventory(cleanHerbId,2,28)) {
        
        // Deposit all clean herbs in the bank
        v.getBank().deposit(cleanHerbId,27);

        // Withdraw dirty herbs from the bank
        v.getBank().withdraw(dirtyHerbId,27);
    }
    // If there are dirty herbs in the inventory
    else if(v.getInventory().amountInInventory(dirtyHerbId,1,27)) {

        // Cast the 'Degrime' spell on the dirty herbs
        v.invoke("Cast","<col=00ff00>Degrime</col>",1,57,-1,14287024,false);
    }
    // If the local player is not engaged in an animation and the inventory is full
    else if(v.getLocalPlayer().hasAnimation(-1) && v.getInventory().inventoryFull()) {
        
        // Deposit all clean herbs in the bank
        v.getBank().deposit(cleanHerbId,27);

        // Withdraw dirty herbs from the bank
        v.getBank().withdraw(dirtyHerbId,27);
    }
        // If the local player is not engaged in an animation and the is not inventory is full
    else if(v.getLocalPlayer().hasAnimation(-1) && !v.getInventory().inventoryFull()) {
        
        // Deposit all clean herbs in the bank
        v.getBank().deposit(cleanHerbId,27);

        // Withdraw dirty herbs from the bank
        v.getBank().withdraw(dirtyHerbId,27);
    }
}
