package com.atguigu.java;

import java.util.ArrayList;
/**
 * @author Jesse
 * @create 2020-03-22-16:46
 */
public class TemplateTest {
    //测试提交。。。。。。

    //模版一：psvm
    public static void main(String[] args) {
        //模版二：sout
        System.out.println("hello!");
        //变形：soutp / soutm / soutv / xxx.sout
        //soutp 打印方法的形参
        System.out.println("args = [" + args + "]");
        //soutm 打印方法名
        System.out.println("TemplateTest.main");
        //soutv 打印变量
        int num1 = 10;
        int num2 = 10;
        System.out.println("num2 = " + num2);

        //模版三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//arr[i].sout
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模版四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            
        }
        //变形：list.foii
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //模版五：ifn
        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {
            
        }
        //变形：xxx.nn /xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }
}
