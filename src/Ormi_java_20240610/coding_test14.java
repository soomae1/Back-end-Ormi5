package Ormi_java_20240610;

// 주어진 문자열에서 모든 별표(*)와 별표 바로 왼쪽 및 오른쪽에 있는 문자를 제거한 버전을 반환하세요.
// 예를 들어, "abcd"는 "ad"를 반환하고, "ab**cd"도 "ad"를 반환합니다.

// System.out.println(starSideDel("cd*zq")); // "cq"
// System.out.println(starSideDel("ab**cd")); // "ad"
// System.out.println(starSideDel("wacy*xko")); // "wacko"

public class coding_test14 {
  public static void main(String[] args) {
    System.out.println(starSideDel("wacy*xko"));
  }
    static String starSideDel(String str){

        String result = "";

        for(int i=0; i <str.length(); i++){

            // 현재 문자가 *인 경우
            if(str.charAt(i) == '*'){
                // 두번 건너뛰도록 만들겠습니다.
                i++;
                continue;
            }

            // 현재 문자가 *이 아닌 경우
            if( (i==0 || str.charAt(i -1) != '*' ) && (i == str.length() -1 || str.charAt(i +1) != '*' )){
                result += String.valueOf(str.charAt(i));
            }

//            if(i == 0 && str.charAt(i) != '*'){
//                result += String.valueOf(str.charAt(i));
//            }
//
//            if(i>0 && str.charAt(i) != '*' && str.charAt(i -1) != '*'){
//                result += String.valueOf(str.charAt(i));
//            }
//
//            if(i>0 && str.charAt(i) == '*' && str.charAt(i-1) != '*'){
//                result = result.substring(0, result.length() -1);
//            }
        }

        return result;
    }
}
