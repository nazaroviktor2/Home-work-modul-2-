public class Square extends Figure{//квадрат
    Square(double length1,double length2){
        this.setLength1(length1);
        this.setLength2(length2);
    }
    Square (int x1 , int y1 ,int x3 , int y3 ){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1;
        this.y2 = y3;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x3;
        this.y4 = y1;

            this.setLength1((this.x1 - this.y1)-(this.x4-this.y4));
            this.setLength2((this.x3-this.y3)-(this.x4 - this.y4));
    }
    @Override
    double P() {
        setP((getLength1()+getLength2())*2);
        return getP();
    }

    @Override
    double S() {
        setS(getLength1()*getLength2());
        return getS();
    }
}