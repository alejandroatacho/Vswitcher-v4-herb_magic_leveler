//Title: V4 Degrime Caster 
//____________________________________________________________________________________________
// User Variables:
int dirty_herb = 215; //ID of the herb when its not cleaned
int dirty_herb_price = 20; //Current market price of dirty herb
int clean_herb = 265; //ID of the herb when its cleaned
int clean_herb_price = 50; //Current market price of clean herb
int nature_rune_price = 88; //Current price of nature rune
//___________________________________________________________________________________________

// Hinamizawa Variables don't touch!
double clean_herb_tax = 0.01; // Tax on clean herb sale (1%)
int profit_net = (27 * (clean_herb_price - (clean_herb_price * clean_herb_tax)))  // Revenue from selling cleaned herbs
                 - (27 * dirty_herb_price) // Cost of buying dirty herbs
                 - (2 * nature_rune_price); // Cost of nature runes


//Methods/statements down below
if (profit_net >= 1) {
    if(v.getLocalPlayer().hasAnimation(-1)) {

    if(v.getInventory().amountInInventory(clean_herb,2,28)) {
        
            v.getBank().deposit(clean_herb,27);
						v.getBank().withdraw(dirty_herb,27);
        }
        else if(v.getInventory().amountInInventory(dirty_herb,1,27)) {
        
        v.invoke("Cast","<col=00ff00>Degrime</col>",1,57,-1,14287024,false);

            } 
            else if(v.getLocalPlayer().hasAnimation(-1) && v.getInventory().inventoryFull()) {
            v.getBank().deposit(clean_herb,27);
            v.getBank().withdraw(dirty_herb,27);
        }
    
    } 
    
}
 else if (profit_net < 1) {
        log.info("You are about to lose this much money per inventory cast: " + profit_net + " GP per cast");
        // v.getGame().logout();
}

