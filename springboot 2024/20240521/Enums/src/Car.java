public class Car {

    private CarFirm firm;
    private CarColor color;
    private int km;

    public CarFirm getFirm() {
        return firm;
    }

    public void setFirm(CarFirm firm) {
        this.firm = firm;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public boolean isBeautiful()
    {
        if(color == CarColor.Blue)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void drive(int distance)
    {
       /* MathFunctions math = new MathFunctions();
        this.km = math.add(km,distance);*/
        MathFunctions.add(km,distance);
    }
}
