package program;

import java.util.Stack;

public class Easy {
    public boolean isPalindrome(int x) {
        String sNum, sComparador = "";
        boolean fim = false;

        sNum = Integer.toString(x);

        for(int i = 0; i < sNum.length(); i++){
            sComparador = sNum.charAt(i) + sComparador;
        }

        if(sNum.equals(sComparador)) {fim = true;}

        return fim;

    }

    public int[] twoSum(int[] nums, int target) {
        int[] aRetorno = new int[2];
        int iRes = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                iRes = nums[i] + nums[j];
                if (iRes == target) {
                    aRetorno[0] = i;
                    aRetorno[1] = j;
                    break;
                }
            }
            if (iRes == target) {
                break;
            }
        }
        return aRetorno;
    }

    public int romanToInt(String s) {
        int iRetorno = 0;
        char chNum1, chNum2 = ' ';


        for(int i = 0; i < s.length(); i++){
            chNum1 = s.charAt(i);

            if( i < s.length() - 1) {
                chNum2 = s.charAt(i + 1);
            }

            if(chNum1 == 'I' && (chNum2 == 'V' || chNum2 == 'X')){
                iRetorno -= 1;
            }else if(chNum1 == 'X' && (chNum2 == 'L' || chNum2 == 'C')){
                iRetorno -= 10;
            }else if(chNum1 == 'C' && (chNum2 == 'D' || chNum2 == 'M')) {
                iRetorno -= 100;
            }else{
                switch (chNum1){
                    case 'I':
                        iRetorno += 1;
                        break;

                    case 'V':
                        iRetorno += 5;
                        break;

                    case 'X':
                        iRetorno += 10;
                        break;

                    case 'L':
                        iRetorno += 50;
                        break;

                    case 'C':
                        iRetorno += 100;
                        break;

                    case 'D':
                        iRetorno += 500;
                        break;

                    case 'M':
                        iRetorno += 1000;
                        break;

                    default:
                }
            }
        }
        return iRetorno;
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String sRetorno;

        sRetorno = strs[0];


        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(sRetorno) != 0){
                sRetorno = sRetorno.substring(0, sRetorno.length() - 1);
                if(sRetorno.isEmpty()) return "";
            }
        }

        return sRetorno;
    }

    public boolean isValid(String s) {
       Stack<Character> stack = new Stack();

       for(char c : s.toCharArray()){
           if(c == '('){
               stack.push(')');
           } else if (c == '{') {
               stack.push('}');
           }else if (c == '['){
               stack.push(']');
           }else if(stack.isEmpty() || stack.pop() != c){
               return false;
           }
       }

       return stack.isEmpty();
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode();

        return listNode;
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean bRetorno = false;
        String sWord1 = "", sWord2 = "";

        for (int i = 0; i < word1.length; i++){
            sWord1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++){
            sWord2 += word2[i];
        }

        if(sWord1.equals(sWord2)){
            bRetorno = true;
        }else{
            bRetorno = false;
        }

        return bRetorno;
    }

    public int singleNumber(int[] nums) {
        int iVerificar, iFinal = 0;

        for(int i = 0; i < nums.length; i++){
            iVerificar = nums[i];

            if(nums[i++] == iVerificar){
                iFinal = iVerificar;
            }


        }
        return iFinal;
    }


}



