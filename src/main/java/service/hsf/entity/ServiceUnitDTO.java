package service.hsf.entity;



import java.util.List;

public class ServiceUnitDTO {

	private Long id;
	private String name;
	private String code;
	private List<ObjectProptiesDO> props;
	private ClassifyDO classifyDO;
	private int status;
	private int sourceId;
	private String sourceName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public ClassifyDO getClassifyDO() {
		return classifyDO;
	}
	public void setClassifyDO(ClassifyDO classifyDO) {
		this.classifyDO = classifyDO;
	}
	
	public List<ObjectProptiesDO> getProps() {
		return props;
	}
	public void setProps(List<ObjectProptiesDO> props) {
		this.props = props;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getSourceId() {
		return sourceId;
	}
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

}
