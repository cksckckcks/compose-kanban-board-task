package woowacourse.kanban.board.model

data class Content(
    val text: String,
) {
    init {
        require(text.isNotBlank()) { "본문은 비어있거나, 공백으로 구성될 수 없습니다." }
    }
}
