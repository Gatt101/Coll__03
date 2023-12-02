class p4 {
    public static void main(String[] args) {
        int n = 4;

        for (int i=1;i<=n;i++) {
           int k=1;
            for (int j=1;j<=2*n-1; j++) {
                if (j>=n-i+1 && j<=n+i-1 && k==1) {
                    System.out.print("*");
                   k=0;
                } else {
                    System.out.print(" ");
                      k=1;
                }
            }
            System.out.println();
        }
    }
}
