package woowacourse.kanban.board.model

data class Tag(
    val name: String,
) {
    init {
        require(name.isNotBlank()) { "태그 이름은 비어있거나 공백일 수 없습니다." }
    }
}
