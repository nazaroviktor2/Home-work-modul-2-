public class Figure {
   String name ;
    int x1 , y1, x2 , y2,x3,y3,x4,y4;
    private double  Length1 , Length2, Length3, Length4;
   private double P ;
   private double S ;
    double S ( ){
        return getS();
    }
    double P (){
        return getP();
    }

    public double getP() {
        return P;
    }

    public void setP(double p) {
        if (p>0)
        P = p;
    }

    public double getS() {
        return S;
    }

    public void setS(double s) {
      if (s>0)
        S = s;
    }

    public double getLength1() {
        return Length1;
    }

    public void setLength1(double length1) {
        if(length1 >0)
            Length1 = length1;
        else
            Length1 = length1*-1;

    }

    public double getLength3() {

        return Length3;
    }

    public void setLength3(double length3) {
        if(length3 >0)
        Length3 = length3;
        else
            Length3 = length3*-1;
    }

    public double getLength4() {
        return Length4;
    }

    public void setLength4(double length4) {
        if(length4 >0)
        Length4 = length4;
        else
            Length4 = length4 *-1;
    }

    public double getLength2() {
        return Length2;
    }

    public void setLength2(double length2) {
        if(length2 >0)
        Length2 = length2;
        else
            Length2 = length2*-1;
    }
}
