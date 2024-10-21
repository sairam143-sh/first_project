public class protected_var {
    protected int a;
    protected_var(int h)
    {
        this.a=h;
    }
    public void get()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        protected_var s =new protected_var(20);

        s.get();

    }
}
