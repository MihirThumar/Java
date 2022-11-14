package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.student.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Programm Started ... " );
        	
//        	spring jdbc => Jdbc Templet
        
 //       ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        ApplicationContext con = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao sd = con.getBean("sD",StudentDao.class);
        
    // Insering ......
//        Student stu = new Student();
//        stu.setId(2);
//        stu.setName("Tobirama Senju");
//        stu.setCity("leaf");     
//        int result = sd.insert(stu);      
//        System.out.println("Data inserted...." + result);
        
//         Updataing .....    
//        	Student stu = new Student();
//        	stu.setId(999);
//        	stu.setName("Minato Namekaze");
//        	stu.setCity("Hidden In The LEAF");
//        	int result = sd.change(stu);
//        	System.out.println("data Changed " + result);
        
        // Delete Query ....
//        	Student stu = new Student();
//        	stu.setId(999);
//        	int result = sd.delete(stu);
//        	System.out.println("Data Deleted .... " + result);
        
//        	int result = sd.delete(2);
//        	System.out.println("Delete Data "+ result);
        
        //SELECT Single Data From Table
//        Student stu = sd.getStudent(2);            
//        System.out.println(stu);
        
        List<Student> stu = sd.getAllStudents();
        for (Student s : stu)
        {
        	System.out.println(s);
        }
        
    }
}
