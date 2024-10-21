import java.sql.SQLOutput;

public class public_var {
    public int a;
    public_var(int h)
    {
        this.a=h;
    }
    public void get()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        public_var s =new public_var(20);

        s.get();

    }
}
