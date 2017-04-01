package com.ningmeng.common.enums;

/**
 * @title 账号状态
 * @author young.M
 * @CreatDate: 2017/3/31
 */
public enum StatusType {

	NORMAL(1, "正常"),
	BAN(0, "禁用");

	private Integer type;
	private String name;

	private StatusType(Integer type, String name) {
		this.type = type;
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static StatusType getByType(Integer type) {
		for (StatusType ct : values()) {
			if (ct.getType().intValue() == type.intValue()) {
				return ct;
			}
		}
		return null;
	}

}
