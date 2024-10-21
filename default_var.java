public class default_var {
    int a;
    default_var(int h)
    {
        this.a=h;
    }
    public void get()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        default_var s =new default_var(20);

        s.get();

    }
}
