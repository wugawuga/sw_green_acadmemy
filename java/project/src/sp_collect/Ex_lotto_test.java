package sp_collect;

import java.util.HashSet;
import java.util.Set;

public class Ex_lotto_test {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<>();
		
		for(;lotto.size()<6;) {
			int lonum = (int)(Math.random()*45+1);
			
			lotto.add(lonum);
		}
		System.out.println(lotto);
		
		
	}

}
