public class pr2_9 {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        int max, min;
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    max = a;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    max = b;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        }

        if (a < b) {
            if (a < c) {
                if (a < d) {
                    min = a;
                } else {
                    min = d;
                }
            } else {
                if (c < d) {
                    min = c;
                } else {
                    min = d;
                }
            }
        } else {
            if (b < c) {
                if (b < d) {
                    min = b;
                } else {
                    min = d;
                }
            } else {
                if (c < d) {
                    min = c;
                } else {
                    min = d;
                }
            }
        }
        System.out.println("Maximum number = " + max);
        System.out.println("Minimum number = " + min);
    }
}
