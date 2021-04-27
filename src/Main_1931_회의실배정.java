import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1931_회의실배정 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N + 1][2];
		int count = 0;

		// 한 개의 회의실을 잘 사용할 수 있는 법
		for (int i = 0; i < N; i++) { // 0부터 12까지
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			count++;
			for(int j=1; j<N; j++) {
			 
			}
		}

		print(arr, N);

	}// end of main

	private static void print(int[][] arr, int N) {
		for (int i = 0; i < N; i++) {
			System.out.println();
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
		} // end of for

	}
}// end of class

/*
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 각 회의 1에 대해 시작시간과 끝나는
 * 시간이 주어져있고 각 회의가 겹치지않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 단, 회의는 한번 시작하면 중간에
 * 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이
 * 주어진다. 최대한의 회의의 개수를 찾는 것이므로!!
 */
