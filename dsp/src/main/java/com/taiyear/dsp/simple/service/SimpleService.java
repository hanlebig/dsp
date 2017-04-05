/**
 * 
 */
package com.taiyear.dsp.simple.service;

import com.taiyear.dsp.simple.entity.Student;

/**
 * @author liul
 *
 */
public interface SimpleService {
	public void save();
	
	public void delete();
	
	public void update();
	
	public Student query();
}
