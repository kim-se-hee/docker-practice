package ksh.dockerpratice;

import ksh.dockerpratice.config.TestContainersConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@Import(TestContainersConfig.class)
@ActiveProfiles("test")
class DockerPraticeApplicationTests {

    @Test
    void contextLoads() {
    }
}
