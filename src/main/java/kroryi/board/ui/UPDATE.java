package kroryi.board.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import kroryi.board.controller.UI;
import kroryi.board.dto.Board;
import kroryi.board.service.BoardService;
import kroryi.board.service.BoardServiceImpl;
import kroryi.board.util.SceneUtil;

import java.io.IOException;

public class UPDATE {

    @FXML
    public TextField tfTitle;
    @FXML
    public TextField tfWriter;
    @FXML
    public TextField tfRegDate;
    @FXML
    public TextArea taContent;

    int boardNo;
    private BoardService boardService = new BoardServiceImpl();

    public void read(int boardNo) {
        this.boardNo = boardNo;
        Board board = boardService.select(boardNo);
        tfTitle.setText(board.getTitle());
        tfWriter.setText(board.getWriter());
        tfRegDate.setText(board.getRegDate());
        taContent.setText(board.getContent());
    }

    public void moveToUpdate(ActionEvent event) throws IOException {
        Board board = new Board(tfTitle.getText(), tfWriter.getText(), taContent.getText());
        board.setNo(boardNo);
        int result = boardService.update(board);
        if(result > 0) {
            System.out.println("글 수정 완료");
            SceneUtil.getInstance().switchScene(event, UI.UPDATE.getPath());
        }
    }


    public void moveToList(ActionEvent event) {
        Board board = new Board(tfTitle.getText(), tfWriter.getText(), taContent.getText());

    }

    public void moveToNext(ActionEvent event) {

    }

    public void moveToDelete(ActionEvent event) {

    }

    public void moveToPrev(ActionEvent event) {

    }


}
