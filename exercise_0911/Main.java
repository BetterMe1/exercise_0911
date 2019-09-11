package exercise.exercise_0911;

/**
 * @Description:美团、小米
 * @Author:Anan
 * @Date:2019/9/11
 */
//删掉重复字符
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringBuilder sb = new StringBuilder(sc.next());
            boolean flag = true;//记录是不是第一次
            char tmp = '+';
            for(int i=0; i<sb.length(); i++){
                if(tmp == '+'){
                    tmp = sb.charAt(i);
                }else{
                    if(sb.charAt(i) == tmp){
                        if(flag){
                            sb.delete(i-1,i+1);
                            flag = false;
                            i-=2;
                        }else{
                            sb.delete(i,i+1);
                            i--;
                        }
                    }else{
                        flag = true;
                        tmp = sb.charAt(i);
                    }
                }
            }
            String result = sb.toString().equals("") ? "no" :sb.toString();
            System.out.println(result);
        }
    }
}

*/


//在字符串一中删除二中所有的字符
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        for(int i=0; i<str2.length(); i++){
            char a = str2.charAt(i);
            for(int j=0; j<str1.length(); j++){
                if(str1.charAt(j) == a){
                    str1=str1.substring(0,j)+str1.substring(j+1);
                    j--;
                }
            }
        }
        System.out.println(str1);
    }
}*/


//求数字
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long num = Long.parseLong(sc.next());
            int count = 0;
            int i = 1;
            while(count<num){
                count += i;
                i++;
            }
            if(count == num){
                System.out.println(--i);
            }else{
                System.out.println("No");
            }
        }
    }
}