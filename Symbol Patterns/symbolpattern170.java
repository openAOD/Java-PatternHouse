class symbolpattern {

    public static void main(String []args) {
        int n = 5;
        int a[] = {4, 3, 5, 1, 2};
        
        for(int i = 0; i < n; i++) {
            System.out.print("[" + (i+1) + "]");
            
            for(int j = 0; j < a[i]; j++) {
                System.out.print("# ");
            }
            
            System.out.println();
        }
    }
}