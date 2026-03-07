package woowacourse.kanban.board.model

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class TagTest {
    @Test
    fun `Tag가 정상적으로 생성된다`() {
        val tagName = "볼트"

        val tag = Tag(tagName)

        assertEquals(tagName, tag.name)
    }

    @Test
    fun `Tag가 비어있다면 생성되지 않는다`() {
        val tagName = ""

        assertFailsWith<IllegalArgumentException> {
            Tag(tagName)
        }
    }

    @Test
    fun `Tag에 공백만 있다면 생성되지 않는다`() {
        val tagName = "    "

        assertFailsWith<IllegalArgumentException> {
            Tag(tagName)
        }
    }
}
