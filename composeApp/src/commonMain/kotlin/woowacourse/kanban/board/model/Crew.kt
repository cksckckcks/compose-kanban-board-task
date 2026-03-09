package woowacourse.kanban.board.model

data class Crew(
    val name: String,
) {
    init {
        require(name.isNotBlank()) { "크루 이름은 공백이거나 비어있을 수 없습니다." }
    }
}
