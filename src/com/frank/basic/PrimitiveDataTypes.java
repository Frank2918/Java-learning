public class PrimitiveDataTypes {
    static void main() {
        //1.整型的写法
        byte age = 20;
        short port = 443;
        int num = 100;
        long population = 100_000_000_00L;

        //2.浮点的写法和三个特殊值
        double pi = 3.141592653589793;   // 字面量默认 double
        float f = 3.14f;                 // float 必须加 f（不加编译错误）

        double a = 1.0 / 0;      // Infinity  （正无穷）
        double b = -1.0 / 0;     // -Infinity
        double c = 0.0 / 0;      // NaN       （Not a Number）
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //3. char：无符号的 16 位字符
        char letter = 'A';
        char chinese = '中';
        char byCode = 65;   //可接数字;

        System.out.println((int) '中');      // 20013：字符的 Unicode 码点
        System.out.println('A' + 1);         // 66：char 参与算术会提升为 int

        //4.截断
        int big = 130;
        byte bg = (byte) big;   // 130 --> 00000000 00000000 00000000 10000010(原/反/补)
        System.out.println(bg); // 截断--> 10000010(补)--> 11111101(反)--> 11111110(原) -->-126

        //5.浮点转整型：不是四舍五入，是砍掉小数
        double d = 9.99;
        int i = (int) d;               //直接截断小数部分（向零取整）
        int rounded = (int) Math.round(d);   //真正四舍五入要走 Math.round

        //6.整形溢出
        int max = Integer.MAX_VALUE;
        System.out.println(max + 1);    //int 最大值是 ，再加 1 会绕回最小值

        //7.浮点不精确
        float f1 = 0.1f;
        float f2 = 0.2f;
        System.out.println(f1+f2);

        System.out.println(0.1 + 0.2);  //不精确

        //8.基本类型转字符串
        int a2 = 42;
        String s1 = String.valueOf(a2);    // 推荐
        String s2 = a2 + "";               // 拼接空串，最随手
        String s3 = Integer.toString(a2);  // 同效果
    }
}
