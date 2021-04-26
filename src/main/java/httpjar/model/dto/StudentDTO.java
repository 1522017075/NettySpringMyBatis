package httpjar.model.dto;

import lombok.Data;

@Data
public class StudentDTO {
    private Integer id;
    private Integer did;
    private String num;
    private String name;
    private String sex;
    private String cls;
    private String cid;
    private String dor;
    private String flag;
    private String buildName;
    private String cover;
    private String phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getDor() {
		return dor;
	}
	public void setDor(String dor) {
		this.dor = dor;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getBuildName() {
		return buildName;
	}
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", did=" + did + ", num=" + num + ", name=" + name + ", sex=" + sex + ", cls="
				+ cls + ", cid=" + cid + ", dor=" + dor + ", flag=" + flag + ", buildName=" + buildName + ", cover="
				+ cover + ", phone=" + phone + "]";
	}
    

}