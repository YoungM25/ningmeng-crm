package com.ningmeng.common.enums;

/**
 * @title 菜单类型
 * @author young.M
 * @CreatDate: 2017/3/31
 */
public enum MenuType {
	CATALOG(0,"目录"),
	MENU(1,"菜单"),
	BUTTON(2,"按钮");

	private Integer type;
	private String name;

	private MenuType(Integer type, String name) {
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

	public static MenuType getByType(Integer type) {
		for (MenuType ct : values()) {
			if (ct.getType().intValue() == type.intValue()) {
				return ct;
			}
		}
		return null;
	}

}
