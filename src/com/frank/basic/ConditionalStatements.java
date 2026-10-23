
public class ConditionalStatements {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        if(a > 0)
            if(b > 0)
                System.out.println("全都大于零");
        else    // 悬空 else,属于内层if,else值匹配最近的if
            System.out.println("a大于0,b小于零");

        //switch语句case穿透
        int day = 3;
        String type = switch(day){        //新特性(不用加break)
            // case 1:         //?  case 1,2,3,4,5 -> System.out.println("工作日");                   
            // case 2:         //?  case 6,7 -> System.out.println("周末");
            // case 3:
            // case 4:
            // case 5:
            //     System.out.println("工作日");
            //     break;
            // case 6:
            // case 7:
            //     System.out.println("周末");
            //     break;
            //? case 1,2,3,4,5 -> System.out.println("工作日");                  

            case 1,2,3,4,5 -> {System.out.println("工作日"); yield "工作日";}                 
            case 6,7 -> {
                System.out.println("周末");
                System.out.println("开心");
                yield "周末";                   //! 块语句用yield返回值
            }
            default -> "非法日期";
        };
    }


    // 卫语句：异常情况先走人
    public static String grade(int score) {
        if (score < 0 || score > 100) return "分数非法";   // 不合法，立刻返回
        if (score >= 60) return "及格";
        return "不及格";
    }

}
