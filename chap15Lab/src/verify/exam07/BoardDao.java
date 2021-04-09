package verify.exam07;

import java.util.ArrayList;
import java.util.List;

// DAO : Data Access Object, 데이터 접근 객체
public class BoardDao {
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		for(int i = 1; i <= 3; i++) {
			list.add(new Board("제목"+i, "내용"+i));
		}
		return list;
	}

}
