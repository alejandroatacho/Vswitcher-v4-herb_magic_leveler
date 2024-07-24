int dirty_herb = 215;
int clean_herb = 265;

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
    