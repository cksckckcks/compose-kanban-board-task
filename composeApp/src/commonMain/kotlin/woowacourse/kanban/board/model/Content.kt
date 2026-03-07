package woowacourse.kanban.board.model

data class Content(
    val text: String,
) {
    init {
        require(text.isNotBlank()) { "올바른 본문 내용을 입력해주세요." }
    }
}
