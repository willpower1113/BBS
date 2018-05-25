package impl;

import java.util.Scanner;

import comm.Common;
import model.ImenuManager;

/**
 * 菜单工厂
 * 
 * @author Administrator
 *
 */
public class MenuFactory implements ImenuManager {

	private static MenuFactory factory = new MenuFactory();

	private static Scanner scanner = new Scanner(System.in);

	public static MenuFactory create() {
		return factory;
	}

	@Override
	public void splash() {
		out(Common.splashArray + "\n请选择：\n");
		String next = scanner.next();
		switch (next) {
		case "1":
			userLoginIn();
			break;
		case "2":
			adminLoginIn();
			break;
		case "3":
			register();
			break;
		default:
			break;
		}
	}

	@Override
	public void adminLoginIn() {
	}

	@Override
	public void userLoginIn() {
		out("------用户登录-------\n请输入用户名：\n");
		String username = scanner.next();
		out("请输入密码：\n");
		String pwd = scanner.next();
		if (username.equals("admin") && pwd.equals("111111")) {
				home();//登录成功
		}
	}

	@Override
	public void loginOut() {

	}

	@Override
	public void register() {

	}

	@Override
	public void home() {
		out(Common.homeArray);
		scanner.next();
	}

	@Override
	public void watch() {

	}

	private void out(Object obj) {
		System.out.println(obj);
	}
}
