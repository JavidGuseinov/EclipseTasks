package KodlamaIoWeb.dataAccess;

import KodlamaIoWeb.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
