package com.example.java8test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootTest
class Java8testApplicationTests {
    public static void main(String[] args) {

    }

    @Test
    void contextLoads() {
        int nums [] = {-2,1,-3,4,-1,2,1,-5,4};
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        System.out.println(maxAns);


    }
    @Test
    public void test(){
        int nums [] = {2,7,11,15};
        int target = 9;
        Map<Integer,Integer> hashtable = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                System.out.println(hashtable.get(target - nums[i])+"   "+i);
            }
            hashtable.put(nums[i], i);
        }
    }
    @Test
    public void test1(){
        int cap = 50;
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println((n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1);
    }

    @Test
    public void test2() throws Exception{
        int n = 4;
        int i = "a".hashCode();
        int b = (n - 1) & i;
        System.out.println(b);
    }

    @Test
    public void test3() {
        Map map = new HashMap();
        for(int i = 0;i<10;++i){
            map.put(i,i);
        }
        System.out.println(map.size());
    }
    @Test
    public void test4() {
        int h;
        String key = "abcd";
        System.out.println(key.hashCode());
        System.out.println((h = key.hashCode()) ^ (h >>> 16));
    }

    @Test
    public void test5(){
        int nums1 [] = {1,2,2,3};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
    }

    @Test
    public void test6() {
        int nums[] = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int newnums[] = new int[nums.length];
        for (int i = 0; i < k; i++) {
            newnums[i] = nums[nums.length - k + i];
        }
        for (int j = 0; j < nums.length - k; j++) {
            newnums[j + k] = nums[j];
        }
        System.out.println();
    }

    @Test
    public void test7(){
        char [][] board =
                {{'5','3','.','.','7','.','.','.','.'}
,{'6','.','.','1','9','5','.','.','.'}
,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}};
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][][] subboxes = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int index = c - '0' - 1;
                    rows[i][index]++;
                    columns[j][index]++;
                    subboxes[i / 3][j / 3][index]++;
                    if (rows[i][index] > 1 || columns[j][index] > 1 || subboxes[i / 3][j / 3][index] > 1) {
                        System.out.println(false);
                    }
                }
            }
        }
        System.out.println(true) ;

    }

    @Test
    public void test8(){
        String s = "abc def";
        String a[] = s.split(" ");
        StringBuffer rtn = new StringBuffer();
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length();j++){
                rtn.append(a[i].charAt(a[i].length()-j-1));
            }
            if(i!=a.length-1){
                rtn.append(" ");
            }
        }
        System.out.println(rtn.toString());
    }

    @Test
    public void test9(){
        int a[] = {1,2,3,4,5};
        int b[] = new int[5];
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(b);
    }

    @Test
    public void test10(){
        String s = "abcabcdd";
        Set<Character> occ = new HashSet<Character>();
        occ.contains(s);
        System.out.println(s);
    }

}
