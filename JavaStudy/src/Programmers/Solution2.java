package Programmers;

import java.util.*;

public class Solution2 {

	public static void main(String[] args) {

		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 }, };

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 3, 2, 4, 2 };
		int location = 0;

		// int[] arr2 = {4, 5, 6, 7, 8, 9};

		String arr3 = "banana";
		String a = "ana";
		String[] arr4 = { "ae", "be", "ce", "ae" };

		// int[] a = { 93, 30, 55 };
		// int[] b = { 1, 30, 5 };

		// System.out.println(solution(2, 1, 20));
		// System.out.println(solution(3, 1, 20));
		System.out.println(Arrays.toString(solution(arr)));
		System.out.println(Arrays.toString(solution(arr2)));
	}

	public static int[] solution(int[] answers) {
		List<Integer> answer = new ArrayList<>();

		 int[] a = {1, 2, 3, 4, 5}; //5 2
		 int[] b = {2, 1, 2, 3, 2, 4, 2, 5}; //8 2
		 int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10 2
		// 단지 이 안에 몇개를 맞췄느냐가 중요

		int[] temp = new int[3];
		 
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == a[i % a.length]) //i = 5, a[0] / 6, a[1]
				temp[0]++;
			if(answers[i] == b[i % b.length])
				temp[1]++;
			if(answers[i] == c[i % c.length])
				temp[2]++;
		}
		System.out.println(Arrays.toString(temp)); //5, 0, 0 & 2, 2, 2

		int max = 0;
		max = max(temp[0], temp[1], temp[2]);
		
		int[] result;
		
		//값이 다 같을 때
		if(temp[0] == temp[1] && temp[1] == temp[2]) {
			result = new int[3];
			result[0] = 1;
			result[1] = 2;
			result[2] = 3;
		} else { //count값이 다를 때
			max = max(temp[0], temp[1], temp[2]);
			if(max == temp[0]) {
				result = new int[1];
				result[0] = 1;
			} else if(max == temp[1]) {
				result = new int[1];
				result[0] = 2;
			} else {
				result = new int[1];
				result[0] = 3;
			}
			
			if(max == temp[0] && max == temp[1]) {
				result = new int[2];
				result[0] = 1;
				result[1] = 2;
			} else if(max == temp[0] && max == temp[2]) {
				result = new int[2];
				result[0] = 1;
				result[1] = 3;
			} else if(max == temp[1] && max == temp[2]){
				result = new int[2];
				result[0] = 2;
				result[1] = 3;
			}
		}
		
		return result;
	}
	
	static int max(int a,int b, int c) {
        int A = a;
        int B = b;
        int C = c;
        int max = a;
        
        if(max<B)
            max = B;
        if(max<C)
            max = C;
        
        return max;
    }

}