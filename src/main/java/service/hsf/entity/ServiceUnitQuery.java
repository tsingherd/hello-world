package service.hsf.entity;

import java.util.List;

public class ServiceUnitQuery {

	/**
	 * 如果传了ids和codes这两个字段，查询方式是or，只要有一个，其他字段都忽略掉
	 */
	private List<Long> ids;//根据id字段查询
	private List<String> codes;//根据code字段查询
	
	/**
	 * 模糊查询字段
	 */
	private String name;//名称模糊查询
	private String code;//code模糊查询
	private String classifyName;//名称模糊查询
	
	
	/**
	 * 分页		
	 * 获取对应服务单元提供方的所有服务单元,根据分页进行查询，一页最大100条数据，根据应用提供方确定
	 */
	private int page;//分页
	
	public List<Long> getIds() {
		return ids;
	}
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}
	public List<String> getCodes() {
		return codes;
	}
	public void setCodes(List<String> codes) {
		this.codes = codes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getClassifyName() {
		return classifyName;
	}
	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}
