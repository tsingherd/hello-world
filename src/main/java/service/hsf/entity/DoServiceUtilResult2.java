package service.hsf.entity;

import java.util.List;

public class DoServiceUtilResult2 {

	private boolean sucess;//是否执行成功
	private Long taskId;//本次执行的task，用于异步执行，如果不传，必须是同步执行完成
	private int status;//当前运行状态。0为以创建，1：运行中，2：运行成功，3：运行异常，4：运行成功，但是校验异常
	private String data;//执行后放回的结果
	private String result;//执行后要展示的结果
	private List<String> replace;//用于进行tsc和bizId的替换，只给tsc用
	private String errorCode;//如果执行失败，传递一个失败code
	private String errorMsg;//如果失败，传递失败msg
	public boolean isSucess() {
		return sucess;
	}
	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Long getTaskId() {
		return taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List<String> getReplace() {
		return replace;
	}
	public void setReplace(List<String> replace) {
		this.replace = replace;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
