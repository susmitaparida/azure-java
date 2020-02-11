package com.nms.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nms.dao.DeviceDAO;
import com.nms.entity.NetworkDevices;
import com.nms.service.DeviceService;

@Service
@Transactional
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private DeviceDAO deviceDAO;
	
	@Override
	public List<NetworkDevices> getAllDevices() {

		return deviceDAO.getAllDevices();
	}

	@Override
	public void addDevice(NetworkDevices nd) {
		
		deviceDAO.addDevice(nd);
	}

}
