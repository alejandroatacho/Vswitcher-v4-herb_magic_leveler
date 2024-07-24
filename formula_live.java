int dirtyHerbId = 215; // Dirty herb ID
int cleanHerbId = 265; // Clean herb ID
int clean_herb_price = 50; // Market price of clean herb
int dirty_herb_price = 20; // Market price of dirty herb
int nature_rune_price = 88; // Price of nature rune
double clean_herb_tax = 0.01; // Tax on clean herb sale (1%)

// Calculate net profit per batch of 27 herbs
int profit_net = (27 * (clean_herb_price - (clean_herb_price * clean_herb_tax)))  // Revenue from selling cleaned herbs
                 - (27 * dirty_herb_price) // Cost of buying dirty herbs
                 - (2 * nature_rune_price); // Cost of nature runes

if (profit_net >= 1) {
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
} else if (profit_net <= 0) {
    // Not profitable, so log out or give a warning
}