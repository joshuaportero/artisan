package dev.portero.artisan;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ArtisanApplicationTest {

    @Test
    void contextLoads() {
        assertThat(true).isTrue();
    }
}
