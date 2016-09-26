package com.rmkk.entity;

import java.util.Date;

public class User {
    private Integer id;

    private Integer roleId;

    private String name;

    private String password;

    private String code;

    private String email;

    private String phone;

    private String img;

    private Date cerateDate;

    private Integer departmentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Date getCerateDate() {
        return cerateDate;
    }

    public void setCerateDate(Date cerateDate) {
        this.cerateDate = cerateDate;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", roleId=" + roleId + ", name=" + name
				+ ", password=" + password + ", code=" + code + ", email="
				+ email + ", phone=" + phone + ", img=" + img + ", cerateDate="
				+ cerateDate + ", departmentId=" + departmentId + "]";
	}
}