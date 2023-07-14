package com.lingfenglong.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestJdbcTemplate {
    @Autowired
    private JdbcTemplate jdbc;

    @Test
    public void testInsert() {
        jdbc.update("insert into t_emp(name, age, sex) values (?, ?, ?)",
                "zhangsan", 19, "男");
        jdbc.update("insert into t_emp(name, age, sex) values (?, ?, ?)",
                "lisi", 31, "男");
        jdbc.update("insert into t_emp(name, age, sex) values (?, ?, ?)",
                "wangwu", 23, "男");
    }

    @Test
    public void testDelete() {
        jdbc.update("delete from t_emp where name = ?",
                "zhangsan");
    }

    @Test
    public void testUpdate() {
        jdbc.update("update t_emp set name = ? where name = ?",
                "lisisisi", "lisi");
    }

    // 返回对象
    @Test
    public void testSelectObject() {
//        Emp emp = jdbc.queryForObject("select * from t_emp where id = ?", new RowMapper<Emp>() {
//            @Override
//            public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
//                return new Emp(
//                        rs.getInt("id"),
//                        rs.getString("name"),
//                        rs.getInt("age"),
//                        rs.getString("sex")
//                );
//            }
//        }, 3);
        Emp emp = jdbc.queryForObject("select * from t_emp where id = ?", new BeanPropertyRowMapper<>(Emp.class), 3);
        System.out.println(emp);
    }

    // 返回List
    @Test
    public void testSelectList() {
        List<Emp> query = jdbc.query("select * from t_emp", new BeanPropertyRowMapper<>(Emp.class));

        query.forEach(row -> System.out.println(row));
    }

    // 返回单个值
    @Test
    public void testSelectValue() {
        System.out.println(jdbc.queryForObject("select count(*) from t_emp", Integer.class));
    }
}
