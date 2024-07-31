package kroryi.board.dao;

import com.mysql.cj.jdbc.Driver;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import kroryi.board.dto.Board;
import kroryi.board.service.BoardService;
import kroryi.board.service.BoardServiceImpl;

import java.sql.*;

public class JDBConnection {

    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rs;

    public JDBConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javafxboard?useSSL=false&allowPublicKeyRetrieval=true";
            String username = "root";
            String password = "wjdtnqls0408";

            con = DriverManager.getConnection(url, username, password);
            System.out.println("DB 연결 성공!!");


        }catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args){
//        JDBConnection jdbConnection = new JDBConnection();

//        BoardDAO boardDAO = new BoardDAO();
//        boardDAO.selectList();
//        System.out.println(boardDAO.select(1).toString());
//        Board board = new Board(new SimpleStringProperty("오늘은 뭐하니"),
//                new SimpleStringProperty("유관순"),
//                new SimpleStringProperty("날씨 참 좋아!"));
//        boardDAO.insert(board);
//        boardDAO.selectList();
//
//        Board board = new Board(new SimpleStringProperty("오늘은 뭐하니2"),
//                new SimpleStringProperty("유관순2"),
//                new SimpleStringProperty("날씨 참 좋아!2"));
//        board.setNo(3);
//        boardDAO.update(board);

//        boardDAO.delete(3);

//        BoardService boardService = new BoardServiceImpl();
//        boardService.list();

//    }
}

