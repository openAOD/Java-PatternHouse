class symbolpattern {

    public static void main(String []args) {
        int x, z;
        for(int i = 1; i <= 9; i++) {
            switch(i) {
                case 1:
                case 9:
                    x = 6;
                    z = 4;
                    break;
                case 2:
                case 8:
                    x = 8;
                    z = 2;
                    break;
                case 3:
                case 7:
                    x = 9;
                    z = 1;
                    break;
                default:
                    x = 10;
                    z = 0;
            }
            for(int j = 1; j <= z; j++) {
                System.out.print(" ");
            }
            
            for(int k = 1; k <= x; k++) {
                System.out.print("* ");
            }
        
        System.out.println();
        }
    }
}