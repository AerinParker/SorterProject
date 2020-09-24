public class Sorter {
    public static void main(String[] args) {
        // Create test array
        Item[] testArray = new Item[24];
        testArray[0] = new Item("foo~03");
        testArray[1] = new Item("foo!03");
        testArray[2] = new Item("foo 10far");
        testArray[3] = new Item("foo 10boo");
        testArray[4] = new Item("foo 10bar");
        testArray[5] = new Item("foo 10");
        testArray[6] = new Item("foo 5");
        testArray[7] = new Item("foo 004");
        testArray[8] = new Item("foo 00003");
        testArray[9] = new Item("foo 003");
        testArray[10] = new Item("foo 03");
        testArray[11] = new Item("foo 002");
        testArray[12] = new Item("a10b2");
        testArray[13] = new Item("a2b10");
        testArray[14] = new Item("a2b2");
        testArray[15] = new Item("a2b1");
        testArray[16] = new Item("a1b2");
        testArray[17] = new Item("111");
        testArray[18] = new Item("1z14");
        testArray[19] = new Item("1z2");
        testArray[20] = new Item("1z1");
        testArray[21] = new Item("1d");
        testArray[22] = new Item("1c");
        testArray[23] = new Item("1b");

        // Sort test array
        Item.bubbleSort(testArray);

        // Print test array
        for (Item i : testArray) {
            System.out.println(i);
        }
    }
}
