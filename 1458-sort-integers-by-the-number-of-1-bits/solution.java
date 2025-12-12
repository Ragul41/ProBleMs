class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) temp[i] = arr[i];

        Arrays.sort(temp, (a, b) -> {
            int x = Integer.bitCount(a);
            int y = Integer.bitCount(b);
            return x == y ? a - b : x - y;
        });

        for (int i = 0; i < arr.length; i++) arr[i] = temp[i];
        return arr;
        
    }
}
