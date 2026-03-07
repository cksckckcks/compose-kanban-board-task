package woowacourse.kanban.board.model

data class Title(
    val text: String,
) {
    init {
        require(text.isNotBlank()) { "올바른 제목을 입력해주세요." }
    }
}
