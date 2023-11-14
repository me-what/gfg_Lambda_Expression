import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FuncInterface fobj = (int x)->System.out.println(2*x);

        fobj.abstractFun(5);
        System.out.println();

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(n -> System.out.println(n));
        System.out.println();

        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
        System.out.println();

        // 2
        FuncInter1 add = (int x, int y) -> x + y;
        FuncInter1 multiply = (int x, int y) -> x * y;

        Main tobj = new Main();

        System.out.println("Addition is "
                + tobj.operate(6, 3, add));

        System.out.println("Multiplication is "
                + tobj.operate(6, 3, multiply));

        FuncInter2 fobj2 = message
                -> System.out.println("Hello " + message);
        fobj2.sayMessage("Geek");
    }

    private int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }
}