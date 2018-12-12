public class Main {
    public static void main(String[] args) {
        Сircle c1 = new Сircle(3.16);//круг по радиусу
        System.out.println("Площадь круга  равна " +c1.S());
        System.out.println("Периметр круга равен "+c1.P());
        Сircle c2 = new  Сircle (3,1,1,3);//круг по двум точка
        System.out.println("Площадь круга  равна " +c2.S());
        System.out.println("Периметр круга равен "+c2.P());
        Square sq1 = new  Square (3.5,8.1);// квадрат по высоте и ширине
        System.out.println("Площадь прямоугольника равна "+sq1.S());
        System.out.println("Периметр прямоугольника равен "+sq1.P());
        Square sq2 = new Square(2,2,5,4);//квадрат по двум точкам
        System.out.println("Площадь прямоугольника равна "+sq2.S());
        System.out.println("Периметр прямоугольника равен "+sq2.P());
        Trigon tri = new Trigon(4,5,3);//существующей треугольник
        System.out.println("Площадь треугольника равна "+ tri.S());
        System.out.println("Периметр треугольника равен "+tri.P());
        Trigon tri2 = new Trigon(3,8,4);//не существующей треугольник
        System.out.println("Площадь треугольника равна "+ tri2.S());
        System.out.println("Периметр треугольника равен "+tri2.P());
    }
}