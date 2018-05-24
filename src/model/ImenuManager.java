package model;

/**
 * 
 * @author Administrator 菜单管理接口
 *
 */
public interface ImenuManager {
	/****************************** 相关菜单语句 ********************************/
	// 欢迎页
	public final static String[] splashArray = { "用户登录", "管理员登录", "用户注册" };
	// 主页菜单
	public final static String[] homeArray = { "发帖", "回帖", "查看帖子", "删帖", "删回帖" };
	// 查看帖子
	public final static String[] selectArray = { "查看所有", "查看自己", "查看指定用户的帖子" };

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
