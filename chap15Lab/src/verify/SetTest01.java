package verify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n;
		Set<Integer> s = new HashSet<Integer>();
		// TreeSet s = new TreeSet();
		Random r = new Random();
		
		// �ۼ� ��ġ
		while(s.size()!=6){
			s.add(r.nextInt(45)+1);
		}
		
		System.out.print("[");
		for(int n : s) {
			System.out.print(n+"\t");
		}
		System.out.println("]");
		
		// set -> list �����Ͽ� Collection.sort()�� ����
		List list = new ArrayList(s);
		Collections.sort(list);
		
		System.out.println(s);
		System.out.println(list);

	}

}
