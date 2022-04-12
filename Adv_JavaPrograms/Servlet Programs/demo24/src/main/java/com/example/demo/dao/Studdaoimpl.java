package com.example.demo.dao;

import com.example.demo.stud;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Studdaoimpl implements StudDao {
    JdbcTemplate template;
//    @Override
//    public void insert(stud sob) {
//        String query="insert into students(id,name,addr) values(?,?,?)";
//        int status=this.template.update(query,sob.getId(),sob.getName(),sob.getAddr());
//        System.out.println("record inserted"+status);
//
//    }

    //    @Override
//    public void update(stud sob) {
//        String query="update students set addr=? where id=?";
//        int up=this.template.update(query,sob.getAddr(),sob.getId());
//        System.out.println("record updated"+up);
//    }
    @Override
    public void delete(stud sob) {
        String query = "delete  from students  where id=?";
        int del = this.template.update(query, sob.getId());
        System.out.println("record deleted" + del);


    }

//    @Override
//    public void displaybyid(int id) {
//        String query = "SELECT * from students  where id=?";
//
//        stud ob = (stud) this.template.queryForObject(query, new Object[]{id}, new rowdemo());
//
//        System.out.println(ob.getName());
//
//    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
//
//    class rowdemo implements RowMapper<stud> {
//
//        @Override
//        public stud mapRow(ResultSet resultSet, int i) throws SQLException {
//            stud sob = new stud();
//            sob.setId(resultSet.getInt("id"));
//            sob.setName(resultSet.getString("name"));
//            sob.setAddr(resultSet.getString("addr"));
//            return sob;
//        }
//    }


}



