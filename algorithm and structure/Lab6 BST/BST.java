public class BST {

    // Node root;
    private Node root;

    public BST() {
        root = null;
    }

    public BST(Integer key) {
        root = new Node(key);
    }

    private Node insert(Node x, Integer key) {
        if (x == null) {
            return new Node(key);
        }
        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = insert(x.left, key);
        } else if (cmp > 0) {
            x.right = insert(x.right, key);
        } else {
            // duplicate
            x.key = key;
        }
        return x;
    }

    // pre-oder
    // node - left - right
    private void NLR(Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            NLR(x.left);
            NLR(x.right);
        }
    }

    // in-oder
    // left - node - right
    private void LNR(Node x) {
        if (x != null) {
            LNR(x.left);
            System.out.print(x.key + " ");
            LNR(x.right);
        }
    }

    // post-oder
    // left - right - node
    private void LRN(Node x) {
        if (x != null) {
            LRN(x.left);
            LRN(x.right);
            System.out.print(x.key + " ");
        }
    }

    // decending order
    private void RNL(Node x) {
        if (x != null) {
            RNL(x.right);
            System.out.print(x.key + " ");
            RNL(x.left);
        }
    }

    private boolean contain(Node x, Integer key) {
        if (x == null) {
            return false;
        }

        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            return contain(x.right, key);
        } else if (cmp < 0) {
            return contain(x.left, key);
        } else {
            return true;
        }
    }

    private Node search(Node x, Integer key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return search(x.left, key);
        } else if (cmp > 0) {
            return search(x.right, key);
        } else {
            return x;
        }
    }

    private Node min(Node x) {
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }

    private Node max(Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }
    }

    public boolean constains(Integer key) {
        return contain(root, key);
    }

    public void insertNode(Integer key) {
        root = insert(root, key);
    }

    public void printPreOder() {
        NLR(root);
        System.out.println("");
    }

    public void printInOder() {
        LNR(root);
        System.out.println("");
    }

    public void printPostOder() {
        LRN(root);
        System.out.println("");
    }

    public void printDecendingOder() {
        RNL(root);
        System.out.println("");
    }

    public void printAscendingOder(BST tree) {
        printInOder();
    }

    private Node findParent(Node x, Node child) {
        if (x == null) {
            return null;
        }
        if (x.left == child || x.right == child) {
            return x;
        }

        int cmp = child.key.compareTo(x.key);
        if (cmp < 0) {
            return findParent(x.left, child);
        } else if (cmp > 0) {
            return findParent(x.right, child);
        }
        return null;
    }

    public void deleteMax() {
        Node max = max(root);
        Node parentMax = findParent(root, max);
        parentMax.right = null;
    }

    public void delete_pre() {
        // code

    }

    private int height(Node x) {
        if (x == null) {
            return 0;
        }
        return 1 + Math.max(height(x.left), height(x.right));

    }

    public int getHeight() {
        return height(root);
    }

    public Integer sum(Node x) {
        // code
        if (x == null) {
            return 0;
        }

        return x.key + sum(x.left) + sum(x.right);
    }

    public Integer sum() {
        return sum(root);
    }
}
