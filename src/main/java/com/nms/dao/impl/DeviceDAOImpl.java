package com.nms.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nms.dao.DeviceDAO;
import com.nms.entity.NetworkDevices;

@Repository
public class DeviceDAOImpl implements DeviceDAO {

	@Autowired
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<NetworkDevices> getAllDevices() {
		
		CriteriaBuilder builder=em.getCriteriaBuilder();
		CriteriaQuery<NetworkDevices> cQuery=builder.createQuery(NetworkDevices.class);
		Root<NetworkDevices> root = cQuery.from(NetworkDevices.class);
		cQuery.select(root);
		Query query = em.createQuery(cQuery);
		
		return query.getResultList();
	}

	@Override
	public void addDevice(NetworkDevices nd) {
		
		em.persist(nd);
	}

}
