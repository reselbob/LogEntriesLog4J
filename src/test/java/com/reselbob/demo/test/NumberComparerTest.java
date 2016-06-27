package com.reselbob.demo.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reselbob.demo.CompareState;
import com.reselbob.demo.NumberComparer;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import demo.reselbob.logging.Logentry;

public class NumberComparerTest {
	private static Logger logger = LogManager.getRootLogger();
	
  @Test
  public void canCompareEqual() {
	  NumberComparer comparer = new NumberComparer();
	  CompareState result = comparer.compare(4,4);
	  Assert.assertTrue(result == CompareState.Equal);
	  
	  String str = "canCompareLess result is " + (result == CompareState.Equal);
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  logger.info(new Logentry(str,this.getClass().getSimpleName() + "." + name));
  }
  @Test
  public void canCompareMore() {
	  NumberComparer comparer = new NumberComparer();
	  CompareState result = comparer.compare(5,4);
	  Assert.assertTrue(result == CompareState.More);
	  
	  String str = "canCompareLess result is " + (result == CompareState.More);
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  logger.info(new Logentry(str,this.getClass().getSimpleName() + "." + name));
  }
  @Test
  public void canCompareLess() {
	  NumberComparer comparer = new NumberComparer();
	  CompareState result = comparer.compare(4,5);
	  Assert.assertTrue(result == CompareState.Less);
	  
	  String str = "canCompareLess result is " + (result == CompareState.Less);
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();  
	  logger.info(new Logentry(str,this.getClass().getSimpleName() + "." + name));
  }
}
