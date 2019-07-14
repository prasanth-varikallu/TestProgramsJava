import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Trees {

    private class Node {
        int value;
        Node left;
        Node right;

    }

    Node root;

    public void addNode(int val) {


        if (root == null) {
            root.value = val;
            return;
        }

        Node currentNode = root;

        navigateAndInsert(currentNode, val);

    }

    private void navigateAndInsert(Node n, int val) {

        if (val < n.value) {
            if (n.left == null) {
                Node newNode = new Node();
                newNode.value = val;
                n.left = newNode;
                return;
            }
            navigateAndInsert(n.left, val);
        } else {
            if (n.right == null) {
                Node newNode = new Node();
                newNode.value = val;
                n.right = newNode;
                return;
            }
            navigateAndInsert(n.right, val);
        }


    }

    private void printTree() {
        Queue<Node> queue = null;
        queue.add(root);
        
        for (int i = 0; i < queue.size(); i++) {
            Node n = queue.remove();

            System.out.print(n.value);
        }


    }

    public static void main(String[] args) {
//        Trees t = new Trees();
//        t.addNode(5);
//        t.addNode(2);
//        t.addNode(4);
//        t.addNode(6);
//        t.addNode(8);
//        t.addNode(3);


        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        set1.add('a');
        set2.add('b');

        Set<Character> set = set1.stream().filter(set2::contains).collect(Collectors.toSet());

        System.out.println(set.size());
        System.out.println(set.isEmpty());



    }
}
