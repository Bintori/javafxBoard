package kroryi.board.service;

import kroryi.board.dto.Board;

import java.util.List;

public interface BoardService {

    List<Board> list();
    Board select(int no);
    int insert(Board board);
    int update(Board board);
    int delete(int no);

    void setWriter(String 홍길동);

    List<Board> pageList(int pageNo);
    int totalListCount();

}
