package org.bolo.photo.service;

import java.util.Enumeration;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.bolo.photo.model.TipoUtente;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.AbandonedConnectionCleanupThread;

@Service
@Transactional
public class ParametriServiceImpl implements ParametriService {

	@PersistenceContext
	private EntityManager em;
	
	public List<TipoUtente> listTipiUtente() throws Exception {
		return em.createQuery("from TipoUtente tu").getResultList();
	}
	
	@PreDestroy
	public void predestroy() throws Exception {
		try {
			AbandonedConnectionCleanupThread.shutdown();
		} catch (Throwable t) {
		}
//		// This manually deregisters JDBC driver, which prevents Tomcat 7 from
//		// complaining about memory leaks
//		Enumeration<java.sql.Driver> drivers = java.sql.DriverManager
//				.getDrivers();
//		while (drivers.hasMoreElements()) {
//			java.sql.Driver driver = drivers.nextElement();
//			try {
//				java.sql.DriverManager.deregisterDriver(driver);
//			} catch (Throwable t) {
//			}
//		}
		try {
			Thread.sleep(2000L);
		} catch (Exception e) {
		}
	}

}
