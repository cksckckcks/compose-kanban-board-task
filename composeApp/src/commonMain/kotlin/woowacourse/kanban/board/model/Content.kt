package woowacourse.kanban.board.model

import woowacourse.kanban.board.constants.CONTENT_ERROR_MESSAGE

data class Content(
    val text: String,
) {
    init {
        require(text.isNotBlank()) { CONTENT_ERROR_MESSAGE }
    }
}
