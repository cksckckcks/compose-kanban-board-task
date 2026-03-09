package woowacourse.kanban.board.model

import woowacourse.kanban.board.constants.CREW_ERROR_MESSAGE
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CrewTest {
    @Test
    fun `크루 이름이 공백이 아닌 문자열이라면 크루가 생성된다`() {
        val crewName = "볼트"

        val name = Crew(crewName)

        assertEquals(crewName, name.name)
    }

    @Test
    fun `이름이 비어있다면 생성되지 않는다`() {
        val crewName = ""

        val exception = assertFailsWith<IllegalArgumentException> {
            Crew(crewName)
        }

        assertEquals(CREW_ERROR_MESSAGE, exception.message)
    }

    @Test
    fun `이름에 공백만 있다면 생성되지 않는다`() {
        val crewName = "    "

        val exception = assertFailsWith<IllegalArgumentException> {
            Crew(crewName)
        }

        assertEquals(CREW_ERROR_MESSAGE, exception.message)
    }
}
