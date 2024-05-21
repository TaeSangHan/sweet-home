package com.taesang.sweethome.repository;

import com.taesang.sweethome.config.JpaConfig;
import com.taesang.sweethome.domain.Users;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
@Import(JpaConfig.class)
@DataJpaTest
@DisplayName("JPA 연결 테스트")
class JpaRepositoryTest {


    private final UsersRepository usersRepository;

    public JpaRepositoryTest(
            @Autowired UsersRepository usersRepository
    ) {
        this.usersRepository = usersRepository;
    }
    @DisplayName("select 테스트")
    @Test
    void test_work_fine() {
        List<Users> users = usersRepository.findAll();

        assertThat(users).isNotNull().hasSize(0);
    }

}