public class Operators {
    static void main() {
        //1.算术运算符
        System.out.print(1 + 2 + " ");
        System.out.print(1 - 2 + " ");
        System.out.print(1 * 2 + " ");
        System.out.print(1 / 2 + " ");
        System.out.print(1 % 2 + " ");
        int a = 0;
        System.out.println(a++);
        System.out.println(++a);
        System.out.print(a);


        //2.赋值与复合赋值(自带隐式转换)
        int b = 10;
        b += 5;
        System.out.println(b);

        //3.关系与逻辑运算符
        System.out.println(a < b);
        //短路逻辑运算
        System.out.println(true && false);
        System.out.println(true || false);

        //逻辑运算
        System.out.println(true & false);
        System.out.println(true | false);

        //4.位运算
        System.out.println(true ^ false);
        System.out.println(~a);
        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);

        //5.三目运算符
        int res = a > b ? a : b;
        System.out.println(res);
    }
}
