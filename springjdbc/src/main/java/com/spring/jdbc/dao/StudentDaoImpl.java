package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.student.entites.Student;

@Component("sD")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	 // insert Query
	public int insert(Student student) {	
        String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r ;
	}
	
	//Updating data
	public int change(Student student) {
		String query = "update student set name = ? , city = ? where id= ?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
//	public int delete(Student student) {
//		//Deleting query
//		String query = "delete from student where id = ? ";
//		int r = this.jdbcTemplate.update(query,student.getId());
//		return r;
//	}
	public int delete(int studentId)
	{
		String query = "delete from student where id = ?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	//Select Query
	public Student getStudent(int studentId) {
		String qurey ="select * from student where id = ?"; 	

				RowMapper<Student> rowMapper = new RowMapperImpl();

		// Anonyums class
		
		Student stu = this.jdbcTemplate.queryForObject(qurey, rowMapper
//				new RowMapper() 
//		{
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student stu = new Student();
//				stu.setId(rs.getInt(1));
//				stu.setName(rs.getString(2));
//				stu.setCity(rs.getString(3));
//				return stu;
//			}
//		}
		, studentId);
		return stu;
	}
	
	// Select Multiple Query
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> stu = this.jdbcTemplate.query(query, new RowMapperImpl());
		return stu;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
//	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}