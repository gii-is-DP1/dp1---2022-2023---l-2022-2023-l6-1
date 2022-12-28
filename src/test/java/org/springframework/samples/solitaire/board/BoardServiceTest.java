package org.springframework.samples.solitaire.board;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.solitaire.board.Board;
import org.springframework.samples.solitaire.board.BoardService;
import org.springframework.stereotype.Service;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class BoardServiceTest {
	  @Autowired
		protected BoardService boardService;

		@Test
		void shouldFindBoardById() {
			Optional<Board> board = this.boardService.findById(1);
			assertThat(board.get()).isEqualTo(1);

		}

		
		
		
}
