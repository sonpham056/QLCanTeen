package DAO;

import java.util.List;

import org.hibernate.Session;

import Utils.HibernateUtil;
import entities.MonAn;

public class MonAnDAO {
	public static List<MonAn> layDanhSachMonAn(){
		List<MonAn> list = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from MonAn m";
			list = session.createQuery(hql).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
