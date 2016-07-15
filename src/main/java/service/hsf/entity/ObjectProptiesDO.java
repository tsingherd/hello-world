package service.hsf.entity;

import java.util.Map;

public class ObjectProptiesDO {

	private String type;//变量类型，比如：Integer,Long,String,Short,Double，如果是一个子节点，type为child
	private String cname;//中文名
	private String ename;//英文名
	private Boolean nonEmpty = false;//false为可以为空，true为不能为空
	private String initialType = "input"; //初始化类型，为文本输入框还是选择框
	private Map<String,String> listInfo;//选择框的信息
	private String defaultInfo; //默认项
	private String description;//描述
	private Boolean hidden = false; //是否隐藏
	
	private Map<String,ObjectProptiesDO> childrenMap = null;//子节点,最好不要用

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Boolean getNonEmpty() {
		return nonEmpty;
	}

	public void setNonEmpty(Boolean nonEmpty) {
		this.nonEmpty = nonEmpty;
	}

	public String getInitialType() {
		return initialType;
	}

	public void setInitialType(String initialType) {
		this.initialType = initialType;
	}

	public Map<String, String> getListInfo() {
		return listInfo;
	}

	public void setListInfo(Map<String, String> listInfo) {
		this.listInfo = listInfo;
	}

	public String getDefaultInfo() {
		return defaultInfo;
	}

	public void setDefaultInfo(String defaultInfo) {
		this.defaultInfo = defaultInfo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public Map<String, ObjectProptiesDO> getChildrenMap() {
		return childrenMap;
	}

	public void setChildrenMap(Map<String, ObjectProptiesDO> childrenMap) {
		this.childrenMap = childrenMap;
	}

	@Override
	public String toString() {
		return "ObjectProptiesDO{" +
				"type='" + type + '\'' +
				", cname='" + cname + '\'' +
				", ename='" + ename + '\'' +
				", nonEmpty=" + nonEmpty +
				", initialType='" + initialType + '\'' +
				", listInfo=" + listInfo +
				", defaultInfo='" + defaultInfo + '\'' +
				", description='" + description + '\'' +
				", hidden=" + hidden +
				", childrenMap=" + childrenMap +
				'}';
	}
}
