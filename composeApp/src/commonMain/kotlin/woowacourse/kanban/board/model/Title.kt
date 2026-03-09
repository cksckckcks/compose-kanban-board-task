package woowacourse.kanban.board.model

data class Title(
    val text: String,
) {
    init {
        require(text.isNotBlank()) { "제목은 비어있거나 공백일 수 없습니다." }
    }
}
