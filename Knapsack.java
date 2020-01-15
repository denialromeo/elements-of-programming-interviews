import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knapsack {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(60, 50, 70, 30);
		List<Integer> weights = Arrays.asList(5, 3, 4, 2);
		int ROWS = values.size();
		int COLS = Collections.max(weights) + 1;
		int[][] table = new int[ROWS][COLS];
		for (int j = 0; j < COLS; j++) {
			for (int i = 0; i < ROWS; i++) {
				if (i > 0 && (weights.get(i) > j)) {
					table[i][j] = table[i-1][j];
				}
				else {
					int poss1 = j >= weights.get(i) ? table[i][j - weights.get(i)] + values.get(i) : 0;
					int poss2 = i > 0 ? table[i-1][j] : 0;
					table[i][j] = Math.max(poss1, poss2);
				}
				System.out.printf("%d %d %d\n", i, j, table[i][j]);
			}
		}
	}
}
