package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;
	private String roleName;
	private String roleUsername;
	private String rolePassword;
	private String roleCode;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleUsername() {
		return roleUsername;
	}

	public void setRoleUsername(String roleUsername) {
		this.roleUsername = roleUsername;
	}

	public String getRolePassword() {
		return rolePassword;
	}

	public void setRolePassword(String rolePassword) {
		this.rolePassword = rolePassword;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleUsername=" + roleUsername
				+ ", rolePassword=" + rolePassword + ", roleCode=" + roleCode + "]";
	}

}
