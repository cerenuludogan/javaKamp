package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concrete.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//Todo: Spring IoC ile çöülecek
		ProductService productService = new ProductManager(new AbcProductDao(),new jLoggerManagerAdapter());
		Product product = new Product(1, 2, "elma", 12, 50);
		productService.add(product);

	}

}
