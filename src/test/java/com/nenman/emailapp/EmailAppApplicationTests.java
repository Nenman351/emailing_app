package com.nenman.emailapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EmailAppApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testDatabaseConnection(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://127.0.0.1:3306", "Nenman","Christysele25");
        try{
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
            assertThat(connection).isNotNull();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
