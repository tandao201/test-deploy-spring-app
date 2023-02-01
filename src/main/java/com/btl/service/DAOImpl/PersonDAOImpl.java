package com.btl.service.DAOImpl;

import com.btl.model.Person;
import com.btl.service.DAO.IPersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonDAOImpl implements IPersonDAO {
    private JdbcTemplate jdbcTemplate;
    public PersonDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Person> getAllPerson() {
        String sql = "SELECT * FROM person";

        return jdbcTemplate.query(sql, rs -> {
            List<Person> personList = new ArrayList<>();

            while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getInt(1));
                person.setName(rs.getString(2));
                personList.add(person);
            }
            return personList;
        });
    }
}
