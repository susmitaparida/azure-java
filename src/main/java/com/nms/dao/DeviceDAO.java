package com.nms.dao;

import java.util.List;

import com.nms.entity.NetworkDevices;

public interface DeviceDAO {

	public List<NetworkDevices> getAllDevices();

	public void addDevice(NetworkDevices nd);
}
