/**
 * Created by Artem on 20.06.16.
 */
public class DelegateApp {
    public static void main(String[] args) {
//
        Painter painter=new Painter();
        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();
    }
}
//
//class A{
//    void f(){
//        System.out.println("f()");
//    }
//}
//
//class B{
//    A a=new A();
//    void f(){
//        a.f();
//    }
//}

interface Graphics{
    void draw();
}

class Triangle implements Graphics{

    @Override
    public void draw() {
        System.out.println("Draw triangle");
    }
}

class Square implements Graphics{

    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}

class Circle implements Graphics{

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}

class Painter{
    Graphics graphics;
    void setGraphics(Graphics graphics){
        this.graphics=graphics;
    }
    void draw(){
        graphics.draw();
    }
}