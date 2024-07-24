# V4 Degrime Caster

Welcome to the V4 Degrime Caster, a script that automates the process of casting the Degrime spell in the Arceuus spellbook of Old School RuneScape. Degrime is a spell that requires level 70 Magic and the completion of A Kingdom Divided quest to be cast.

## Overview

The script calculates the net profit from cleaning herbs using the Degrime spell and automates the actions based on the profit outcome. 

If the expected profit per cast is greater than or equal to 1, the script will:

- Deposit the cleaned herbs to the bank if there are any in the inventory.
- Withdraw dirty herbs from the bank.
- Cast the Degrime spell on the dirty herbs.
- Repeat the process until there is no more profit to be made or the inventory is full.

If the profit is less than 1, a log will be printed indicating the expected loss per cast. 

## How to Use

You need to fill in the data in the script before running it. 

Replace these variables with the current market values:

- `dirty_herb`: ID of the dirty herb.
- `dirty_herb_price`: Current market price of dirty herb.
- `clean_herb`: ID of the clean herb.
- `clean_herb_price`: Current market price of clean herb.
- `nature_rune_price`: Current price of nature rune.

The other variables in the script are system variables that you should not modify.

## WARNING

Keep in mind that the market prices fluctuate, so ensure to update the prices regularly for accurate profit calculations.

Also, remember to have enough magic level and the required quest completed to cast the Degrime spell. The script does not handle these prerequisites.
