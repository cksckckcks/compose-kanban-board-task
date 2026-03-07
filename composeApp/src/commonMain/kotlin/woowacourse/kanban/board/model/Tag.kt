package woowacourse.kanban.board.model

data class Tag(
    val name: String,
) {
    init {
        require(name.isNotBlank()) { "올바른 태그를 입력해주세요." }
    }
}
