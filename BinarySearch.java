public class BinarySearch {
    public static int bsearch(int[] a, int item) {
        int l = 0, u = a.length - 1;
	while (u > l) {
	    int m = l + (u - l)/2;
	    if (a[m] < item) { l = m + 1; }
	    else if (a[m] == item) { return m; }
	    else { u = m - 1; }
	}
	return -1;
    }

    public static void main(String[] args) {
        int[] a = {2,5,6,100,112,114};
        System.out.println(bsearch(a, 112));
        System.out.println(bsearch(a, 1000));
    }
}
