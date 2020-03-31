package formula;

public class Formula
{

    public Formula()
    {



    }


    public void set()
    {

        x = 14.26;

        y = -1.22;

        z = 3.5 * Math.pow(10,-2);

        t = 0.564849;

    }

    public void print()
    {

        System.out.println("x = " + x + "\n" + "y = " + y + "\n" + "z = " + z + "\n" + "t = " + t);

    }

    public void run()
    {

        double znam;

        znam = 0.5 + Math.pow(Math.sin(y),2);

        if(znam == 0)
        {

            System.out.println("Result = 0");

        }
        else
        {

            double chisel;

            double result;

            chisel = 2 * Math.cos(x - (Math.PI/6));

            result = (chisel / znam) * (1 + (Math.pow(z,2) / (3 - (Math.pow(z,2) / 5))));

            System.out.println("Result = " + result);

        }


    }

    private double x;

    private double y;

    private double z;

    private double t;

}
