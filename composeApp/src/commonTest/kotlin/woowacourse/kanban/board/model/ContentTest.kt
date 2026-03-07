package woowacourse.kanban.board.model

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ContentTest {
    @Test
    fun `본문이 정상적으로 생성된다`() {
        val contentText = "안녕하세요. 본문입니다. 반갑습니다. 잘부탁드립니다"

        val content = Content(contentText)

        assertEquals(contentText, content.text)
    }

    @Test
    fun `제목이 비어있다면 생성되지 않는다`() {
        val contentText = ""

        assertFailsWith<IllegalArgumentException> {
            Content(contentText)
        }
    }

    @Test
    fun `제목에 공백만 있다면 생성되지 않는다`() {
        val contentText = "    "

        assertFailsWith<IllegalArgumentException> {
            Content(contentText)
        }
    }
}
