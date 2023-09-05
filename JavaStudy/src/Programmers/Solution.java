package Programmers;

import java.util.*;

public class Solution {

	public static void main(String[] args) {

		int[][] commands = {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3},
		};

//		int[] arr = {1, 1, 1, 1, 1};
//		int[] arr2 = {4, 1, 2, 1};

		int target = 3;
		int target2 = 4;

		String arr = "banana";
		String a = "2022.05.19";
		String[] arr1 = {"#.", ".."};
		String[] arr2 = {".....", "....#"};
		String[] arr3 = {"..#..", "#...#"};

		System.out.println(solution(arr1));
		System.out.println(solution(arr2));
		System.out.println(solution(arr3));
		System.out.println(arr1.toString());
	}

	public static int[] solution(String[] wallpaper) {
		int[] answer = new int[4];

		int[] pointXY = new int[wallpaper.length];
		for(int i = 0; i < wallpaper.length; i++) {
			pointXY[i] = wallpaper[i].indexOf("#"); //y값 나옴, -1,5,6,3,4
			System.out.println("전: " + pointXY[i]);
		}

		int min = pointXY[0];
		for(int i = 0; i < pointXY.length; i++) {
			if(pointXY[i] < min) {
				min = pointXY[i];
			}
			if(pointXY[i] == -1) {
				answer[0] = i+1;
				if(min < 0)
					min = pointXY[i];
			}
		}
		answer[1] = min;

		for(int i = 0; i < wallpaper.length; i++) {
			pointXY[i] = wallpaper[i].lastIndexOf("#");
			System.out.println("후: " + pointXY[i]);
		}

		// for(int plus : pointXY) {
		//     plus = plus+1;
		//     System.out.println(plus);
		// }

		int max = pointXY[0]; //2,3,4
		for(int i = 0; i < pointXY.length; i++) {
			if(pointXY[i] > max) {
				max = pointXY[i];
			}
		}
		answer[2] = pointXY.length;
		answer[3] = max;

		return answer;
	}


}

