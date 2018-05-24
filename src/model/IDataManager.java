package model;

/**
 * 数据操作管理类
 * 
 * @author Administrator
 *
 */
public interface IDataManager {
	// 连接数据库
	void connect();

	// 查询数据
	void query();

	// 更新数据
	void update();

	// 删除数据
	void delete();

	// 添加数据
	void add();
}
