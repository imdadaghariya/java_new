public class invertedhalfpyramidwithnumber {
    public static void main(String[] args) {
        for(int i =5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        
        System.out.println();
        System.out.println();
        System.out.println("halfpyramid");
        System.out.println();
        System.out.println();

        for(int i =1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("halfpyramid "+ "*");
        System.out.println();
        System.out.println();

        for(int i = 1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Inverted Half Pyramid "+ "*");
        System.out.println();
        System.out.println();

        for(int i=5;i>0;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Floyd's Triangle");
        System.out.println();
        System.out.println();

        int counter = 1;
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println(" 0-1 Triangle");
        System.out.println();
        System.out.println();

        for(int i = 1;i<=5;i++){
            int num = 1;
            for(int j =1;j<=i;j++){
                int sum = i+j;
                if(sum% 2 == 0){
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("  Half Pyramid 180 ");
        System.out.println();
        System.out.println();

        int n =5;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println(" Full Triangle");
        System.out.println();
        System.out.println();


        for(int i = 0;i<=5;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j =1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
