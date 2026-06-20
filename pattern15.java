class pattern15 {
    public void pattern15 (int n) {
        for (int i = 65+n; i >= 65; i--) {
            for(int j = 65; j<i; j++) {
                System.out.print((char)j + " ");
            }
        }
    }



    public static void main(String[] args) {
        pattern15 ans = new pattern15();
        ans.pattern15(4);
    }
}