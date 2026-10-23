public class Variable {
    public static void main() {
        int age;    //声明变量
        age = 20;

        int score = 95;     //声明加初始化(推荐)

        int a = 1, b = 2;   //一行声明多个变量

        //final修饰的变量只能赋值一次，赋值后不可更改
        final double PI = 3.1415;
        // PI = 3.14;报错


        //var:声明局部变量时可以不写类型，编译器从右侧表达式推断
        var str = "字符串";
    }
}
