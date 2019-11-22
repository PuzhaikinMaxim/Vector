public class Main {
    public static void main(String[] args)
    {
        Vector a = new Vector(1,2, 3);
        Vector b = new Vector(3,4,4);
        Vector c = new Vector(3,4,4);
        a = a.Summ(a,b);
        a.print(a);
        a = a.Subs(a,b);
        a.print(a);
        double lenght = a.Scalar_prod(a,b);
        System.out.println(lenght);
        double lenght1 = a.Vector_prod(a,b);
        System.out.println(lenght);
        double lenght2 = a.Vector_mixed(a,b,c);
        System.out.println(lenght);
        a = a.Multi(a, 8);
        a.print(a);
    }
}
