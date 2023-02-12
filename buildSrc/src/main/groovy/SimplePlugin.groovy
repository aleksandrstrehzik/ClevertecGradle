import org.gradle.api.Plugin
import org.gradle.api.Project

class SimplePlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.task('greeting') {
            println 'Hello'
        }
    }
}
