package com.atguigu.java;

public class QuickSort{

    



    public static void main(String[] args) {
        QuickSort u = new QuickSort();
        int temp;
        int[] a = {1,3,4,5,6,67,543,100};
        u.quick_sort(a,0,7);
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    void quick_sort(int s[], int l, int r)
    {
        if(l < r){
            int i = l,j = r,x = s[l];
            while (i < j){
                while(i < j && s[j] > x){
                    j--;
                }
                if(i<j){
                    s[i++] = s[j];
                }
                while(i < j && s[i] < x){
                    i++; }
                if(i<j){
                    s[j--] = s[i];
                }
                s[i] = x;
                quick_sort(s,l,i-1);
                quick_sort(s,i+1,r);
             }
        }
    }

}