package com.alperenaktug.cruddemo;

import com.alperenaktug.cruddemo.dao.StudentDAO;
import com.alperenaktug.cruddemo.entity.Student;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO){
		return runner -> {
			// createStudent(studentDAO);
			 createMultipleStudent(studentDAO);
			// readStudent(studentDAO);
			//   queryForStudents(studentDAO);
			// queryForStudentsLastName(studentDAO);
			//  updateStudent(studentDAO);
			 //  deleteStudent(studentDAO);
			// deleteAllStudent(studentDAO);
   		};

	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count : " + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3 ;
		System.out.println("Deleting student id : " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		int studentId = 1 ;
		System.out.println("Getting student with id : " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		System.out.println("Updating student");
		myStudent.setFirstName("Scooby");

		studentDAO.update(myStudent);

		System.out.println("updated student : " + myStudent);

	}

	private void queryForStudentsLastName(StudentDAO studentDAO) {

		List<Student> theStudents = studentDAO.findByLastname("bob");
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		List<Student> theStudents = studentDAO.findAll();

		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object ....");
		Student tempStudent = new Student("sponge" , "bob" , "spongebob@gmail.com");

		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student. Generated Id : " + tempStudent.getId());


	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating 3 student object.....");
		Student tempStudent1 = new Student("Mustafa" , "Top" , "murat@gmail.com");
		Student tempStudent2 = new Student("Furkan" , "Ala" , "furkan@gmail.com");
		Student tempStudent3 = new Student("Fatma" , "Fark" , "fatma@gmail.com");

		System.out.println("Saving the student.....");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {

		System.out.println("Creating new student object.....");
		Student tempStudent = new Student("Murat" , "incir" , "murat@gmail.com");

		System.out.println("Saving the student.....");
		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		System.out.println("Saved student . Genersted id : " + theId);

		System.out.println("Retreiving student with id : " + theId);
		Student myStudent = studentDAO.findById(theId);

		System.out.println("Found the student : " + myStudent);


	}

}
