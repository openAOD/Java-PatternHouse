class symbolpattern78 {

    public static void main(String []args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i % 2 == 0) {
                    if(j % 2 != 0) {
                        System.out.print("X ");
                    }
                    else {
                        System.out.print("O ");
                    }
                }
                else {
                    if(j % 2 != 0) {
                        System.out.print("O ");
                    }
                    else {
                        System.out.print("X ");
                    }
                }
            }
            System.out.println();
        }    
    }
}