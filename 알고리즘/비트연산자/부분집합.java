package 비트연산자;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 부분집합 {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
        // 모든 부분집합의 경우의 수 (공집합 제외 / 공집합 포함 시 i=0부터)
        for (int i = 1; i < (1 << array.length); i++) {
        	
            // 부분집합 생성
        	List<Integer> list = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                if ((i & (1 << j)) > 0) {
                    list.add(array[j]);
                }
            }
            
            //출력
            System.out.println(Arrays.toString(list.toArray()));
        }
	}
}
