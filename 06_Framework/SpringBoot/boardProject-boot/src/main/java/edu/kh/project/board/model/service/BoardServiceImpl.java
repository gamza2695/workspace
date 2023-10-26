package edu.kh.project.board.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.board.model.dto.Board;
import edu.kh.project.board.model.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;

@Service
@Transactional(rollbackFor = Exception.class) // 모든 예외 발생 시 롤백
@RequiredArgsConstructor // 롬복을 이용한 생성자 방식의 Autowired : 필드 final 형식으로 선언하면 알아서 bean DI 
public class BoardServiceImpl implements BoardService {

	private final BoardMapper mapper;
	
	@Override
	public Map<String, Object> selectBoardList(int boardCode, int i) {
		
		
		List<Board> boardList = mapper.selectBoardList(boardCode);
		
		
		// Map에 담아서 반환
		Map<String, Object> map = new HashMap<>();
		map.put("boardList", boardList);
		
		return map;
	}
	
}
