package game;
//khong static duoc gan vao doi tuong
// static gan thang vao ham
public class Vector2D {
    public double x;
    public double y;

    public Vector2D()
    {
        this.x = 0;
        this.y = 0;
    }
    public Vector2D(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    // TODO: continue upgrading
    public Vector2D clone()
    {
        return new Vector2D (this.x,this.y);
    }
    public void set(double x , double y)
    {
        //gan cap x y moi cho vector duoc goi
        this.x=x;
        this.y=y;
    }
    public void add(double x , double y)
    {
        // cong gia tri x y vao vector duoc goi
        this.x += x;
        this.y += y;
    }
    public void minus(double x,double y)
    {
        //tru gia tri x y vao vector duoc goi
        this.x-=x;
        this.y-=y;
    }
    public void scale(double rate)
    {
        // nhan gia tri rate vao vector duoc goi
         this.x *= rate;
         this.y *= rate;
    }
    public double getLength()
    {
        //tra ra do dai cua vector duoc goi
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
    public void setLength(double length)
    {
        //giu nguyen huong cua vector duoc goi thay doi do dai bang do dai duoc turyen vao
        double currentLength = this.getLength();
        if(currentLength !=0 )
        {
            this.x = this.x * length/currentLength;
            this.y = this.y * length/currentLength;
        }
    }
    public double getAngle()
    {
//        double tanAngle = this.y/this.x;
//        double angle = Math.atan(tanAngle);
//        return angle;
         return Math.atan(this.y/this.x);
        // tra ve goc giua duong cheo va canh ben//giua vector va truc hoanh
    }
    public void setAngle(double angle)
    {
        //truyen vao 1 goc moi,vector se quay theo goc moi giu nguyen do dai
        double length = this.getLength();
        if(length!=0)
        {
            this.x = length * Math.cos(angle);
            this.y = length * Math.sin(angle);

        }
    }

    public void print()
    {
        System.out.println(this.x);//moi lan this duoc goi thi lai tao ra 1 dia chi moi(khong dung)
        //this dai dien cho doi tuong tao ra tu class
        // this la non static
        //static co the goi den static
        // non static co the goi den non static
        // static khong the goi den non- static
    }
    //super
    public static void main(String[] args)//khi dang chay static thi khong doi tuong nao duoc tao ra
    {
        Vector2D v1 = new Vector2D(1,1);
        Vector2D v2 = new Vector2D(2,2);
        Vector2D v3 = new Vector2D(3,3);
        v1.print();
        v2.print();
        v3.print();
//        Vector2D v2 = new Vector2D(0,3);
//        Vector2D v3 = new Vector2D(0,-3);
//        System.out.println(v1.getLength()+" "+ Math.sqrt(2));
//        v1.setLength(3);
//        System.out.println(v1.getLength()+" "+ 3);
//
//        System.out.println(v1.getAngle()+ " "+ (Math.PI /4));
//        System.out.println(v2.getAngle()+ " "+ (Math.PI /2));
//        System.out.println(v3.getAngle()+ " "+ (-Math.PI /2));
//        v1.setAngle(Math.PI);
//        System.out.println(v1.x + " "+ v1.y+ "(-3,0");
//        v1.setAngle(-Math.PI/2);
//        System.out.println(v1.x + " "+ v1.y + "(0,-3)");
//        v1.setAngle(Math.PI/2);
//        System.out.println(v1.x + " "+ v1.y +"(0,3)" );
//        v1.setAngle(0);
//        System.out.println(v1.x + " "+ v1.y+ "(3,0)");
    }
}
