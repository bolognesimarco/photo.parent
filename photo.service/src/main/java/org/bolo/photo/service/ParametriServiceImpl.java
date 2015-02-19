package org.bolo.photo.service;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
			ThreadLocal tl = new ThreadLocal();
			
		} catch (Throwable t) {
		}
//		Field field1 = Thread.class.getDeclaredField("threadLocals");
//        field1.setAccessible(true);
//        Object o1 = field1.get(Thread.currentThread());
//        Field field2 = o1.getClass().getDeclaredField("table");
//        field2.setAccessible(true);
//        Object[] o2 = (Object[]) field2.get(o1);
//        System.out.println("_________________________________________________________________________"+o2.length);
//        
//        for (Object temp : o2) {
//            if (temp != null) {
//            	
//                Field field3 = temp.getClass().getDeclaredField("value");
//                field3.setAccessible(true);
//                Object o3 = field3.get(temp);
//                try {
//					System.out.println("===:" + (((Class)field3.getType()).isPrimitive()?("primitive:"+o3):o3==null?"nullo":"object:"+o3.getClass().getName() ));
//					
//					if(o3 instanceof Object[]){
//						System.out.println("nel object[].."+((Object[])o3).length);
//						Object[] oo = ((Object[])o3);
//						for (Object object : oo) {
//							System.out.println(object);
//						}
//						
////						Iterator keys = ((java.util.HashMap)o3).keySet().iterator();
////						while (keys.hasNext()) {
////							Object nextkey = (Object) keys.next();
////							System.out.println(nextkey+":"+((java.util.HashMap)o3).get(nextkey));
////						}
//					}
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//            }
//        }
	}

}
