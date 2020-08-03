
package com.demo.servlet;

import cn.hutool.core.util.RandomUtil;

public class demo {

    public static String smsCode(){
        String code = "";
        for(int i=0;i<6;i++){
            int num = RandomUtil.randomInt(10);
            code += num;
        }
        return code;
    }

    public static void main(String[] args) {
        int chuanglan = 0;
        int aliyun = 0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                String m = smsCode();
                int s = Integer.valueOf(m);
                if(s>=500000 && s<999999){
                    System.out.print("\033[32;4m" + m + "\033[0m"+" ");
                    aliyun++;
                }else {
                    System.out.print(m+" ");
                    chuanglan++;
                }

            }
            System.out.println();
        }
        System.out.println("chuanglan:"+chuanglan+"  aliyun:"+aliyun);
    }
}
