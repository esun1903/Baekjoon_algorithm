import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15652 {
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder(); //String builder

    private static void dfs(int n, int m, int d) {
        if (d == m) {
            for (int a : arr) sb.append(a + " ");
            sb.append("\n");
            return;
        }
//중복인 값을 빼기
        for (int i = 1; i <= n; i++) {


            visit[i] = true;
            arr[d] = i;

            if (d == 0)
                dfs(n, m, d + 1);
            if (d > 0 && arr[d] >= arr[d - 1])
                dfs(n, m, d + 1);

            visit[i] = false;

        }
        return;
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visit = new boolean[n + 1];
        dfs(n, m, 0);
        System.out.print(sb);
    }
}