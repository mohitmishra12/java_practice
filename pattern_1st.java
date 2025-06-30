public class pattern_1st {
    public static void main(String[] args) {
        int n=6;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    }

//        int n = 4;
//        int m = 5;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//
//                if (i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print("*");
//                } else {
//                    System.out.println("  ");
//                }
//            }
//            System.out.println();
//        }
//
//
//    }

