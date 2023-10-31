public class patterPrinting {
    public static void main(String[] args) {
        // for(int i = 5;i>0;i--){
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //      System.out.println();
        // }

        // for(int i = 1;i<5;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //      System.out.println();
        // }
            int n = 4;
        // for(int i = 1;i<=5;i++ ){
        //     for(int j = 1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i = n;i>=1;i-- ){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
