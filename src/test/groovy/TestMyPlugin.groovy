import com.jhood.MyTask
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import com.jhood.MyPlugin

class TestMyPlugin extends GroovyTestCase {
    void testDealWithIt() {
        Project project = ProjectBuilder.builder().withName("hello-world").build()
        project.pluginManager.apply MyPlugin

        assertNotNull(project.tasks.dealwithit)
    }

    void testMyTask() {
        Project project = ProjectBuilder.builder().withName("hello-world").build()
        project.pluginManager.apply MyPlugin

        assertTrue(project.tasks.mytask instanceof MyTask)
    }
}