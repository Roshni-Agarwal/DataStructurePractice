package linklistDemo;


import java.io.*;
import java.util.*;
import java.lang.Math;

//class representing Structure of node in the binary tree
class treeNode {
    int data;
    treeNode left;
    treeNode right;

    public treeNode(int element) {
        data = element;
        left = null;
        right = null;
    }
}

class Tree{
    treeNode head;
    
    public void createTree(int[] x){
        head = new treeNode(0);
        treeNode[] trr = new treeNode[2*x.length+2];
        trr[0] = head;
        for(int i = 0; i < x.length; i++){
            int left = -1;
            int right = -1;
            for(int j = 0; j < x.length; j++){
                if(x[j] ==i){
                    if(left == -1){
                        left = j+1;
                    }else{
                        right = j+1;
                        break;
                    }
                }
            }
            if(left != -1){
            trr[i].left = new treeNode(left);
            trr[2*i +1] = trr[i].left;
            }
            if(right != -1){
            trr[i].right = new treeNode(right);
            trr[2*i + 2] = trr[i].right;}
        }
}}
public class dd {
    static treeNode rootNode;
    public static int calculateMedian(int[] parent){
        Tree t = new Tree();
        t.createTree(parent);
        return storeArray(t.head);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int M;
        M=scan.nextInt();
        int[] parent = new int[M];
        for(int j=0;j<M;j++){
            parent[j]=scan.nextInt();
        }
        int result;
        result = calculateMedian(parent);
        System.out.print(result);
        return ;
    } 
    public static int storeArray(treeNode node){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        ArrayList<Integer> medianArr = new ArrayList<Integer>();
        preOrder(node,arr1);
        postOrder(node, arr2);
        inOrder(node, arr3);
        int sum = 0;
        ListIterator<Integer> it1 = arr1.listIterator();
        ListIterator<Integer> it2 = arr2.listIterator(); 
        ListIterator<Integer> it3 = arr3.listIterator(); 
        while(it1.hasNext()){
            int a = it1.next();
            int b = it2.next();
            int c =it3.next();
            
        if ((a < b && b < c) || (c < b && b <= a)) 
            sum = sum +b;
        // Checking for a 
        else if ((b <= a && a <= c) || (c < a && a < b)) 
            sum = sum +a;
        else
            sum = sum +c;
        }
        return sum;
    }
    public static void preOrder(treeNode node,ArrayList<Integer> arr1){
        
        if(node!=null){
            arr1.add(node.data);
            preOrder(node.left,arr1);
            preOrder(node.right,arr1);
        }
       
    }
     public static void inOrder(treeNode node,ArrayList<Integer> arr2){
        if(node!=null){
            inOrder(node.left,arr2);
            arr2.add(node.data);
            inOrder(node.right,arr2);
        }
    }
     public static void postOrder(treeNode node,ArrayList<Integer> arr3){
        if(node!=null){
            postOrder(node.left,arr3);
            postOrder(node.right,arr3);
            arr3.add(node.data);
            
        }
    }
}