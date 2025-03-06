package 심화2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ex2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		Map<Integer, Integer> freqMap = new HashMap<>();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
		}
		sc.close();

		int mean = (int) Math.round((double) sum / n);

		Arrays.sort(arr);
		int median = arr[n / 2];

		int maxFreq = 0;
		List<Integer> modeCandidates = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			int key = entry.getKey();
			int freq = entry.getValue();
			if (freq > maxFreq) {
				maxFreq = freq;
				modeCandidates.clear();
				modeCandidates.add(key);
			} else if (freq == maxFreq) {
				modeCandidates.add(key);
			}
		}

		Collections.sort(modeCandidates);
		int mode = (modeCandidates.size() > 1) ? modeCandidates.get(1) : modeCandidates.get(0);

		int range = arr[n - 1] - arr[0];

		System.out.println(mean);
		System.out.println(median);
		System.out.println(mode);
		System.out.println(range);
	}
}
