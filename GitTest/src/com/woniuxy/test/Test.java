package com.woniuxy.test;
/*
 * 分支管理：
 * 	分支：git在管理项目的时候至少有一个分支master（主干）
 * 		主干的作用：主要是提供公共的代码，一般的程序不要去对其进行修改
 * 		一般情况下由项目经理、组长配置好环境之后推送到远程仓库，这些代码作为master
 * 		其他的程序员、组员，应该在该分支以外的其他分支进行各自的开发
 * 		宿舍管理模块：张三，张三应该新建一个分支 branch-zhangsan，然后在该分支上进行
 * 			代码编写，新建分支相当于是复制了一份master的代码
 * 		学生管理模块：李四，也应该新建一分支，然后在该分支上编写代码
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("hello git");
	}
	public void fun() {
		System.out.println("hello word");
	}
	public void fun2() {
		System.out.println("hello word");
	}
	public void fun3() {
		System.out.println("hello word");
	}
	public void fun4() {
		System.out.println("hello word");
	}
	public void fun5() {
		System.out.println("hello word");
	}
	
	public void fun7() {
		System.out.println("程序员2修改的");
	}
	//程序员1
	public void fun6() {
		
	}
	
}
