package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentCourse {
	class Course {
	    
	    int course_id;
	    String course_name;
	    List<Student> list;
	    
	    public Course() {
	        super();
	    }
	    
	    public Course(int course_id, String course_name) {
	        super();
	        this.course_id = course_id;
	        this.course_name = course_name;
	    }
	    
	    public void addStudentToCourse() {
	        Scanner sc = new Scanner(System.in);
	        list = new ArrayList<>();
	        System.out.println("Enter No Of Students");
	        int size = sc.nextInt();
	        for (int i = 0; i < size; i++) {
	            System.out.println("Enter "+(i + 1)+" Sudent Details");
	            list.add(new Student(sc.nextInt(), sc.next(), sc.nextInt()));
	        }
	        
	    }
	    
	    public void displayCourseDetails() {
	        System.out.println("Course [course_id=" + course_id + ", course_name=" + course_name+ " " );
	        for (Student student : list) {
	            System.out.println(student);
	        }
	    }

	 

	    @Override
	    public String toString() {
	        return "Course [course_id=" + course_id + ", course_name=" + course_name + ", list=" + list + "]";
	    }
	class Student {
	    
	    int student_id;
	    String student_name;
	    int student_marks;
	    
	    public Student() {
	        super();
	    }
	    
	    public Student(int student_id, String student_name, int student_marks) {
	        super();
	        this.student_id = student_id;
	        this.student_name = student_name;
	        this.student_marks = student_marks;
	    }
	    
	    public void displayStudentDetails() {
	        System.out.println("studentName " +student_name+ " studentId= "+student_id+ "marks = "+student_marks);
	    }

	 

	    @Override
	    public String toString() {
	        return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_marks="
	                + student_marks + "]";
	    }

	}
	}


	public class Department {
	    
	    int deptartment_id;
	    String deptartment_name;
	    List<Course> list;
	    

	 

	    public Department() {
	        super();
	    }

	 

	    public Department(int deptartment_id, String deptartment_name) {
	        super();
	        this.deptartment_id = deptartment_id;
	        this.deptartment_name = deptartment_name;
	    }

	 

	    
	    public void addCourseToDepartment() {
	        Scanner sc = new Scanner(System.in);
	         list = new ArrayList<>();
	        System.out.println("Enter No Of Courses");
	        int size = sc.nextInt();
	        for (int i = 0; i < size; i++) {
	            System.out.println("Enter "+(i + 1)+" Course Details");
	            list.add(new Course(sc.nextInt(), sc.next()));
	        }
	        
	    }
	    
	    @Override
	    public String toString() {
	        return "Department [deptartment_id=" + deptartment_id + ", deptartment_name=" + deptartment_name + ", Course ="
	                + list + "]";    
	    }

	 

	    public void main(String[] args) {
	        
	        
	        System.out.println("Enter Deratment Id and name");
	        Scanner sc = new Scanner(System.in);        
	        Department d = new Department(sc.nextInt(),sc.next());        
	        d.addCourseToDepartment();
	        Course c = new Course();
	        c.addStudentToCourse();
	       
	        System.out.println(d);
	        System.out.println(c);
	        
	    }

	 

}
}

