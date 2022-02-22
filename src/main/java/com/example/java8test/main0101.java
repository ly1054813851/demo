package com.example.java8test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树
 * @author：ly
 * @Data :10:36 2022/1/1
 **/

public class main0101 {
    public static void main(String[] args) {

        //System.out.println(preorderTraversal(new TreeNode(1,new TreeNode(2,new TreeNode(7,null,new TreeNode(8)),new TreeNode(4)),new TreeNode(3,new TreeNode(5),new TreeNode(6)))));
        //test(new TreeNode(1,new TreeNode(2),new TreeNode(3)));
        //System.out.println(inorderTraversal1(new TreeNode(1,new TreeNode(2,new TreeNode(7,null,new TreeNode(8)),new TreeNode(4)),new TreeNode(3,new TreeNode(5),new TreeNode(6)))));
        System.out.println(postorderTraversal(new TreeNode(1,new TreeNode(2,new TreeNode(7,null,new TreeNode(8,null,new TreeNode(9))),new TreeNode(4)),new TreeNode(3,new TreeNode(5),new TreeNode(6)))));

    }

    //morris后序遍历
    public static List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        TreeNode p1 =root,p2 = null;
        TreeNode p3 = null;

        while (p1 != null){
            p2 = p1.left;
            if(p2 !=null) {
                while (p2.right != null && p2.right != p1) {
                    p2 = p2.right;
                }
                if (p2.right == null) {
                    p2.right = p1;
                    p1 = p1.left;
                    continue;
                } else {

                    p2.right = null;
                    addPath(res,p1.left);


                }
            }

            p1 = p1.right;

        }
        addPath(res,root);
        return res;
    }
    public static void addPath(List<Integer> res, TreeNode node) {
        int count = 0;
        while (node != null) {
            ++count;
            res.add(node.val);
            node = node.right;
        }
        int left = res.size() - count, right = res.size() - 1;
        while (left < right) {
            int temp = res.get(left);
            res.set(left, res.get(right));
            res.set(right, temp);
            left++;
            right--;
        }
    }



    //迭代后序遍历
    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Deque<TreeNode> stk = new LinkedList<>();
        TreeNode node = root,p = null;
        while (!stk.isEmpty() || node != null ){
            while (node != null){
                stk.push(node);
                node = node.left;
            }
            node = stk.pop();
            if(node.right == null || p==node.right){
                res.add(node.val);
                p = node;
                node = null;
            } else{
                stk.push(node);
                node = node.right;
            }

        }
        return res;
    }

    //morris中序遍历
    public static List<Integer> inorderTraversal1(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        TreeNode p1 = root,p2 = null;


        while (p1 != null){
            p2 = p1.left;
            if(p2 != null){
                while (p2.right != null && p2.right!=p1){
                    p2 = p2.right;
                }
                if(p2.right == null){
                    p2.right = p1;
                    p1 = p1.left;
                    continue;
                }else {
                    p2.right = null;
                    res.add(p1.val);
                }
            }else{
                res.add(p1.val);
            }
            p1 = p1.right;
        }

        return res;
    }


    //迭代中序遍历
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Deque<TreeNode> stk = new LinkedList<>();
        TreeNode node = root;
        while (node != null || !stk.isEmpty()){
            while (node != null){
                stk.push(node);
                node = node.left;
            }
            node = stk.pop();
            res.add(node.val);
            node = node.right;
        }

        return res;
    }

    //
    public static  void test(TreeNode root){
        if(root ==null){
            return;
        }
        test(root.left);
        test(root.right);
        System.out.println(root.val);
    }
    //morris前序遍历
    public static List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        TreeNode p1 = root, p2 = null;

        while (p1 != null) {
            p2 = p1.left;
            if (p2 != null) {
                while (p2.right != null && p2.right != p1) {
                    p2 = p2.right;
                }
                if (p2.right == null) {
                    res.add(p1.val);
                    p2.right = p1;
                    p1 = p1.left;
                    continue;
                } else {
                    p2.right = null;
                }
            } else {
                res.add(p1.val);

            }
            p1 = p1.right;
        }
        return res;
    }
    //迭代前序遍历
    public static List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();

        TreeNode node = root;
        while (!stack.isEmpty()||node!=null){
            while (node!=null){
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }


    //遍历二叉树 前中后取决res.add(root.val);的前后
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }

    public static void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        preorder(root.left, res);
        preorder(root.right, res);
        res.add(root.val);
    }


}
