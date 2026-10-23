public class LoopStatements {
    public static void main(String[] args) {
        /*  for (;;);   //死循环等价于while(true); */
        //! 增强for-->for-each,遍历集合或数组等可迭代对象的语法糖（让代码更好写、更好读的语法形式）
        String[] names = {"张三","李四"};
        for(String name : names){
            System.out.println(name);
        }
    

        /* 两个限制：
        1.拿不到下标(要下标就用普通 for)
        2.只读遍历：循环变量是元素的副本，改它不影响原数组 */
        int arr[] = {1,2,3,4,5};
        for(int x : arr){
            x += 1; //只修改副本arr;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //! 带标签的 break / continue：跳出多层
        outer:     //* 标签，写在循环前面，带冒号
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j > 40) {
                    System.out.println("乘积超 40，全部结束");
                    continue outer;                // 直接跳出外层（=跳出整个嵌套）
                    // continue outer; --->跳过外层本轮，进入外层下一轮
                }
                System.out.print(i + "×" + j + " ");
            }
        }
        // continue outer：跳过外层本轮，进入外层下一轮
        print99Table();    
    }

    // 嵌套循环实战：九九乘法表
    public static void print99Table(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t"); 
            }
            System.out.println();
        }
    }
}
