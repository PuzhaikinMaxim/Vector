public class Vector {
    private double x;
    private double y;
    private double z;
    public Vector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    double lenght;
    public Vector Summ(Vector a, Vector b)
    {
        return new Vector (a.x + b.x, a.y + b.y, a.z + b.z);
    }
    public void print(Vector a)
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public Vector Subs(Vector a, Vector b)
    {
        return new Vector (a.x - b.x, a.y - b.y, a.z - b.z);
    }
    public Vector Multi(Vector a, float b)
    {
        return new Vector(a.x * b, a.y * b, a.z * b);
    }
    public double Scalar_prod(Vector a, Vector b)
    {
        lenght = a.x * b.x + a.y * b.y + a.z * b.z;
        return lenght;
    }
    public double Vector_prod(Vector a, Vector b)
    {
        lenght = a.y*b.z - a.z * b.y - a.x * b.z + a.z * b.x + a.x * b.y - a.y * b.x;
        return lenght;
    }
    public double Vector_mixed(Vector a, Vector b, Vector c)
    {
        lenght = a.x * b.y * c.z + b.x * c.y * a.z + c.x * a.y * b.z - c.x * b.y * a.z - a.x * c.y * b.z - b.x * a.y * c.z;
        return lenght;
    }
    /*
    public double Summ(double x1, double x2, double y1, double y2)
    {
        x3 = x1 + x2;
        y3 = y1 + y2;
        x3 = x3 * x3;
        y3 = y3 * y3;
        lenght = Math.sqrt(x3 + y3);
        return lenght;
    }
    public double Subs(double x1, double x2, double y1, double y2)
    {
        if (Math.sqrt(x1 * x1 + y1 * y1) > Math.sqrt(x2 * x2 + y2 * y2))
        {
            x3 = x1 - x2;
            y3 = y1 - y2;
        }
        else {
            x3 = x2 - x1;
            y3 = y2 - y1;
        }
        lenght = Math.sqrt(x3 * x3 + y3 * y3);
        return lenght;
    }
    public double Multi(double x1, double y1, double num)
    {
        num = num * num;
        x1 = x1 * x1;
        y1 = y1 * y1;
        lenght = Math.sqrt(x1 * num + y1 * num);
        return lenght;
    }
    public double Scalar_prod(double x1, double x2, double y1, double y2)
    {
        lenght = x1 * x2 + y1 * y2;
        return lenght;
    }
    public double Vector_prod(double x1, double x2, double y1, double y2)
    {
        lenght = x1*y2 - x2*y1;
        return lenght;
    }
    public double Vector_mixed(double x1, double x2, double x3, double y1, double y2, double y3, double z1, double z2, double z3)
    {
        lenght = x1 * y2 * z3 + x2 * y3 * z1 + x3 * y1 * z2 - x3 * y2 * z1 - x1 * y3 * z2 - x2 * y1 * z3;
        return lenght;
    }
    */
}
