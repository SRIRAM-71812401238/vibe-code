class Solution {
    public boolean squareIsWhite(String s) {
        int col = s.charAt(0) - 'a' + 1;
        int row = s.charAt(1) - '0';
        return (col + row) % 2 != 0;
    }
}
