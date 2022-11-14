package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;

@Repository
public class Userdao {
	
	@Autowired
	private HibernateTemplate hbt;
	
	public int saveUser(User user)
	{
		int id=(Integer)this.hbt.save(user);
		return id;
	}
	
}
