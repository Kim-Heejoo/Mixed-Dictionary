package ��Ʈ������;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class �κ����� {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
        // ��� �κ������� ����� �� (������ ���� / ������ ���� �� i=0����)
        for (int i = 1; i < (1 << array.length); i++) {
        	
            // �κ����� ����
        	List<Integer> list = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                if ((i & (1 << j)) > 0) {
                    list.add(array[j]);
                }
            }
            
            //���
            System.out.println(Arrays.toString(list.toArray()));
        }
	}
}
