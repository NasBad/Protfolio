public enum CarFirm {
    Mercedes(1),//->will call the CTOR
    Ferrari(5),
    BMW (2),
    Toyota(3), Mazda(4);

    private int id;

    CarFirm(int id) //CTOR
    {
        this.id = id;
    }

    static CarFirm findById(int id)
    {
        for(CarFirm firm : values())
        {
            if(firm.id == id)
            {
                return firm;
            }
        }
        return null;
    }

    int getId()
    {
        return this.id;
    }

}
