package sof3011.it16307.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import sof3011.it16307.query.BaseQuery;
import sof3011.it16307.query.ListQuery;
import sof3011.it16307.utils.HibernateUtil;


public abstract class BaseRepository<T> {

	public List<T> find(BaseQuery queryInfo) {
		try (Session session = HibernateUtil.getSessionFactory().openSession();) {
			Query<T> query = createQuery(queryInfo, session);
			
			if (queryInfo instanceof ListQuery) {
				ListQuery listQuery = (ListQuery) queryInfo;
				
				query.setFirstResult(listQuery.getOffset());
				query.setMaxResults(listQuery.getMaxResult());
			}
			
		    return query.list();
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	protected abstract Query<T> createQuery(BaseQuery queryInfo, Session session);
}
