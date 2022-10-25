package KodlamaIoWeb.dataAccess;

import KodlamaIoWeb.entities.Course;

public class JdbcCourseDao implements CourseDao {

	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi");
	}
}