public class Trigon extends Figure {
private double base ;
private double height;
private boolean  chek;
    Trigon (double length1 , double length2 , double length3 ){
    if (length1<length2+length3&&length1>length2-length3&&length2<length1+length3&&length2>length1-length3&&length3<length1+length2&&length3>length1-length3){//проверка на сущетсвование
        this.setLength1(length1);
        this.setLength2(length2);
        this.setLength3(length3);
        chek = true;
        if(length1>=length2 &&length1>=length3) {
            base = length1;
            if (length2>length3)
            height = length2;
            else
                height = length3;
        }
        else if (length2>length1&&length2>length3)
        {
            base = length2;
            if(length1>length3)
            height = length1;
            else
                height = length3;
        }
        else if (length3>length1&&length3>length2){
          base = length3;
          if(length1>length2)
          height = length1;
          else
              height = length2;
      }
    }
else
        System.out.println("Треугольник не существует");
    }
    @Override
    double S() {
        if (chek==true){
        setS(0.5*base*height);
        }
        else {
            System.out.println("Такой треугольник не может существовоть ");
        }
        return getS();
    }

    @Override
    double P() {
        if (chek == true){
            setP(getLength1()+getLength2()+getLength3());
        }
        else {
            System.out.println("Такой треугольник не может существовоть ");
        }
        return getP();
    }
}
