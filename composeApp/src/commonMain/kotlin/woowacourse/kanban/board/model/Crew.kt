package woowacourse.kanban.board.model

data class Crew(
    val name: String,
) {
    init {
        require(name.isNotBlank()) { "올바른 이름을 입력해주세요." }
    }
}
