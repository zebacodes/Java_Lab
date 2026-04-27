class Test {
    static int cnt = 0;

    Test(){
        cnt++;
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        System.out.println("Total objects: " + cnt);
    }
}
