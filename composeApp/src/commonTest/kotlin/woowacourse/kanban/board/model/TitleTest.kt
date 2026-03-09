package woowacourse.kanban.board.model

import woowacourse.kanban.board.constants.TITLE_ERROR_MESSAGE
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class TitleTest {
    @Test
    fun `제목이 공백이 아닌 문자열이라면 정상적으로 생성된다`() {
        val titleText = "안녕하세요. 제목입니다."

        val title = Title(titleText)

        assertEquals(titleText, title.text)
    }

    @Test
    fun `제목이 비어있다면 생성되지 않는다`() {
        val titleText = ""

        val exception = assertFailsWith<IllegalArgumentException> {
            Title(titleText)
        }

        assertEquals(TITLE_ERROR_MESSAGE, exception.message)
    }

    @Test
    fun `제목에 공백만 있다면 생성되지 않는다`() {
        val titleText = "    "

        val exception = assertFailsWith<IllegalArgumentException> {
            Title(titleText)
        }

        assertEquals(TITLE_ERROR_MESSAGE, exception.message)
    }
}
