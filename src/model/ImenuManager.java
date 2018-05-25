package model;

/**
 * 
 * @author Administrator 菜单管理接口
 *
 */
public interface ImenuManager {
	// 显示欢迎菜单
	void splash();

	// 管理员登录
	void adminLoginIn();

	// 普通用户登录
	void userLoginIn();

	// 退出登录
	void loginOut();

	// 注册
	void register();

	// 主页菜单
	void home();
	
	//查看界面
	void watch();
}
