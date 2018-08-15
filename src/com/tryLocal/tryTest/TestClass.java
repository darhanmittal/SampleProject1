package com.tryLocal.tryTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tryLocal.tryUtil.TryUtil;

public class TestClass extends TryUtil {
	
	@BeforeClass
	public void setup() {
		connectToBrowser();
		driver.get(prop.getProperty("ulr"));
		initializePages();
	}
	
	@Test(expectedExceptions= NoSuchElementException.class)
	public void googleSearch() {
		
		pageModel.getTxtBoxSearch().clear();
		pageModel.getTxtBoxSearch().sendKeys("automation testing"+ Keys.ENTER);
		
//		pageModel.get2ndresult().click();
		
//		driver.findElements(By.id("asd"));
	}
	
	
	@Test
	public void findDuplicate() {
		
		int[] arry = new int[10];
		List<Integer> list = new ArrayList<Integer>();
		
		for(Integer i=0; i<=10; i++) {
			list.add(i);
		}
		
		for(Integer i=0; i<=5; i++) {
			list.add(i);
		}
	
		Set<Integer> setUnqiqe = new HashSet<Integer>();
		Set<Integer> setDupli = new HashSet<Integer>();
		for(Integer i : list) {
			if(!setUnqiqe.add(i)) {
				setDupli.add(i);
			}
		}
		
		System.out.println(setUnqiqe);
		System.out.println(setDupli);
		}
	
	
	@Test
	public void sortString() {
		
		List<String> list = new ArrayList<String>();
		list.add("darshan");
		list.add("mittal");
		list.add("lives");
		list.add("in");
		list.add("meerut");
		
		Collections.sort(list);
		System.out.println(retStrin("darshanmittalpaglgaiha").toString());
	}
	
		public Set<String> retStrin(String str) {
		Set<String> abc =new LinkedHashSet<String>();
		for(int i=0; i<str.length(); i++) {
			String s= str.charAt(i) + "";
			abc.add(s);
		}
		return abc;
		}
		
		
		
	}

