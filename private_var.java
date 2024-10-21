public class private_var {
    private int a;
    private_var(int h)
    {
        this.a=h;
    }
    public void get()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        private_var s =new private_var(20);

        s.get();

    }
}
