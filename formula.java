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
    // Profitable, so continue with mega long main code
} else if (profit_net <= 0) {
    // Not profitable, so log out or give a warning
}