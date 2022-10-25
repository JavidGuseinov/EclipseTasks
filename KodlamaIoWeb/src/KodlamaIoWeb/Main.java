package KodlamaIoWeb;

import java.util.List;

import KodlamaIoWeb.business.CategoryManager;
import KodlamaIoWeb.business.CourseManager;
import KodlamaIoWeb.business.InstructorManager;
import KodlamaIoWeb.core.logging.DatabaseLogger;
import KodlamaIoWeb.core.logging.FileLogger;
import KodlamaIoWeb.core.logging.Logger;
import KodlamaIoWeb.core.logging.MailLogger;
import KodlamaIoWeb.dataAccess.HibernateCategoryDao;
import KodlamaIoWeb.dataAccess.HibernateCourseDao;
import KodlamaIoWeb.dataAccess.HibernateInstructorDao;
import KodlamaIoWeb.dataAccess.JdbcCourseDao;
import KodlamaIoWeb.entities.Category;
import KodlamaIoWeb.entities.Course;
import KodlamaIoWeb.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new FileLogger(), new DatabaseLogger(), new MailLogger() };

		Category category1 = new Category(111, "Robotik Kodlama");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);

		Course course1 = new Course(222, "Flutter",
				"Flutter Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.",
				"Engin Demiroğ", 500);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);

		Instructor instructor1 = new Instructor(333, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);

	}
}
