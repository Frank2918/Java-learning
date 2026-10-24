import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //? 1.数组的两种初始化方式
        //  动态初始化：指定长度，元素先取默认值
        int[] scores = new int[5];
        
        //  静态初始化：直接给出元素，长度自动确定
        int[] nums = { 1, 2, 3, 4, 5 };     // 完整格式-->int[] nuns = new int[]{1,2,3,4,5}
        printArr(nums);
        



        //?2.拷贝数组
        // todo:1.Arrays.copyOf(需要导包)  
        int[] numsCpy1 = Arrays.copyOf(nums, 5); //取前5个（可扩可缩，缺的补默认值）
        printArr(numsCpy1);

        //todo  2.Arrays.copyOfRange
        int[] numsCpy2 = Arrays.copyOfRange(nums, 1, 6); //左闭右开 [1,6)
        printArr(numsCpy2);

        //todo  3.System.arraycopy
        int[] numsCpy3 = new int[nums.length];
        System.arraycopy(nums, 0, numsCpy3, 0, nums.length); //原生方法，性能最好
        printArr(numsCpy3);

        int[] numsCpy4 = nums;  //❌ int[] c4 = src;    这是引用赋值，不是拷贝！

        //* 空字符NULL
        System.out.println('\u0000');   // char类型默认值:char 是 16 位的 Unicode 字符，
                                        // '\u0000' 表示 Unicode 编码表里的第0号字符，它的十进制值是0
        


        //? 3.数组三种遍历方式
        int[] number = {2,0,2,6};

        // 1)常规for循环:需要下标
        for (int i = 0; i < number.length; i++) {
            if(i != number.length){
                System.out.print(number[i] + " ");
            }else{
                System.out.println(number[i]);
            }
        }
        System.err.println();

        // 2)for-each-->增强for:只要元素首选
        for (int x : number) {
            if(x != number[number.length - 1]){
                System.out.print(x + " ");
            }else{
                System.out.println(x);
            }
        }
        System.out.println();

        // 3)Arrays.toString：打印一维数组用
        System.out.println(Arrays.toString(number));



        //? 4.二维数组

        // 1)二维数组静态初始化
        int[][] matrix = {
            {1,2,3},
            {4,5,6}
        };

        // 二维数组动态创建
        int[][] grid = new int[2][3]; //!全为0

        // 2)不规则数组
        int[][] jagged = new int[3][];           // 先定行数，列数待定
        jagged[0] = new int[]{1};
        jagged[1] = new int[]{1, 2};
        jagged[2] = new int[]{1, 2, 3};          // 杨辉三角就是这么存的

        // 3)二维数组遍历
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.err.println();
        }

        // todo: Arrays.deepToString(arr)
        System.out.println(Arrays.deepToString(jagged));
        System.out.println();





        //? 5.Arrays 工具类

        int[] arr = {1,0,2,4};
        int[] arr2 = {1,0,2,4};
        int[][] matrixArr = {
            {2,0,2,6},
            {1,0,2,4},
            {2,1,5,0}
        };

        System.out.println("Arrays 工具类");
        // 1.一维转可读字符串
        System.out.println(Arrays.toString(arr));

        // 2.二维数组转可读字符串
        System.out.println(Arrays.deepToString(matrixArr));

        // 2.原地排序（升序）,改变原数组,无返回值   排序区间 [from, to)--->局部排
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        

        // 3.二分查找:已排序；返回下标，不存在返回 -(插入点+1)
        int index = Arrays.binarySearch(arr, 3);
        System.out.println(index);
        // System.out.println(arr[index]);


        // 4.全部填充为 v
        Arrays.fill(arr, 1); //第二个参数为v
        System.out.println(Arrays.toString(arr));

        // 5.拷贝 copyOf, copyOfRange
        int[] c1 = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(c1));

        int[][] c2 = Arrays.copyOfRange(matrixArr, 0, matrixArr.length);
        System.out.println(Arrays.deepToString(c2));

        
        // 6.逐元素比较内容
        boolean result = Arrays.equals(arr,arr2);
        System.out.println(result);
        System.out.println(Arrays.equals(arr, new int[]{1, 1, 1, 1})); 

        // 二维数组比较用deepEquals
        boolean res = Arrays.deepEquals(matrix, new int[][]{{1,2,3},{3,6,8}});
        System.out.println(res);

        // todo:   7.数组--->List集合: asList(...)

        //! asList 返回的是定长视图（内部类 Arrays$ArrayList）长度不可变
        System.out.println(Arrays.asList(arr).size());        // 1 ！（一个元素：数组本身）
        System.out.println(Arrays.asList(1, 2, 3).size());    // 3（三个 Integer）
        // todo:   8.转 IntStream: stream(arr)

    
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
