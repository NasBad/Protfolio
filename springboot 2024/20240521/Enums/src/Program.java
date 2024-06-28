public class Program {
    public static void main(String[] args) {

        Car c = new Car();
        c.setFirm(CarFirm.findById(1));
        c.setColor(CarColor.Blue);


        System.out.println(CarFirm.Mercedes.getId());


        System.out.println(c.getFirm()+" is "+c.getColor());
        if(c.isBeautiful())
        {
            System.out.println("The car is beautiful");
        }
        else {
            System.out.println("The car is nice only");
        }


        int x = 10;
        int z = 20;

       // MathFunctions math = new MathFunctions();
       // int res1 = math.add(x,z);
        System.out.println("XXXXX");
        MathFunctions.add(x,z);
        System.out.println("YYYYY");

        MathFunctions.add(x,z);
        System.out.println("ZZZZZ");
        int res = MathFunctions.add(x,z);
        System.out.println("WWWWW");
        c.drive(20);
        System.out.println(res);

        System.gc();

    }
}
