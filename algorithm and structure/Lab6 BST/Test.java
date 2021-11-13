public class Test {

    public static BST createTree(String strKey) {
        String[] keys = strKey.split(" ");
        BST tree = new BST();

        for (int i = 0; i < keys.length; i++) {
            tree.insertNode(Integer.valueOf(keys[i]));
        }

        return tree;
    }

    public static void printAscendingOder(BST tree) {
        System.out.println("tang dan: ");
        tree.printInOder();
    }

    public static void printDecendingOder(BST tree) {
        System.out.println("giam dan: ");
        tree.printDecendingOder();
    }

    public static void main(String[] args) {
        // ex1
        BST tree = new BST();

        tree.insertNode(40);
        tree.insertNode(25);
        tree.insertNode(10);
        tree.insertNode(32);
        tree.insertNode(78);

        System.out.println("pre oder: ");
        tree.printPreOder();
        System.out.println("in oder: ");
        tree.printInOder();
        System.out.println("post oder: ");
        tree.printPostOder();

        // ex2
        String strKey = "45 25 78 10 3 17 32 30 38 50 93";
        BST tree2 = createTree(strKey);
        // tree2.printPreOder();

        // ex3
        printAscendingOder(tree2);

        // ex4
        printDecendingOder(tree2);

        // ex5
        // int key = 17;
        // boolean isContain = tree2.constains(key);
        // System.out.println("function contains: " + isContain);
    }

}
