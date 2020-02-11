package com.nms.service;

import java.util.List;

import com.nms.entity.NetworkDevices;

public interface DeviceService {

	public List<NetworkDevices> getAllDevices();

	public void addDevice(NetworkDevices nd);
}
