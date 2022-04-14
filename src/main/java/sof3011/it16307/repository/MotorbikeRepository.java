package sof3011.it16307.repository;

import org.hibernate.Session;
import org.hibernate.query.Query;

import sof3011.it16307.entity.Motorbike;
import sof3011.it16307.query.BaseQuery;

public class MotorbikeRepository extends BaseRepository<Motorbike> {

	protected Query<Motorbike> createQuery(BaseQuery queryInfo, Session session) {
		Query<Motorbike> query = session
				.createQuery("FROM Motorbike m", Motorbike.class);
		return query;
	}
}
