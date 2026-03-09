package woowacourse.kanban.board.model

import woowacourse.kanban.board.constants.TAG_ERROR_MESSAGE
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class TagTest {
    @Test
    fun `태그가 공백이 아닌 문자열이라면 정상적으로 생성된다`() {
        val tagName = "볼트"

        val tag = Tag(tagName)

        assertEquals(tagName, tag.name)
    }

    @Test
    fun `Tag가 비어있다면 생성되지 않는다`() {
        val tagName = ""

        val exception = assertFailsWith<IllegalArgumentException> {
            Tag(tagName)
        }

        assertEquals(TAG_ERROR_MESSAGE, exception.message)
    }

    @Test
    fun `Tag에 공백만 있다면 생성되지 않는다`() {
        val tagName = "    "

        val exception = assertFailsWith<IllegalArgumentException> {
            Tag(tagName)
        }

        assertEquals(TAG_ERROR_MESSAGE, exception.message)
    }
}
