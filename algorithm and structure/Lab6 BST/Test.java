public class Test {

    public static BST createTree(String strKey) {
        String[] keys = strKey.split(" ");
        BST tree = new BST();

        for (int i = 0; i < keys.length; i++) {
            tree.insertNode(Integer.valueOf(keys[i]));
        }

        return tree;
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
        System.out.println("tang dan: ");
        tree2.printInOder();

        // ex4
        System.out.println("giam dan: ");
        tree2.printDecendingOder();

        // ex5
        int key = 11;
        boolean isContain = tree2.constains(key);
        System.out.println("key: " + key);
        System.out.println("function contains: " + isContain);

        // ex6
        System.out.println("truoc khi xoa max: ");
        tree2.printPreOder();
        tree2.deleteMax();
        System.out.println("sau khi xoa max: ");
        tree2.printPreOder();
        // Integer x = null;
        // if (x == null) {
        // System.out.println("Null");
        // }

        // ex7

        // ex8
        System.out.println("height = " + tree2.getHeight());

        // ex9
        System.out.println(tree2.sum());

        // ex10
        System.out.println(tree2.sum());
    }

}
