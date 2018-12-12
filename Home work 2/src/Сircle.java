public class Сircle extends Figure {//круг
    double R;
    Сircle(double R ){
    this.R = R ;

    }
    Сircle(int x1 , int y1, int x2, int y2  ){
        this.x1 = x1;
        this.y1 = y1;
        this.x2= x2;
        this.y2 = y2 ;
        this.setLength1((x1-y1)-(x2-y2));

        R = getLength1();
    }
    @Override
    double S() {
    setS(R*R*Math.PI);
        return getS();
    }

    @Override
    double P() {
        setP(2*Math.PI*R);
        return getP();
    }
}