public class BSTNode<T extends Comparable<T>> {
	public T data;
	public BSTNode<T> left, right;

    @SafeVarargs
    public BSTNode(T ... data) {
        this.data = data[0];
        for (int i = 1; i < data.length; i++) {
            this.insert(data[i]);
        }
    }

    public void insert(T key) {
        if (this.data == key) { return; }
        else if (this.left == null && this.data.compareTo(key) > 0) { this.left = new BSTNode<T>(key); }
        else if (this.right == null && this.data.compareTo(key) < 0) { this.right = new BSTNode<T>(key); }
        else if (this.left != null && this.data.compareTo(key) > 0) { this.left.insert(key); }
        else if (this.right != null && this.data.compareTo(key) < 0) { this.right.insert(key); }
    }

    public boolean search(T key) {
        if (this.data == key) { return true; }
        else if (this.left != null && this.data.compareTo(key) > 0) { return this.left.search(key); }
        else if (this.right != null && this.data.compareTo(key) < 0) { return this.right.search(key); }
        return false;
    }

    public static void main(String[] args) {
        BSTNode<Integer> tree = new BSTNode<>(5, 10, 2, 3);
        System.out.println(tree.left.right.data);
        System.out.println(tree.search(3));
    }
}