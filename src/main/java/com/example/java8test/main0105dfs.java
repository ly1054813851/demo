package com.example.java8test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author：ly
 * @Data :09:20 2022/1/5
 * 深度优先算法
 **/
public class main0105dfs {
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) {
        int image [][]=  {{1,1,1},{1,1,0},{1,0,1}};
        floodFill(image,1,1,2);
    }

    //最大岛屿
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                ans = Math.max(ans,dfs(grid,i,j));
            }
        }
        return ans;
    }
    public int dfs(int[][] grid, int cur_i, int cur_j) {
        if (cur_i < 0 || cur_j < 0 || cur_i == grid.length || cur_j == grid[0].length || grid[cur_i][cur_j] != 1) {
            return 0;
        }
        grid[cur_i][cur_j] = 0;
        int[] di = {0, 0, 1, -1};
        int[] dj = {1, -1, 0, 0};
        int ans = 1;
        for(int i = 0; i < 4; ++i){
            int next_i = di[i]+cur_i, next_j = dj[i]+cur_j;
            ans+= dfs(grid,next_i,next_j);
        }
        return ans;
    }

    public int dfs2(int[][] grid, int cur_i, int cur_j) {
        int ans = 0;
        for (int i = 0; i != grid.length; ++i) {
            for (int j = 0; j != grid[0].length; ++j) {
                int cur = 0;
                Deque<int[]> deque = new LinkedList<>();
                deque.push(new int[]{i,j});
                while (!deque.isEmpty()){
                    int []cell = deque.pop();
                    int mx = cell[0],my = cell[1];
                    if(mx < 0 || my < 0 || mx == grid.length || my == grid[0].length || grid[mx][my] != 1){
                        continue;
                    }
                    ++cur;
                    grid[mx][my] = 0;
                    int[] di = {0, 0, 1, -1};
                    int[] dj = {1, -1, 0, 0};
                    for(int l = 0; l < 4; ++l){
                        int next_x = mx+di[l], next_y = my+dj[l];
                        deque.push(new int[] {next_x,next_y});
                    }
                }
                ans = Math.max(ans,cur);
            }
        }




        return ans;

    }


    //颜色修改(深度算法+栈)
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int currColor = image[sr][sc];
        if (currColor == newColor) {
            return image;
        }
        int n = image.length, m = image[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = newColor;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < n && my >= 0 && my < m && image[mx][my] == currColor) {
                    queue.offer(new int[]{mx, my});
                    image[mx][my] = newColor;
                }
            }
        }
        return image;
    }


}
