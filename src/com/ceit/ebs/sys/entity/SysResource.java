package com.ceit.ebs.sys.entity;


/**
 * SysResource entity. @author MyEclipse Persistence Tools
 */

public class SysResource {

	private Integer id;     //资源编号
	private String resourceName;   //资源名称
	private String resourceAlias;  //资源描述
	private String resourceUrl;    //资源请求路径
	private Integer parentId;     //资源所属功能id，对应sys_function下的function_id
	private Integer dispIndex;     //排序索引，主要用于资源的上移下移
	private String isAudit;        //是否需要审计：y为需要，n为不需要


	/** default constructor */
	public SysResource() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceAlias() {
		return this.resourceAlias;
	}

	public void setResourceAlias(String resourceAlias) {
		this.resourceAlias = resourceAlias;
	}

	public String getResourceUrl() {
		return this.resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}


	public Integer getParentId() {
		return parentId;
	}


	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}


	public Integer getDispIndex() {
		return this.dispIndex;
	}

	public void setDispIndex(Integer dispIndex) {
		this.dispIndex = dispIndex;
	}

	public String getIsAudit() {
		return this.isAudit;
	}

	public void setIsAudit(String isAudit) {
		this.isAudit = isAudit;
	}

}