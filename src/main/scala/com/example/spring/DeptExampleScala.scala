package com.example.spring

object DeptExampleScala {
  def main(args: Array[String]): Unit = {
    
	  var dept : Dept = new Dept;
	   dept.deptno = 10;
	   dept.dname = "xxx"
	   dept.loc = "yyyy"
	   
	   println(dept);
	     
	   println(dept.deptno + dept.dname);
  }
}