package service.hsf.entity;

public class ClassifyDO {

	private Long classifyId;
	private String classifyName;//分类，根据层级来，中间用“,”分割
	private String classifyCode;//分类的code
	public String getClassifyName() {
		return classifyName;
	}
	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}
	public String getClassifyCode() {
		return classifyCode;
	}
	public void setClassifyCode(String classifyCode) {
		this.classifyCode = classifyCode;
	}
	public Long getClassifyId() {
		return classifyId;
	}
	public void setClassifyId(Long classifyId) {
		this.classifyId = classifyId;
	}
	
	
}
