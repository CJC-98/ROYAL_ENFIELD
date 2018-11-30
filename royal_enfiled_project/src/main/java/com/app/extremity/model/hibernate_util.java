package com.app.extremity.model;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class hibernate_util {
	
	static StandardServiceRegistry registry;
	static MetadataSources sources;
	static Metadata metadata;
	static SessionFactory sf;
	
	static {
		if(sf == null) {
			Map<String, Object> setting = new HashMap<>();
			setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			setting.put(Environment.URL, "jdbc:mysql://localhost:3306/cjctest");
			setting.put(Environment.USER, "root");
			setting.put(Environment.PASS, "root");
			setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			setting.put(Environment.HBM2DDL_AUTO, "update");
			//setting.put(Environment.SHOW_SQL, true);
		
			
			registry =  new StandardServiceRegistryBuilder().applySettings(setting).build();               
			sources = new MetadataSources(registry)
					.addAnnotatedClass(BikeServicing.class)
					.addAnnotatedClass(ServiceInvoice.class)
					.addAnnotatedClass(ServcingBikeInfo.class)
					.addAnnotatedClass(ServicingChart.class);
			metadata = sources.getMetadataBuilder().build();
			sf = metadata.getSessionFactoryBuilder().build();
		}
		
	}
	
	
	static SessionFactory getSessionFactory() {
		
		return sf;
		
	}
}
