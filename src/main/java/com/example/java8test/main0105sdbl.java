package com.example.java8test;

import java.util.*;

/**
 * @author：ly
 * @Data :10:57 2022/1/5
 * 二叉树
 **/
public class main0105sdbl {
    public static void main(String[] args) {
        //System.out.println(levelOrder(new TreeNode(3,new TreeNode(9,new TreeNode(4),new TreeNode(10)),new TreeNode(20,new TreeNode(15),new TreeNode(7)))));
        //maxDepth(new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7))));
        //System.out.println(maxDepth(new TreeNode(3,new TreeNode(9,null,new TreeNode(6,new TreeNode(7),new TreeNode(8))),new TreeNode(20,new TreeNode(15),new TreeNode(7)))));
        System.out.println(isSymmetric(new TreeNode(1,new TreeNode(2,null,new TreeNode(3)),new TreeNode(2,null,new TreeNode(3)))));
        //System.out.println(isSymmetric(new TreeNode(1)));

    }

    //对称二叉树
    public static boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public static boolean check(TreeNode u,TreeNode v){
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();
            if (u == null && v == null) {
                continue;
            }
            if ((u == null || v == null) || (u.val != v.val)) {
                return false;
            }

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;

    }


    //二叉树最大深度
    public static int maxDepth(TreeNode root) {
        int max = 0;
        if(root == null){
            return max;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            for(int i = 0; i < size; ++i){
                TreeNode node = deque.pop();
                if(node.left != null){
                    deque.add(node.left);
                }
                if(node.right != null){
                    deque.add(node.right);
                }
            }
            ++max;
        }
        return max;
    }


    //二叉树深度遍历
    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Deque<TreeNode> deque = new LinkedList<>();

        deque.add(root);
        while (!deque.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = deque.size();
            for(int i = 0; i < size; ++i){
                TreeNode node = deque.pop();
                level.add(node.val);
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }
            }
            list.add(level);
        }


        return list;

    }
}
