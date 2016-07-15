package service.hsf.entity;

import java.util.List;

/**
 * @author tangyu.jc
 *
 */
public class ServiceUnitAssDTO2 {

	private Long id;
	private Long bizId;
	private Integer bizSourceId;
	private Integer sourceId;
	private String name;//服务单元名称
	private String code;//对应服务提供方的唯一code
//	private String props;//定义传输的对象
	private List<ObjectProptiesDO> props;
//	private Long classifyId;//分类
	private String propsJson;
	private String tscClassifyName;
	private Integer status;//单元是否已经失效，-1为失效
	private String desc;
	private String sourceName;
	private String creater;
	private String lastModifier;
	private String linkman;
	private String httpUrl;
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBizId() {
		return bizId;
	}

	public void setBizId(Long bizId) {
		this.bizId = bizId;
	}

	public Integer getBizSourceId() {
		return bizSourceId;
	}

	public void setBizSourceId(Integer bizSourceId) {
		this.bizSourceId = bizSourceId;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
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

	public List<ObjectProptiesDO> getProps() {
		return props;
	}

	public void setProps(List<ObjectProptiesDO> props) {
		this.props = props;
	}

	public String getPropsJson() {
		return propsJson;
	}

	public void setPropsJson(String propsJson) {
		this.propsJson = propsJson;
	}

	public String getTscClassifyName() {
		return tscClassifyName;
	}

	public void setTscClassifyName(String tscClassifyName) {
		this.tscClassifyName = tscClassifyName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getLastModifier() {
		return lastModifier;
	}

	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(String httpUrl) {
		this.httpUrl = httpUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
