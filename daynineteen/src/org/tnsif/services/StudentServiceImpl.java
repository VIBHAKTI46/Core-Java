package org.tnsif.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.tnsif.entities.Student;

public class StudentServiceImpl implements StudentRepo1 {


	public boolean addStudent(Student student) {
		String query="INSERT INTO STUDENT VALUES(?,?)";
		StudentRepo1 repo=new StudentRepo1();
		int count=repo.addQuery(query, student);
		if(count==1)
			return true;
		else
			return false;
	}
	public Student getStudent(int rollno) {
		Student student=new Student();
		StudentRepo1 repo=new StudentRepo1();
		String query="SELECT * FROM STUDENT WHERE rollno= "+rollno;
		ResultSet rs=repo.retrieveQuery(query);
		try {
			rs.next();
			student.setRollno(rs.getInt(1));
			student.setName(rs.getString(2));
		} catch (SQLException e) {
			System.out.println(e);
		}
		return student;
	}

	public List<Student> getAll() {
		List<Student> students=new List<Student>();
		StudentRepo1 repo=new StudentRepo1();
		String query="SELECT * FROM STUDENT";
		ResultSet rs=repo.retrieveQuery(query);
		try {
			while(rs.next()) {
				Student student=new Student();
				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));
				students.add(student);
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		return students;
	}

	public Student updateStudent(Student student) {
		String query="UPDATE STUDENT SET name= ? WHERE (rollno= ?)";
		StudentRepo1 repo=new StudentRepo1();
		int count=repo.updateQuery(query, student);
		if(count==1) {
			Student s=getStudent(student.getRollno());
			return s;
		}
		else {
			return null;
		}
	}

	public boolean deleteStudent(int rollno) {
		// TODO Auto-generated method stub
		return false;
	}

	
}