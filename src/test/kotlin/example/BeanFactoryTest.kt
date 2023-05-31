package example

import io.mockk.every
import io.mockk.mockkClass
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BeanFactoryTest {
    @Test
    fun test() {
        val factory = mockkClass(BeanFactory::class)
        val result = Bean("mock", 2)
        every { factory.create() } returns result

        val bean = factory.create()

        assertEquals(result, bean)
    }
}