package Programmers;

import java.util.Arrays;

class Solution2 {
   
   public static void main(String[] args) {
      String[] result = {"aya", "yee", "u", "maa",  "wyeoo"};
      String[] result2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
      
      System.out.println(solution(result));
   } //main 끝


   public static int solution(String[] babbling) {
      
      int answer = 0;
//      int count = 0;
      String[] speak = {"aya","ye","woo","ma"}; // 가능한 단어

//      String A = can[0].replace("speak[0]", "A"); // replace로 한 단어로 치환
//      String Y = can[1].replace("speak[1]", "Y");
//      String W = can[2].replace("speak[2]", "W");
//      String M = can[3].replace("speak[3]", "M");


      for(int i = 0; i < babbling.length; i++) {
         if(babbling[i].replace("aya","").replace("ye","").replace("woo", "").replace("ma", "") == "") { // 첫번째부터 ""로 바꾸고 결론적으로 ""나오면 하나씩 카운트
            answer = answer + 1; // 나올 수 있는 값
         }    
      }
      
      return answer;
   } 
}