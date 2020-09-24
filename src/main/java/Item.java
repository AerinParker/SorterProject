public class Item implements Comparable<Item> {
    private String itemName;

    public Item() {
        itemName = "item0";
    }
    public Item(String name) {
        itemName = name;
    }

    // Sorting method
    public static void bubbleSort(Item[] testArray) {
        for (int i = 0; i < testArray.length; i++) {
            for(int j = 1; j < (testArray.length-i); j++) {
                // Swap two elements if one is larger than other
                if (testArray[j-1].compareTo(testArray[j]) > 0) {
                    // Create temporary item
                    Item temp = testArray[j-1];
                    // Swap items
                    testArray[j-1] = testArray[j];
                    testArray[j] = temp;
                }
            }
        }
    }

    public String toString() {
        return itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String name) {
        this.itemName = name;
    }

    // Check if character is a digit
    public static boolean isDigit(char ch) {
        int asciiVal = ch;
        if (asciiVal >= 48 && asciiVal <= 57) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Item item) {
        String name1 = this.getItemName();
        String name2 = item.getItemName();
        int nameVal1 = 0;
        int nameVal2 = 0;
        // If the character at position 1 is a digit, that name comes first
        if (isDigit(name1.charAt(0)) && !isDigit(name2.charAt(0))) {
            return -1;
        }
        if (isDigit(name2.charAt(0)) && !isDigit(name1.charAt(0))) {
            return 1;
        }
        // Initialize i
        int i = 0;
        // While i is less than both names' lengths,
        while (i < name1.length() && i < name2.length()) {
            // Iterate through name1
            for (int j = 0; j < name1.length(); j++) {
                if (name1.charAt(j) == ' ') {
                    break;
                }
                // Get ASCII value for char at j
                int asciiVal1 = name1.charAt(j);
                // Iterate through name2
                for (int k = 0; k < name2.length(); k++) {
                    if (name2.charAt(k) == ' ') {
                        break;
                    }
                    // Get ASCII value for char at k
                    int asciiVal2 = name2.charAt(k);
                    // If the ASCII val of name1's char at j is larger
                    // than the ASCII val of name2's char at k, increment nameVal
                    if (asciiVal1 > asciiVal2) {
                        nameVal1++;
                    } else {
                        nameVal2++;
                    }
                }
            }
            // Increment i
            i++;
        }
        if (nameVal1 > nameVal2 && name1.length() < name2.length()) {
            return -1;
        } else {
            return 1;
        }
    }
}
