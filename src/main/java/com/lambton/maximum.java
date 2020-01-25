package com.lambton;

public class maximum {
    public static void main(String[] args) {
        int a[];
        a = new int[]{3,4,6,1,9};
        int t =0;
        int e =100;
        for(int i = 0;i<a.length;i++)
        {
            int b=a[i];
            t =t+ b;

        }
        System.out.println("sum ="+t);
        int c = a.length;
        System.out.println("avg ="+t/c);
        for(int i=0;i<a.length;i++)
        {
            int d =a[i];
            if(d<e)
            {
                e =d;
            }
        }
        System.out.println("min ="+e);
    }
}
