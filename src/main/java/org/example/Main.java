package org.example;


public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        System.out.println("----------------");
//        for (int i = 10; i < 20; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("----------------");
//        for (int i = 0; i < 50; i+=7) {
//            System.out.println(i);
//        }
//
//        System.out.println("----------------");
//        for (int i = 5 -1; i >= 0; i--) {
//            System.out.println(i);
//        }
//
//        System.out.println("----------------");
//        for (int i = 0; i < 10; i++) {
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//
//        System.out.println("----------------");
//        for (int i = 0; i < 10; i++) {
//            if(i % 2 != 0){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("----------------");
//        for (int i = 1; i < 10; i++) {
//            if(i % 7 == 0){
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("----------------");
//        for (int i = 1; i < 100; i+=i) {
//            System.out.println(i);
//        }
//        System.out.println("----------------");
////        for (int i = 1; i > 0; i++) {
////            if( i % 1000000 == 0) {
////                System.out.println(i/1000000);
////            }
////        }
//        // extra
//        System.out.println("----------------");
//        int i = 0;
//        for (; i < 5;) {
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("----------------");
//        i = 0;
//        for (;true;) {
//            System.out.println(i);
//            if (i >= 4){
//                break;
//            }
//            i++;
//        }
//        System.out.println("----------------");
//        i = 0;
//        while (true){
//            System.out.println(i);
//            if (i >= 4){
//                break;
//            }
//            i++;
//        }

//            System.out.println("----------------");
//
//        boolean isTails = false;
//
//        while (!isTails){
//            int coin = (int) Math.round(Math.random());
//            System.out.println("metu moneta");
//            if (coin == 1){
//               isTails = true;
//            }
//        }

        int num = 20;
        //            0 1 2 3 4 5
        int[] nums = {1,5,3,7,8,20};
        System.out.println(nums);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[0]);
        System.out.println(nums[5]);
//        System.out.println(nums[6]);

        nums[0] = 50;
        System.out.println(nums[0]);

        int[] nums2 = new int[20];
        System.out.println(nums2[0]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
        }
        System.out.println("----------------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("----------------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + "-ta iteracija. nums[" + i + "] reiksme yra " + nums[i]);
        }
        System.out.println("----------------");

        for (int i = nums.length -1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        System.out.println("----------------");

        for (int y = 1; y <= 10; y++) {
            for (int x = 1; x <= 10; x++) {
                System.out.print(x * y + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");

        for (int y = 1; y <= 10; y++) {
            String row = "";
            for (int x = 1; x <= 10; x++) {
                row += x * y + " ";
            }
            System.out.println(row);
        }
    }
}